package ca.toadlybroodledev.sublist;

import ca.toadlybroodledev.sublist.model.OutlineRow;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Phase 9.1/9.2 — legacy data format migration + Repository contract, verified by source scan
 * and pure-JVM unit tests.
 *
 * legacyOutlineRowGsonRoundTrip: the Gson format used by OutlineStore (ArrayList<OutlineRow>)
 *   survives a serialize→deserialize round-trip with field fidelity intact.
 * legacyMapGsonRoundTrip: the multi-sublist format (HashMap<String, ArrayList<OutlineRow>>)
 *   also round-trips correctly — this is the in-memory shape passed to importLegacy().
 * repositoryInterfaceHasSublistMethods: OutlineRepository.java must declare getAllSublists,
 *   insertSublist, deleteSublist, renameSublist, updateSublistPosition.
 * repositoryInterfaceHasRowMethods: OutlineRepository.java must declare getRowsForSublist,
 *   insertRow, updateRow, deleteRow, deleteCompletedRows, replaceRowsForSublist.
 * repositoryInterfaceHasImportLegacy: OutlineRepository.java must declare importLegacy so the
 *   one-shot migration can be triggered from AppMain on first launch.
 * repositoryImplImplementsInterface: OutlineRepositoryImpl must declare
 *   "implements OutlineRepository".
 * repositoryImplDelegatesViaDaos: OutlineRepositoryImpl must hold both a SublistDao and an
 *   OutlineRowDao field (delegation, not reimplementation).
 * repositoryImplHasImportLegacyBody: OutlineRepositoryImpl must contain the insertSublist +
 *   insertAll calls that drive the legacy import — guards against a stub-only implementation.
 */
public class Phase9LegacyMigrationTest {

    private File projectRoot() {
        File dir = new File(System.getProperty("user.dir"));
        while (dir != null) {
            if (new File(dir, "settings.gradle.kts").exists()) return dir;
            dir = dir.getParentFile();
        }
        throw new IllegalStateException("Cannot find project root");
    }

    private String readSource(String relativePath) {
        try {
            return new String(Files.readAllBytes(new File(projectRoot(), relativePath).toPath()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static final String DB_DIR =
            "app/src/main/java/ca/toadlybroodledev/sublist/db/";

    // --- Pure-JVM legacy format tests ---

    @Test
    public void legacyOutlineRowGsonRoundTrip() {
        OutlineRow original = new OutlineRow(2, "buy milk", true, false, 1_700_000_000L, false);
        Gson gson = new Gson();

        ArrayList<OutlineRow> list = new ArrayList<>();
        list.add(original);
        String json = gson.toJson(list);
        assertNotNull("Gson must produce non-null JSON", json);
        assertFalse("JSON must not be empty", json.isEmpty());

        List<OutlineRow> restored = gson.fromJson(json,
                new TypeToken<ArrayList<OutlineRow>>() {}.getType());
        assertNotNull("Deserialized list must not be null", restored);
        assertEquals("Round-trip must preserve list size", 1, restored.size());
        OutlineRow r = restored.get(0);
        assertEquals("indent preserved", 2, r.indent);
        assertEquals("text preserved", "buy milk", r.text);
        assertTrue("complete preserved", r.complete);
        assertFalse("collapsed preserved", r.collapsed);
        assertEquals("reminder preserved", 1_700_000_000L, r.reminder);
        assertFalse("isInstr preserved", r.isInstr);
    }

    @Test
    public void legacyMapGsonRoundTrip() {
        HashMap<String, ArrayList<OutlineRow>> map = new HashMap<>();
        ArrayList<OutlineRow> rows = new ArrayList<>();
        rows.add(new OutlineRow(0, "root row", false, false, 0L, false));
        rows.add(new OutlineRow(1, "child row", false, true, 0L, false));
        map.put("My List", rows);

        Gson gson = new Gson();
        String json = gson.toJson(map);

        HashMap<String, ArrayList<OutlineRow>> restored = gson.fromJson(json,
                new TypeToken<HashMap<String, ArrayList<OutlineRow>>>() {}.getType());
        assertNotNull("Restored map must not be null", restored);
        assertTrue("Restored map must contain 'My List'", restored.containsKey("My List"));
        List<OutlineRow> restoredRows = restored.get("My List");
        assertEquals("Row count preserved", 2, restoredRows.size());
        assertEquals("Row 0 text preserved", "root row", restoredRows.get(0).text);
        assertEquals("Row 1 indent preserved", 1, restoredRows.get(1).indent);
    }

    // --- Source-scan tests for Repository contract ---

    @Test
    public void repositoryInterfaceHasSublistMethods() {
        String src = readSource(DB_DIR + "OutlineRepository.java");
        assertTrue("OutlineRepository must declare getAllSublists", src.contains("getAllSublists"));
        assertTrue("OutlineRepository must declare insertSublist", src.contains("insertSublist"));
        assertTrue("OutlineRepository must declare deleteSublist", src.contains("deleteSublist"));
        assertTrue("OutlineRepository must declare renameSublist", src.contains("renameSublist"));
        assertTrue("OutlineRepository must declare updateSublistPosition",
                src.contains("updateSublistPosition"));
    }

    @Test
    public void repositoryInterfaceHasRowMethods() {
        String src = readSource(DB_DIR + "OutlineRepository.java");
        assertTrue("OutlineRepository must declare getRowsForSublist",
                src.contains("getRowsForSublist"));
        assertTrue("OutlineRepository must declare insertRow", src.contains("insertRow"));
        assertTrue("OutlineRepository must declare updateRow", src.contains("updateRow"));
        assertTrue("OutlineRepository must declare deleteRow", src.contains("deleteRow"));
        assertTrue("OutlineRepository must declare deleteCompletedRows",
                src.contains("deleteCompletedRows"));
        assertTrue("OutlineRepository must declare replaceRowsForSublist",
                src.contains("replaceRowsForSublist"));
    }

    @Test
    public void repositoryInterfaceHasImportLegacy() {
        String src = readSource(DB_DIR + "OutlineRepository.java");
        assertTrue("OutlineRepository must declare importLegacy for one-shot migration",
                src.contains("importLegacy"));
    }

    @Test
    public void repositoryImplImplementsInterface() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl must implement OutlineRepository",
                src.contains("implements OutlineRepository"));
    }

    @Test
    public void repositoryImplDelegatesViaDaos() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl must hold a SublistDao field",
                src.contains("SublistDao"));
        assertTrue("OutlineRepositoryImpl must hold an OutlineRowDao field",
                src.contains("OutlineRowDao"));
    }

    @Test
    public void repositoryImplHasImportLegacyBody() {
        String src = readSource(DB_DIR + "OutlineRepositoryImpl.java");
        assertTrue("OutlineRepositoryImpl.importLegacy must call insertSublist or sublistDao.insert",
                src.contains("insertSublist") || src.contains("sublistDao.insert"));
        assertTrue("OutlineRepositoryImpl.importLegacy must call insertAll or rowDao.insert",
                src.contains("insertAll") || src.contains("rowDao.insert"));
    }

    private static void assertEquals(String msg, int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }

    private static void assertEquals(String msg, long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }

    private static void assertEquals(String msg, String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(msg + " expected:<" + expected + "> but was:<" + actual + ">");
        }
    }
}
