package android.support.v4.p006a;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: renamed from: android.support.v4.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0146b {
    /* JADX INFO: renamed from: a */
    public static boolean m829a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
