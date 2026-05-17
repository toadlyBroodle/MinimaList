package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.zy */
/* JADX INFO: loaded from: classes.dex */
public final class C2112zy extends acd {

    /* JADX INFO: renamed from: a */
    private final C2113zz f12747a;

    /* JADX INFO: renamed from: b */
    private boolean f12748b;

    C2112zy(abd abdVar) {
        super(abdVar);
        this.f12747a = new C2113zz(this, mo7385l(), "google_app_measurement_local.db");
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: a */
    private final boolean m12787a(int i, byte[] bArr) {
        mo7376c();
        if (this.f12748b) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            SQLiteDatabase sQLiteDatabase = null;
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabaseM12788z = m12788z();
                if (sQLiteDatabaseM12788z == null) {
                    this.f12748b = true;
                    if (sQLiteDatabaseM12788z != null) {
                        sQLiteDatabaseM12788z.close();
                    }
                    return false;
                }
                sQLiteDatabaseM12788z.beginTransaction();
                long j = 0;
                Cursor cursorRawQuery = sQLiteDatabaseM12788z.rawQuery("select count(1) from messages", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                if (j >= 100000) {
                    mo7393t().m7410y().m7412a("Data loss, local db full");
                    long j2 = (100000 - j) + 1;
                    long jDelete = sQLiteDatabaseM12788z.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                    if (jDelete != j2) {
                        mo7393t().m7410y().m7415a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                    }
                }
                sQLiteDatabaseM12788z.insertOrThrow("messages", null, contentValues);
                sQLiteDatabaseM12788z.setTransactionSuccessful();
                sQLiteDatabaseM12788z.endTransaction();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (sQLiteDatabaseM12788z != null) {
                    sQLiteDatabaseM12788z.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                try {
                    mo7393t().m7410y().m7413a("Error writing entry to local database", e);
                    this.f12748b = true;
                    if (0 != 0) {
                        cursor.close();
                    }
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                if (Build.VERSION.SDK_INT < 11 || !(e2 instanceof SQLiteDatabaseLockedException)) {
                    if (0 != 0 && sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    mo7393t().m7410y().m7413a("Error writing entry to local database", e2);
                    this.f12748b = true;
                } else {
                    SystemClock.sleep(i2);
                    i2 += 20;
                }
                if (0 != 0) {
                    cursor.close();
                }
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        mo7393t().m7401A().m7412a("Failed to write entry to local database");
        return false;
    }

    /* JADX INFO: renamed from: z */
    private final SQLiteDatabase m12788z() {
        if (this.f12748b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f12747a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f12748b = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List<com.google.android.gms.internal.we>] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @TargetApi(11)
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractC2011we> m12789a(int i) {
        Cursor cursorQuery;
        ?? r2;
        Cursor cursor;
        int i2;
        aeh aehVarCreateFromParcel;
        C2088za c2088zaCreateFromParcel;
        mo7376c();
        if (this.f12748b) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!mo7385l().getDatabasePath("google_app_measurement_local.db").exists()) {
            return arrayList;
        }
        int i3 = 5;
        int i4 = 0;
        while (i4 < 5) {
            ?? r1 = 0;
            r1 = 0;
            try {
                ?? M12788z = m12788z();
                try {
                    if (M12788z == 0) {
                        this.f12748b = true;
                        if (M12788z != 0) {
                            M12788z.close();
                        }
                        M12788z = 0;
                    } else {
                        M12788z.beginTransaction();
                        cursorQuery = M12788z.query("messages", new String[]{"rowid", "type", "entry"}, null, null, null, null, "rowid asc", Integer.toString(100));
                        long j = -1;
                        while (cursorQuery.moveToNext()) {
                            try {
                                j = cursorQuery.getLong(0);
                                int i5 = cursorQuery.getInt(1);
                                byte[] blob = cursorQuery.getBlob(2);
                                if (i5 == 0) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                        parcelObtain.setDataPosition(0);
                                        C2104zq c2104zqCreateFromParcel = C2104zq.CREATOR.createFromParcel(parcelObtain);
                                        if (c2104zqCreateFromParcel != null) {
                                            arrayList.add(c2104zqCreateFromParcel);
                                        }
                                    } catch (C2013wg e) {
                                        mo7393t().m7410y().m7412a("Failed to load event from local database");
                                    } finally {
                                    }
                                } else if (i5 == 1) {
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        try {
                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                            parcelObtain2.setDataPosition(0);
                                            aehVarCreateFromParcel = aeh.CREATOR.createFromParcel(parcelObtain2);
                                        } catch (C2013wg e2) {
                                            mo7393t().m7410y().m7412a("Failed to load user property from local database");
                                            parcelObtain2.recycle();
                                            aehVarCreateFromParcel = null;
                                        }
                                        if (aehVarCreateFromParcel != null) {
                                            arrayList.add(aehVarCreateFromParcel);
                                        }
                                    } finally {
                                    }
                                } else if (i5 == 2) {
                                    Parcel parcelObtain3 = Parcel.obtain();
                                    try {
                                        try {
                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                            parcelObtain3.setDataPosition(0);
                                            c2088zaCreateFromParcel = C2088za.CREATOR.createFromParcel(parcelObtain3);
                                        } catch (C2013wg e3) {
                                            mo7393t().m7410y().m7412a("Failed to load user property from local database");
                                            parcelObtain3.recycle();
                                            c2088zaCreateFromParcel = null;
                                        }
                                        if (c2088zaCreateFromParcel != null) {
                                            arrayList.add(c2088zaCreateFromParcel);
                                        }
                                    } finally {
                                    }
                                } else {
                                    mo7393t().m7410y().m7412a("Unknown record type in local database");
                                }
                            } catch (SQLiteFullException e4) {
                                cursor = cursorQuery;
                                r2 = M12788z;
                                e = e4;
                                try {
                                    mo7393t().m7410y().m7413a("Error reading entries from local database", e);
                                    this.f12748b = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (r2 != 0) {
                                        r2.close();
                                        i2 = i3;
                                    } else {
                                        i2 = i3;
                                    }
                                    i4++;
                                    i3 = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    Cursor cursor2 = cursor;
                                    r1 = r2;
                                    cursorQuery = cursor2;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (r1 != 0) {
                                        r1.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e5) {
                                r1 = M12788z;
                                e = e5;
                                try {
                                    if (Build.VERSION.SDK_INT < 11 || !(e instanceof SQLiteDatabaseLockedException)) {
                                        if (r1 != 0 && r1.inTransaction()) {
                                            r1.endTransaction();
                                        }
                                        mo7393t().m7410y().m7413a("Error reading entries from local database", e);
                                        this.f12748b = true;
                                        i2 = i3;
                                    } else {
                                        SystemClock.sleep(i3);
                                        i2 = i3 + 20;
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (r1 != 0) {
                                        r1.close();
                                    }
                                    i4++;
                                    i3 = i2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursorQuery != null) {
                                    }
                                    if (r1 != 0) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                r1 = M12788z;
                                th = th3;
                                if (cursorQuery != null) {
                                }
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        }
                        if (M12788z.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                            mo7393t().m7410y().m7412a("Fewer entries removed from local database than expected");
                        }
                        M12788z.setTransactionSuccessful();
                        M12788z.endTransaction();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (M12788z != 0) {
                            M12788z.close();
                        }
                        M12788z = arrayList;
                    }
                    return M12788z;
                } catch (SQLiteFullException e6) {
                    r2 = M12788z;
                    e = e6;
                    cursor = null;
                } catch (SQLiteException e7) {
                    cursorQuery = null;
                    r1 = M12788z;
                    e = e7;
                } catch (Throwable th4) {
                    cursorQuery = null;
                    r1 = M12788z;
                    th = th4;
                }
            } catch (SQLiteFullException e8) {
                e = e8;
                r2 = 0;
                cursor = null;
            } catch (SQLiteException e9) {
                e = e9;
                cursorQuery = null;
            } catch (Throwable th5) {
                th = th5;
                cursorQuery = null;
            }
        }
        mo7393t().m7401A().m7412a("Failed to read events from database in reasonable time");
        return null;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12790a(aeh aehVar) {
        Parcel parcelObtain = Parcel.obtain();
        aehVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m12787a(1, bArrMarshall);
        }
        mo7393t().m7401A().m7412a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12791a(C2088za c2088za) {
        mo7389p();
        byte[] bArrM7729a = aek.m7729a((Parcelable) c2088za);
        if (bArrM7729a.length <= 131072) {
            return m12787a(2, bArrM7729a);
        }
        mo7393t().m7401A().m7412a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12792a(C2104zq c2104zq) {
        Parcel parcelObtain = Parcel.obtain();
        c2104zq.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m12787a(0, bArrMarshall);
        }
        mo7393t().m7401A().m7412a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m12793y() {
        mo7376c();
        try {
            int iDelete = m12788z().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                mo7393t().m7405E().m7413a("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            mo7393t().m7410y().m7413a("Error resetting local analytics data. error", e);
        }
    }
}
