package ca.toadlybroodledev.sublist.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ca.toadlybroodledev.sublist.db.entity.OutlineRowEntity;
import ca.toadlybroodledev.sublist.db.entity.SublistEntity;
import ca.toadlybroodledev.sublist.model.OutlineRow;

public interface OutlineRepository {

    // Sublist operations
    List<SublistEntity> getAllSublists();
    long insertSublist(String name, int position);
    void deleteSublist(long sublistId);
    void renameSublist(long sublistId, String name);
    void updateSublistPosition(long sublistId, int position);

    // Row operations
    List<OutlineRowEntity> getRowsForSublist(long sublistId);
    long insertRow(OutlineRowEntity row);
    void updateRow(OutlineRowEntity row);
    void deleteRow(long rowId);
    void deleteCompletedRows(long sublistId);

    // Replaces all rows for the given sublist atomically (delete-then-insert).
    void replaceRowsForSublist(long sublistId, List<OutlineRowEntity> rows);

    // One-shot legacy migration: imports the HashMap produced by OutlineStore / AppSettings
    // into Room. Called once on first launch after Room is available.
    void importLegacy(HashMap<String, ArrayList<OutlineRow>> data);

    // Reconstructs the in-memory HashMap<sublist-name, row-list> shape from Room. Used by
    // the active read path that previously deserialized a Gson HashMap from disk.
    HashMap<String, ArrayList<OutlineRow>> loadAllAsHashMap();

    // Persists the current in-memory state. Walks the HashMap, ensuring each sublist exists
    // (by name) and atomically replacing its rows.
    void saveAllAsHashMap(HashMap<String, ArrayList<OutlineRow>> data);
}
