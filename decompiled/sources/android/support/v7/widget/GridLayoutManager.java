package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v7.widget.C0484av;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    boolean f2738a;

    /* JADX INFO: renamed from: b */
    int f2739b;

    /* JADX INFO: renamed from: c */
    int[] f2740c;

    /* JADX INFO: renamed from: d */
    View[] f2741d;

    /* JADX INFO: renamed from: e */
    final SparseIntArray f2742e;

    /* JADX INFO: renamed from: f */
    final SparseIntArray f2743f;

    /* JADX INFO: renamed from: g */
    AbstractC0436c f2744g;

    /* JADX INFO: renamed from: h */
    final Rect f2745h;

    /* JADX INFO: renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0434a extends AbstractC0436c {
        @Override // android.support.v7.widget.GridLayoutManager.AbstractC0436c
        /* JADX INFO: renamed from: a */
        public int mo3458a(int i) {
            return 1;
        }

        @Override // android.support.v7.widget.GridLayoutManager.AbstractC0436c
        /* JADX INFO: renamed from: a */
        public int mo3459a(int i, int i2) {
            return i % i2;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C0435b extends C0484av.i {

        /* JADX INFO: renamed from: a */
        int f2746a;

        /* JADX INFO: renamed from: b */
        int f2747b;

        public C0435b(int i, int i2) {
            super(i, i2);
            this.f2746a = -1;
            this.f2747b = 0;
        }

        public C0435b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2746a = -1;
            this.f2747b = 0;
        }

        public C0435b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2746a = -1;
            this.f2747b = 0;
        }

        public C0435b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2746a = -1;
            this.f2747b = 0;
        }

        /* JADX INFO: renamed from: a */
        public int m3460a() {
            return this.f2746a;
        }

        /* JADX INFO: renamed from: b */
        public int m3461b() {
            return this.f2747b;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class AbstractC0436c {

        /* JADX INFO: renamed from: a */
        final SparseIntArray f2748a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        private boolean f2749b = false;

        /* JADX INFO: renamed from: a */
        public abstract int mo3458a(int i);

        /* JADX INFO: renamed from: a */
        public int mo3459a(int i, int i2) {
            int i3;
            int iMo3458a;
            int iM3463b;
            int iMo3458a2 = mo3458a(i);
            if (iMo3458a2 == i2) {
                return 0;
            }
            if (!this.f2749b || this.f2748a.size() <= 0 || (iM3463b = m3463b(i)) < 0) {
                i3 = 0;
                iMo3458a = 0;
            } else {
                iMo3458a = this.f2748a.get(iM3463b) + mo3458a(iM3463b);
                i3 = iM3463b + 1;
            }
            int i4 = i3;
            while (i4 < i) {
                int iMo3458a3 = mo3458a(i4);
                int i5 = iMo3458a + iMo3458a3;
                if (i5 == i2) {
                    iMo3458a3 = 0;
                } else if (i5 <= i2) {
                    iMo3458a3 = i5;
                }
                i4++;
                iMo3458a = iMo3458a3;
            }
            if (iMo3458a + iMo3458a2 <= i2) {
                return iMo3458a;
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public void m3462a() {
            this.f2748a.clear();
        }

        /* JADX INFO: renamed from: b */
        int m3463b(int i) {
            int i2 = 0;
            int size = this.f2748a.size() - 1;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2748a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2748a.size()) {
                return -1;
            }
            return this.f2748a.keyAt(i4);
        }

        /* JADX INFO: renamed from: b */
        int m3464b(int i, int i2) {
            if (!this.f2749b) {
                return mo3459a(i, i2);
            }
            int i3 = this.f2748a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iMo3459a = mo3459a(i, i2);
            this.f2748a.put(i, iMo3459a);
            return iMo3459a;
        }

        /* JADX INFO: renamed from: c */
        public int m3465c(int i, int i2) {
            int iMo3458a = mo3458a(i);
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                int iMo3458a2 = mo3458a(i3);
                int i6 = i5 + iMo3458a2;
                if (i6 == i2) {
                    i4++;
                    iMo3458a2 = 0;
                } else if (i6 > i2) {
                    i4++;
                } else {
                    iMo3458a2 = i6;
                }
                i3++;
                i5 = iMo3458a2;
            }
            return i5 + iMo3458a > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f2738a = false;
        this.f2739b = -1;
        this.f2742e = new SparseIntArray();
        this.f2743f = new SparseIntArray();
        this.f2744g = new C0434a();
        this.f2745h = new Rect();
        m3440a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f2738a = false;
        this.f2739b = -1;
        this.f2742e = new SparseIntArray();
        this.f2743f = new SparseIntArray();
        this.f2744g = new C0434a();
        this.f2745h = new Rect();
        m3440a(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2738a = false;
        this.f2739b = -1;
        this.f2742e = new SparseIntArray();
        this.f2743f = new SparseIntArray();
        this.f2744g = new C0434a();
        this.f2745h = new Rect();
        m3440a(m4195a(context, attributeSet, i, i2).f3318b);
    }

    /* JADX INFO: renamed from: J */
    private void m3418J() {
        this.f2742e.clear();
        this.f2743f.clear();
    }

    /* JADX INFO: renamed from: K */
    private void m3419K() {
        int iU = m4286u();
        for (int i = 0; i < iU; i++) {
            C0435b c0435b = (C0435b) m4271h(i).getLayoutParams();
            int iF = c0435b.m4300f();
            this.f2742e.put(iF, c0435b.m3461b());
            this.f2743f.put(iF, c0435b.m3460a());
        }
    }

    /* JADX INFO: renamed from: L */
    private void m3420L() {
        m3431l(m3519f() == 1 ? (m4289x() - m4205B()) - m4291z() : (m4290y() - m4206C()) - m4204A());
    }

    /* JADX INFO: renamed from: M */
    private void m3421M() {
        if (this.f2741d == null || this.f2741d.length != this.f2739b) {
            this.f2741d = new View[this.f2739b];
        }
    }

    /* JADX INFO: renamed from: a */
    private int m3422a(C0484av.o oVar, C0484av.t tVar, int i) {
        if (!tVar.m4379a()) {
            return this.f2744g.m3465c(i, this.f2739b);
        }
        int iM4334b = oVar.m4334b(i);
        if (iM4334b != -1) {
            return this.f2744g.m3465c(iM4334b, this.f2739b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m3423a(float f, int i) {
        m3431l(Math.max(Math.round(this.f2739b * f), i));
    }

    /* JADX INFO: renamed from: a */
    private void m3424a(C0484av.o oVar, C0484av.t tVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (z) {
            i4 = 1;
            i3 = 0;
        } else {
            int i5 = i - 1;
            i = -1;
            i3 = i5;
            i4 = -1;
        }
        int i6 = 0;
        for (int i7 = i3; i7 != i; i7 += i4) {
            View view = this.f2741d[i7];
            C0435b c0435b = (C0435b) view.getLayoutParams();
            c0435b.f2747b = m3430c(oVar, tVar, m4256d(view));
            c0435b.f2746a = i6;
            i6 += c0435b.f2747b;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3425a(View view, int i, int i2, boolean z) {
        C0484av.i iVar = (C0484av.i) view.getLayoutParams();
        if (z ? m4237a(view, i, i2, iVar) : m4247b(view, i, i2, iVar)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3426a(View view, int i, boolean z) {
        int iA;
        int iA2;
        C0435b c0435b = (C0435b) view.getLayoutParams();
        Rect rect = c0435b.f3322d;
        int i2 = rect.top + rect.bottom + c0435b.topMargin + c0435b.bottomMargin;
        int i3 = c0435b.rightMargin + rect.right + rect.left + c0435b.leftMargin;
        int iM3432a = m3432a(c0435b.f2746a, c0435b.f2747b);
        if (this.f2758i == 1) {
            iA = m4194a(iM3432a, i, i3, c0435b.width, false);
            iA2 = m4194a(this.f2759j.mo4012f(), m4288w(), i2, c0435b.height, true);
        } else {
            int iA3 = m4194a(iM3432a, i, i2, c0435b.height, false);
            iA = m4194a(this.f2759j.mo4012f(), m4287v(), i3, c0435b.width, true);
            iA2 = iA3;
        }
        m3425a(view, iA, iA2, z);
    }

    /* JADX INFO: renamed from: a */
    static int[] m3427a(int[] iArr, int i, int i2) {
        int i3;
        int i4 = 0;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private int m3428b(C0484av.o oVar, C0484av.t tVar, int i) {
        if (!tVar.m4379a()) {
            return this.f2744g.m3464b(i, this.f2739b);
        }
        int i2 = this.f2743f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4334b = oVar.m4334b(i);
        if (iM4334b != -1) {
            return this.f2744g.m3464b(iM4334b, this.f2739b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private void m3429b(C0484av.o oVar, C0484av.t tVar, LinearLayoutManager.C0437a c0437a, int i) {
        boolean z = i == 1;
        int iM3428b = m3428b(oVar, tVar, c0437a.f2765a);
        if (z) {
            while (iM3428b > 0 && c0437a.f2765a > 0) {
                c0437a.f2765a--;
                iM3428b = m3428b(oVar, tVar, c0437a.f2765a);
            }
            return;
        }
        int iM4383e = tVar.m4383e() - 1;
        int i2 = c0437a.f2765a;
        int i3 = iM3428b;
        while (i2 < iM4383e) {
            int iM3428b2 = m3428b(oVar, tVar, i2 + 1);
            if (iM3428b2 <= i3) {
                break;
            }
            i2++;
            i3 = iM3428b2;
        }
        c0437a.f2765a = i2;
    }

    /* JADX INFO: renamed from: c */
    private int m3430c(C0484av.o oVar, C0484av.t tVar, int i) {
        if (!tVar.m4379a()) {
            return this.f2744g.mo3458a(i);
        }
        int i2 = this.f2742e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM4334b = oVar.m4334b(i);
        if (iM4334b != -1) {
            return this.f2744g.mo3458a(iM4334b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: l */
    private void m3431l(int i) {
        this.f2740c = m3427a(this.f2740c, this.f2739b, i);
    }

    /* JADX INFO: renamed from: a */
    int m3432a(int i, int i2) {
        return (this.f2758i == 1 && m3522g()) ? this.f2740c[this.f2739b - i] - this.f2740c[(this.f2739b - i) - i2] : this.f2740c[i + i2] - this.f2740c[i];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public int mo3433a(int i, C0484av.o oVar, C0484av.t tVar) {
        m3420L();
        m3421M();
        return super.mo3433a(i, oVar, tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public int mo3434a(C0484av.o oVar, C0484av.t tVar) {
        if (this.f2758i == 0) {
            return this.f2739b;
        }
        if (tVar.m4383e() < 1) {
            return 0;
        }
        return m3422a(oVar, tVar, tVar.m4383e() - 1) + 1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3435a() {
        return this.f2758i == 0 ? new C0435b(-2, -1) : new C0435b(-1, -2);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3436a(Context context, AttributeSet attributeSet) {
        return new C0435b(context, attributeSet);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3437a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0435b((ViewGroup.MarginLayoutParams) layoutParams) : new C0435b(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View mo3438a(C0484av.o oVar, C0484av.t tVar, int i, int i2, int i3) {
        View view;
        View view2 = null;
        m3524h();
        int iMo4006c = this.f2759j.mo4006c();
        int iMo4008d = this.f2759j.mo4008d();
        int i4 = i2 > i ? 1 : -1;
        View view3 = null;
        while (i != i2) {
            View viewH = m4271h(i);
            int iD = m4256d(viewH);
            if (iD < 0 || iD >= i3) {
                view = view2;
                viewH = view3;
            } else if (m3428b(oVar, tVar, iD) != 0) {
                view = view2;
                viewH = view3;
            } else if (((C0484av.i) viewH.getLayoutParams()).m4298d()) {
                if (view3 == null) {
                    view = view2;
                }
            } else {
                if (this.f2759j.mo4001a(viewH) < iMo4008d && this.f2759j.mo4005b(viewH) >= iMo4006c) {
                    return viewH;
                }
                if (view2 == null) {
                    view = viewH;
                    viewH = view3;
                }
            }
            i += i4;
            view2 = view;
            view3 = viewH;
        }
        if (view2 == null) {
            view2 = view3;
        }
        return view2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public View mo3439a(View view, int i, C0484av.o oVar, C0484av.t tVar) {
        int iU;
        int i2;
        int iU2;
        int i3;
        int iMin;
        View view2;
        int iMin2;
        int i4;
        View view3;
        View viewE = m4260e(view);
        if (viewE == null) {
            return null;
        }
        C0435b c0435b = (C0435b) viewE.getLayoutParams();
        int i5 = c0435b.f2746a;
        int i6 = c0435b.f2746a + c0435b.f2747b;
        if (super.mo3439a(view, i, oVar, tVar) == null) {
            return null;
        }
        if ((m3516e(i) == 1) != this.f2760k) {
            iU = m4286u() - 1;
            i2 = -1;
            iU2 = -1;
        } else {
            iU = 0;
            i2 = 1;
            iU2 = m4286u();
        }
        boolean z = this.f2758i == 1 && m3522g();
        View view4 = null;
        int i7 = -1;
        int i8 = 0;
        View view5 = null;
        int i9 = -1;
        int i10 = 0;
        int iM3422a = m3422a(oVar, tVar, iU);
        int i11 = iU;
        while (i11 != iU2) {
            int iM3422a2 = m3422a(oVar, tVar, i11);
            View viewH = m4271h(i11);
            if (viewH == viewE) {
                break;
            }
            if (viewH.hasFocusable() && iM3422a2 != iM3422a) {
                if (view4 != null) {
                    break;
                }
            } else {
                C0435b c0435b2 = (C0435b) viewH.getLayoutParams();
                int i12 = c0435b2.f2746a;
                int i13 = c0435b2.f2746a + c0435b2.f2747b;
                if (viewH.hasFocusable() && i12 == i5 && i13 == i6) {
                    return viewH;
                }
                boolean z2 = false;
                if (!(viewH.hasFocusable() && view4 == null) && (viewH.hasFocusable() || view5 != null)) {
                    int iMin3 = Math.min(i13, i6) - Math.max(i12, i5);
                    if (viewH.hasFocusable()) {
                        if (iMin3 > i8) {
                            z2 = true;
                        } else if (iMin3 == i8) {
                            if (z == (i12 > i7)) {
                                z2 = true;
                            }
                        }
                    } else if (view4 == null && m4239a(viewH, false, true)) {
                        if (iMin3 > i10) {
                            z2 = true;
                        } else if (iMin3 == i10) {
                            if (z == (i12 > i9)) {
                                z2 = true;
                            }
                        }
                    }
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (viewH.hasFocusable()) {
                        int i14 = c0435b2.f2746a;
                        int i15 = i10;
                        i3 = i9;
                        view2 = view5;
                        iMin2 = Math.min(i13, i6) - Math.max(i12, i5);
                        iMin = i15;
                        view3 = viewH;
                        i4 = i14;
                    } else {
                        i3 = c0435b2.f2746a;
                        iMin = Math.min(i13, i6) - Math.max(i12, i5);
                        view2 = viewH;
                        iMin2 = i8;
                        i4 = i7;
                        view3 = view4;
                    }
                }
                i11 += i2;
                view4 = view3;
                i8 = iMin2;
                i7 = i4;
                view5 = view2;
                i9 = i3;
                i10 = iMin;
            }
            iMin = i10;
            i4 = i7;
            i3 = i9;
            view2 = view5;
            iMin2 = i8;
            view3 = view4;
            i11 += i2;
            view4 = view3;
            i8 = iMin2;
            i7 = i4;
            view5 = view2;
            i9 = i3;
            i10 = iMin;
        }
        if (view4 == null) {
            view4 = view5;
        }
        return view4;
    }

    /* JADX INFO: renamed from: a */
    public void m3440a(int i) {
        if (i == this.f2739b) {
            return;
        }
        this.f2738a = true;
        if (i < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.f2739b = i;
        this.f2744g.m3462a();
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3441a(Rect rect, int i, int i2) {
        int iA;
        int iA2;
        if (this.f2740c == null) {
            super.mo3441a(rect, i, i2);
        }
        int iB = m4205B() + m4291z();
        int iA3 = m4204A() + m4206C();
        if (this.f2758i == 1) {
            iA2 = m4193a(i2, iA3 + rect.height(), m4209F());
            iA = m4193a(i, iB + this.f2740c[this.f2740c.length - 1], m4208E());
        } else {
            iA = m4193a(i, iB + rect.width(), m4208E());
            iA2 = m4193a(i2, iA3 + this.f2740c[this.f2740c.length - 1], m4209F());
        }
        m4266f(iA, iA2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: a */
    void mo3442a(C0484av.o oVar, C0484av.t tVar, LinearLayoutManager.C0437a c0437a, int i) {
        super.mo3442a(oVar, tVar, c0437a, i);
        m3420L();
        if (tVar.m4383e() > 0 && !tVar.m4379a()) {
            m3429b(oVar, tVar, c0437a, i);
        }
        m3421M();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: a */
    void mo3443a(C0484av.o oVar, C0484av.t tVar, LinearLayoutManager.C0439c c0439c, LinearLayoutManager.C0438b c0438b) {
        int i;
        int i2;
        int i3;
        int iMakeMeasureSpec;
        int iA;
        View viewM3537a;
        int iMo4016i = this.f2759j.mo4016i();
        boolean z = iMo4016i != 1073741824;
        int i4 = m4286u() > 0 ? this.f2740c[this.f2739b] : 0;
        if (z) {
            m3420L();
        }
        boolean z2 = c0439c.f2778e == 1;
        int i5 = 0;
        int i6 = 0;
        int iM3428b = this.f2739b;
        if (!z2) {
            iM3428b = m3428b(oVar, tVar, c0439c.f2777d) + m3430c(oVar, tVar, c0439c.f2777d);
        }
        while (i5 < this.f2739b && c0439c.m3540a(tVar) && iM3428b > 0) {
            int i7 = c0439c.f2777d;
            int iM3430c = m3430c(oVar, tVar, i7);
            if (iM3430c > this.f2739b) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iM3430c + " spans but GridLayoutManager has only " + this.f2739b + " spans.");
            }
            iM3428b -= iM3430c;
            if (iM3428b < 0 || (viewM3537a = c0439c.m3537a(oVar)) == null) {
                break;
            }
            i6 += iM3430c;
            this.f2741d[i5] = viewM3537a;
            i5++;
        }
        if (i5 == 0) {
            c0438b.f2771b = true;
            return;
        }
        m3424a(oVar, tVar, i5, i6, z2);
        int i8 = 0;
        float f = 0.0f;
        int i9 = 0;
        while (i8 < i5) {
            View view = this.f2741d[i8];
            if (c0439c.f2784k == null) {
                if (z2) {
                    m4244b(view);
                } else {
                    m4245b(view, 0);
                }
            } else if (z2) {
                m4220a(view);
            } else {
                m4221a(view, 0);
            }
            m4246b(view, this.f2745h);
            m3426a(view, iMo4016i, false);
            int iMo4011e = this.f2759j.mo4011e(view);
            if (iMo4011e > i9) {
                i9 = iMo4011e;
            }
            float fMo4013f = (this.f2759j.mo4013f(view) * 1.0f) / ((C0435b) view.getLayoutParams()).f2747b;
            if (fMo4013f <= f) {
                fMo4013f = f;
            }
            i8++;
            f = fMo4013f;
        }
        if (z) {
            m3423a(f, i4);
            i9 = 0;
            int i10 = 0;
            while (i10 < i5) {
                View view2 = this.f2741d[i10];
                m3426a(view2, 1073741824, true);
                int iMo4011e2 = this.f2759j.mo4011e(view2);
                if (iMo4011e2 <= i9) {
                    iMo4011e2 = i9;
                }
                i10++;
                i9 = iMo4011e2;
            }
        }
        for (int i11 = 0; i11 < i5; i11++) {
            View view3 = this.f2741d[i11];
            if (this.f2759j.mo4011e(view3) != i9) {
                C0435b c0435b = (C0435b) view3.getLayoutParams();
                Rect rect = c0435b.f3322d;
                int i12 = rect.top + rect.bottom + c0435b.topMargin + c0435b.bottomMargin;
                int i13 = rect.right + rect.left + c0435b.leftMargin + c0435b.rightMargin;
                int iM3432a = m3432a(c0435b.f2746a, c0435b.f2747b);
                if (this.f2758i == 1) {
                    iMakeMeasureSpec = m4194a(iM3432a, 1073741824, i13, c0435b.width, false);
                    iA = View.MeasureSpec.makeMeasureSpec(i9 - i12, 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                    iA = m4194a(iM3432a, 1073741824, i12, c0435b.height, false);
                }
                m3425a(view3, iMakeMeasureSpec, iA, true);
            }
        }
        c0438b.f2770a = i9;
        int i14 = 0;
        if (this.f2758i == 1) {
            if (c0439c.f2779f == -1) {
                i14 = c0439c.f2775b;
                i3 = i14 - i9;
                i2 = 0;
                i = 0;
            } else {
                int i15 = c0439c.f2775b;
                i14 = i15 + i9;
                i3 = i15;
                i2 = 0;
                i = 0;
            }
        } else if (c0439c.f2779f == -1) {
            int i16 = c0439c.f2775b;
            i2 = i16;
            i = i16 - i9;
            i3 = 0;
        } else {
            i = c0439c.f2775b;
            i2 = i9 + i;
            i3 = 0;
        }
        int iMo4013f = i14;
        int iA2 = i3;
        int iMo4013f2 = i2;
        int iZ = i;
        for (int i17 = 0; i17 < i5; i17++) {
            View view4 = this.f2741d[i17];
            C0435b c0435b2 = (C0435b) view4.getLayoutParams();
            if (this.f2758i != 1) {
                iA2 = m4204A() + this.f2740c[c0435b2.f2746a];
                iMo4013f = iA2 + this.f2759j.mo4013f(view4);
            } else if (m3522g()) {
                iMo4013f2 = m4291z() + this.f2740c[this.f2739b - c0435b2.f2746a];
                iZ = iMo4013f2 - this.f2759j.mo4013f(view4);
            } else {
                iZ = m4291z() + this.f2740c[c0435b2.f2746a];
                iMo4013f2 = iZ + this.f2759j.mo4013f(view4);
            }
            m4223a(view4, iZ, iA2, iMo4013f2, iMo4013f);
            if (c0435b2.m4298d() || c0435b2.m4299e()) {
                c0438b.f2772c = true;
            }
            c0438b.f2773d |= view4.hasFocusable();
        }
        Arrays.fill(this.f2741d, (Object) null);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0484av.o oVar, C0484av.t tVar, View view, C0224b c0224b) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0435b)) {
            super.m4226a(view, c0224b);
            return;
        }
        C0435b c0435b = (C0435b) layoutParams;
        int iM3422a = m3422a(oVar, tVar, c0435b.m4300f());
        if (this.f2758i == 0) {
            c0224b.m1626b(C0224b.c.m1660a(c0435b.m3460a(), c0435b.m3461b(), iM3422a, 1, this.f2739b > 1 && c0435b.m3461b() == this.f2739b, false));
        } else {
            c0224b.m1626b(C0224b.c.m1660a(iM3422a, 1, c0435b.m3460a(), c0435b.m3461b(), this.f2739b > 1 && c0435b.m3461b() == this.f2739b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3445a(C0484av.t tVar) {
        super.mo3445a(tVar);
        this.f2738a = false;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: a */
    void mo3446a(C0484av.t tVar, LinearLayoutManager.C0439c c0439c, C0484av.h.a aVar) {
        int iMo3458a = this.f2739b;
        for (int i = 0; i < this.f2739b && c0439c.m3540a(tVar) && iMo3458a > 0; i++) {
            int i2 = c0439c.f2777d;
            aVar.mo3926b(i2, Math.max(0, c0439c.f2780g));
            iMo3458a -= this.f2744g.mo3458a(i2);
            c0439c.f2777d += c0439c.f2778e;
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3447a(C0484av c0484av) {
        this.f2744g.m3462a();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3448a(C0484av c0484av, int i, int i2) {
        this.f2744g.m3462a();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3449a(C0484av c0484av, int i, int i2, int i3) {
        this.f2744g.m3462a();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3450a(C0484av c0484av, int i, int i2, Object obj) {
        this.f2744g.m3462a();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: a */
    public void mo3451a(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo3451a(false);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public boolean mo3452a(C0484av.i iVar) {
        return iVar instanceof C0435b;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public int mo3453b(int i, C0484av.o oVar, C0484av.t tVar) {
        m3420L();
        m3421M();
        return super.mo3453b(i, oVar, tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public int mo3454b(C0484av.o oVar, C0484av.t tVar) {
        if (this.f2758i == 1) {
            return this.f2739b;
        }
        if (tVar.m4383e() < 1) {
            return 0;
        }
        return m3422a(oVar, tVar, tVar.m4383e() - 1) + 1;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public void mo3455b(C0484av c0484av, int i, int i2) {
        this.f2744g.m3462a();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public boolean mo3456b() {
        return this.f2763n == null && !this.f2738a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public void mo3457c(C0484av.o oVar, C0484av.t tVar) {
        if (tVar.m4379a()) {
            m3419K();
        }
        super.mo3457c(oVar, tVar);
        m3418J();
    }
}
