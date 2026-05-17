package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.zz */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
final class C2113zz extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2112zy f12749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2113zz(C2112zy c2112zy, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f12749a = c2112zy;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (Build.VERSION.SDK_INT >= 11 && (e instanceof SQLiteDatabaseLockedException)) {
                throw e;
            }
            this.f12749a.mo7393t().m7410y().m7412a("Opening the local database failed, dropping and recreating it");
            if (!this.f12749a.mo7385l().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f12749a.mo7393t().m7410y().m7413a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f12749a.mo7393t().m7410y().m7413a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2091zd.m12701a(this.f12749a.mo7393t(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        if (Build.VERSION.SDK_INT < 15) {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                cursorRawQuery.moveToFirst();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        C2091zd.m12702a(this.f12749a.mo7393t(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
