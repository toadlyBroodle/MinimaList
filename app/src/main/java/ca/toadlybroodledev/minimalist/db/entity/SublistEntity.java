package ca.toadlybroodledev.minimalist.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sublists")
public class SublistEntity {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "name")
    public String name;

    // Display order in the drawer list.
    @ColumnInfo(name = "position")
    public int position;
}
