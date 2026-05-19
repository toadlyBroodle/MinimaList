package ca.toadlybroodle.minimalist.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    tableName = "outline_rows",
    foreignKeys = @ForeignKey(
        entity = SublistEntity.class,
        parentColumns = "id",
        childColumns = "sublist_id",
        onDelete = ForeignKey.CASCADE
    ),
    indices = @Index("sublist_id")
)
public class OutlineRowEntity {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "sublist_id")
    public long sublistId;

    // Rendering order within the sublist; rows are ordered by this field.
    @ColumnInfo(name = "position")
    public int position;

    @ColumnInfo(name = "text")
    public String text;

    @ColumnInfo(name = "complete")
    public boolean complete;

    @ColumnInfo(name = "collapsed")
    public boolean collapsed;

    @ColumnInfo(name = "indent")
    public int indent;

    // Epoch millis; 0 means no reminder set.
    @ColumnInfo(name = "reminder")
    public long reminder;

    @ColumnInfo(name = "is_instr")
    public boolean isInstr;
}
