package com.google.android.gms.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ahx extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private boolean f6807a;

    /* JADX INFO: renamed from: b */
    private long f6808b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ ahv f6809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ahx(ahv ahvVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f6809c = ahvVar;
        this.f6808b = 0L;
    }

    /* JADX INFO: renamed from: a */
    private static void m7969a(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" WHERE 0").toString(), null);
        HashSet hashSet = new HashSet();
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            cursorRawQuery.close();
            for (String str3 : list) {
                if (!hashSet.remove(str3)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", str3, str));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", str));
            }
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7970a(String str, SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            Cursor cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                if (cursorQuery == null) {
                    return zMoveToFirst;
                }
                cursorQuery.close();
                return zMoveToFirst;
            } catch (SQLiteException e) {
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                cursor2 = cursorQuery;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if (this.f6807a && this.f6808b + 3600000 > this.f6809c.f6804k.mo7252a()) {
            throw new SQLiteException("Database creation failed");
        }
        SQLiteDatabase writableDatabase = null;
        this.f6807a = true;
        this.f6808b = this.f6809c.f6804k.mo7252a();
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f6809c.f6801h.getDatabasePath(this.f6809c.f6802i).delete();
        }
        if (writableDatabase == null) {
            writableDatabase = super.getWritableDatabase();
        }
        this.f6807a = false;
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (ahc.m7910a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
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
        if (m7970a("gtm_hit_unique_ids", sQLiteDatabase)) {
            m7969a(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
        } else {
            sQLiteDatabase.execSQL(ahv.f6794a);
        }
        if (m7970a("gtm_hits", sQLiteDatabase)) {
            m7969a(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
        } else {
            sQLiteDatabase.execSQL(ahv.f6795b);
        }
        sQLiteDatabase.execSQL(ahv.f6796c);
        sQLiteDatabase.execSQL(ahv.f6797d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
