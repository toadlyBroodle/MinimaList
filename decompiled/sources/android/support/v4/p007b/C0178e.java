package android.support.v4.p007b;

import android.content.Context;
import android.os.Process;
import android.support.v4.p006a.C0147c;

/* JADX INFO: renamed from: android.support.v4.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0178e {
    /* JADX INFO: renamed from: a */
    public static int m1373a(Context context, String str) {
        return m1374a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public static int m1374a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strM831a = C0147c.m831a(str);
        if (strM831a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0147c.m830a(context, strM831a, str2) != 0 ? -2 : 0;
    }
}
