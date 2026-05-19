package ca.toadlybroodle.minimalist;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import ca.toadlybroodle.minimalist.db.OutlineRepository;
import ca.toadlybroodle.minimalist.db.OutlineRepositoryImpl;
import ca.toadlybroodle.minimalist.db.MinimaListDatabase;
import ca.toadlybroodle.minimalist.db.dao.OutlineRowDao;
import ca.toadlybroodle.minimalist.db.dao.SublistDao;
import ca.toadlybroodle.minimalist.db.entity.OutlineRowEntity;
import ca.toadlybroodle.minimalist.db.entity.SublistEntity;
import ca.toadlybroodle.minimalist.model.OutlineRow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Mockito-based behavioral tests for OutlineRepositoryImpl.
 *
 * These verify call-sequence and field-mapping correctness at the unit level.
 * SQL atomicity is provided by Room's @Transaction annotation on OutlineRowDao.replaceForSublist
 * (verified by Phase9TransactionTest source scans); these tests confirm the impl
 * actually wires through to that method.
 */
public class Phase9RepositoryImplTest {

    private MinimaListDatabase mockDb;
    private SublistDao mockSublistDao;
    private OutlineRowDao mockRowDao;
    private OutlineRepositoryImpl repo;

    @Before
    public void setUp() {
        mockDb = mock(MinimaListDatabase.class);
        mockSublistDao = mock(SublistDao.class);
        mockRowDao = mock(OutlineRowDao.class);
        when(mockDb.sublistDao()).thenReturn(mockSublistDao);
        when(mockDb.outlineRowDao()).thenReturn(mockRowDao);
        // Make runInTransaction execute its Runnable so transaction bodies are testable.
        doAnswer(inv -> {
            ((Runnable) inv.getArgument(0)).run();
            return null;
        }).when(mockDb).runInTransaction(any(Runnable.class));
        // insertSublist calls sublistDao.insert; return a stable id.
        when(mockSublistDao.insert(any(SublistEntity.class))).thenReturn(42L);
        repo = new OutlineRepositoryImpl(mockDb);
    }

    // --- replaceRowsForSublist ---

    @Test
    public void replaceRowsForSublistDelegatesToDaoTransactionalMethod() {
        List<OutlineRowEntity> rows = new ArrayList<>();
        repo.replaceRowsForSublist(7L, rows);
        verify(mockRowDao).replaceForSublist(eq(7L), eq(rows));
    }

    @Test
    public void replaceRowsForSublistDoesNotCallDeleteAndInsertSeparately() {
        List<OutlineRowEntity> rows = new ArrayList<>();
        repo.replaceRowsForSublist(7L, rows);
        // Must NOT call deleteAllRowsForSublist or insertAll directly — only replaceForSublist.
        verify(mockRowDao, never()).deleteAllRowsForSublist(anyLong());
        verify(mockRowDao, never()).insertAll(any());
    }

    // --- importLegacy ---

    @Test
    public void importLegacyEmptyMapCallsNoInserts() {
        repo.importLegacy(new HashMap<>());
        verify(mockSublistDao, never()).insert(any());
        verify(mockRowDao, never()).insertAll(any());
    }

    @Test
    public void importLegacySingleSublistInsertsSublistAndRows() {
        ArrayList<OutlineRow> rows = new ArrayList<>();
        OutlineRow r = new OutlineRow();
        r.text = "hello";
        r.complete = false;
        r.collapsed = true;
        r.indent = 2;
        r.reminder = 0L;
        r.isInstr = false;
        rows.add(r);

        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("My List", rows);

        repo.importLegacy(data);

        verify(mockSublistDao, times(1)).insert(any(SublistEntity.class));
        verify(mockRowDao, times(1)).insertAll(any());
    }

    @Test
    public void importLegacyNullTextNormalizedToEmptyString() {
        ArrayList<OutlineRow> rows = new ArrayList<>();
        OutlineRow r = new OutlineRow();
        r.text = null;
        rows.add(r);

        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("List", rows);

        repo.importLegacy(data);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<ArrayList<OutlineRowEntity>> captor =
                ArgumentCaptor.forClass(ArrayList.class);
        verify(mockRowDao).insertAll(captor.capture());
        List<OutlineRowEntity> inserted = captor.getValue();
        assertEquals("null text must be normalized to empty string", "", inserted.get(0).text);
    }

    @Test
    public void importLegacyMultipleSublistsAllImported() {
        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("Alpha", new ArrayList<>());
        data.put("Beta", new ArrayList<>());
        data.put("Gamma", new ArrayList<>());

        repo.importLegacy(data);

        verify(mockSublistDao, times(3)).insert(any(SublistEntity.class));
    }

    @Test
    public void importLegacyWrapsEntireMigrationInSingleTransaction() {
        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("A", new ArrayList<>());
        data.put("B", new ArrayList<>());

        repo.importLegacy(data);

        verify(mockDb, times(1)).runInTransaction(any(Runnable.class));
    }

    @Test
    public void importLegacyRowFieldsMappedToEntity() {
        ArrayList<OutlineRow> rows = new ArrayList<>();
        OutlineRow r = new OutlineRow();
        r.text = "buy milk";
        r.complete = true;
        r.collapsed = false;
        r.indent = 1;
        r.reminder = 9_000_000L;
        r.isInstr = true;
        rows.add(r);

        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("Groceries", rows);

        repo.importLegacy(data);

        @SuppressWarnings("unchecked")
        ArgumentCaptor<ArrayList<OutlineRowEntity>> captor =
                ArgumentCaptor.forClass(ArrayList.class);
        verify(mockRowDao).insertAll(captor.capture());
        OutlineRowEntity e = captor.getValue().get(0);
        assertEquals("buy milk", e.text);
        assertTrue(e.complete);
        assertEquals(1, e.indent);
        assertEquals(9_000_000L, e.reminder);
        assertTrue(e.isInstr);
    }

    // --- loadAllAsHashMap ---

    @Test
    public void loadAllAsHashMapReturnsCorrectSublistKeys() {
        SublistEntity s1 = sublistEntity(1L, "Work", 0);
        SublistEntity s2 = sublistEntity(2L, "Home", 1);
        when(mockSublistDao.getAll()).thenReturn(Arrays.asList(s1, s2));
        when(mockRowDao.getRowsForSublist(anyLong())).thenReturn(new ArrayList<>());

        HashMap<String, ArrayList<OutlineRow>> result = repo.loadAllAsHashMap();

        assertEquals(2, result.size());
        assertTrue(result.containsKey("Work"));
        assertTrue(result.containsKey("Home"));
    }

    @Test
    public void loadAllAsHashMapRowsIncludedUnderCorrectSublist() {
        SublistEntity s1 = sublistEntity(1L, "Tasks", 0);
        when(mockSublistDao.getAll()).thenReturn(Arrays.asList(s1));

        OutlineRowEntity re = new OutlineRowEntity();
        re.id = 10L;
        re.sublistId = 1L;
        re.position = 0;
        re.text = "do the thing";
        re.complete = false;
        re.collapsed = false;
        re.indent = 0;
        re.reminder = 0L;
        re.isInstr = false;
        when(mockRowDao.getRowsForSublist(1L)).thenReturn(Arrays.asList(re));

        HashMap<String, ArrayList<OutlineRow>> result = repo.loadAllAsHashMap();

        List<OutlineRow> rows = result.get("Tasks");
        assertNotNull(rows);
        assertEquals(1, rows.size());
        assertEquals("do the thing", rows.get(0).text);
    }

    @Test
    public void loadAllAsHashMapNullEntityTextNormalizedToEmpty() {
        SublistEntity s1 = sublistEntity(1L, "List", 0);
        when(mockSublistDao.getAll()).thenReturn(Arrays.asList(s1));

        OutlineRowEntity re = new OutlineRowEntity();
        re.text = null;
        when(mockRowDao.getRowsForSublist(1L)).thenReturn(Arrays.asList(re));

        HashMap<String, ArrayList<OutlineRow>> result = repo.loadAllAsHashMap();
        assertEquals("", result.get("List").get(0).text);
    }

    // --- saveAllAsHashMap ---

    @Test
    public void saveAllAsHashMapWrapsInTransaction() {
        when(mockSublistDao.getAll()).thenReturn(new ArrayList<>());
        repo.saveAllAsHashMap(new HashMap<>());
        verify(mockDb, times(1)).runInTransaction(any(Runnable.class));
    }

    @Test
    public void saveAllAsHashMapCallsReplaceForSublistPerEntry() {
        when(mockSublistDao.getAll()).thenReturn(new ArrayList<>());

        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("Alpha", new ArrayList<>());
        data.put("Beta", new ArrayList<>());

        repo.saveAllAsHashMap(data);

        verify(mockRowDao, times(2)).replaceForSublist(anyLong(), any());
    }

    @Test
    public void saveAllAsHashMapDeletesRemovedSublists() {
        SublistEntity old = sublistEntity(99L, "OldList", 0);
        when(mockSublistDao.getAll()).thenReturn(Arrays.asList(old));

        // Save a map that doesn't contain "OldList" → it should be deleted.
        HashMap<String, ArrayList<OutlineRow>> data = new HashMap<>();
        data.put("NewList", new ArrayList<>());

        repo.saveAllAsHashMap(data);

        verify(mockSublistDao).delete(99L);
    }

    // --- deleteSublist / renameSublist ---

    @Test
    public void deleteSublistDelegatesToSublistDao() {
        repo.deleteSublist(5L);
        verify(mockSublistDao).delete(5L);
    }

    @Test
    public void renameSublistDelegatesToSublistDao() {
        repo.renameSublist(3L, "Renamed");
        verify(mockSublistDao).rename(3L, "Renamed");
    }

    // --- helpers ---

    private static SublistEntity sublistEntity(long id, String name, int position) {
        SublistEntity e = new SublistEntity();
        e.id = id;
        e.name = name;
        e.position = position;
        return e;
    }
}
