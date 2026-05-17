package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.internal.C1217af;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.common.util.C1310n;
import com.google.android.gms.common.util.C1316t;
import com.google.android.gms.internal.C2040xg;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.w */
/* JADX INFO: loaded from: classes.dex */
public class C1319w {

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f6055b = 11910000;

    /* JADX INFO: renamed from: a */
    private static boolean f6054a = false;

    /* JADX INFO: renamed from: d */
    private static boolean f6057d = false;

    /* JADX INFO: renamed from: e */
    private static boolean f6058e = false;

    /* JADX INFO: renamed from: f */
    private static boolean f6059f = false;

    /* JADX INFO: renamed from: c */
    static final AtomicBoolean f6056c = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    private static final AtomicBoolean f6060g = new AtomicBoolean();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static String m7306a(int i) {
        return C1071a.m6610a(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m7307a(Context context, int i) {
        return C1316t.m7293a(context, i);
    }

    @TargetApi(19)
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static boolean m7308a(Context context, int i, String str) {
        return C1316t.m7294a(context, i, str);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    static boolean m7309a(Context context, String str) {
        Bundle applicationRestrictions;
        boolean zEquals = str.equals("com.google.android.gms");
        if (C1310n.m7284g()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                if (!(C1310n.m7281d() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m7310b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C0651a.d.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6060g.get()) {
            int iM7060b = C1217af.m7060b(context);
            if (iM7060b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (iM7060b != f6055b) {
                throw new IllegalStateException(new StringBuilder(String.valueOf("com.google.android.gms.version").length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(f6055b).append(" but found ").append(iM7060b).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        boolean z = (C1304h.m7265b(context) || C1304h.m7267d(context)) ? false : true;
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1320x.m7319a(context);
            if (z) {
                AbstractBinderC1285o abstractBinderC1285oM7318a = C1320x.m7318a(packageInfo, C1288r.f5991a);
                if (abstractBinderC1285oM7318a == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if (C1320x.m7318a(packageInfo2, abstractBinderC1285oM7318a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else if (C1320x.m7318a(packageInfo2, C1288r.f5991a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 < f6055b / 1000) {
                Log.w("GooglePlayServicesUtil", new StringBuilder(77).append("Google Play services out of date.  Requires ").append(f6055b).append(" but found ").append(packageInfo2.versionCode).toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m7311b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return false;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static boolean m7312b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m7309a(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m7313c(Context context) {
        try {
            if (!f6059f) {
                PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b("com.google.android.gms", 64);
                if (packageInfoM12560b != null) {
                    C1320x.m7319a(context);
                    if (C1320x.m7318a(packageInfoM12560b, C1288r.f5991a[1]) != null) {
                        f6058e = true;
                    } else {
                        f6058e = false;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f6059f = true;
        }
        return f6058e || !"user".equals(Build.TYPE);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static void m7314d(Context context) {
        if (f6056c.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static Resources m7315e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Context m7316f(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static int m7317g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
}
