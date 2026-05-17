package android.support.v4.p019j;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* JADX INFO: renamed from: android.support.v4.j.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0233d {
    /* JADX INFO: renamed from: a */
    public static int m1692a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : (-8388609) & i;
    }

    /* JADX INFO: renamed from: a */
    public static void m1693a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
