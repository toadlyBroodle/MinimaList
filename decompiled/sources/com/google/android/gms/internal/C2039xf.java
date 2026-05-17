package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: renamed from: com.google.android.gms.internal.xf */
/* JADX INFO: loaded from: classes.dex */
public final class C2039xf {

    /* JADX INFO: renamed from: a */
    private Context f12290a;

    public C2039xf(Context context) {
        this.f12290a = context;
    }

    /* JADX INFO: renamed from: a */
    public final int m12554a(String str) {
        return this.f12290a.checkCallingOrSelfPermission(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m12555a(String str, String str2) {
        return this.f12290a.getPackageManager().checkPermission(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo m12556a(String str, int i) {
        return this.f12290a.getPackageManager().getApplicationInfo(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12557a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2038xe.m12553a(this.f12290a);
        }
        if (!C1310n.m7286i() || (nameForUid = this.f12290a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f12290a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public final boolean m12558a(int i, String str) {
        if (C1310n.m7282e()) {
            try {
                ((AppOpsManager) this.f12290a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.f12290a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m12559a(int i) {
        return this.f12290a.getPackageManager().getPackagesForUid(i);
    }

    /* JADX INFO: renamed from: b */
    public final PackageInfo m12560b(String str, int i) {
        return this.f12290a.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m12561b(String str) {
        return this.f12290a.getPackageManager().getApplicationLabel(this.f12290a.getPackageManager().getApplicationInfo(str, 0));
    }
}
