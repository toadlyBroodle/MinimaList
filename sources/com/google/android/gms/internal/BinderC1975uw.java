package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.cast.C0990d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1156cq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.uw */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1975uw extends AbstractBinderC1988vi {

    /* JADX INFO: renamed from: a */
    private final AtomicReference<C1973uu> f11715a;

    /* JADX INFO: renamed from: b */
    private final Handler f11716b;

    public BinderC1975uw(C1973uu c1973uu) {
        this.f11715a = new AtomicReference<>(c1973uu);
        this.f11716b = new Handler(c1973uu.m7128t());
    }

    /* JADX INFO: renamed from: a */
    private static void m12408a(C1973uu c1973uu, long j, int i) {
        InterfaceC1156cq interfaceC1156cq;
        synchronized (c1973uu.f11707x) {
            interfaceC1156cq = (InterfaceC1156cq) c1973uu.f11707x.remove(Long.valueOf(j));
        }
        if (interfaceC1156cq != null) {
            interfaceC1156cq.mo6179a(new Status(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12409a(C1973uu c1973uu, int i) {
        synchronized (C1973uu.f11686B) {
            if (c1973uu.f11709z == null) {
                return false;
            }
            c1973uu.f11709z.mo6179a(new Status(i));
            C1973uu.m12390b(c1973uu, (InterfaceC1156cq) null);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1973uu m12410a() {
        C1973uu andSet = this.f11715a.getAndSet(null);
        if (andSet == null) {
            return null;
        }
        andSet.m12377A();
        return andSet;
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12411a(int i) {
        C1973uu c1973uuM12410a = m12410a();
        if (c1973uuM12410a == null) {
            return;
        }
        C1973uu.f11687d.m12445a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            c1973uuM12410a.m7117b(2);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12412a(C0990d c0990d, String str, String str2, boolean z) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        c1973uu.f11688e = c0990d;
        c1973uu.f11704u = c0990d.m6304a();
        c1973uu.f11705v = str2;
        c1973uu.f11695l = str;
        synchronized (C1973uu.f11685A) {
            if (c1973uu.f11708y != null) {
                c1973uu.f11708y.mo6179a(new C1974uv(new Status(0), c0990d, str, str2, z));
                C1973uu.m12381a(c1973uu, (InterfaceC1156cq) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12413a(C1962uj c1962uj) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        C1973uu.f11687d.m12445a("onApplicationStatusChanged", new Object[0]);
        this.f11716b.post(new RunnableC1978uz(this, c1973uu, c1962uj));
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12414a(C1982vc c1982vc) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        C1973uu.f11687d.m12445a("onDeviceStatusChanged", new Object[0]);
        this.f11716b.post(new RunnableC1977uy(this, c1973uu, c1982vc));
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12415a(String str, double d, boolean z) {
        C1973uu.f11687d.m12445a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12416a(String str, long j) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        m12408a(c1973uu, j, 0);
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12417a(String str, long j, int i) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        m12408a(c1973uu, j, i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12418a(String str, String str2) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        C1973uu.f11687d.m12445a("Receive (type=text, ns=%s) %s", str, str2);
        this.f11716b.post(new RunnableC1980va(this, c1973uu, str, str2));
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: a */
    public final void mo12419a(String str, byte[] bArr) {
        if (this.f11715a.get() == null) {
            return;
        }
        C1973uu.f11687d.m12445a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: b */
    public final void mo12420b(int i) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        synchronized (C1973uu.f11685A) {
            if (c1973uu.f11708y != null) {
                c1973uu.f11708y.mo6179a(new C1974uv(new Status(i)));
                C1973uu.m12381a(c1973uu, (InterfaceC1156cq) null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12421b() {
        return this.f11715a.get() == null;
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: c */
    public final void mo12422c(int i) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        m12409a(c1973uu, i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: d */
    public final void mo12423d(int i) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        m12409a(c1973uu, i);
    }

    @Override // com.google.android.gms.internal.InterfaceC1987vh
    /* JADX INFO: renamed from: e */
    public final void mo12424e(int i) {
        C1973uu c1973uu = this.f11715a.get();
        if (c1973uu == null) {
            return;
        }
        c1973uu.f11704u = null;
        c1973uu.f11705v = null;
        m12409a(c1973uu, i);
        if (c1973uu.f11690g != null) {
            this.f11716b.post(new RunnableC1976ux(this, c1973uu, i));
        }
    }
}
