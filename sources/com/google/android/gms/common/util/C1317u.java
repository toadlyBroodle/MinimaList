package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.internal.C2040xg;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.util.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1317u {

    /* JADX INFO: renamed from: a */
    private static final Method f6049a = m7298a();

    /* JADX INFO: renamed from: b */
    private static final Method f6050b = m7302b();

    /* JADX INFO: renamed from: c */
    private static final Method f6051c = m7303c();

    /* JADX INFO: renamed from: d */
    private static final Method f6052d = m7304d();

    /* JADX INFO: renamed from: e */
    private static final Method f6053e = m7305e();

    /* JADX INFO: renamed from: a */
    private static WorkSource m7295a(int i, String str) {
        WorkSource workSource = new WorkSource();
        if (f6050b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f6050b.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (f6049a != null) {
            try {
                f6049a.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return workSource;
    }

    /* JADX INFO: renamed from: a */
    public static WorkSource m7296a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfoM12556a = C2040xg.m12562a(context).m12556a(str, 0);
            if (applicationInfoM12556a != null) {
                return m7295a(applicationInfoM12556a.uid, str);
            }
            String strValueOf = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf2 = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m7297a(WorkSource workSource, int i) {
        if (f6053e != null) {
            try {
                return (String) f6053e.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Method m7298a() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m7299a(WorkSource workSource) {
        int iM7301b = workSource == null ? 0 : m7301b(workSource);
        if (iM7301b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iM7301b; i++) {
            String strM7297a = m7297a(workSource, i);
            if (!C1313q.m7289a(strM7297a)) {
                arrayList.add(strM7297a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7300a(Context context) {
        return (context == null || context.getPackageManager() == null || C2040xg.m12562a(context).m12555a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private static int m7301b(WorkSource workSource) {
        if (f6051c != null) {
            try {
                return ((Integer) f6051c.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private static Method m7302b() {
        if (!C1310n.m7281d()) {
            return null;
        }
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m7303c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Method m7304d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Method m7305e() {
        if (!C1310n.m7281d()) {
            return null;
        }
        try {
            return WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e) {
            return null;
        }
    }
}
