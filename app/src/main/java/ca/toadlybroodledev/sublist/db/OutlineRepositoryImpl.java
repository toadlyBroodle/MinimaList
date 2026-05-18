package ca.toadlybroodledev.sublist.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.toadlybroodledev.sublist.db.dao.OutlineRowDao;
import ca.toadlybroodledev.sublist.db.dao.SublistDao;
import ca.toadlybroodledev.sublist.db.entity.OutlineRowEntity;
import ca.toadlybroodledev.sublist.db.entity.SublistEntity;
import ca.toadlybroodledev.sublist.model.OutlineRow;

public class OutlineRepositoryImpl implements OutlineRepository {

    private final SublistDatabase db;
    private final SublistDao sublistDao;
    private final OutlineRowDao rowDao;

    public OutlineRepositoryImpl(SublistDatabase db) {
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
