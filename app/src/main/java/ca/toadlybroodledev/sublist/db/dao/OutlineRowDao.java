package ca.toadlybroodledev.sublist.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import ca.toadlybroodledev.sublist.db.entity.OutlineRowEntity;

@Dao
public interface OutlineRowDao {

    @Insert
    long insert(OutlineRowEntity row);

    @Insert
    List<Long> insertAll(List<OutlineRowEntity> rows);

    @Update
    void update(OutlineRowEntity row);

    @Query("SELECT * FROM outline_rows WHERE sublist_id = :sublistId ORDER BY position ASC")
    List<OutlineRowEntity> getRowsForSublist(long sublistId);

    @Query("DELETE FROM outline_rows WHERE id = :id")
    void delete(long id);

    @Query("DELETE FROM outline_rows WHERE sublist_id = :sublistId AND complete = 1")
    void deleteCompletedRows(long sublistId);

    @Query("DELETE FROM outline_rows WHERE sublist_id = :sublistId")
    void deleteAllRowsForSublist(long sublistId);

    @Transaction
    default void replaceForSublist(long sublistId, List<OutlineRowEntity> rows) {
        deleteAllRowsForSublist(sublistId);
        insertAll(rows);
    }
}
