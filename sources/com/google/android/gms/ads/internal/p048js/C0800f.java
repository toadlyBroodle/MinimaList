package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1704kv;
import com.google.android.gms.internal.C1706kx;
import com.google.android.gms.internal.InterfaceC1627hz;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0800f extends C1706kx<InterfaceC0809o> {

    /* JADX INFO: renamed from: b */
    private InterfaceC1627hz<InterfaceC0809o> f4715b;

    /* JADX INFO: renamed from: a */
    private final Object f4714a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f4716c = false;

    /* JADX INFO: renamed from: d */
    private int f4717d = 0;

    public C0800f(InterfaceC1627hz<InterfaceC0809o> interfaceC1627hz) {
        this.f4715b = interfaceC1627hz;
    }

    /* JADX INFO: renamed from: f */
    private final void m5721f() {
        synchronized (this.f4714a) {
            C1221aj.m7070a(this.f4717d >= 0);
            if (this.f4716c && this.f4717d == 0) {
                C1560fm.m11343a("No reference is left (including root). Cleaning up engine.");
                mo11659a(new C0803i(this), new C1704kv());
            } else {
                C1560fm.m11343a("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0796b m5722a() {
        C0796b c0796b = new C0796b(this);
        synchronized (this.f4714a) {
            mo11659a(new C0801g(this, c0796b), new C0802h(this, c0796b));
            C1221aj.m7070a(this.f4717d >= 0);
            this.f4717d++;
        }
        return c0796b;
    }

    /* JADX INFO: renamed from: b */
    protected final void m5723b() {
        synchronized (this.f4714a) {
            C1221aj.m7070a(this.f4717d > 0);
            C1560fm.m11343a("Releasing 1 reference for JS Engine");
            this.f4717d--;
            m5721f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5724c() {
        synchronized (this.f4714a) {
            C1221aj.m7070a(this.f4717d >= 0);
            C1560fm.m11343a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f4716c = true;
            m5721f();
        }
    }
}
