package ca.toadlybroodledev.sublist.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ca.toadlybroodledev.sublist.db.dao.OutlineRowDao;
import ca.toadlybroodledev.sublist.db.dao.SublistDao;
import ca.toadlybroodledev.sublist.db.entity.OutlineRowEntity;
import ca.toadlybroodledev.sublist.db.entity.SublistEntity;

@Database(
    entities = {SublistEntity.class, OutlineRowEntity.class},
    version = 1,
    exportSchema = false
)
public abstract class SublistDatabase extends RoomDatabase {

    private static volatile SublistDatabase instance;

    public abstract SublistDao sublistDao();
    public abstract OutlineRowDao outlineRowDao();

    public static SublistDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (SublistDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            SublistDatabase.class,
                            "sublist.db"
                    ).build();
                }
            }
        }
        return instance;
    }
}
