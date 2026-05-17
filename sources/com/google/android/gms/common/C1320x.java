package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.x */
/* JADX INFO: loaded from: classes.dex */
public class C1320x {

    /* JADX INFO: renamed from: a */
    private static C1320x f6061a;

    /* JADX INFO: renamed from: b */
    private final Context f6062b;

    private C1320x(Context context) {
        this.f6062b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    static AbstractBinderC1285o m7318a(PackageInfo packageInfo, AbstractBinderC1285o... abstractBinderC1285oArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC1286p binderC1286p = new BinderC1286p(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC1285oArr.length; i++) {
            if (abstractBinderC1285oArr[i].equals(binderC1286p)) {
                return abstractBinderC1285oArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C1320x m7319a(Context context) {
        C1221aj.m7065a(context);
        synchronized (C1320x.class) {
            if (f6061a == null) {
                C1284n.m7228a(context);
                f6061a = new C1320x(context);
            }
        }
        return f6061a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7320a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m7318a(packageInfo, C1288r.f5991a) : m7318a(packageInfo, C1288r.f5991a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7321a(String str) {
        try {
            PackageInfo packageInfoM12560b = C2040xg.m12562a(this.f6062b).m12560b(str, 64);
            if (packageInfoM12560b == null) {
                return false;
            }
            if (C1319w.m7313c(this.f6062b)) {
                return m7322b(packageInfoM12560b, true);
            }
            boolean zM7322b = m7322b(packageInfoM12560b, false);
            if (!zM7322b && m7322b(packageInfoM12560b, true)) {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
            return zM7322b;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7322b(PackageInfo packageInfo, boolean z) {
        boolean zM7232b = false;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else {
            BinderC1286p binderC1286p = new BinderC1286p(packageInfo.signatures[0].toByteArray());
            String str = packageInfo.packageName;
            zM7232b = z ? C1284n.m7232b(str, binderC1286p) : C1284n.m7230a(str, binderC1286p);
            if (!zM7232b) {
                Log.d("GoogleSignatureVerifier", new StringBuilder(27).append("Cert not in list. atk=").append(z).toString());
            }
        }
        return zM7232b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7323a(int i) {
        String[] strArrM12559a = C2040xg.m12562a(this.f6062b).m12559a(i);
        if (strArrM12559a == null || strArrM12559a.length == 0) {
            return false;
        }
        for (String str : strArrM12559a) {
            if (m7321a(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7324a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m7320a(packageInfo, false)) {
            return true;
        }
        if (!m7320a(packageInfo, true)) {
            return false;
        }
        if (C1319w.m7313c(this.f6062b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }
}
