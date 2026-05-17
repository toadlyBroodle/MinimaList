package android.support.v7.widget;

import android.support.v7.widget.C0484av;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v7.widget.ad */
/* JADX INFO: loaded from: classes.dex */
class C0466ad {

    /* JADX INFO: renamed from: a */
    final b f2984a;

    /* JADX INFO: renamed from: b */
    final a f2985b = new a();

    /* JADX INFO: renamed from: c */
    final List<View> f2986c = new ArrayList();

    /* JADX INFO: renamed from: android.support.v7.widget.ad$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f2987a = 0;

        /* JADX INFO: renamed from: b */
        a f2988b;

        a() {
        }

        /* JADX INFO: renamed from: b */
        private void m3793b() {
            if (this.f2988b == null) {
                this.f2988b = new a();
            }
        }

        /* JADX INFO: renamed from: a */
        void m3794a() {
            this.f2987a = 0L;
            if (this.f2988b != null) {
                this.f2988b.m3794a();
            }
        }

        /* JADX INFO: renamed from: a */
        void m3795a(int i) {
            if (i < 64) {
                this.f2987a |= 1 << i;
            } else {
                m3793b();
                this.f2988b.m3795a(i - 64);
            }
        }

        /* JADX INFO: renamed from: a */
        void m3796a(int i, boolean z) {
            if (i >= 64) {
                m3793b();
                this.f2988b.m3796a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2987a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.f2987a = (((j ^ (-1)) & this.f2987a) << 1) | (this.f2987a & j);
            if (z) {
                m3795a(i);
            } else {
                m3797b(i);
            }
            if (z2 || this.f2988b != null) {
                m3793b();
                this.f2988b.m3796a(0, z2);
            }
        }

        /* JADX INFO: renamed from: b */
        void m3797b(int i) {
            if (i < 64) {
                this.f2987a &= (1 << i) ^ (-1);
            } else if (this.f2988b != null) {
                this.f2988b.m3797b(i - 64);
            }
        }

        /* JADX INFO: renamed from: c */
        boolean m3798c(int i) {
            if (i < 64) {
                return (this.f2987a & (1 << i)) != 0;
            }
            m3793b();
            return this.f2988b.m3798c(i - 64);
        }

        /* JADX INFO: renamed from: d */
        boolean m3799d(int i) {
            if (i >= 64) {
                m3793b();
                return this.f2988b.m3799d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2987a & j) != 0;
            this.f2987a &= j ^ (-1);
            long j2 = j - 1;
            this.f2987a = Long.rotateRight((j2 ^ (-1)) & this.f2987a, 1) | (this.f2987a & j2);
            if (this.f2988b == null) {
                return z;
            }
            if (this.f2988b.m3798c(0)) {
                m3795a(63);
            }
            this.f2988b.m3799d(0);
            return z;
        }

        /* JADX INFO: renamed from: e */
        int m3800e(int i) {
            return this.f2988b == null ? i >= 64 ? Long.bitCount(this.f2987a) : Long.bitCount(this.f2987a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2987a & ((1 << i) - 1)) : this.f2988b.m3800e(i - 64) + Long.bitCount(this.f2987a);
        }

        public String toString() {
            return this.f2988b == null ? Long.toBinaryString(this.f2987a) : this.f2988b.toString() + "xx" + Long.toBinaryString(this.f2987a);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ad$b */
    interface b {
        /* JADX INFO: renamed from: a */
        int mo3801a();

        /* JADX INFO: renamed from: a */
        int mo3802a(View view);

        /* JADX INFO: renamed from: a */
        void mo3803a(int i);

        /* JADX INFO: renamed from: a */
        void mo3804a(View view, int i);

        /* JADX INFO: renamed from: a */
        void mo3805a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* JADX INFO: renamed from: b */
        C0484av.w mo3806b(View view);

        /* JADX INFO: renamed from: b */
        View mo3807b(int i);

        /* JADX INFO: renamed from: b */
        void mo3808b();

        /* JADX INFO: renamed from: c */
        void mo3809c(int i);

        /* JADX INFO: renamed from: c */
        void mo3810c(View view);

        /* JADX INFO: renamed from: d */
        void mo3811d(View view);
    }

    C0466ad(b bVar) {
        this.f2984a = bVar;
    }

    /* JADX INFO: renamed from: f */
    private int m3773f(int i) {
        if (i < 0) {
            return -1;
        }
        int iMo3801a = this.f2984a.mo3801a();
        int i2 = i;
        while (i2 < iMo3801a) {
            int iM3800e = i - (i2 - this.f2985b.m3800e(i2));
            if (iM3800e == 0) {
                while (this.f2985b.m3798c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM3800e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    private void m3774g(View view) {
        this.f2986c.add(view);
        this.f2984a.mo3810c(view);
    }

    /* JADX INFO: renamed from: h */
    private boolean m3775h(View view) {
        if (!this.f2986c.remove(view)) {
            return false;
        }
        this.f2984a.mo3811d(view);
        return true;
    }

    /* JADX INFO: renamed from: a */
    void m3776a() {
        this.f2985b.m3794a();
        for (int size = this.f2986c.size() - 1; size >= 0; size--) {
            this.f2984a.mo3811d(this.f2986c.get(size));
            this.f2986c.remove(size);
        }
        this.f2984a.mo3808b();
    }

    /* JADX INFO: renamed from: a */
    void m3777a(int i) {
        int iM3773f = m3773f(i);
        View viewMo3807b = this.f2984a.mo3807b(iM3773f);
        if (viewMo3807b == null) {
            return;
        }
        if (this.f2985b.m3799d(iM3773f)) {
            m3775h(viewMo3807b);
        }
        this.f2984a.mo3803a(iM3773f);
    }

    /* JADX INFO: renamed from: a */
    void m3778a(View view) {
        int iMo3802a = this.f2984a.mo3802a(view);
        if (iMo3802a < 0) {
            return;
        }
        if (this.f2985b.m3799d(iMo3802a)) {
            m3775h(view);
        }
        this.f2984a.mo3803a(iMo3802a);
    }

    /* JADX INFO: renamed from: a */
    void m3779a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo3801a = i < 0 ? this.f2984a.mo3801a() : m3773f(i);
        this.f2985b.m3796a(iMo3801a, z);
        if (z) {
            m3774g(view);
        }
        this.f2984a.mo3805a(view, iMo3801a, layoutParams);
    }

    /* JADX INFO: renamed from: a */
    void m3780a(View view, int i, boolean z) {
        int iMo3801a = i < 0 ? this.f2984a.mo3801a() : m3773f(i);
        this.f2985b.m3796a(iMo3801a, z);
        if (z) {
            m3774g(view);
        }
        this.f2984a.mo3804a(view, iMo3801a);
    }

    /* JADX INFO: renamed from: a */
    void m3781a(View view, boolean z) {
        m3780a(view, -1, z);
    }

    /* JADX INFO: renamed from: b */
    int m3782b() {
        return this.f2984a.mo3801a() - this.f2986c.size();
    }

    /* JADX INFO: renamed from: b */
    int m3783b(View view) {
        int iMo3802a = this.f2984a.mo3802a(view);
        if (iMo3802a == -1 || this.f2985b.m3798c(iMo3802a)) {
            return -1;
        }
        return iMo3802a - this.f2985b.m3800e(iMo3802a);
    }

    /* JADX INFO: renamed from: b */
    View m3784b(int i) {
        return this.f2984a.mo3807b(m3773f(i));
    }

    /* JADX INFO: renamed from: c */
    int m3785c() {
        return this.f2984a.mo3801a();
    }

    /* JADX INFO: renamed from: c */
    View m3786c(int i) {
        int size = this.f2986c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2986c.get(i2);
            C0484av.w wVarMo3806b = this.f2984a.mo3806b(view);
            if (wVarMo3806b.m4422d() == i && !wVarMo3806b.m4432n() && !wVarMo3806b.m4435q()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    boolean m3787c(View view) {
        return this.f2986c.contains(view);
    }

    /* JADX INFO: renamed from: d */
    View m3788d(int i) {
        return this.f2984a.mo3807b(i);
    }

    /* JADX INFO: renamed from: d */
    void m3789d(View view) {
        int iMo3802a = this.f2984a.mo3802a(view);
        if (iMo3802a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f2985b.m3795a(iMo3802a);
        m3774g(view);
    }

    /* JADX INFO: renamed from: e */
    void m3790e(int i) {
        int iM3773f = m3773f(i);
        this.f2985b.m3799d(iM3773f);
        this.f2984a.mo3809c(iM3773f);
    }

    /* JADX INFO: renamed from: e */
    void m3791e(View view) {
        int iMo3802a = this.f2984a.mo3802a(view);
        if (iMo3802a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (!this.f2985b.m3798c(iMo3802a)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        this.f2985b.m3797b(iMo3802a);
        m3775h(view);
    }

    /* JADX INFO: renamed from: f */
    boolean m3792f(View view) {
        int iMo3802a = this.f2984a.mo3802a(view);
        if (iMo3802a == -1) {
            if (m3775h(view)) {
            }
            return true;
        }
        if (!this.f2985b.m3798c(iMo3802a)) {
            return false;
        }
        this.f2985b.m3799d(iMo3802a);
        if (!m3775h(view)) {
        }
        this.f2984a.mo3803a(iMo3802a);
        return true;
    }

    public String toString() {
        return this.f2985b.toString() + ", hidden list:" + this.f2986c.size();
    }
}
