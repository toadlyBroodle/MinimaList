package android.support.v7.view;

import android.support.v4.p019j.C0250u;
import android.support.v4.p019j.C0252w;
import android.support.v4.p019j.InterfaceC0251v;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v7.view.h */
/* JADX INFO: loaded from: classes.dex */
public class C0394h {

    /* JADX INFO: renamed from: b */
    InterfaceC0251v f2386b;

    /* JADX INFO: renamed from: d */
    private Interpolator f2388d;

    /* JADX INFO: renamed from: e */
    private boolean f2389e;

    /* JADX INFO: renamed from: c */
    private long f2387c = -1;

    /* JADX INFO: renamed from: f */
    private final C0252w f2390f = new C0252w() { // from class: android.support.v7.view.h.1

        /* JADX INFO: renamed from: b */
        private boolean f2392b = false;

        /* JADX INFO: renamed from: c */
        private int f2393c = 0;

        /* JADX INFO: renamed from: a */
        void m3162a() {
            this.f2393c = 0;
            this.f2392b = false;
            C0394h.this.m3160b();
        }

        @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: a */
        public void mo1862a(View view) {
            if (this.f2392b) {
                return;
            }
            this.f2392b = true;
            if (C0394h.this.f2386b != null) {
                C0394h.this.f2386b.mo1862a(null);
            }
        }

        @Override // android.support.v4.p019j.C0252w, android.support.v4.p019j.InterfaceC0251v
        /* JADX INFO: renamed from: b */
        public void mo1863b(View view) {
            int i = this.f2393c + 1;
            this.f2393c = i;
            if (i == C0394h.this.f2385a.size()) {
                if (C0394h.this.f2386b != null) {
                    C0394h.this.f2386b.mo1863b(null);
                }
                m3162a();
            }
        }
    };

    /* JADX INFO: renamed from: a */
    final ArrayList<C0250u> f2385a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public C0394h m3154a(long j) {
        if (!this.f2389e) {
            this.f2387c = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0394h m3155a(C0250u c0250u) {
        if (!this.f2389e) {
            this.f2385a.add(c0250u);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0394h m3156a(C0250u c0250u, C0250u c0250u2) {
        this.f2385a.add(c0250u);
        c0250u2.m1859b(c0250u.m1852a());
        this.f2385a.add(c0250u2);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0394h m3157a(InterfaceC0251v interfaceC0251v) {
        if (!this.f2389e) {
            this.f2386b = interfaceC0251v;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0394h m3158a(Interpolator interpolator) {
        if (!this.f2389e) {
            this.f2388d = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m3159a() {
        if (this.f2389e) {
            return;
        }
        for (C0250u c0250u : this.f2385a) {
            if (this.f2387c >= 0) {
                c0250u.m1854a(this.f2387c);
            }
            if (this.f2388d != null) {
                c0250u.m1857a(this.f2388d);
            }
            if (this.f2386b != null) {
                c0250u.m1855a(this.f2390f);
            }
            c0250u.m1861c();
        }
        this.f2389e = true;
    }

    /* JADX INFO: renamed from: b */
    void m3160b() {
        this.f2389e = false;
    }

    /* JADX INFO: renamed from: c */
    public void m3161c() {
        if (this.f2389e) {
            Iterator<C0250u> it = this.f2385a.iterator();
            while (it.hasNext()) {
                it.next().m1860b();
            }
            this.f2389e = false;
        }
    }
}
