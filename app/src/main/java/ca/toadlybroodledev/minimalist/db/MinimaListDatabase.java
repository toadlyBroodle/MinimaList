package ca.toadlybroodledev.minimalist.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ca.toadlybroodledev.minimalist.db.dao.OutlineRowDao;
import ca.toadlybroodledev.minimalist.db.dao.SublistDao;
import ca.toadlybroodledev.minimalist.db.entity.OutlineRowEntity;
import ca.toadlybroodledev.minimalist.db.entity.SublistEntity;

@Database(
    entities = {SublistEntity.class, OutlineRowEntity.class},
    version = 1,
    exportSchema = false
)
public abstract class MinimaListDatabase extends RoomDatabase {

    private static volatile MinimaListDatabase instance;

    public abstract SublistDao sublistDao();
    public abstract OutlineRowDao outlineRowDao();

    public static MinimaListDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (MinimaListDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            MinimaListDatabase.class,
                            "sublist.db"
                    ).build();
                }
            }
        }
        return instance;
    }
}
