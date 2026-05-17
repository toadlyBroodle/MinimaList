package android.support.v4.p019j;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v4.j.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0235f {
    /* JADX INFO: renamed from: a */
    public static int m1697a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    /* JADX INFO: renamed from: b */
    public static int m1698b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }
}
