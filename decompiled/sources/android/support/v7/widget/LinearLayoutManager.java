package android.support.v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.C0484av;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends C0484av.h {

    /* JADX INFO: renamed from: a */
    private C0439c f2750a;

    /* JADX INFO: renamed from: b */
    private boolean f2751b;

    /* JADX INFO: renamed from: c */
    private boolean f2752c;

    /* JADX INFO: renamed from: d */
    private boolean f2753d;

    /* JADX INFO: renamed from: e */
    private boolean f2754e;

    /* JADX INFO: renamed from: f */
    private boolean f2755f;

    /* JADX INFO: renamed from: g */
    private final C0438b f2756g;

    /* JADX INFO: renamed from: h */
    private int f2757h;

    /* JADX INFO: renamed from: i */
    int f2758i;

    /* JADX INFO: renamed from: j */
    AbstractC0483au f2759j;

    /* JADX INFO: renamed from: k */
    boolean f2760k;

    /* JADX INFO: renamed from: l */
    int f2761l;

    /* JADX INFO: renamed from: m */
    int f2762m;

    /* JADX INFO: renamed from: n */
    C0440d f2763n;

    /* JADX INFO: renamed from: o */
    final C0437a f2764o;

    /* JADX INFO: renamed from: android.support.v7.widget.LinearLayoutManager$a */
    class C0437a {

        /* JADX INFO: renamed from: a */
        int f2765a;

        /* JADX INFO: renamed from: b */
        int f2766b;

        /* JADX INFO: renamed from: c */
        boolean f2767c;

        /* JADX INFO: renamed from: d */
        boolean f2768d;

        C0437a() {
            m3530a();
        }

        /* JADX INFO: renamed from: a */
        void m3530a() {
            this.f2765a = -1;
            this.f2766b = Integer.MIN_VALUE;
            this.f2767c = false;
            this.f2768d = false;
        }

        /* JADX INFO: renamed from: a */
        public void m3531a(View view) {
            int iM4004b = LinearLayoutManager.this.f2759j.m4004b();
            if (iM4004b >= 0) {
                m3534b(view);
                return;
            }
            this.f2765a = LinearLayoutManager.this.m4256d(view);
            if (!this.f2767c) {
                int iMo4001a = LinearLayoutManager.this.f2759j.mo4001a(view);
                int iMo4006c = iMo4001a - LinearLayoutManager.this.f2759j.mo4006c();
                this.f2766b = iMo4001a;
                if (iMo4006c > 0) {
                    int iMo4008d = (LinearLayoutManager.this.f2759j.mo4008d() - Math.min(0, (LinearLayoutManager.this.f2759j.mo4008d() - iM4004b) - LinearLayoutManager.this.f2759j.mo4005b(view))) - (iMo4001a + LinearLayoutManager.this.f2759j.mo4011e(view));
                    if (iMo4008d < 0) {
                        this.f2766b -= Math.min(iMo4006c, -iMo4008d);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo4008d2 = (LinearLayoutManager.this.f2759j.mo4008d() - iM4004b) - LinearLayoutManager.this.f2759j.mo4005b(view);
            this.f2766b = LinearLayoutManager.this.f2759j.mo4008d() - iMo4008d2;
            if (iMo4008d2 > 0) {
                int iMo4011e = this.f2766b - LinearLayoutManager.this.f2759j.mo4011e(view);
                int iMo4006c2 = LinearLayoutManager.this.f2759j.mo4006c();
                int iMin = iMo4011e - (iMo4006c2 + Math.min(LinearLayoutManager.this.f2759j.mo4001a(view) - iMo4006c2, 0));
                if (iMin < 0) {
                    this.f2766b = Math.min(iMo4008d2, -iMin) + this.f2766b;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m3532a(View view, C0484av.t tVar) {
            C0484av.i iVar = (C0484av.i) view.getLayoutParams();
            return !iVar.m4298d() && iVar.m4300f() >= 0 && iVar.m4300f() < tVar.m4383e();
        }

        /* JADX INFO: renamed from: b */
        void m3533b() {
            this.f2766b = this.f2767c ? LinearLayoutManager.this.f2759j.mo4008d() : LinearLayoutManager.this.f2759j.mo4006c();
        }

        /* JADX INFO: renamed from: b */
        public void m3534b(View view) {
            if (this.f2767c) {
                this.f2766b = LinearLayoutManager.this.f2759j.mo4005b(view) + LinearLayoutManager.this.f2759j.m4004b();
            } else {
                this.f2766b = LinearLayoutManager.this.f2759j.mo4001a(view);
            }
            this.f2765a = LinearLayoutManager.this.m4256d(view);
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2765a + ", mCoordinate=" + this.f2766b + ", mLayoutFromEnd=" + this.f2767c + ", mValid=" + this.f2768d + '}';
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0438b {

        /* JADX INFO: renamed from: a */
        public int f2770a;

        /* JADX INFO: renamed from: b */
        public boolean f2771b;

        /* JADX INFO: renamed from: c */
        public boolean f2772c;

        /* JADX INFO: renamed from: d */
        public boolean f2773d;

        protected C0438b() {
        }

        /* JADX INFO: renamed from: a */
        void m3535a() {
            this.f2770a = 0;
            this.f2771b = false;
            this.f2772c = false;
            this.f2773d = false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0439c {

        /* JADX INFO: renamed from: b */
        int f2775b;

        /* JADX INFO: renamed from: c */
        int f2776c;

        /* JADX INFO: renamed from: d */
        int f2777d;

        /* JADX INFO: renamed from: e */
        int f2778e;

        /* JADX INFO: renamed from: f */
        int f2779f;

        /* JADX INFO: renamed from: g */
        int f2780g;

        /* JADX INFO: renamed from: j */
        int f2783j;

        /* JADX INFO: renamed from: l */
        boolean f2785l;

        /* JADX INFO: renamed from: a */
        boolean f2774a = true;

        /* JADX INFO: renamed from: h */
        int f2781h = 0;

        /* JADX INFO: renamed from: i */
        boolean f2782i = false;

        /* JADX INFO: renamed from: k */
        List<C0484av.w> f2784k = null;

        C0439c() {
        }

        /* JADX INFO: renamed from: b */
        private View m3536b() {
            int size = this.f2784k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2784k.get(i).f3381a;
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                if (!iVar.m4298d() && this.f2777d == iVar.m4300f()) {
                    m3539a(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        View m3537a(C0484av.o oVar) {
            if (this.f2784k != null) {
                return m3536b();
            }
            View viewM4340c = oVar.m4340c(this.f2777d);
            this.f2777d += this.f2778e;
            return viewM4340c;
        }

        /* JADX INFO: renamed from: a */
        public void m3538a() {
            m3539a((View) null);
        }

        /* JADX INFO: renamed from: a */
        public void m3539a(View view) {
            View viewM3541b = m3541b(view);
            if (viewM3541b == null) {
                this.f2777d = -1;
            } else {
                this.f2777d = ((C0484av.i) viewM3541b.getLayoutParams()).m4300f();
            }
        }

        /* JADX INFO: renamed from: a */
        boolean m3540a(C0484av.t tVar) {
            return this.f2777d >= 0 && this.f2777d < tVar.m4383e();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public View m3541b(View view) {
            int iM4300f;
            View view2;
            int size = this.f2784k.size();
            View view3 = null;
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < size) {
                View view4 = this.f2784k.get(i2).f3381a;
                C0484av.i iVar = (C0484av.i) view4.getLayoutParams();
                if (view4 == view) {
                    iM4300f = i;
                    view2 = view3;
                } else if (iVar.m4298d()) {
                    iM4300f = i;
                    view2 = view3;
                } else {
                    iM4300f = (iVar.m4300f() - this.f2777d) * this.f2778e;
                    if (iM4300f < 0) {
                        iM4300f = i;
                        view2 = view3;
                    } else if (iM4300f < i) {
                        if (iM4300f == 0) {
                            return view4;
                        }
                        view2 = view4;
                    }
                }
                i2++;
                view3 = view2;
                i = iM4300f;
            }
            return view3;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.LinearLayoutManager$d */
    public static class C0440d implements Parcelable {
        public static final Parcelable.Creator<C0440d> CREATOR = new Parcelable.Creator<C0440d>() { // from class: android.support.v7.widget.LinearLayoutManager.d.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0440d createFromParcel(Parcel parcel) {
                return new C0440d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0440d[] newArray(int i) {
                return new C0440d[i];
            }
        };

        /* JADX INFO: renamed from: a */
        int f2786a;

        /* JADX INFO: renamed from: b */
        int f2787b;

        /* JADX INFO: renamed from: c */
        boolean f2788c;

        public C0440d() {
        }

        C0440d(Parcel parcel) {
            this.f2786a = parcel.readInt();
            this.f2787b = parcel.readInt();
            this.f2788c = parcel.readInt() == 1;
        }

        public C0440d(C0440d c0440d) {
            this.f2786a = c0440d.f2786a;
            this.f2787b = c0440d.f2787b;
            this.f2788c = c0440d.f2788c;
        }

        /* JADX INFO: renamed from: a */
        boolean m3542a() {
            return this.f2786a >= 0;
        }

        /* JADX INFO: renamed from: b */
        void m3543b() {
            this.f2786a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2786a);
            parcel.writeInt(this.f2787b);
            parcel.writeInt(this.f2788c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2752c = false;
        this.f2760k = false;
        this.f2753d = false;
        this.f2754e = true;
        this.f2761l = -1;
        this.f2762m = Integer.MIN_VALUE;
        this.f2763n = null;
        this.f2764o = new C0437a();
        this.f2756g = new C0438b();
        this.f2757h = 2;
        m3507b(i);
        m3508b(z);
        m4254c(true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2752c = false;
        this.f2760k = false;
        this.f2753d = false;
        this.f2754e = true;
        this.f2761l = -1;
        this.f2762m = Integer.MIN_VALUE;
        this.f2763n = null;
        this.f2764o = new C0437a();
        this.f2756g = new C0438b();
        this.f2757h = 2;
        C0484av.h.b bVarA = m4195a(context, attributeSet, i, i2);
        m3507b(bVarA.f3317a);
        m3508b(bVarA.f3319c);
        mo3451a(bVarA.f3320d);
        m4254c(true);
    }

    /* JADX INFO: renamed from: J */
    private void m3466J() {
        if (this.f2758i == 1 || !m3522g()) {
            this.f2760k = this.f2752c;
        } else {
            this.f2760k = this.f2752c ? false : true;
        }
    }

    /* JADX INFO: renamed from: K */
    private View m3467K() {
        return m4271h(this.f2760k ? m4286u() - 1 : 0);
    }

    /* JADX INFO: renamed from: L */
    private View m3468L() {
        return m4271h(this.f2760k ? 0 : m4286u() - 1);
    }

    /* JADX INFO: renamed from: a */
    private int m3469a(int i, C0484av.o oVar, C0484av.t tVar, boolean z) {
        int iMo4008d;
        int iMo4008d2 = this.f2759j.mo4008d() - i;
        if (iMo4008d2 <= 0) {
            return 0;
        }
        int i2 = -m3509c(-iMo4008d2, oVar, tVar);
        int i3 = i + i2;
        if (!z || (iMo4008d = this.f2759j.mo4008d() - i3) <= 0) {
            return i2;
        }
        this.f2759j.mo4003a(iMo4008d);
        return i2 + iMo4008d;
    }

    /* JADX INFO: renamed from: a */
    private View m3470a(boolean z, boolean z2) {
        return this.f2760k ? m3498a(m4286u() - 1, -1, z, z2) : m3498a(0, m4286u(), z, z2);
    }

    /* JADX INFO: renamed from: a */
    private void m3471a(int i, int i2) {
        this.f2750a.f2776c = this.f2759j.mo4008d() - i2;
        this.f2750a.f2778e = this.f2760k ? -1 : 1;
        this.f2750a.f2777d = i;
        this.f2750a.f2779f = 1;
        this.f2750a.f2775b = i2;
        this.f2750a.f2780g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    private void m3472a(int i, int i2, boolean z, C0484av.t tVar) {
        int iMo4006c;
        this.f2750a.f2785l = m3526j();
        this.f2750a.f2781h = m3505b(tVar);
        this.f2750a.f2779f = i;
        if (i == 1) {
            this.f2750a.f2781h += this.f2759j.mo4014g();
            View viewM3468L = m3468L();
            this.f2750a.f2778e = this.f2760k ? -1 : 1;
            this.f2750a.f2777d = m4256d(viewM3468L) + this.f2750a.f2778e;
            this.f2750a.f2775b = this.f2759j.mo4005b(viewM3468L);
            iMo4006c = this.f2759j.mo4005b(viewM3468L) - this.f2759j.mo4008d();
        } else {
            View viewM3467K = m3467K();
            this.f2750a.f2781h += this.f2759j.mo4006c();
            this.f2750a.f2778e = this.f2760k ? 1 : -1;
            this.f2750a.f2777d = m4256d(viewM3467K) + this.f2750a.f2778e;
            this.f2750a.f2775b = this.f2759j.mo4001a(viewM3467K);
            iMo4006c = (-this.f2759j.mo4001a(viewM3467K)) + this.f2759j.mo4006c();
        }
        this.f2750a.f2776c = i2;
        if (z) {
            this.f2750a.f2776c -= iMo4006c;
        }
        this.f2750a.f2780g = iMo4006c;
    }

    /* JADX INFO: renamed from: a */
    private void m3473a(C0437a c0437a) {
        m3471a(c0437a.f2765a, c0437a.f2766b);
    }

    /* JADX INFO: renamed from: a */
    private void m3474a(C0484av.o oVar, int i) {
        if (i < 0) {
            return;
        }
        int iU = m4286u();
        if (this.f2760k) {
            for (int i2 = iU - 1; i2 >= 0; i2--) {
                View viewH = m4271h(i2);
                if (this.f2759j.mo4005b(viewH) > i || this.f2759j.mo4007c(viewH) > i) {
                    m3475a(oVar, iU - 1, i2);
                    return;
                }
            }
            return;
        }
        for (int i3 = 0; i3 < iU; i3++) {
            View viewH2 = m4271h(i3);
            if (this.f2759j.mo4005b(viewH2) > i || this.f2759j.mo4007c(viewH2) > i) {
                m3475a(oVar, 0, i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3475a(C0484av.o oVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m4213a(i, oVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m4213a(i3, oVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3476a(C0484av.o oVar, C0439c c0439c) {
        if (!c0439c.f2774a || c0439c.f2785l) {
            return;
        }
        if (c0439c.f2779f == -1) {
            m3482b(oVar, c0439c.f2780g);
        } else {
            m3474a(oVar, c0439c.f2780g);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3477a(C0484av.o oVar, C0484av.t tVar, C0437a c0437a) {
        if (m3478a(tVar, c0437a) || m3484b(oVar, tVar, c0437a)) {
            return;
        }
        c0437a.m3533b();
        c0437a.f2765a = this.f2753d ? tVar.m4383e() - 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3478a(C0484av.t tVar, C0437a c0437a) {
        if (tVar.m4379a() || this.f2761l == -1) {
            return false;
        }
        if (this.f2761l < 0 || this.f2761l >= tVar.m4383e()) {
            this.f2761l = -1;
            this.f2762m = Integer.MIN_VALUE;
            return false;
        }
        c0437a.f2765a = this.f2761l;
        if (this.f2763n != null && this.f2763n.m3542a()) {
            c0437a.f2767c = this.f2763n.f2788c;
            if (c0437a.f2767c) {
                c0437a.f2766b = this.f2759j.mo4008d() - this.f2763n.f2787b;
                return true;
            }
            c0437a.f2766b = this.f2759j.mo4006c() + this.f2763n.f2787b;
            return true;
        }
        if (this.f2762m != Integer.MIN_VALUE) {
            c0437a.f2767c = this.f2760k;
            if (this.f2760k) {
                c0437a.f2766b = this.f2759j.mo4008d() - this.f2762m;
                return true;
            }
            c0437a.f2766b = this.f2759j.mo4006c() + this.f2762m;
            return true;
        }
        View viewMo3512c = mo3512c(this.f2761l);
        if (viewMo3512c == null) {
            if (m4286u() > 0) {
                c0437a.f2767c = (this.f2761l < m4256d(m4271h(0))) == this.f2760k;
            }
            c0437a.m3533b();
            return true;
        }
        if (this.f2759j.mo4011e(viewMo3512c) > this.f2759j.mo4012f()) {
            c0437a.m3533b();
            return true;
        }
        if (this.f2759j.mo4001a(viewMo3512c) - this.f2759j.mo4006c() < 0) {
            c0437a.f2766b = this.f2759j.mo4006c();
            c0437a.f2767c = false;
            return true;
        }
        if (this.f2759j.mo4008d() - this.f2759j.mo4005b(viewMo3512c) >= 0) {
            c0437a.f2766b = c0437a.f2767c ? this.f2759j.mo4005b(viewMo3512c) + this.f2759j.m4004b() : this.f2759j.mo4001a(viewMo3512c);
            return true;
        }
        c0437a.f2766b = this.f2759j.mo4008d();
        c0437a.f2767c = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private int m3479b(int i, C0484av.o oVar, C0484av.t tVar, boolean z) {
        int iMo4006c;
        int iMo4006c2 = i - this.f2759j.mo4006c();
        if (iMo4006c2 <= 0) {
            return 0;
        }
        int i2 = -m3509c(iMo4006c2, oVar, tVar);
        int i3 = i + i2;
        if (!z || (iMo4006c = i3 - this.f2759j.mo4006c()) <= 0) {
            return i2;
        }
        this.f2759j.mo4003a(-iMo4006c);
        return i2 - iMo4006c;
    }

    /* JADX INFO: renamed from: b */
    private View m3480b(boolean z, boolean z2) {
        return this.f2760k ? m3498a(0, m4286u(), z, z2) : m3498a(m4286u() - 1, -1, z, z2);
    }

    /* JADX INFO: renamed from: b */
    private void m3481b(C0437a c0437a) {
        m3487g(c0437a.f2765a, c0437a.f2766b);
    }

    /* JADX INFO: renamed from: b */
    private void m3482b(C0484av.o oVar, int i) {
        int iU = m4286u();
        if (i < 0) {
            return;
        }
        int iMo4010e = this.f2759j.mo4010e() - i;
        if (this.f2760k) {
            for (int i2 = 0; i2 < iU; i2++) {
                View viewH = m4271h(i2);
                if (this.f2759j.mo4001a(viewH) < iMo4010e || this.f2759j.mo4009d(viewH) < iMo4010e) {
                    m3475a(oVar, 0, i2);
                    return;
                }
            }
            return;
        }
        for (int i3 = iU - 1; i3 >= 0; i3--) {
            View viewH2 = m4271h(i3);
            if (this.f2759j.mo4001a(viewH2) < iMo4010e || this.f2759j.mo4009d(viewH2) < iMo4010e) {
                m3475a(oVar, iU - 1, i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3483b(C0484av.o oVar, C0484av.t tVar, int i, int i2) {
        int iMo4011e;
        int iMo4011e2;
        if (!tVar.m4380b() || m4286u() == 0 || tVar.m4379a() || !mo3456b()) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        List<C0484av.w> listM4341c = oVar.m4341c();
        int size = listM4341c.size();
        int iD = m4256d(m4271h(0));
        int i5 = 0;
        while (i5 < size) {
            C0484av.w wVar = listM4341c.get(i5);
            if (wVar.m4435q()) {
                iMo4011e = i4;
                iMo4011e2 = i3;
            } else {
                if (((wVar.m4422d() < iD) != this.f2760k ? (byte) -1 : (byte) 1) == -1) {
                    iMo4011e2 = this.f2759j.mo4011e(wVar.f3381a) + i3;
                    iMo4011e = i4;
                } else {
                    iMo4011e = this.f2759j.mo4011e(wVar.f3381a) + i4;
                    iMo4011e2 = i3;
                }
            }
            i5++;
            i3 = iMo4011e2;
            i4 = iMo4011e;
        }
        this.f2750a.f2784k = listM4341c;
        if (i3 > 0) {
            m3487g(m4256d(m3467K()), i);
            this.f2750a.f2781h = i3;
            this.f2750a.f2776c = 0;
            this.f2750a.m3538a();
            m3497a(oVar, this.f2750a, tVar, false);
        }
        if (i4 > 0) {
            m3471a(m4256d(m3468L()), i2);
            this.f2750a.f2781h = i4;
            this.f2750a.f2776c = 0;
            this.f2750a.m3538a();
            m3497a(oVar, this.f2750a, tVar, false);
        }
        this.f2750a.f2784k = null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m3484b(C0484av.o oVar, C0484av.t tVar, C0437a c0437a) {
        if (m4286u() == 0) {
            return false;
        }
        View viewD = m4207D();
        if (viewD != null && c0437a.m3532a(viewD, tVar)) {
            c0437a.m3531a(viewD);
            return true;
        }
        if (this.f2751b != this.f2753d) {
            return false;
        }
        View viewM3485f = c0437a.f2767c ? m3485f(oVar, tVar) : m3486g(oVar, tVar);
        if (viewM3485f == null) {
            return false;
        }
        c0437a.m3534b(viewM3485f);
        if (!tVar.m4379a() && mo3456b()) {
            if (this.f2759j.mo4001a(viewM3485f) >= this.f2759j.mo4008d() || this.f2759j.mo4005b(viewM3485f) < this.f2759j.mo4006c()) {
                c0437a.f2766b = c0437a.f2767c ? this.f2759j.mo4008d() : this.f2759j.mo4006c();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private View m3485f(C0484av.o oVar, C0484av.t tVar) {
        return this.f2760k ? m3488h(oVar, tVar) : m3490i(oVar, tVar);
    }

    /* JADX INFO: renamed from: g */
    private View m3486g(C0484av.o oVar, C0484av.t tVar) {
        return this.f2760k ? m3490i(oVar, tVar) : m3488h(oVar, tVar);
    }

    /* JADX INFO: renamed from: g */
    private void m3487g(int i, int i2) {
        this.f2750a.f2776c = i2 - this.f2759j.mo4006c();
        this.f2750a.f2777d = i;
        this.f2750a.f2778e = this.f2760k ? 1 : -1;
        this.f2750a.f2779f = -1;
        this.f2750a.f2775b = i2;
        this.f2750a.f2780g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: h */
    private View m3488h(C0484av.o oVar, C0484av.t tVar) {
        return mo3438a(oVar, tVar, 0, m4286u(), tVar.m4383e());
    }

    /* JADX INFO: renamed from: i */
    private int m3489i(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        m3524h();
        return C0488az.m4453a(tVar, this.f2759j, m3470a(!this.f2754e, true), m3480b(this.f2754e ? false : true, true), this, this.f2754e, this.f2760k);
    }

    /* JADX INFO: renamed from: i */
    private View m3490i(C0484av.o oVar, C0484av.t tVar) {
        return mo3438a(oVar, tVar, m4286u() - 1, -1, tVar.m4383e());
    }

    /* JADX INFO: renamed from: j */
    private int m3491j(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        m3524h();
        return C0488az.m4452a(tVar, this.f2759j, m3470a(!this.f2754e, true), m3480b(this.f2754e ? false : true, true), this, this.f2754e);
    }

    /* JADX INFO: renamed from: j */
    private View m3492j(C0484av.o oVar, C0484av.t tVar) {
        return this.f2760k ? m3495l(oVar, tVar) : m3496m(oVar, tVar);
    }

    /* JADX INFO: renamed from: k */
    private int m3493k(C0484av.t tVar) {
        if (m4286u() == 0) {
            return 0;
        }
        m3524h();
        return C0488az.m4454b(tVar, this.f2759j, m3470a(!this.f2754e, true), m3480b(this.f2754e ? false : true, true), this, this.f2754e);
    }

    /* JADX INFO: renamed from: k */
    private View m3494k(C0484av.o oVar, C0484av.t tVar) {
        return this.f2760k ? m3496m(oVar, tVar) : m3495l(oVar, tVar);
    }

    /* JADX INFO: renamed from: l */
    private View m3495l(C0484av.o oVar, C0484av.t tVar) {
        return m3506b(0, m4286u());
    }

    /* JADX INFO: renamed from: m */
    private View m3496m(C0484av.o oVar, C0484av.t tVar) {
        return m3506b(m4286u() - 1, -1);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public int mo3433a(int i, C0484av.o oVar, C0484av.t tVar) {
        if (this.f2758i == 1) {
            return 0;
        }
        return m3509c(i, oVar, tVar);
    }

    /* JADX INFO: renamed from: a */
    int m3497a(C0484av.o oVar, C0439c c0439c, C0484av.t tVar, boolean z) {
        int i = c0439c.f2776c;
        if (c0439c.f2780g != Integer.MIN_VALUE) {
            if (c0439c.f2776c < 0) {
                c0439c.f2780g += c0439c.f2776c;
            }
            m3476a(oVar, c0439c);
        }
        int i2 = c0439c.f2776c + c0439c.f2781h;
        C0438b c0438b = this.f2756g;
        while (true) {
            if ((!c0439c.f2785l && i2 <= 0) || !c0439c.m3540a(tVar)) {
                break;
            }
            c0438b.m3535a();
            mo3443a(oVar, tVar, c0439c, c0438b);
            if (!c0438b.f2771b) {
                c0439c.f2775b += c0438b.f2770a * c0439c.f2779f;
                if (!c0438b.f2772c || this.f2750a.f2784k != null || !tVar.m4379a()) {
                    c0439c.f2776c -= c0438b.f2770a;
                    i2 -= c0438b.f2770a;
                }
                if (c0439c.f2780g != Integer.MIN_VALUE) {
                    c0439c.f2780g += c0438b.f2770a;
                    if (c0439c.f2776c < 0) {
                        c0439c.f2780g += c0439c.f2776c;
                    }
                    m3476a(oVar, c0439c);
                }
                if (z && c0438b.f2773d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0439c.f2776c;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public C0484av.i mo3435a() {
        return new C0484av.i(-2, -2);
    }

    /* JADX INFO: renamed from: a */
    View m3498a(int i, int i2, boolean z, boolean z2) {
        m3524h();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.f2758i == 0 ? this.f3307r.m4554a(i, i2, i3, i4) : this.f3308s.m4554a(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
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

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public View mo3439a(View view, int i, C0484av.o oVar, C0484av.t tVar) {
        int iM3516e;
        m3466J();
        if (m4286u() != 0 && (iM3516e = m3516e(i)) != Integer.MIN_VALUE) {
            m3524h();
            m3524h();
            m3472a(iM3516e, (int) (0.33333334f * this.f2759j.mo4012f()), false, tVar);
            this.f2750a.f2780g = Integer.MIN_VALUE;
            this.f2750a.f2774a = false;
            m3497a(oVar, this.f2750a, tVar, true);
            View viewM3494k = iM3516e == -1 ? m3494k(oVar, tVar) : m3492j(oVar, tVar);
            View viewM3467K = iM3516e == -1 ? m3467K() : m3468L();
            if (!viewM3467K.hasFocusable()) {
                return viewM3494k;
            }
            if (viewM3494k == null) {
                return null;
            }
            return viewM3467K;
        }
        return null;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3499a(int i, int i2, C0484av.t tVar, C0484av.h.a aVar) {
        if (this.f2758i != 0) {
            i = i2;
        }
        if (m4286u() == 0 || i == 0) {
            return;
        }
        m3524h();
        m3472a(i > 0 ? 1 : -1, Math.abs(i), true, tVar);
        mo3446a(tVar, this.f2750a, aVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3500a(int i, C0484av.h.a aVar) {
        int i2;
        boolean z;
        if (this.f2763n == null || !this.f2763n.m3542a()) {
            m3466J();
            boolean z2 = this.f2760k;
            if (this.f2761l == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.f2761l;
                z = z2;
            }
        } else {
            z = this.f2763n.f2788c;
            i2 = this.f2763n.f2786a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f2757h && i2 >= 0 && i2 < i; i4++) {
            aVar.mo3926b(i2, 0);
            i2 += i3;
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3501a(Parcelable parcelable) {
        if (parcelable instanceof C0440d) {
            this.f2763n = (C0440d) parcelable;
            m4278n();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo3442a(C0484av.o oVar, C0484av.t tVar, C0437a c0437a, int i) {
    }

    /* JADX INFO: renamed from: a */
    void mo3443a(C0484av.o oVar, C0484av.t tVar, C0439c c0439c, C0438b c0438b) {
        int iA;
        int iMo4013f;
        int iZ;
        int i;
        int iMo4013f2;
        View viewM3537a = c0439c.m3537a(oVar);
        if (viewM3537a == null) {
            c0438b.f2771b = true;
            return;
        }
        C0484av.i iVar = (C0484av.i) viewM3537a.getLayoutParams();
        if (c0439c.f2784k == null) {
            if (this.f2760k == (c0439c.f2779f == -1)) {
                m4244b(viewM3537a);
            } else {
                m4245b(viewM3537a, 0);
            }
        } else {
            if (this.f2760k == (c0439c.f2779f == -1)) {
                m4220a(viewM3537a);
            } else {
                m4221a(viewM3537a, 0);
            }
        }
        m4222a(viewM3537a, 0, 0);
        c0438b.f2770a = this.f2759j.mo4011e(viewM3537a);
        if (this.f2758i == 1) {
            if (m3522g()) {
                iMo4013f2 = m4289x() - m4205B();
                iZ = iMo4013f2 - this.f2759j.mo4013f(viewM3537a);
            } else {
                iZ = m4291z();
                iMo4013f2 = this.f2759j.mo4013f(viewM3537a) + iZ;
            }
            if (c0439c.f2779f == -1) {
                iMo4013f = c0439c.f2775b;
                iA = c0439c.f2775b - c0438b.f2770a;
                i = iMo4013f2;
            } else {
                iA = c0439c.f2775b;
                iMo4013f = c0438b.f2770a + c0439c.f2775b;
                i = iMo4013f2;
            }
        } else {
            iA = m4204A();
            iMo4013f = iA + this.f2759j.mo4013f(viewM3537a);
            if (c0439c.f2779f == -1) {
                int i2 = c0439c.f2775b;
                iZ = c0439c.f2775b - c0438b.f2770a;
                i = i2;
            } else {
                iZ = c0439c.f2775b;
                i = c0439c.f2775b + c0438b.f2770a;
            }
        }
        m4223a(viewM3537a, iZ, iA, i, iMo4013f);
        if (iVar.m4298d() || iVar.m4299e()) {
            c0438b.f2772c = true;
        }
        c0438b.f2773d = viewM3537a.hasFocusable();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3445a(C0484av.t tVar) {
        super.mo3445a(tVar);
        this.f2763n = null;
        this.f2761l = -1;
        this.f2762m = Integer.MIN_VALUE;
        this.f2764o.m3530a();
    }

    /* JADX INFO: renamed from: a */
    void mo3446a(C0484av.t tVar, C0439c c0439c, C0484av.h.a aVar) {
        int i = c0439c.f2777d;
        if (i < 0 || i >= tVar.m4383e()) {
            return;
        }
        aVar.mo3926b(i, Math.max(0, c0439c.f2780g));
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3502a(C0484av c0484av, C0484av.o oVar) {
        super.mo3502a(c0484av, oVar);
        if (this.f2755f) {
            m4249c(oVar);
            oVar.m4324a();
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3503a(AccessibilityEvent accessibilityEvent) {
        super.mo3503a(accessibilityEvent);
        if (m4286u() > 0) {
            accessibilityEvent.setFromIndex(m3528l());
            accessibilityEvent.setToIndex(m3529m());
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: a */
    public void mo3504a(String str) {
        if (this.f2763n == null) {
            super.mo3504a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo3451a(boolean z) {
        mo3504a((String) null);
        if (this.f2753d == z) {
            return;
        }
        this.f2753d = z;
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public int mo3453b(int i, C0484av.o oVar, C0484av.t tVar) {
        if (this.f2758i == 0) {
            return 0;
        }
        return m3509c(i, oVar, tVar);
    }

    /* JADX INFO: renamed from: b */
    protected int m3505b(C0484av.t tVar) {
        if (tVar.m4382d()) {
            return this.f2759j.mo4012f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    View m3506b(int i, int i2) {
        int i3;
        int i4;
        m3524h();
        if ((i2 > i ? (byte) 1 : i2 < i ? (byte) -1 : (byte) 0) == 0) {
            return m4271h(i);
        }
        if (this.f2759j.mo4001a(m4271h(i)) < this.f2759j.mo4006c()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f2758i == 0 ? this.f3307r.m4554a(i, i2, i3, i4) : this.f3308s.m4554a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public void m3507b(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo3504a((String) null);
        if (i == this.f2758i) {
            return;
        }
        this.f2758i = i;
        this.f2759j = null;
        m4278n();
    }

    /* JADX INFO: renamed from: b */
    public void m3508b(boolean z) {
        mo3504a((String) null);
        if (z == this.f2752c) {
            return;
        }
        this.f2752c = z;
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: b */
    public boolean mo3456b() {
        return this.f2763n == null && this.f2751b == this.f2753d;
    }

    /* JADX INFO: renamed from: c */
    int m3509c(int i, C0484av.o oVar, C0484av.t tVar) {
        if (m4286u() == 0 || i == 0) {
            return 0;
        }
        this.f2750a.f2774a = true;
        m3524h();
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m3472a(i2, iAbs, true, tVar);
        int iM3497a = this.f2750a.f2780g + m3497a(oVar, this.f2750a, tVar, false);
        if (iM3497a < 0) {
            return 0;
        }
        if (iAbs > iM3497a) {
            i = i2 * iM3497a;
        }
        this.f2759j.mo4003a(-i);
        this.f2750a.f2783j = i;
        return i;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public int mo3510c(C0484av.t tVar) {
        return m3489i(tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public Parcelable mo3511c() {
        if (this.f2763n != null) {
            return new C0440d(this.f2763n);
        }
        C0440d c0440d = new C0440d();
        if (m4286u() <= 0) {
            c0440d.m3543b();
            return c0440d;
        }
        m3524h();
        boolean z = this.f2751b ^ this.f2760k;
        c0440d.f2788c = z;
        if (z) {
            View viewM3468L = m3468L();
            c0440d.f2787b = this.f2759j.mo4008d() - this.f2759j.mo4005b(viewM3468L);
            c0440d.f2786a = m4256d(viewM3468L);
            return c0440d;
        }
        View viewM3467K = m3467K();
        c0440d.f2786a = m4256d(viewM3467K);
        c0440d.f2787b = this.f2759j.mo4001a(viewM3467K) - this.f2759j.mo4006c();
        return c0440d;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public View mo3512c(int i) {
        int iU = m4286u();
        if (iU == 0) {
            return null;
        }
        int iD = i - m4256d(m4271h(0));
        if (iD >= 0 && iD < iU) {
            View viewH = m4271h(iD);
            if (m4256d(viewH) == i) {
                return viewH;
            }
        }
        return super.mo3512c(i);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: c */
    public void mo3457c(C0484av.o oVar, C0484av.t tVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View viewMo3512c;
        int i5 = -1;
        if (!(this.f2763n == null && this.f2761l == -1) && tVar.m4383e() == 0) {
            m4249c(oVar);
            return;
        }
        if (this.f2763n != null && this.f2763n.m3542a()) {
            this.f2761l = this.f2763n.f2786a;
        }
        m3524h();
        this.f2750a.f2774a = false;
        m3466J();
        View viewD = m4207D();
        if (!this.f2764o.f2768d || this.f2761l != -1 || this.f2763n != null) {
            this.f2764o.m3530a();
            this.f2764o.f2767c = this.f2760k ^ this.f2753d;
            m3477a(oVar, tVar, this.f2764o);
            this.f2764o.f2768d = true;
        } else if (viewD != null && (this.f2759j.mo4001a(viewD) >= this.f2759j.mo4008d() || this.f2759j.mo4005b(viewD) <= this.f2759j.mo4006c())) {
            this.f2764o.m3531a(viewD);
        }
        int iM3505b = m3505b(tVar);
        if (this.f2750a.f2783j >= 0) {
            i = 0;
        } else {
            i = iM3505b;
            iM3505b = 0;
        }
        int iMo4006c = i + this.f2759j.mo4006c();
        int iMo4014g = iM3505b + this.f2759j.mo4014g();
        if (tVar.m4379a() && this.f2761l != -1 && this.f2762m != Integer.MIN_VALUE && (viewMo3512c = mo3512c(this.f2761l)) != null) {
            int iMo4008d = this.f2760k ? (this.f2759j.mo4008d() - this.f2759j.mo4005b(viewMo3512c)) - this.f2762m : this.f2762m - (this.f2759j.mo4001a(viewMo3512c) - this.f2759j.mo4006c());
            if (iMo4008d > 0) {
                iMo4006c += iMo4008d;
            } else {
                iMo4014g -= iMo4008d;
            }
        }
        if (this.f2764o.f2767c) {
            if (this.f2760k) {
                i5 = 1;
            }
        } else if (!this.f2760k) {
            i5 = 1;
        }
        mo3442a(oVar, tVar, this.f2764o, i5);
        m4216a(oVar);
        this.f2750a.f2785l = m3526j();
        this.f2750a.f2782i = tVar.m4379a();
        if (this.f2764o.f2767c) {
            m3481b(this.f2764o);
            this.f2750a.f2781h = iMo4006c;
            m3497a(oVar, this.f2750a, tVar, false);
            int i6 = this.f2750a.f2775b;
            int i7 = this.f2750a.f2777d;
            if (this.f2750a.f2776c > 0) {
                iMo4014g += this.f2750a.f2776c;
            }
            m3473a(this.f2764o);
            this.f2750a.f2781h = iMo4014g;
            this.f2750a.f2777d += this.f2750a.f2778e;
            m3497a(oVar, this.f2750a, tVar, false);
            int i8 = this.f2750a.f2775b;
            if (this.f2750a.f2776c > 0) {
                int i9 = this.f2750a.f2776c;
                m3487g(i7, i6);
                this.f2750a.f2781h = i9;
                m3497a(oVar, this.f2750a, tVar, false);
                i4 = this.f2750a.f2775b;
            } else {
                i4 = i6;
            }
            i3 = i4;
            i2 = i8;
        } else {
            m3473a(this.f2764o);
            this.f2750a.f2781h = iMo4014g;
            m3497a(oVar, this.f2750a, tVar, false);
            i2 = this.f2750a.f2775b;
            int i10 = this.f2750a.f2777d;
            if (this.f2750a.f2776c > 0) {
                iMo4006c += this.f2750a.f2776c;
            }
            m3481b(this.f2764o);
            this.f2750a.f2781h = iMo4006c;
            this.f2750a.f2777d += this.f2750a.f2778e;
            m3497a(oVar, this.f2750a, tVar, false);
            i3 = this.f2750a.f2775b;
            if (this.f2750a.f2776c > 0) {
                int i11 = this.f2750a.f2776c;
                m3471a(i10, i2);
                this.f2750a.f2781h = i11;
                m3497a(oVar, this.f2750a, tVar, false);
                i2 = this.f2750a.f2775b;
            }
        }
        if (m4286u() > 0) {
            if (this.f2760k ^ this.f2753d) {
                int iM3469a = m3469a(i2, oVar, tVar, true);
                int i12 = i3 + iM3469a;
                int iM3479b = m3479b(i12, oVar, tVar, false);
                i3 = i12 + iM3479b;
                i2 = i2 + iM3469a + iM3479b;
            } else {
                int iM3479b2 = m3479b(i3, oVar, tVar, true);
                int i13 = i2 + iM3479b2;
                int iM3469a2 = m3469a(i13, oVar, tVar, false);
                i3 = i3 + iM3479b2 + iM3469a2;
                i2 = i13 + iM3469a2;
            }
        }
        m3483b(oVar, tVar, i3, i2);
        if (tVar.m4379a()) {
            this.f2764o.m3530a();
        } else {
            this.f2759j.m4002a();
        }
        this.f2751b = this.f2753d;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public int mo3513d(C0484av.t tVar) {
        return m3489i(tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public void mo3514d(int i) {
        this.f2761l = i;
        this.f2762m = Integer.MIN_VALUE;
        if (this.f2763n != null) {
            this.f2763n.m3543b();
        }
        m4278n();
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: d */
    public boolean mo3515d() {
        return this.f2758i == 0;
    }

    /* JADX INFO: renamed from: e */
    int m3516e(int i) {
        switch (i) {
            case 1:
                return (this.f2758i == 1 || !m3522g()) ? -1 : 1;
            case 2:
                return (this.f2758i != 1 && m3522g()) ? -1 : 1;
            case 17:
                return this.f2758i != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.f2758i != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                return this.f2758i != 0 ? Integer.MIN_VALUE : 1;
            case 130:
                return this.f2758i == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: e */
    public int mo3517e(C0484av.t tVar) {
        return m3491j(tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: e */
    public boolean mo3518e() {
        return this.f2758i == 1;
    }

    /* JADX INFO: renamed from: f */
    public int m3519f() {
        return this.f2758i;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: f */
    public int mo3520f(C0484av.t tVar) {
        return m3491j(tVar);
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: g */
    public int mo3521g(C0484av.t tVar) {
        return m3493k(tVar);
    }

    /* JADX INFO: renamed from: g */
    protected boolean m3522g() {
        return m4284s() == 1;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: h */
    public int mo3523h(C0484av.t tVar) {
        return m3493k(tVar);
    }

    /* JADX INFO: renamed from: h */
    void m3524h() {
        if (this.f2750a == null) {
            this.f2750a = m3525i();
        }
        if (this.f2759j == null) {
            this.f2759j = AbstractC0483au.m3999a(this, this.f2758i);
        }
    }

    /* JADX INFO: renamed from: i */
    C0439c m3525i() {
        return new C0439c();
    }

    /* JADX INFO: renamed from: j */
    boolean m3526j() {
        return this.f2759j.mo4015h() == 0 && this.f2759j.mo4010e() == 0;
    }

    @Override // android.support.v7.widget.C0484av.h
    /* JADX INFO: renamed from: k */
    boolean mo3527k() {
        return (m4288w() == 1073741824 || m4287v() == 1073741824 || !m4212I()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public int m3528l() {
        View viewM3498a = m3498a(0, m4286u(), false, true);
        if (viewM3498a == null) {
            return -1;
        }
        return m4256d(viewM3498a);
    }

    /* JADX INFO: renamed from: m */
    public int m3529m() {
        View viewM3498a = m3498a(m4286u() - 1, -1, false, true);
        if (viewM3498a == null) {
            return -1;
        }
        return m4256d(viewM3498a);
    }
}
