package android.support.v4.p006a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: android.support.v4.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0147c {
    /* JADX INFO: renamed from: a */
    public static int m830a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public static String m831a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
