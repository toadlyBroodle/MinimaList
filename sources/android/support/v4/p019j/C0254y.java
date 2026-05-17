package android.support.v4.p019j;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: renamed from: android.support.v4.j.y */
/* JADX INFO: loaded from: classes.dex */
public class C0254y {

    /* JADX INFO: renamed from: a */
    private final Object f1374a;

    private C0254y(Object obj) {
        this.f1374a = obj;
    }

    /* JADX INFO: renamed from: a */
    static C0254y m1866a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0254y(obj);
    }

    /* JADX INFO: renamed from: a */
    static Object m1867a(C0254y c0254y) {
        if (c0254y == null) {
            return null;
        }
        return c0254y.f1374a;
    }

    /* JADX INFO: renamed from: a */
    public int m1868a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1374a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public C0254y m1869a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0254y(((WindowInsets) this.f1374a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public int m1870b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1374a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m1871c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1374a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m1872d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1374a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1873e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1374a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0254y c0254y = (C0254y) obj;
        return this.f1374a == null ? c0254y.f1374a == null : this.f1374a.equals(c0254y.f1374a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m1874f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1374a).isConsumed();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public C0254y m1875g() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0254y(((WindowInsets) this.f1374a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int hashCode() {
        if (this.f1374a == null) {
            return 0;
        }
        return this.f1374a.hashCode();
    }
}
