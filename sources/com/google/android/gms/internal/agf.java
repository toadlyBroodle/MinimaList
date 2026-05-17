package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1292c;
import com.google.android.gms.common.stats.C1294e;
import com.google.android.gms.common.util.C1313q;
import com.google.android.gms.common.util.C1317u;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class agf {

    /* JADX INFO: renamed from: a */
    private static String f6687a = "WakeLock";

    /* JADX INFO: renamed from: b */
    private static String f6688b = "*gcore*:";

    /* JADX INFO: renamed from: c */
    private static boolean f6689c = false;

    /* JADX INFO: renamed from: d */
    private final PowerManager.WakeLock f6690d;

    /* JADX INFO: renamed from: e */
    private WorkSource f6691e;

    /* JADX INFO: renamed from: f */
    private final int f6692f;

    /* JADX INFO: renamed from: g */
    private final String f6693g;

    /* JADX INFO: renamed from: h */
    private final String f6694h;

    /* JADX INFO: renamed from: i */
    private final String f6695i;

    /* JADX INFO: renamed from: j */
    private final Context f6696j;

    /* JADX INFO: renamed from: k */
    private boolean f6697k;

    /* JADX INFO: renamed from: l */
    private final Map<String, Integer[]> f6698l;

    /* JADX INFO: renamed from: m */
    private int f6699m;

    public agf(Context context, int i, String str) {
        this(context, 1, str, null, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private agf(Context context, int i, String str, String str2, String str3) {
        this(context, 1, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private agf(Context context, int i, String str, String str2, String str3, String str4) {
        this.f6697k = true;
        this.f6698l = new HashMap();
        C1221aj.m7068a(str, (Object) "Wake lock name can NOT be empty");
        this.f6692f = i;
        this.f6694h = null;
        this.f6695i = null;
        this.f6696j = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6693g = str;
        } else {
            String strValueOf = String.valueOf(f6688b);
            String strValueOf2 = String.valueOf(str);
            this.f6693g = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        this.f6690d = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C1317u.m7300a(this.f6696j)) {
            this.f6691e = C1317u.m7296a(context, C1313q.m7289a(str3) ? context.getPackageName() : str3);
            WorkSource workSource = this.f6691e;
            if (workSource == null || !C1317u.m7300a(this.f6696j)) {
                return;
            }
            if (this.f6691e != null) {
                this.f6691e.add(workSource);
            } else {
                this.f6691e = workSource;
            }
            try {
                this.f6690d.setWorkSource(this.f6691e);
            } catch (IllegalArgumentException e) {
                Log.wtf(f6687a, e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m7836a(String str) {
        if (!this.f6697k || TextUtils.isEmpty(null)) {
            return this.f6694h;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: all -> 0x006b, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x000c, B:14:0x0021, B:15:0x0042, B:19:0x004a, B:21:0x0052, B:22:0x0059, B:10:0x0019, B:12:0x001d), top: B:30:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: all -> 0x006b, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x000c, B:14:0x0021, B:15:0x0042, B:19:0x004a, B:21:0x0052, B:22:0x0059, B:10:0x0019, B:12:0x001d), top: B:30:0x0008 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7837a() {
        boolean z;
        String strM7836a = m7836a((String) null);
        synchronized (this) {
            if (this.f6697k) {
                Integer[] numArr = this.f6698l.get(strM7836a);
                if (numArr == null) {
                    z = false;
                } else if (numArr[0].intValue() == 1) {
                    this.f6698l.remove(strM7836a);
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    z = false;
                }
                if (!z) {
                }
            } else if (!this.f6697k && this.f6699m == 1) {
                C1294e.m7244a();
                C1294e.m7245a(this.f6696j, C1292c.m7243a(this.f6690d, strM7836a), 8, this.f6693g, strM7836a, null, this.f6692f, C1317u.m7299a(this.f6691e));
                this.f6699m--;
            }
        }
        try {
            this.f6690d.release();
        } catch (RuntimeException e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0012, B:11:0x0026, B:13:0x002a, B:15:0x0034, B:21:0x004f, B:22:0x0071, B:26:0x007a, B:17:0x0047, B:19:0x004b, B:8:0x0016, B:10:0x001e), top: B:30:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0012, B:11:0x0026, B:13:0x002a, B:15:0x0034, B:21:0x004f, B:22:0x0071, B:26:0x007a, B:17:0x0047, B:19:0x004b, B:8:0x0016, B:10:0x001e), top: B:30:0x000a }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7838a(long j) {
        boolean z;
        String strM7836a = m7836a((String) null);
        synchronized (this) {
            if ((!this.f6698l.isEmpty() || this.f6699m > 0) && !this.f6690d.isHeld()) {
                this.f6698l.clear();
                this.f6699m = 0;
            }
            if (this.f6697k) {
                Integer[] numArr = this.f6698l.get(strM7836a);
                if (numArr == null) {
                    this.f6698l.put(strM7836a, new Integer[]{1});
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                    z = false;
                }
                if (!z) {
                }
            } else if (!this.f6697k && this.f6699m == 0) {
                C1294e.m7244a();
                C1294e.m7246a(this.f6696j, C1292c.m7243a(this.f6690d, strM7836a), 7, this.f6693g, strM7836a, null, this.f6692f, C1317u.m7299a(this.f6691e), 1000L);
                this.f6699m++;
            }
        }
        this.f6690d.acquire(1000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m7839a(boolean z) {
        this.f6690d.setReferenceCounted(false);
        this.f6697k = false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7840b() {
        return this.f6690d.isHeld();
    }
}
