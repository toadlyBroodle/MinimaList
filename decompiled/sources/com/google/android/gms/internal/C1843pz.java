package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1307k;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.pz */
/* JADX INFO: loaded from: classes.dex */
final class C1843pz extends AbstractC1832po implements Closeable {

    /* JADX INFO: renamed from: a */
    private static final String f11341a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");

    /* JADX INFO: renamed from: b */
    private static final String f11342b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");

    /* JADX INFO: renamed from: c */
    private final C1845qa f11343c;

    /* JADX INFO: renamed from: d */
    private final C1895rx f11344d;

    /* JADX INFO: renamed from: e */
    private final C1895rx f11345e;

    C1843pz(C1834pq c1834pq) {
        super(c1834pq);
        this.f11344d = new C1895rx(m12037i());
        this.f11345e = new C1895rx(m12037i());
        this.f11343c = new C1845qa(this, c1834pq.m12056a(), "google_analytics_v4.db");
    }

    /* JADX INFO: renamed from: C */
    private final long m12097C() {
        C0903r.m6076d();
        m12052y();
        return m12099a("SELECT COUNT(*) FROM hits2", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static String m12098D() {
        return "google_analytics_v4.db";
    }

    /* JADX INFO: renamed from: a */
    private final long m12099a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m12106A().rawQuery(str, null);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                m12032d("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private final long m12100a(String str, String[] strArr, long j) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            try {
                cursorRawQuery = m12106A().rawQuery(str, strArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            if (!cursorRawQuery.moveToFirst()) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            if (cursorRawQuery == null) {
                return j2;
            }
            cursorRawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            e = e2;
            m12032d("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorRawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, String> m12102a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String strValueOf = String.valueOf(str);
                str = strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?");
            }
            return C1307k.m7272a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            m12034e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE (r10 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:25:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Long> m12104d(long j) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2 = null;
        C0903r.m6076d();
        m12052y();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase sQLiteDatabaseM12106A = m12106A();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                cursorQuery = sQLiteDatabaseM12106A.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(Long.valueOf(cursorQuery.getLong(0)));
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    m12031d("Error selecting hit ids", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private final Map<String, String> m12105g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String strValueOf = String.valueOf(str);
            return C1307k.m7272a(new URI(strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?")), "UTF-8");
        } catch (URISyntaxException e) {
            m12034e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* JADX INFO: renamed from: A */
    final SQLiteDatabase m12106A() {
        try {
            return this.f11343c.getWritableDatabase();
        } catch (SQLiteException e) {
            m12031d("Error opening database", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m12107a(long j, String str, String str2) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        m12052y();
        C0903r.m6076d();
        return m12100a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C1877rf> m12108a(long j) throws Throwable {
        Cursor cursor;
        Cursor cursor2 = null;
        C1221aj.m7074b(j >= 0);
        C0903r.m6076d();
        m12052y();
        try {
            try {
                Cursor cursorQuery = m12106A().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.moveToFirst()) {
                        do {
                            arrayList.add(new C1877rf(this, m12102a(cursorQuery.getString(2)), cursorQuery.getLong(1), C1897rz.m12296c(cursorQuery.getString(3)), cursorQuery.getLong(0), cursorQuery.getInt(4)));
                        } while (cursorQuery.moveToNext());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursorQuery;
                    try {
                        m12034e("Error loading hits from the database", e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
    }

    /* JADX INFO: renamed from: a */
    public final void m12109a(C1877rf c1877rf) throws Throwable {
        C1221aj.m7065a(c1877rf);
        C0903r.m6076d();
        m12052y();
        C1221aj.m7065a(c1877rf);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : c1877rf.m12211b().entrySet()) {
            String key = entry.getKey();
            if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                builder.appendQueryParameter(key, entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        String str = encodedQuery == null ? "" : encodedQuery;
        if (str.length() > 8192) {
            m12039k().m12228a(c1877rf, "Hit length exceeds the maximum allowed size");
            return;
        }
        int iIntValue = C1872ra.f11419c.m12204a().intValue();
        long jM12097C = m12097C();
        if (jM12097C > iIntValue - 1) {
            List<Long> listM12104d = m12104d((jM12097C - ((long) iIntValue)) + 1);
            m12031d("Store full, deleting hits to make room, count", Integer.valueOf(listM12104d.size()));
            m12110a(listM12104d);
        }
        SQLiteDatabase sQLiteDatabaseM12106A = m12106A();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", str);
        contentValues.put("hit_time", Long.valueOf(c1877rf.m12213d()));
        contentValues.put("hit_app_id", Integer.valueOf(c1877rf.m12210a()));
        contentValues.put("hit_url", c1877rf.m12215f() ? C1863qs.m12176h() : C1863qs.m12177i());
        try {
            long jInsert = sQLiteDatabaseM12106A.insert("hits2", null, contentValues);
            if (jInsert == -1) {
                m12035f("Failed to insert a hit (got -1)");
            } else {
                m12025b("Hit saved to database. db-id, hit", Long.valueOf(jInsert), c1877rf);
            }
        } catch (SQLiteException e) {
            m12034e("Error storing a hit", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12110a(List<Long> list) {
        C1221aj.m7065a(list);
        C0903r.m6076d();
        m12052y();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                sb.append(")");
                String string = sb.toString();
                try {
                    SQLiteDatabase sQLiteDatabaseM12106A = m12106A();
                    m12020a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                    int iDelete = sQLiteDatabaseM12106A.delete("hits2", string, null);
                    if (iDelete != list.size()) {
                        m12026b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    m12034e("Error deleting hits", e);
                    throw e;
                }
            }
            Long l = list.get(i2);
            if (l == null || l.longValue() == 0) {
                break;
            }
            if (i2 > 0) {
                sb.append(",");
            }
            sb.append(l);
            i = i2 + 1;
        }
        throw new SQLiteException("Invalid hit id");
    }

    /* JADX INFO: renamed from: b */
    public final void m12111b() {
        m12052y();
        m12106A().beginTransaction();
    }

    /* JADX INFO: renamed from: b */
    public final void m12112b(long j) {
        C0903r.m6076d();
        m12052y();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        m12020a("Deleting hit, id", Long.valueOf(j));
        m12110a((List<Long>) arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C1837pt> m12113c(long j) throws Throwable {
        Cursor cursor;
        m12052y();
        C0903r.m6076d();
        SQLiteDatabase sQLiteDatabaseM12106A = m12106A();
        Cursor cursor2 = null;
        try {
            try {
                int iIntValue = C1872ra.f11420d.m12204a().intValue();
                Cursor cursorQuery = sQLiteDatabaseM12106A.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(iIntValue));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.moveToFirst()) {
                        do {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            boolean z = cursorQuery.getInt(2) != 0;
                            long j2 = cursorQuery.getInt(3);
                            Map<String, String> mapM12105g = m12105g(cursorQuery.getString(4));
                            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                m12029c("Read property with empty client id or tracker id", string, string2);
                            } else {
                                arrayList.add(new C1837pt(0L, string, string2, z, j2, mapM12105g));
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    if (arrayList.size() >= iIntValue) {
                        m12033e("Sending hits to too many properties. Campaign report might be incorrect");
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursorQuery;
                    try {
                        m12034e("Error loading hits from the database", e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12114c() {
        m12052y();
        m12106A().setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f11343c.close();
        } catch (SQLiteException e) {
            m12034e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            m12034e("Error closing database", e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12115d() {
        m12052y();
        m12106A().endTransaction();
    }

    /* JADX INFO: renamed from: e */
    final boolean m12116e() {
        return m12097C() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m12117f() {
        C0903r.m6076d();
        m12052y();
        if (!this.f11344d.m12280a(86400000L)) {
            return 0;
        }
        this.f11344d.m12279a();
        m12023b("Deleting stale hits (if any)");
        int iDelete = m12106A().delete("hits2", "hit_time < ?", new String[]{Long.toString(m12037i().mo7252a() - 2592000000L)});
        m12020a("Deleted stale hits, count", Integer.valueOf(iDelete));
        return iDelete;
    }

    /* JADX INFO: renamed from: g */
    public final long m12118g() {
        C0903r.m6076d();
        m12052y();
        return m12100a(f11342b, (String[]) null, 0L);
    }
}
