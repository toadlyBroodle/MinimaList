package android.support.v4.p019j.p020a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.j.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0223a {
    /* JADX INFO: renamed from: a */
    public static int m1609a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m1610a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
