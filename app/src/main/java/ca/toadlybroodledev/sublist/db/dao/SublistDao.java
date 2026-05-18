package ca.toadlybroodledev.sublist.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import ca.toadlybroodledev.sublist.db.entity.SublistEntity;

@Dao
public interface SublistDao {

    @Insert
    long insert(SublistEntity sublist);

    @Query("SELECT * FROM sublists ORDER BY position ASC")
    List<SublistEntity> getAll();

    @Query("DELETE FROM sublists WHERE id = :id")
    void delete(long id);

    @Query("UPDATE sublists SET name = :name WHERE id = :id")
    void rename(long id, String name);

    @Query("UPDATE sublists SET position = :position WHERE id = :id")
    void updatePosition(long id, int position);
}
