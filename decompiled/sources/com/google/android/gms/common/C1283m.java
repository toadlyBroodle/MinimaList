package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1265l;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.m */
/* JADX INFO: loaded from: classes.dex */
public class C1283m {

    /* JADX INFO: renamed from: b */
    public static final int f5983b = C1319w.f6055b;

    /* JADX INFO: renamed from: a */
    private static final C1283m f5982a = new C1283m();

    C1283m() {
    }

    /* JADX INFO: renamed from: a */
    public static Intent m7220a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !C1304h.m7265b(context)) ? C1265l.m7210a("com.google.android.gms", m7221a(context, str)) : C1265l.m7208a();
            case 3:
                return C1265l.m7209a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m7221a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5983b);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C2040xg.m12562a(context).m12560b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C1283m m7222b() {
        return f5982a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7223b(Context context, int i) {
        return C1319w.m7312b(context, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m7224c(Context context) {
        C1319w.m7314d(context);
    }

    /* JADX INFO: renamed from: d */
    public static int m7225d(Context context) {
        return C1319w.m7317g(context);
    }

    /* JADX INFO: renamed from: a */
    public int mo7040a(Context context) {
        int iM7310b = C1319w.m7310b(context);
        if (C1319w.m7312b(context, iM7310b)) {
            return 18;
        }
        return iM7310b;
    }

    /* JADX INFO: renamed from: a */
    public PendingIntent mo7042a(Context context, int i, int i2) {
        return m7226a(context, i, i2, null);
    }

    /* JADX INFO: renamed from: a */
    public final PendingIntent m7226a(Context context, int i, int i2, String str) {
        Intent intentM7220a = m7220a(context, i, str);
        if (intentM7220a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentM7220a, 268435456);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7045a(int i) {
        return C1319w.m7311b(i);
    }

    /* JADX INFO: renamed from: b */
    public String mo7048b(int i) {
        return C1319w.m7306a(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final Intent m7227c(int i) {
        return m7220a((Context) null, i, (String) null);
    }
}
