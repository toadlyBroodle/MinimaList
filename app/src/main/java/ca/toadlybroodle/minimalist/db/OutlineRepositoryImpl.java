package ca.toadlybroodle.minimalist.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.toadlybroodle.minimalist.db.dao.OutlineRowDao;
import ca.toadlybroodle.minimalist.db.dao.SublistDao;
import ca.toadlybroodle.minimalist.db.entity.OutlineRowEntity;
import ca.toadlybroodle.minimalist.db.entity.SublistEntity;
import ca.toadlybroodle.minimalist.model.OutlineRow;

public class OutlineRepositoryImpl implements OutlineRepository {

    private final MinimaListDatabase db;
    private final SublistDao sublistDao;
    private final OutlineRowDao rowDao;

    public OutlineRepositoryImpl(MinimaListDatabase db) {
        this.db = db;
        this.sublistDao = db.sublistDao();
        this.rowDao = db.outlineRowDao();
    }

    @Override
    public List<SublistEntity> getAllSublists() {
        return sublistDao.getAll();
    }

    @Override
    public long insertSublist(String name, int position) {
        SublistEntity entity = new SublistEntity();
        entity.name = name;
        entity.position = position;
        return sublistDao.insert(entity);
    }

    @Override
    public void deleteSublist(long sublistId) {
        sublistDao.delete(sublistId);
    }

    @Override
    public void renameSublist(long sublistId, String name) {
        sublistDao.rename(sublistId, name);
    }

    @Override
    public void updateSublistPosition(long sublistId, int position) {
        sublistDao.updatePosition(sublistId, position);
    }

    @Override
    public List<OutlineRowEntity> getRowsForSublist(long sublistId) {
        return rowDao.getRowsForSublist(sublistId);
    }

    @Override
    public long insertRow(OutlineRowEntity row) {
        return rowDao.insert(row);
    }

    @Override
    public void updateRow(OutlineRowEntity row) {
        rowDao.update(row);
    }

    @Override
    public void deleteRow(long rowId) {
        rowDao.delete(rowId);
    }

    @Override
    public void deleteCompletedRows(long sublistId) {
        rowDao.deleteCompletedRows(sublistId);
    }

    @Override
    public void replaceRowsForSublist(long sublistId, List<OutlineRowEntity> rows) {
        rowDao.replaceForSublist(sublistId, rows);
    }

    @Override
    public HashMap<String, ArrayList<OutlineRow>> loadAllAsHashMap() {
        HashMap<String, ArrayList<OutlineRow>> result = new HashMap<>();
        for (SublistEntity sub : sublistDao.getAll()) {
            ArrayList<OutlineRow> rows = new ArrayList<>();
            for (OutlineRowEntity e : rowDao.getRowsForSublist(sub.id)) {
                OutlineRow row = new OutlineRow();
                row.id = e.id;
                row.text = e.text != null ? e.text : "";
                row.complete = e.complete;
                row.collapsed = e.collapsed;
                row.indent = e.indent;
                row.reminder = e.reminder;
                row.isInstr = e.isInstr;
                rows.add(row);
            }
            result.put(sub.name, rows);
        }
        return result;
    }

    @Override
    public void saveAllAsHashMap(HashMap<String, ArrayList<OutlineRow>> data) {
        db.runInTransaction(() -> {
            HashMap<String, Long> existing = new HashMap<>();
            List<SublistEntity> currentSublists = sublistDao.getAll();
            for (SublistEntity s : currentSublists) {
                existing.put(s.name, s.id);
            }
            for (SublistEntity s : currentSublists) {
                if (!data.containsKey(s.name)) {
                    sublistDao.delete(s.id);
                }
            }
            int position = 0;
            for (Map.Entry<String, ArrayList<OutlineRow>> entry : data.entrySet()) {
                Long sublistId = existing.get(entry.getKey());
                if (sublistId == null) {
                    sublistId = insertSublist(entry.getKey(), position);
                } else {
                    sublistDao.updatePosition(sublistId, position);
                }
                ArrayList<OutlineRowEntity> rows = new ArrayList<>();
                int rowPos = 0;
                for (OutlineRow row : entry.getValue()) {
                    OutlineRowEntity entity = new OutlineRowEntity();
                    entity.sublistId = sublistId;
                    entity.position = rowPos++;
                    entity.text = row.text != null ? row.text : "";
                    entity.complete = row.complete;
                    entity.collapsed = row.collapsed;
                    entity.indent = row.indent;
                    entity.reminder = row.reminder;
                    entity.isInstr = row.isInstr;
                    rows.add(entity);
                }
                rowDao.replaceForSublist(sublistId, rows);
                position++;
            }
        });
    }

    @Override
    public List<OutlineRowEntity> getRowsWithFutureReminders(long nowMs) {
        return rowDao.getRowsWithFutureReminders(nowMs);
    }

    @Override
    public void importLegacy(HashMap<String, ArrayList<OutlineRow>> data) {
        db.runInTransaction(() -> {
            int position = 0;
            for (Map.Entry<String, ArrayList<OutlineRow>> entry : data.entrySet()) {
                long sublistId = insertSublist(entry.getKey(), position++);
                ArrayList<OutlineRowEntity> rows = new ArrayList<>();
                int rowPos = 0;
                for (OutlineRow row : entry.getValue()) {
                    OutlineRowEntity entity = new OutlineRowEntity();
                    entity.sublistId = sublistId;
                    entity.position = rowPos++;
                    entity.text = row.text != null ? row.text : "";
                    entity.complete = row.complete;
                    entity.collapsed = row.collapsed;
                    entity.indent = row.indent;
                    entity.reminder = row.reminder;
                    entity.isInstr = row.isInstr;
                    rows.add(entity);
                }
                rowDao.insertAll(rows);
            }
        });
    }
}
