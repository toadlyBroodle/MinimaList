package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C1221aj;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.zd */
/* JADX INFO: loaded from: classes.dex */
final class C2091zd extends acd {

    /* JADX INFO: renamed from: a */
    private static final String[] f12648a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};

    /* JADX INFO: renamed from: b */
    private static final String[] f12649b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: c */
    private static final String[] f12650c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"};

    /* JADX INFO: renamed from: d */
    private static final String[] f12651d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: e */
    private static final String[] f12652e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"};

    /* JADX INFO: renamed from: f */
    private static final String[] f12653f = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    private final C2094zg f12654g;

    /* JADX INFO: renamed from: h */
    private final aee f12655h;

    C2091zd(abd abdVar) {
        super(abdVar);
        this.f12655h = new aee(mo7384k());
        this.f12654g = new C2094zg(this, mo7385l(), "google_app_measurement.db");
    }

    /* JADX INFO: renamed from: T */
    private final boolean m12695T() {
        return mo7385l().getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: a */
    private final long m12696a(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m12709A().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                } else if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final Object m12698a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo7393t().m7410y().m7412a("Loaded invalid null value from database");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                mo7393t().m7410y().m7412a("Loaded invalid blob type value, ignoring it");
                break;
            default:
                mo7393t().m7410y().m7413a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Set<String> m12699a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12700a(ContentValues contentValues, String str, Object obj) {
        C1221aj.m7067a(str);
        C1221aj.m7065a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m12701a(aac aacVar, SQLiteDatabase sQLiteDatabase) {
        if (aacVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            aacVar.m7401A().m7412a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            aacVar.m7401A().m7412a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            aacVar.m7401A().m7412a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        aacVar.m7401A().m7412a("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: renamed from: a */
    static void m12702a(aac aacVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (aacVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m12704a(aacVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            m12703a(aacVar, sQLiteDatabase, str, str3, strArr);
        } catch (SQLiteException e) {
            aacVar.m7410y().m7413a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m12703a(aac aacVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        if (aacVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Set<String> setM12699a = m12699a(sQLiteDatabase, str);
        for (String str3 : str2.split(",")) {
            if (!setM12699a.remove(str3)) {
                throw new SQLiteException(new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
            }
        }
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i += 2) {
                if (!setM12699a.remove(strArr[i])) {
                    sQLiteDatabase.execSQL(strArr[i + 1]);
                }
            }
        }
        if (setM12699a.isEmpty()) {
            return;
        }
        aacVar.m7401A().m7414a("Table has extra columns. table, columns", str, TextUtils.join(", ", setM12699a));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12704a(aac aacVar, SQLiteDatabase sQLiteDatabase, String str) throws Throwable {
        Cursor cursorQuery;
        boolean zMoveToFirst;
        Cursor cursor = null;
        try {
            if (aacVar == null) {
                throw new IllegalArgumentException("Monitor must not be null");
            }
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    zMoveToFirst = cursorQuery.moveToFirst();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    aacVar.m7401A().m7414a("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    zMoveToFirst = false;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
            }
            return zMoveToFirst;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQuery;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m12705a(String str, int i, aem aemVar) {
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        C1221aj.m7065a(aemVar);
        if (TextUtils.isEmpty(aemVar.f6511b)) {
            mo7393t().m7401A().m7415a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", aac.m7397a(str), Integer.valueOf(i), String.valueOf(aemVar.f6510a));
            return false;
        }
        try {
            byte[] bArr = new byte[aemVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aemVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", aemVar.f6510a);
            contentValues.put("event_name", aemVar.f6511b);
            contentValues.put("data", bArr);
            try {
                if (m12709A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    mo7393t().m7410y().m7413a("Failed to insert event filter (got -1). appId", aac.m7397a(str));
                }
                return true;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Error storing event filter. appId", aac.m7397a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo7393t().m7410y().m7414a("Configuration loss. Failed to serialize event filter. appId", aac.m7397a(str), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m12706a(String str, int i, aep aepVar) {
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        C1221aj.m7065a(aepVar);
        if (TextUtils.isEmpty(aepVar.f6527b)) {
            mo7393t().m7401A().m7415a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", aac.m7397a(str), Integer.valueOf(i), String.valueOf(aepVar.f6526a));
            return false;
        }
        try {
            byte[] bArr = new byte[aepVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aepVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", aepVar.f6526a);
            contentValues.put("property_name", aepVar.f6527b);
            contentValues.put("data", bArr);
            try {
                if (m12709A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo7393t().m7410y().m7413a("Failed to insert property filter (got -1). appId", aac.m7397a(str));
                return false;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Error storing property filter. appId", aac.m7397a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo7393t().m7410y().m7414a("Configuration loss. Failed to serialize property filter. appId", aac.m7397a(str), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m12707a(String str, List<Integer> list) {
        C1221aj.m7067a(str);
        m7584Q();
        mo7376c();
        SQLiteDatabase sQLiteDatabaseM12709A = m12709A();
        try {
            long jM12708b = m12708b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, mo7395v().m12684b(str, C2106zs.f12701H)));
            if (jM12708b <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            String string = new StringBuilder(String.valueOf(strJoin).length() + 2).append("(").append(strJoin).append(")").toString();
            return sQLiteDatabaseM12709A.delete("audience_filter_values", new StringBuilder(String.valueOf(string).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(string).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Database error querying filters. appId", aac.m7397a(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private final long m12708b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m12709A().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    final SQLiteDatabase m12709A() {
        mo7376c();
        try {
            return this.f12654g.getWritableDatabase();
        } catch (SQLiteException e) {
            mo7393t().m7401A().m7413a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m12710B() throws Throwable {
        Cursor cursorRawQuery;
        Throwable th;
        String string = null;
        try {
            try {
                cursorRawQuery = m12709A().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    mo7393t().m7410y().m7413a("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            cursorRawQuery = null;
            th = th3;
            if (cursorRawQuery != null) {
            }
            throw th;
        }
        return string;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m12711C() {
        return m12708b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: renamed from: D */
    final void m12712D() {
        int iDelete;
        mo7376c();
        m7584Q();
        if (m12695T()) {
            long jM7442a = mo7394u().f6145f.m7442a();
            long jMo7253b = mo7384k().mo7253b();
            if (Math.abs(jMo7253b - jM7442a) > C2106zs.f12694A.m12779b().longValue()) {
                mo7394u().f6145f.m7443a(jMo7253b);
                mo7376c();
                m7584Q();
                if (!m12695T() || (iDelete = m12709A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo7384k().mo7252a()), String.valueOf(C2090zc.m12679y())})) <= 0) {
                    return;
                }
                mo7393t().m7405E().m7413a("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final long m12713E() {
        return m12696a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: renamed from: F */
    public final long m12714F() {
        return m12696a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12715G() {
        return m12708b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m12716H() {
        return m12708b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final long m12717I() {
        long j = -1;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m12709A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7413a("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return j;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m12718a(aez aezVar) throws IOException {
        long jM7735c;
        mo7376c();
        m7584Q();
        C1221aj.m7065a(aezVar);
        C1221aj.m7067a(aezVar.f6590o);
        try {
            byte[] bArr = new byte[aezVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aezVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            aek aekVarMo7389p = mo7389p();
            C1221aj.m7065a(bArr);
            aekVarMo7389p.mo7376c();
            MessageDigest messageDigestM7738g = aek.m7738g("MD5");
            if (messageDigestM7738g == null) {
                aekVarMo7389p.mo7393t().m7410y().m7412a("Failed to get MD5");
                jM7735c = 0;
            } else {
                jM7735c = aek.m7735c(messageDigestM7738g.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", aezVar.f6590o);
            contentValues.put("metadata_fingerprint", Long.valueOf(jM7735c));
            contentValues.put("metadata", bArr);
            try {
                m12709A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return jM7735c;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Error storing raw event metadata. appId", aac.m7397a(aezVar.f6590o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo7393t().m7410y().m7414a("Data loss. Failed to serialize event metadata. appId", aac.m7397a(aezVar.f6590o), e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2092ze m12719a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Throwable {
        Cursor cursorQuery;
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        String[] strArr = {str};
        C2092ze c2092ze = new C2092ze();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM12709A = m12709A();
                cursorQuery = sQLiteDatabaseM12709A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        mo7393t().m7401A().m7413a("Not updating daily counts, app is not known. appId", aac.m7397a(str));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return c2092ze;
                    }
                    if (cursorQuery.getLong(0) == j) {
                        c2092ze.f12657b = cursorQuery.getLong(1);
                        c2092ze.f12656a = cursorQuery.getLong(2);
                        c2092ze.f12658c = cursorQuery.getLong(3);
                        c2092ze.f12659d = cursorQuery.getLong(4);
                        c2092ze.f12660e = cursorQuery.getLong(5);
                    }
                    if (z) {
                        c2092ze.f12657b++;
                    }
                    if (z2) {
                        c2092ze.f12656a++;
                    }
                    if (z3) {
                        c2092ze.f12658c++;
                    }
                    if (z4) {
                        c2092ze.f12659d++;
                    }
                    if (z5) {
                        c2092ze.f12660e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c2092ze.f12656a));
                    contentValues.put("daily_events_count", Long.valueOf(c2092ze.f12657b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c2092ze.f12658c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c2092ze.f12659d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c2092ze.f12660e));
                    sQLiteDatabaseM12709A.update("apps", contentValues, "app_id=?", strArr);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return c2092ze;
                } catch (SQLiteException e) {
                    e = e;
                    mo7393t().m7410y().m7414a("Error updating daily counts. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return c2092ze;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2099zl m12720a(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        try {
            cursorQuery = m12709A().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursorQuery = null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
            long j = cursorQuery.getLong(0);
            long j2 = cursorQuery.getLong(1);
            long j3 = cursorQuery.getLong(2);
            long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
            Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
            Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
            Boolean boolValueOf = null;
            if (!cursorQuery.isNull(6)) {
                boolValueOf = Boolean.valueOf(cursorQuery.getLong(6) == 1);
            }
            C2099zl c2099zl = new C2099zl(str, str2, j, j2, j3, j4, lValueOf, lValueOf2, boolValueOf);
            if (cursorQuery.moveToNext()) {
                mo7393t().m7410y().m7413a("Got multiple records for event aggregates, expected one. appId", aac.m7397a(str));
            }
            if (cursorQuery == null) {
                return c2099zl;
            }
            cursorQuery.close();
            return c2099zl;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = cursorQuery;
            try {
                mo7393t().m7410y().m7415a("Error querying events. appId", aac.m7397a(str), mo7388o().m7371a(str2), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = cursor;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m12721a(long j) throws Throwable {
        Cursor cursorRawQuery;
        Throwable th;
        String string = null;
        mo7376c();
        m7584Q();
        try {
            cursorRawQuery = m12709A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        mo7393t().m7405E().m7412a("No expired configs for apps with pending events");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    mo7393t().m7410y().m7413a("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            cursorRawQuery = null;
            th = th3;
            if (cursorRawQuery != null) {
            }
            throw th;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<aej> m12722a(String str) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2 = null;
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = m12709A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            }
            do {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                long j = cursorQuery.getLong(2);
                Object objM12698a = m12698a(cursorQuery, 3);
                if (objM12698a == null) {
                    mo7393t().m7410y().m7413a("Read invalid user property value, ignoring it. appId", aac.m7397a(str));
                } else {
                    arrayList.add(new aej(str, string2, string, j, objM12698a));
                }
            } while (cursorQuery.moveToNext());
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = cursorQuery;
            try {
                mo7393t().m7410y().m7414a("Error querying user properties. appId", aac.m7397a(str), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursorQuery;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<aez, Long>> m12723a(String str, int i, int i2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        List<Pair<aez, Long>> listEmptyList;
        int length;
        byte[] bArrM7762b;
        mo7376c();
        m7584Q();
        C1221aj.m7074b(i > 0);
        C1221aj.m7074b(i2 > 0);
        C1221aj.m7067a(str);
        try {
            cursorQuery = m12709A().query("queue", new String[]{"rowid", "data"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursorQuery = null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                listEmptyList = new ArrayList<>();
                int i3 = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrM7762b = mo7389p().m7762b(cursorQuery.getBlob(1));
                    } catch (IOException e2) {
                        mo7393t().m7410y().m7414a("Failed to unzip queued bundle. appId", aac.m7397a(str), e2);
                        length = i3;
                    }
                    if (!listEmptyList.isEmpty() && bArrM7762b.length + i3 > i2) {
                        break;
                    }
                    brt brtVarM10078a = brt.m10078a(bArrM7762b, 0, bArrM7762b.length);
                    aez aezVar = new aez();
                    try {
                        aezVar.mo7776a(brtVarM10078a);
                        length = bArrM7762b.length + i3;
                        listEmptyList.add(Pair.create(aezVar, Long.valueOf(j)));
                    } catch (IOException e3) {
                        mo7393t().m7410y().m7414a("Failed to merge queued bundle. appId", aac.m7397a(str), e3);
                        length = i3;
                    }
                    if (!cursorQuery.moveToNext() || length > i2) {
                        break;
                    }
                    i3 = length;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } else {
                listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = cursorQuery;
            try {
                mo7393t().m7410y().m7414a("Error querying bundles. appId", aac.m7397a(str), e);
                listEmptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = cursor;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
            }
            throw th;
        }
        return listEmptyList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        mo7393t().m7410y().m7413a("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<aej> m12724a(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        Cursor cursor2 = null;
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(str);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(String.valueOf(str3).concat("*"));
                sb.append(" and name glob ?");
            }
            Cursor cursorQuery = m12709A().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return arrayList;
                    }
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        long j = cursorQuery.getLong(1);
                        Object objM12698a = m12698a(cursorQuery, 2);
                        String string2 = cursorQuery.getString(3);
                        if (objM12698a == null) {
                            try {
                                mo7393t().m7410y().m7415a("(2)Read invalid user property value, ignoring it", aac.m7397a(str), string2, str3);
                            } catch (SQLiteException e) {
                                e = e;
                                cursor = cursorQuery;
                                str2 = string2;
                                try {
                                    mo7393t().m7410y().m7415a("(2)Error querying user properties", aac.m7397a(str), str2, e);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            arrayList.add(new aej(str, string2, string, j, objM12698a));
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        str2 = string2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursorQuery;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        mo7393t().m7410y().m7413a("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C2088za> m12725a(String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        mo7376c();
        m7584Q();
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = m12709A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            cursorQuery = null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() >= 1000) {
                    break;
                }
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                String string3 = cursorQuery.getString(2);
                Object objM12698a = m12698a(cursorQuery, 3);
                boolean z = cursorQuery.getInt(4) != 0;
                arrayList.add(new C2088za(string, string2, new aeh(string3, cursorQuery.getLong(10), objM12698a, string2), cursorQuery.getLong(8), z, cursorQuery.getString(5), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(7), C2104zq.CREATOR), cursorQuery.getLong(6), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(9), C2104zq.CREATOR), cursorQuery.getLong(11), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(12), C2104zq.CREATOR)));
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = cursorQuery;
            try {
                mo7393t().m7410y().m7413a("Error querying conditional user property value", e);
                List<C2088za> listEmptyList = Collections.emptyList();
                if (cursor == null) {
                    return listEmptyList;
                }
                cursor.close();
                return listEmptyList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = cursor;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12726a(C2083yw c2083yw) {
        C1221aj.m7065a(c2083yw);
        mo7376c();
        m7584Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2083yw.m12623b());
        contentValues.put("app_instance_id", c2083yw.m12627c());
        contentValues.put("gmp_app_id", c2083yw.m12630d());
        contentValues.put("resettable_device_id_hash", c2083yw.m12633e());
        contentValues.put("last_bundle_index", Long.valueOf(c2083yw.m12656o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2083yw.m12639g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2083yw.m12642h()));
        contentValues.put("app_version", c2083yw.m12644i());
        contentValues.put("app_store", c2083yw.m12648k());
        contentValues.put("gmp_version", Long.valueOf(c2083yw.m12650l()));
        contentValues.put("dev_cert_hash", Long.valueOf(c2083yw.m12652m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c2083yw.m12655n()));
        contentValues.put("day", Long.valueOf(c2083yw.m12661s()));
        contentValues.put("daily_public_events_count", Long.valueOf(c2083yw.m12662t()));
        contentValues.put("daily_events_count", Long.valueOf(c2083yw.m12663u()));
        contentValues.put("daily_conversions_count", Long.valueOf(c2083yw.m12664v()));
        contentValues.put("config_fetched_time", Long.valueOf(c2083yw.m12658p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2083yw.m12659q()));
        contentValues.put("app_version_int", Long.valueOf(c2083yw.m12646j()));
        contentValues.put("firebase_instance_id", c2083yw.m12636f());
        contentValues.put("daily_error_events_count", Long.valueOf(c2083yw.m12666x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2083yw.m12665w()));
        contentValues.put("health_monitor_sample", c2083yw.m12667y());
        contentValues.put("android_id", Long.valueOf(c2083yw.m12617A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2083yw.m12618B()));
        try {
            SQLiteDatabase sQLiteDatabaseM12709A = m12709A();
            if (sQLiteDatabaseM12709A.update("apps", contentValues, "app_id = ?", new String[]{c2083yw.m12623b()}) == 0 && sQLiteDatabaseM12709A.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo7393t().m7410y().m7413a("Failed to insert/update app (got -1). appId", aac.m7397a(c2083yw.m12623b()));
            }
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Error storing app. appId", aac.m7397a(c2083yw.m12623b()), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12727a(C2099zl c2099zl) {
        Long l = null;
        C1221aj.m7065a(c2099zl);
        mo7376c();
        m7584Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2099zl.f12677a);
        contentValues.put("name", c2099zl.f12678b);
        contentValues.put("lifetime_count", Long.valueOf(c2099zl.f12679c));
        contentValues.put("current_bundle_count", Long.valueOf(c2099zl.f12680d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2099zl.f12681e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2099zl.f12682f));
        contentValues.put("last_sampled_complex_event_id", c2099zl.f12683g);
        contentValues.put("last_sampling_rate", c2099zl.f12684h);
        if (c2099zl.f12685i != null && c2099zl.f12685i.booleanValue()) {
            l = 1L;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (m12709A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo7393t().m7410y().m7413a("Failed to insert/update event aggregates (got -1). appId", aac.m7397a(c2099zl.f12677a));
            }
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Error storing event aggregates. appId", aac.m7397a(c2099zl.f12677a), e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m12728a(String str, ael[] aelVarArr) {
        boolean z;
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        C1221aj.m7065a(aelVarArr);
        SQLiteDatabase sQLiteDatabaseM12709A = m12709A();
        sQLiteDatabaseM12709A.beginTransaction();
        try {
            m7584Q();
            mo7376c();
            C1221aj.m7067a(str);
            SQLiteDatabase sQLiteDatabaseM12709A2 = m12709A();
            sQLiteDatabaseM12709A2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM12709A2.delete("event_filters", "app_id=?", new String[]{str});
            for (ael aelVar : aelVarArr) {
                m7584Q();
                mo7376c();
                C1221aj.m7067a(str);
                C1221aj.m7065a(aelVar);
                C1221aj.m7065a(aelVar.f6508c);
                C1221aj.m7065a(aelVar.f6507b);
                if (aelVar.f6506a == null) {
                    mo7393t().m7401A().m7413a("Audience with no ID. appId", aac.m7397a(str));
                } else {
                    int iIntValue = aelVar.f6506a.intValue();
                    aem[] aemVarArr = aelVar.f6508c;
                    int length = aemVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            aep[] aepVarArr = aelVar.f6507b;
                            int length2 = aepVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    aem[] aemVarArr2 = aelVar.f6508c;
                                    int length3 = aemVarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else {
                                            if (!m12705a(str, iIntValue, aemVarArr2[i3])) {
                                                z = false;
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        aep[] aepVarArr2 = aelVar.f6507b;
                                        int length4 = aepVarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            }
                                            if (!m12706a(str, iIntValue, aepVarArr2[i4])) {
                                                z = false;
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    if (!z) {
                                        m7584Q();
                                        mo7376c();
                                        C1221aj.m7067a(str);
                                        SQLiteDatabase sQLiteDatabaseM12709A3 = m12709A();
                                        sQLiteDatabaseM12709A3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iIntValue)});
                                        sQLiteDatabaseM12709A3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iIntValue)});
                                    }
                                } else {
                                    if (aepVarArr[i2].f6526a == null) {
                                        mo7393t().m7401A().m7414a("Property filter with no ID. Audience definition ignored. appId, audienceId", aac.m7397a(str), aelVar.f6506a);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (aemVarArr[i].f6510a == null) {
                                mo7393t().m7401A().m7414a("Event filter with no ID. Audience definition ignored. appId, audienceId", aac.m7397a(str), aelVar.f6506a);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (ael aelVar2 : aelVarArr) {
                arrayList.add(aelVar2.f6506a);
            }
            m12707a(str, arrayList);
            sQLiteDatabaseM12709A.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseM12709A.endTransaction();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12729a(List<Long> list) {
        C1221aj.m7065a(list);
        mo7376c();
        m7584Q();
        StringBuilder sb = new StringBuilder("rowid in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                break;
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i2).longValue());
            i = i2 + 1;
        }
        sb.append(")");
        int iDelete = m12709A().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            mo7393t().m7410y().m7414a("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12730a(aej aejVar) {
        C1221aj.m7065a(aejVar);
        mo7376c();
        m7584Q();
        if (m12738c(aejVar.f6496a, aejVar.f6498c) == null) {
            if (aek.m7723a(aejVar.f6498c)) {
                if (m12708b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{aejVar.f6496a}) >= 25) {
                    return false;
                }
            } else if (m12708b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{aejVar.f6496a, aejVar.f6497b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aejVar.f6496a);
        contentValues.put("origin", aejVar.f6497b);
        contentValues.put("name", aejVar.f6498c);
        contentValues.put("set_timestamp", Long.valueOf(aejVar.f6499d));
        m12700a(contentValues, "value", aejVar.f6500e);
        try {
            if (m12709A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo7393t().m7410y().m7413a("Failed to insert/update user property (got -1). appId", aac.m7397a(aejVar.f6496a));
            }
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Error storing user property. appId", aac.m7397a(aejVar.f6496a), e);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12731a(aez aezVar, boolean z) {
        mo7376c();
        m7584Q();
        C1221aj.m7065a(aezVar);
        C1221aj.m7067a(aezVar.f6590o);
        C1221aj.m7065a(aezVar.f6581f);
        m12712D();
        long jMo7252a = mo7384k().mo7252a();
        if (aezVar.f6581f.longValue() < jMo7252a - C2090zc.m12679y() || aezVar.f6581f.longValue() > C2090zc.m12679y() + jMo7252a) {
            mo7393t().m7401A().m7415a("Storing bundle outside of the max uploading time span. appId, now, timestamp", aac.m7397a(aezVar.f6590o), Long.valueOf(jMo7252a), aezVar.f6581f);
        }
        try {
            byte[] bArr = new byte[aezVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aezVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            byte[] bArrM7758a = mo7389p().m7758a(bArr);
            mo7393t().m7405E().m7413a("Saving bundle, size", Integer.valueOf(bArrM7758a.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", aezVar.f6590o);
            contentValues.put("bundle_end_timestamp", aezVar.f6581f);
            contentValues.put("data", bArrM7758a);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (m12709A().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo7393t().m7410y().m7413a("Failed to insert bundle (got -1). appId", aac.m7397a(aezVar.f6590o));
                return false;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Error storing bundle. appId", aac.m7397a(aezVar.f6590o), e);
                return false;
            }
        } catch (IOException e2) {
            mo7393t().m7410y().m7414a("Data loss. Failed to serialize bundle. appId", aac.m7397a(aezVar.f6590o), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12732a(C2088za c2088za) {
        C1221aj.m7065a(c2088za);
        mo7376c();
        m7584Q();
        if (m12738c(c2088za.f12635a, c2088za.f12637c.f6488a) == null && m12708b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{c2088za.f12635a}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2088za.f12635a);
        contentValues.put("origin", c2088za.f12636b);
        contentValues.put("name", c2088za.f12637c.f6488a);
        m12700a(contentValues, "value", c2088za.f12637c.m7712a());
        contentValues.put("active", Boolean.valueOf(c2088za.f12639e));
        contentValues.put("trigger_event_name", c2088za.f12640f);
        contentValues.put("trigger_timeout", Long.valueOf(c2088za.f12642h));
        mo7389p();
        contentValues.put("timed_out_event", aek.m7729a((Parcelable) c2088za.f12641g));
        contentValues.put("creation_timestamp", Long.valueOf(c2088za.f12638d));
        mo7389p();
        contentValues.put("triggered_event", aek.m7729a((Parcelable) c2088za.f12643i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2088za.f12637c.f6489b));
        contentValues.put("time_to_live", Long.valueOf(c2088za.f12644j));
        mo7389p();
        contentValues.put("expired_event", aek.m7729a((Parcelable) c2088za.f12645k));
        try {
            if (m12709A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo7393t().m7410y().m7413a("Failed to insert/update conditional user property (got -1)", aac.m7397a(c2088za.f12635a));
            }
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Error storing conditional user property", aac.m7397a(c2088za.f12635a), e);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12733a(C2098zk c2098zk, long j, boolean z) {
        mo7376c();
        m7584Q();
        C1221aj.m7065a(c2098zk);
        C1221aj.m7067a(c2098zk.f12671a);
        aew aewVar = new aew();
        aewVar.f6557d = Long.valueOf(c2098zk.f12674d);
        aewVar.f6554a = new aex[c2098zk.f12675e.m12767a()];
        int i = 0;
        for (String str : c2098zk.f12675e) {
            aex aexVar = new aex();
            aewVar.f6554a[i] = aexVar;
            aexVar.f6560a = str;
            mo7389p().m7753a(aexVar, c2098zk.f12675e.m12768a(str));
            i++;
        }
        try {
            byte[] bArr = new byte[aewVar.m10166f()];
            bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
            aewVar.mo7777a(bruVarM10108a);
            bruVarM10108a.m10122a();
            mo7393t().m7405E().m7414a("Saving event, name, data size", mo7388o().m7371a(c2098zk.f12672b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2098zk.f12671a);
            contentValues.put("name", c2098zk.f12672b);
            contentValues.put("timestamp", Long.valueOf(c2098zk.f12673c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (m12709A().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                mo7393t().m7410y().m7413a("Failed to insert raw event (got -1). appId", aac.m7397a(c2098zk.f12671a));
                return false;
            } catch (SQLiteException e) {
                mo7393t().m7410y().m7414a("Error storing raw event. appId", aac.m7397a(c2098zk.f12671a), e);
                return false;
            }
        } catch (IOException e2) {
            mo7393t().m7410y().m7414a("Data loss. Failed to serialize event params/data. appId", aac.m7397a(c2098zk.f12671a), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2083yw m12734b(String str) {
        Cursor cursorQuery;
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        try {
            cursorQuery = m12709A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    C2083yw c2083yw = new C2083yw(this.f6329p, str);
                    c2083yw.m12621a(cursorQuery.getString(0));
                    c2083yw.m12625b(cursorQuery.getString(1));
                    c2083yw.m12629c(cursorQuery.getString(2));
                    c2083yw.m12637f(cursorQuery.getLong(3));
                    c2083yw.m12620a(cursorQuery.getLong(4));
                    c2083yw.m12624b(cursorQuery.getLong(5));
                    c2083yw.m12635e(cursorQuery.getString(6));
                    c2083yw.m12638f(cursorQuery.getString(7));
                    c2083yw.m12631d(cursorQuery.getLong(8));
                    c2083yw.m12634e(cursorQuery.getLong(9));
                    c2083yw.m12622a(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c2083yw.m12645i(cursorQuery.getLong(11));
                    c2083yw.m12647j(cursorQuery.getLong(12));
                    c2083yw.m12649k(cursorQuery.getLong(13));
                    c2083yw.m12651l(cursorQuery.getLong(14));
                    c2083yw.m12640g(cursorQuery.getLong(15));
                    c2083yw.m12643h(cursorQuery.getLong(16));
                    c2083yw.m12628c(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c2083yw.m12632d(cursorQuery.getString(18));
                    c2083yw.m12654n(cursorQuery.getLong(19));
                    c2083yw.m12653m(cursorQuery.getLong(20));
                    c2083yw.m12641g(cursorQuery.getString(21));
                    c2083yw.m12657o(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                    c2083yw.m12626b(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    c2083yw.m12619a();
                    if (cursorQuery.moveToNext()) {
                        mo7393t().m7410y().m7413a("Got multiple records for app, expected one. appId", aac.m7397a(str));
                    }
                    if (cursorQuery == null) {
                        return c2083yw;
                    }
                    cursorQuery.close();
                    return c2083yw;
                } catch (SQLiteException e) {
                    e = e;
                    mo7393t().m7410y().m7414a("Error querying app. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
            }
            th = th;
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final List<C2088za> m12735b(String str, String str2, String str3) {
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m12725a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: b */
    public final void m12736b(String str, String str2) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        try {
            mo7393t().m7405E().m7413a("Deleted user attribute rows", Integer.valueOf(m12709A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7415a("Error deleting user attribute. appId", aac.m7397a(str), mo7388o().m7375c(str2), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m12737c(String str) {
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        try {
            return m12709A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo7395v().m12684b(str, C2106zs.f12726r))))});
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7414a("Error deleting over the limit events. appId", aac.m7397a(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aej m12738c(String str, String str2) {
        Cursor cursor;
        Cursor cursor2 = null;
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        try {
            Cursor cursorQuery = m12709A().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                aej aejVar = new aej(str, cursorQuery.getString(2), str2, cursorQuery.getLong(0), m12698a(cursorQuery, 1));
                if (cursorQuery.moveToNext()) {
                    mo7393t().m7410y().m7413a("Got multiple records for user property, expected one. appId", aac.m7397a(str));
                }
                if (cursorQuery == null) {
                    return aejVar;
                }
                cursorQuery.close();
                return aejVar;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    mo7393t().m7410y().m7415a("Error querying user property. appId", aac.m7397a(str), mo7388o().m7375c(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2088za m12739d(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        try {
            cursorQuery = m12709A().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String string = cursorQuery.getString(0);
                Object objM12698a = m12698a(cursorQuery, 1);
                boolean z = cursorQuery.getInt(2) != 0;
                C2088za c2088za = new C2088za(str, string, new aeh(str2, cursorQuery.getLong(8), objM12698a, string), cursorQuery.getLong(6), z, cursorQuery.getString(3), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(5), C2104zq.CREATOR), cursorQuery.getLong(4), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(7), C2104zq.CREATOR), cursorQuery.getLong(9), (C2104zq) mo7389p().m7748a(cursorQuery.getBlob(10), C2104zq.CREATOR));
                if (cursorQuery.moveToNext()) {
                    mo7393t().m7410y().m7414a("Got multiple records for conditional property, expected one", aac.m7397a(str), mo7388o().m7375c(str2));
                }
                if (cursorQuery == null) {
                    return c2088za;
                }
                cursorQuery.close();
                return c2088za;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    mo7393t().m7410y().m7415a("Error querying conditional property", aac.m7397a(str), mo7388o().m7375c(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery = cursor;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m12740d(String str) {
        Cursor cursorQuery;
        C1221aj.m7067a(str);
        mo7376c();
        m7584Q();
        try {
            cursorQuery = m12709A().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    if (cursorQuery.moveToNext()) {
                        mo7393t().m7410y().m7413a("Got multiple records for app config, expected one. appId", aac.m7397a(str));
                    }
                    if (cursorQuery == null) {
                        return blob;
                    }
                    cursorQuery.close();
                    return blob;
                } catch (SQLiteException e) {
                    e = e;
                    mo7393t().m7410y().m7414a("Error querying remote config. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
            }
            th = th;
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final int m12741e(String str, String str2) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        try {
            return m12709A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7415a("Error deleting conditional property", aac.m7397a(str), mo7388o().m7375c(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<Integer, afa> m12742e(String str) {
        Cursor cursorQuery;
        Cursor cursor = null;
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        try {
            try {
                cursorQuery = m12709A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    C0207a c0207a = new C0207a();
                    do {
                        int i = cursorQuery.getInt(0);
                        byte[] blob = cursorQuery.getBlob(1);
                        brt brtVarM10078a = brt.m10078a(blob, 0, blob.length);
                        afa afaVar = new afa();
                        try {
                            afaVar.mo7776a(brtVarM10078a);
                            c0207a.put(Integer.valueOf(i), afaVar);
                        } catch (IOException e) {
                            mo7393t().m7410y().m7415a("Failed to merge filter results. appId, audienceId, error", aac.m7397a(str), Integer.valueOf(i), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery == null) {
                        return c0207a;
                    }
                    cursorQuery.close();
                    return c0207a;
                } catch (SQLiteException e2) {
                    e = e2;
                    mo7393t().m7410y().m7414a("Database error querying filter results. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m12743f(String str) {
        C1221aj.m7067a(str);
        return m12696a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<Integer, List<aem>> m12744f(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor = null;
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        C0207a c0207a = new C0207a();
        try {
            try {
                cursorQuery = m12709A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map<Integer, List<aem>> mapEmptyMap = Collections.emptyMap();
                        if (cursorQuery == null) {
                            return mapEmptyMap;
                        }
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        byte[] blob = cursorQuery.getBlob(1);
                        brt brtVarM10078a = brt.m10078a(blob, 0, blob.length);
                        aem aemVar = new aem();
                        try {
                            aemVar.mo7776a(brtVarM10078a);
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) c0207a.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c0207a.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(aemVar);
                        } catch (IOException e) {
                            mo7393t().m7410y().m7414a("Failed to merge filter. appId", aac.m7397a(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return c0207a;
                } catch (SQLiteException e2) {
                    e = e2;
                    mo7393t().m7410y().m7414a("Database error querying filters. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map<Integer, List<aep>> m12745g(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor = null;
        m7584Q();
        mo7376c();
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        C0207a c0207a = new C0207a();
        try {
            try {
                cursorQuery = m12709A().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map<Integer, List<aep>> mapEmptyMap = Collections.emptyMap();
                        if (cursorQuery == null) {
                            return mapEmptyMap;
                        }
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        byte[] blob = cursorQuery.getBlob(1);
                        brt brtVarM10078a = brt.m10078a(blob, 0, blob.length);
                        aep aepVar = new aep();
                        try {
                            aepVar.mo7776a(brtVarM10078a);
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) c0207a.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c0207a.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(aepVar);
                        } catch (IOException e) {
                            mo7393t().m7410y().m7414a("Failed to merge filter", aac.m7397a(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return c0207a;
                } catch (SQLiteException e2) {
                    e = e2;
                    mo7393t().m7410y().m7414a("Database error querying filters. appId", aac.m7397a(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2 A[Catch: all -> 0x00e7, SQLiteException -> 0x00ec, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:3:0x0017, B:5:0x004a, B:7:0x0074, B:11:0x008b, B:13:0x00b2, B:15:0x00c8, B:19:0x00d2), top: B:27:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[Catch: all -> 0x00e7, SQLiteException -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:3:0x0017, B:5:0x004a, B:7:0x0074, B:11:0x008b, B:13:0x00b2, B:15:0x00c8, B:19:0x00d2), top: B:27:0x0017 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e3 -> B:26:0x0089). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final long m12746h(String str, String str2) {
        SQLiteException e;
        long jM12696a;
        ContentValues contentValues;
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        mo7376c();
        m7584Q();
        SQLiteDatabase sQLiteDatabaseM12709A = m12709A();
        sQLiteDatabaseM12709A.beginTransaction();
        try {
            try {
                jM12696a = m12696a(new StringBuilder(String.valueOf(str2).length() + 32).append("select ").append(str2).append(" from app2 where app_id=?").toString(), new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseM12709A.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
            jM12696a = 0;
        }
        if (jM12696a == -1) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", (Integer) 0);
            contentValues2.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseM12709A.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                mo7393t().m7410y().m7414a("Failed to insert column (got -1). appId", aac.m7397a(str), str2);
                sQLiteDatabaseM12709A.endTransaction();
                jM12696a = -1;
            } else {
                jM12696a = 0;
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put(str2, Long.valueOf(1 + jM12696a));
                    if (sQLiteDatabaseM12709A.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
                        mo7393t().m7410y().m7414a("Failed to update column (got 0). appId", aac.m7397a(str), str2);
                        sQLiteDatabaseM12709A.endTransaction();
                        jM12696a = -1;
                    } else {
                        sQLiteDatabaseM12709A.setTransactionSuccessful();
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    mo7393t().m7410y().m7415a("Error inserting column. appId", aac.m7397a(str), str2, e);
                    sQLiteDatabaseM12709A.endTransaction();
                }
            }
            mo7393t().m7410y().m7415a("Error inserting column. appId", aac.m7397a(str), str2, e);
            sQLiteDatabaseM12709A.endTransaction();
        } else {
            contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put(str2, Long.valueOf(1 + jM12696a));
            if (sQLiteDatabaseM12709A.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
            }
        }
        return jM12696a;
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m12747x() {
        m7584Q();
        m12709A().beginTransaction();
    }

    /* JADX INFO: renamed from: y */
    public final void m12748y() {
        m7584Q();
        m12709A().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: z */
    public final void m12749z() {
        m7584Q();
        m12709A().endTransaction();
    }
}
