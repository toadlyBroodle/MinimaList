package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.qa */
/* JADX INFO: loaded from: classes.dex */
final class C1845qa extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1843pz f11348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1845qa(C1843pz c1843pz, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f11348a = c1843pz;
    }

    /* JADX INFO: renamed from: a */
    private static void m12119a(SQLiteDatabase sQLiteDatabase) {
        Set<String> setM12121b = m12121b(sQLiteDatabase, "properties");
        String[] strArr = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (!setM12121b.remove(str)) {
                String strValueOf = String.valueOf(str);
                throw new SQLiteException(strValueOf.length() != 0 ? "Database properties is missing required column: ".concat(strValueOf) : new String("Database properties is missing required column: "));
            }
        }
        if (!setM12121b.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m12120a(SQLiteDatabase sQLiteDatabase, String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    if (cursorQuery == null) {
                        return zMoveToFirst;
                    }
                    cursorQuery.close();
                    return zMoveToFirst;
                } catch (SQLiteException e) {
                    e = e;
                    this.f11348a.m12029c("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Set<String> m12121b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if (!this.f11348a.f11345e.m12280a(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f11348a.f11345e.m12279a();
            this.f11348a.m12035f("Opening the database failed, dropping the table and recreating it");
            C1843pz c1843pz = this.f11348a;
            this.f11348a.m12038j().getDatabasePath(C1843pz.m12098D()).delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                this.f11348a.f11345e.m12281b();
                return writableDatabase;
            } catch (SQLiteException e2) {
                this.f11348a.m12034e("Failed to open freshly created database", e2);
                throw e2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (C1870qz.m12198a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (Build.VERSION.SDK_INT < 15) {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                cursorRawQuery.moveToFirst();
            } finally {
                cursorRawQuery.close();
            }
        }
        if (m12120a(sQLiteDatabase, "hits2")) {
            Set<String> setM12121b = m12121b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!setM12121b.remove(str)) {
                    String strValueOf = String.valueOf(str);
                    throw new SQLiteException(strValueOf.length() != 0 ? "Database hits2 is missing required column: ".concat(strValueOf) : new String("Database hits2 is missing required column: "));
                }
            }
            boolean z = setM12121b.remove("hit_app_id") ? false : true;
            if (!setM12121b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        } else {
            sQLiteDatabase.execSQL(C1843pz.f11341a);
        }
        if (m12120a(sQLiteDatabase, "properties")) {
            m12119a(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
