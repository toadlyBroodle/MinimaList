package android.support.v4.p019j;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v4.j.k */
/* JADX INFO: loaded from: classes.dex */
public class C0240k {

    /* JADX INFO: renamed from: a */
    private ViewParent f1340a;

    /* JADX INFO: renamed from: b */
    private ViewParent f1341b;

    /* JADX INFO: renamed from: c */
    private final View f1342c;

    /* JADX INFO: renamed from: d */
    private boolean f1343d;

    /* JADX INFO: renamed from: e */
    private int[] f1344e;

    public C0240k(View view) {
        this.f1342c = view;
    }

    /* JADX INFO: renamed from: a */
    private void m1713a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1340a = viewParent;
                break;
            case 1:
                this.f1341b = viewParent;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private ViewParent m1714d(int i) {
        switch (i) {
            case 0:
                return this.f1340a;
            case 1:
                return this.f1341b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1715a(boolean z) {
        if (this.f1343d) {
            C0246q.m1776v(this.f1342c);
        }
        this.f1343d = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1716a() {
        return this.f1343d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1717a(float f, float f2) {
        ViewParent viewParentM1714d;
        if (!m1716a() || (viewParentM1714d = m1714d(0)) == null) {
            return false;
        }
        return C0249t.m1840a(viewParentM1714d, this.f1342c, f, f2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1718a(float f, float f2, boolean z) {
        ViewParent viewParentM1714d;
        if (!m1716a() || (viewParentM1714d = m1714d(0)) == null) {
            return false;
        }
        return C0249t.m1841a(viewParentM1714d, this.f1342c, f, f2, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1719a(int i) {
        return m1714d(i) != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1720a(int i, int i2) {
        if (m1719a(i2)) {
            return true;
        }
        if (m1716a()) {
            View view = this.f1342c;
            for (ViewParent parent = this.f1342c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0249t.m1842a(parent, view, this.f1342c, i, i2)) {
                    m1713a(i2, parent);
                    C0249t.m1843b(parent, view, this.f1342c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1721a(int i, int i2, int i3, int i4, int[] iArr) {
        return m1722a(i, i2, i3, i4, iArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1722a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent viewParentM1714d;
        int i6;
        int i7;
        if (!m1716a() || (viewParentM1714d = m1714d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1342c.getLocationInWindow(iArr);
            int i8 = iArr[0];
            i6 = iArr[1];
            i7 = i8;
        } else {
            i6 = 0;
            i7 = 0;
        }
        C0249t.m1838a(viewParentM1714d, this.f1342c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f1342c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1723a(int i, int i2, int[] iArr, int[] iArr2) {
        return m1724a(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1724a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM1714d;
        int i4;
        int i5;
        int[] iArr3;
        if (!m1716a() || (viewParentM1714d = m1714d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1342c.getLocationInWindow(iArr2);
            int i6 = iArr2[0];
            i4 = iArr2[1];
            i5 = i6;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f1344e == null) {
                this.f1344e = new int[2];
            }
            iArr3 = this.f1344e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        C0249t.m1839a(viewParentM1714d, this.f1342c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.f1342c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1725b() {
        return m1719a(0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1726b(int i) {
        return m1720a(i, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m1727c() {
        m1728c(0);
    }

    /* JADX INFO: renamed from: c */
    public void m1728c(int i) {
        ViewParent viewParentM1714d = m1714d(i);
        if (viewParentM1714d != null) {
            C0249t.m1837a(viewParentM1714d, this.f1342c, i);
            m1713a(i, (ViewParent) null);
        }
    }
}
