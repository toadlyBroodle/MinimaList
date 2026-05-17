package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.C1302f;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class ahv implements ahi {

    /* JADX INFO: renamed from: a */
    private static final String f6794a = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", "gtm_hit_unique_ids", "hit_unique_id");

    /* JADX INFO: renamed from: b */
    private static final String f6795b = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body");

    /* JADX INFO: renamed from: c */
    private static final String f6796c = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", "save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");

    /* JADX INFO: renamed from: d */
    private static final String f6797d = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", "check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");

    /* JADX INFO: renamed from: e */
    private final ahx f6798e;

    /* JADX INFO: renamed from: f */
    private volatile agz f6799f;

    /* JADX INFO: renamed from: g */
    private final ahj f6800g;

    /* JADX INFO: renamed from: h */
    private final Context f6801h;

    /* JADX INFO: renamed from: i */
    private final String f6802i;

    /* JADX INFO: renamed from: j */
    private long f6803j;

    /* JADX INFO: renamed from: k */
    private InterfaceC1300d f6804k;

    /* JADX INFO: renamed from: l */
    private final int f6805l;

    ahv(ahj ahjVar, Context context) {
        this(ahjVar, context, "gtm_urls.db", 2000);
    }

    private ahv(ahj ahjVar, Context context, String str, int i) {
        this.f6801h = context.getApplicationContext();
        this.f6802i = str;
        this.f6800g = ahjVar;
        this.f6804k = C1303g.m7263d();
        this.f6798e = new ahx(this, this.f6801h, this.f6802i);
        this.f6799f = new ait(this.f6801h, new ahw(this));
        this.f6803j = 0L;
        this.f6805l = 2000;
    }

    /* JADX INFO: renamed from: a */
    private final int m7949a(String str) {
        Cursor cursorRawQuery = null;
        SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for getNumRecords.");
        if (sQLiteDatabaseM7957b != null) {
            try {
                try {
                    String strValueOf = String.valueOf(str);
                    cursorRawQuery = sQLiteDatabaseM7957b.rawQuery(strValueOf.length() != 0 ? "SELECT COUNT(*) from ".concat(strValueOf) : new String("SELECT COUNT(*) from "), null);
                    i = cursorRawQuery.moveToFirst() ? (int) cursorRawQuery.getLong(0) : 0;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (SQLiteException e) {
                    String strValueOf2 = String.valueOf(e.getMessage());
                    ahs.m7944b(strValueOf2.length() != 0 ? "Error getting numStoredRecords: ".concat(strValueOf2) : new String("Error getting numStoredRecords: "));
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private final List<String> m7951a(int i) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            ahs.m7944b("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for peekHitIds.");
        try {
            if (sQLiteDatabaseM7957b == null) {
                return arrayList;
            }
            try {
                cursorQuery = sQLiteDatabaseM7957b.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(String.valueOf(cursorQuery.getLong(0)));
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    String strValueOf = String.valueOf(e.getMessage());
                    ahs.m7944b(strValueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(strValueOf) : new String("Error in peekHits fetching hitIds: "));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7952a(long j) {
        m7956a(new String[]{String.valueOf(j)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7953a(long j, long j2) {
        SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for getNumStoredHits.");
        if (sQLiteDatabaseM7957b == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            sQLiteDatabaseM7957b.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException e) {
            String message = e.getMessage();
            ahs.m7944b(new StringBuilder(String.valueOf(message).length() + 70).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId ").append(j).append(": ").append(message).toString());
            m7952a(j);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7956a(String[] strArr) {
        SQLiteDatabase sQLiteDatabaseM7957b;
        if (strArr == null || strArr.length == 0 || (sQLiteDatabaseM7957b = m7957b("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            sQLiteDatabaseM7957b.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))), strArr);
            this.f6800g.mo7929a(m7949a("gtm_hits") == 0);
        } catch (SQLiteException e) {
            String strValueOf = String.valueOf(e.getMessage());
            ahs.m7944b(strValueOf.length() != 0 ? "Error deleting hits: ".concat(strValueOf) : new String("Error deleting hits: "));
        }
    }

    /* JADX INFO: renamed from: b */
    private final SQLiteDatabase m7957b(String str) {
        try {
            return this.f6798e.getWritableDatabase();
        } catch (SQLiteException e) {
            Context context = this.f6801h;
            ahs.m7945b(str, e);
            if (C1302f.m7261a(context, e)) {
                ahs.m7947d("Crash reported successfully.");
            } else {
                ahs.m7947d("Failed to report crash");
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<ahd> m7960b(int i) throws Throwable {
        Cursor cursor;
        ArrayList arrayList;
        Cursor cursorQuery;
        int i2;
        HashMap map;
        ArrayList arrayList2 = new ArrayList();
        SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for peekHits");
        if (sQLiteDatabaseM7957b == null) {
            return arrayList2;
        }
        Cursor cursor2 = null;
        try {
            Cursor cursorQuery2 = sQLiteDatabaseM7957b.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(40));
            try {
                try {
                    arrayList = new ArrayList();
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            do {
                                arrayList.add(new ahd(cursorQuery2.getLong(0), cursorQuery2.getLong(1), cursorQuery2.getLong(2)));
                            } while (cursorQuery2.moveToNext());
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        try {
                            try {
                                cursorQuery = sQLiteDatabaseM7957b.query("gtm_hits", new String[]{"hit_id", "hit_url", "hit_method", "hit_headers", "hit_body"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(40));
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursorQuery = cursorQuery2;
                        }
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int i3 = 0;
                                while (true) {
                                    if (((SQLiteCursor) cursorQuery).getWindow().getNumRows() > 0) {
                                        ((ahd) arrayList.get(i3)).m7912a(cursorQuery.getString(1));
                                        ((ahd) arrayList.get(i3)).m7915b(cursorQuery.getString(2));
                                        ((ahd) arrayList.get(i3)).m7917c(cursorQuery.getString(4));
                                        try {
                                            String string = cursorQuery.getString(3);
                                            if (string != null) {
                                                JSONObject jSONObject = new JSONObject(string);
                                                JSONArray jSONArrayNames = jSONObject.names();
                                                map = new HashMap();
                                                int i4 = 0;
                                                while (true) {
                                                    int i5 = i4;
                                                    if (i5 >= jSONArrayNames.length()) {
                                                        break;
                                                    }
                                                    String string2 = jSONArrayNames.getString(i5);
                                                    map.put(string2, (String) jSONObject.opt(string2));
                                                    i4 = i5 + 1;
                                                }
                                            } else {
                                                map = null;
                                            }
                                            ((ahd) arrayList.get(i3)).m7913a(map);
                                        } catch (JSONException e2) {
                                            ahs.m7944b(String.format("Failed to read headers for hitId %d: %s", Long.valueOf(((ahd) arrayList.get(i3)).m7911a()), e2.getMessage()));
                                            i2 = i3;
                                        }
                                    } else {
                                        ahs.m7944b(String.format("HitString for hitId %d too large. Hit will be deleted.", Long.valueOf(((ahd) arrayList.get(i3)).m7911a())));
                                    }
                                    i2 = i3 + 1;
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    i3 = i2;
                                }
                            }
                            if (cursorQuery == null) {
                                return arrayList;
                            }
                            cursorQuery.close();
                            return arrayList;
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorQuery2 = cursorQuery;
                            String strValueOf = String.valueOf(e.getMessage());
                            ahs.m7944b(strValueOf.length() != 0 ? "Error in peekHits fetching hit url: ".concat(strValueOf) : new String("Error in peekHits fetching hit url: "));
                            ArrayList arrayList3 = new ArrayList();
                            boolean z = false;
                            ArrayList arrayList4 = arrayList;
                            int size = arrayList4.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = arrayList4.get(i6);
                                i6++;
                                ahd ahdVar = (ahd) obj;
                                if (TextUtils.isEmpty(ahdVar.m7916c())) {
                                    if (z) {
                                        break;
                                    }
                                    z = true;
                                }
                                arrayList3.add(ahdVar);
                            }
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            return arrayList3;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursor = cursorQuery2;
                        try {
                            String strValueOf2 = String.valueOf(e.getMessage());
                            ahs.m7944b(strValueOf2.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(strValueOf2) : new String("Error in peekHits fetching hitIds: "));
                            if (cursor == null) {
                                return arrayList;
                            }
                            cursor.close();
                            return arrayList;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor2 = cursorQuery2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                cursor = cursorQuery2;
                arrayList = arrayList2;
            }
        } catch (SQLiteException e6) {
            e = e6;
            cursor = null;
            arrayList = arrayList2;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: f */
    private final int m7965f() throws Throwable {
        Cursor cursorQuery;
        int count;
        Cursor cursor = null;
        SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for getNumStoredHits.");
        try {
            if (sQLiteDatabaseM7957b == null) {
                return 0;
            }
            try {
                cursorQuery = sQLiteDatabaseM7957b.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
                try {
                    count = cursorQuery.getCount();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    String strValueOf = String.valueOf(e.getMessage());
                    ahs.m7944b(strValueOf.length() != 0 ? "Error getting num untried hits: ".concat(strValueOf) : new String("Error getting num untried hits: "));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        count = 0;
                    } else {
                        count = 0;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
            return count;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.internal.ahi
    /* JADX INFO: renamed from: a */
    public final void mo7927a() throws Throwable {
        ahs.m7947d("GTM Dispatch running...");
        if (this.f6799f.mo7902a()) {
            List<ahd> listM7960b = m7960b(40);
            if (listM7960b.isEmpty()) {
                ahs.m7947d("...nothing to dispatch");
                this.f6800g.mo7929a(true);
            } else {
                this.f6799f.mo7901a(listM7960b);
                if (m7965f() > 0) {
                    ail.m8010b().m8020d();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ahi
    /* JADX INFO: renamed from: a */
    public final void mo7928a(long j, String str, String str2, String str3, Map<String, String> map, String str4) throws Throwable {
        long jMo7252a = this.f6804k.mo7252a();
        if (jMo7252a > this.f6803j + 86400000) {
            this.f6803j = jMo7252a;
            SQLiteDatabase sQLiteDatabaseM7957b = m7957b("Error opening database for deleteStaleHits.");
            if (sQLiteDatabaseM7957b != null) {
                ahs.m7947d(new StringBuilder(31).append("Removed ").append(sQLiteDatabaseM7957b.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.f6804k.mo7252a() - 2592000000L)})).append(" stale hits.").toString());
                this.f6800g.mo7929a(m7949a("gtm_hits") == 0);
            }
        }
        int iM7949a = (m7949a("gtm_hits") - this.f6805l) + 1;
        if (iM7949a > 0) {
            List<String> listM7951a = m7951a(iM7949a);
            ahs.m7947d(new StringBuilder(51).append("Store full, deleting ").append(listM7951a.size()).append(" hits to make room.").toString());
            m7956a((String[]) listM7951a.toArray(new String[0]));
        }
        SQLiteDatabase sQLiteDatabaseM7957b2 = m7957b("Error opening database for putHit");
        if (sQLiteDatabaseM7957b2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", (Integer) 0);
            if (str2 == null) {
                str2 = "GET";
            }
            contentValues.put("hit_method", str2);
            contentValues.put("hit_unique_id", str3);
            contentValues.put("hit_headers", map == null ? null : new JSONObject(map).toString());
            contentValues.put("hit_body", str4);
            try {
                sQLiteDatabaseM7957b2.insertOrThrow("gtm_hits", null, contentValues);
                ahs.m7947d(new StringBuilder(String.valueOf(str).length() + 19).append("Hit stored (url = ").append(str).append(")").toString());
                this.f6800g.mo7929a(false);
            } catch (SQLiteConstraintException e) {
                String strValueOf = String.valueOf(str);
                ahs.m7947d(strValueOf.length() != 0 ? "Hit has already been sent: ".concat(strValueOf) : new String("Hit has already been sent: "));
            } catch (SQLiteException e2) {
                String strValueOf2 = String.valueOf(e2.getMessage());
                ahs.m7944b(strValueOf2.length() != 0 ? "Error storing hit: ".concat(strValueOf2) : new String("Error storing hit: "));
            }
        }
        if (aia.m7973a().m7976b()) {
            ahs.m7947d("Sending hits immediately under preview.");
            mo7927a();
        }
    }
}
