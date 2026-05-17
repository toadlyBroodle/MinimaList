package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
final class bbt extends SQLiteOpenHelper {
    public bbt(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX INFO: renamed from: a */
    private static void m8857a(SQLiteDatabase sQLiteDatabase, String str) {
        String strValueOf = String.valueOf(str);
        sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
        sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
        sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > 1) {
            throw new AssertionError(new StringBuilder(40).append("We don't handle upgrading to ").append(i2).toString());
        }
        m8857a(sQLiteDatabase, "serverCache");
        sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
        m8857a(sQLiteDatabase, "complete");
        sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
    }
}
