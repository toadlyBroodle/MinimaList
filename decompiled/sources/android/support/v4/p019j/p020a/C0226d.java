package android.support.v4.p019j.p020a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: android.support.v4.j.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0226d {

    /* JADX INFO: renamed from: a */
    private final AccessibilityRecord f1320a;

    /* JADX INFO: renamed from: a */
    public static void m1666a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1667b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0226d c0226d = (C0226d) obj;
            return this.f1320a == null ? c0226d.f1320a == null : this.f1320a.equals(c0226d.f1320a);
        }
        return false;
    }

    @Deprecated
    public int hashCode() {
        if (this.f1320a == null) {
            return 0;
        }
        return this.f1320a.hashCode();
    }
}
