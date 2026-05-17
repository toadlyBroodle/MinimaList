package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.api.C1078e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1230as;
import com.google.android.gms.internal.afq;
import com.google.android.gms.p051b.C0965f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1100ao<O extends C1074a.a> implements AbstractC1079f.b, AbstractC1079f.c, InterfaceC1163cx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1098am f5593a;

    /* JADX INFO: renamed from: c */
    private final C1074a.f f5595c;

    /* JADX INFO: renamed from: d */
    private final C1074a.c f5596d;

    /* JADX INFO: renamed from: e */
    private final C1150ck<O> f5597e;

    /* JADX INFO: renamed from: f */
    private final C1171f f5598f;

    /* JADX INFO: renamed from: i */
    private final int f5601i;

    /* JADX INFO: renamed from: j */
    private final BinderC1129bq f5602j;

    /* JADX INFO: renamed from: k */
    private boolean f5603k;

    /* JADX INFO: renamed from: b */
    private final Queue<AbstractC1085a> f5594b = new LinkedList();

    /* JADX INFO: renamed from: g */
    private final Set<C1152cm> f5599g = new HashSet();

    /* JADX INFO: renamed from: h */
    private final Map<C1121bi<?>, C1125bm> f5600h = new HashMap();

    /* JADX INFO: renamed from: l */
    private C1071a f5604l = null;

    public C1100ao(C1098am c1098am, C1078e<O> c1078e) {
        this.f5593a = c1098am;
        this.f5595c = c1078e.mo6654a(c1098am.f5591q.getLooper(), this);
        if (this.f5595c instanceof C1230as) {
            this.f5596d = C1230as.m7086e();
        } else {
            this.f5596d = this.f5595c;
        }
        this.f5597e = c1078e.m6659b();
        this.f5598f = new C1171f();
        this.f5601i = c1078e.m6661c();
        if (this.f5595c.mo6643i()) {
            this.f5602j = c1078e.mo6656a(c1098am.f5582h, c1098am.f5591q);
        } else {
            this.f5602j = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6811b(AbstractC1085a abstractC1085a) {
        abstractC1085a.mo6728a(this.f5598f, m6833k());
        try {
            abstractC1085a.mo6727a((C1100ao<?>) this);
        } catch (DeadObjectException e) {
            mo6386a(1);
            this.f5595c.mo6640f();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m6814c(C1071a c1071a) {
        for (C1152cm c1152cm : this.f5599g) {
            String strM6646l = null;
            if (c1071a == C1071a.f5439a) {
                strM6646l = this.f5595c.m6646l();
            }
            c1152cm.m6937a(this.f5597e, c1071a, strM6646l);
        }
        this.f5599g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m6815n() {
        m6826d();
        m6814c(C1071a.f5439a);
        m6817p();
        Iterator<C1125bm> it = this.f5600h.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().f5663a.m6891a(this.f5596d, new C0965f<>());
            } catch (DeadObjectException e) {
                mo6386a(1);
                this.f5595c.mo6640f();
            } catch (RemoteException e2) {
            }
        }
        while (this.f5595c.m6641g() && !this.f5594b.isEmpty()) {
            m6811b(this.f5594b.remove());
        }
        m6818q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m6816o() {
        m6826d();
        this.f5603k = true;
        this.f5598f.m6988c();
        this.f5593a.f5591q.sendMessageDelayed(Message.obtain(this.f5593a.f5591q, 9, this.f5597e), this.f5593a.f5579c);
        this.f5593a.f5591q.sendMessageDelayed(Message.obtain(this.f5593a.f5591q, 11, this.f5597e), this.f5593a.f5580d);
        this.f5593a.f5584j = -1;
    }

    /* JADX INFO: renamed from: p */
    private final void m6817p() {
        if (this.f5603k) {
            this.f5593a.f5591q.removeMessages(11, this.f5597e);
            this.f5593a.f5591q.removeMessages(9, this.f5597e);
            this.f5603k = false;
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m6818q() {
        this.f5593a.f5591q.removeMessages(12, this.f5597e);
        this.f5593a.f5591q.sendMessageDelayed(this.f5593a.f5591q.obtainMessage(12, this.f5597e), this.f5593a.f5581e);
    }

    /* JADX INFO: renamed from: a */
    public final void m6819a() {
        C1221aj.m7069a(this.f5593a.f5591q);
        m6820a(C1098am.f5575a);
        this.f5598f.m6987b();
        for (C1121bi c1121bi : (C1121bi[]) this.f5600h.keySet().toArray(new C1121bi[this.f5600h.size()])) {
            m6821a(new C1148ci(c1121bi, new C0965f()));
        }
        m6814c(new C1071a(4));
        if (this.f5595c.m6641g()) {
            this.f5595c.m6637a(new C1104as(this));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
        if (Looper.myLooper() == this.f5593a.f5591q.getLooper()) {
            m6816o();
        } else {
            this.f5593a.f5591q.post(new RunnableC1102aq(this));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        if (Looper.myLooper() == this.f5593a.f5591q.getLooper()) {
            m6815n();
        } else {
            this.f5593a.f5591q.post(new RunnableC1101ap(this));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.c
    /* JADX INFO: renamed from: a */
    public final void mo4766a(C1071a c1071a) {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5602j != null) {
            this.f5602j.m6900b();
        }
        m6826d();
        this.f5593a.f5584j = -1;
        m6814c(c1071a);
        if (c1071a.m6613c() == 4) {
            m6820a(C1098am.f5576b);
            return;
        }
        if (this.f5594b.isEmpty()) {
            this.f5604l = c1071a;
            return;
        }
        synchronized (C1098am.f5577f) {
            if (this.f5593a.f5588n != null && this.f5593a.f5589o.contains(this.f5597e)) {
                this.f5593a.f5588n.m6951b(c1071a, this.f5601i);
            } else if (!this.f5593a.m6803a(c1071a, this.f5601i)) {
                if (c1071a.m6613c() == 18) {
                    this.f5603k = true;
                }
                if (this.f5603k) {
                    this.f5593a.f5591q.sendMessageDelayed(Message.obtain(this.f5593a.f5591q, 9, this.f5597e), this.f5593a.f5579c);
                } else {
                    String strM6929a = this.f5597e.m6929a();
                    m6820a(new Status(17, new StringBuilder(String.valueOf(strM6929a).length() + 38).append("API: ").append(strM6929a).append(" is not available on this device.").toString()));
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1163cx
    /* JADX INFO: renamed from: a */
    public final void mo6762a(C1071a c1071a, C1074a<?> c1074a, boolean z) {
        if (Looper.myLooper() == this.f5593a.f5591q.getLooper()) {
            mo4766a(c1071a);
        } else {
            this.f5593a.f5591q.post(new RunnableC1103ar(this, c1071a));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6820a(Status status) {
        C1221aj.m7069a(this.f5593a.f5591q);
        Iterator<AbstractC1085a> it = this.f5594b.iterator();
        while (it.hasNext()) {
            it.next().mo6726a(status);
        }
        this.f5594b.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m6821a(AbstractC1085a abstractC1085a) {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5595c.m6641g()) {
            m6811b(abstractC1085a);
            m6818q();
            return;
        }
        this.f5594b.add(abstractC1085a);
        if (this.f5604l == null || !this.f5604l.m6611a()) {
            m6831i();
        } else {
            mo4766a(this.f5604l);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6822a(C1152cm c1152cm) {
        C1221aj.m7069a(this.f5593a.f5591q);
        this.f5599g.add(c1152cm);
    }

    /* JADX INFO: renamed from: b */
    public final C1074a.f m6823b() {
        return this.f5595c;
    }

    /* JADX INFO: renamed from: b */
    public final void m6824b(C1071a c1071a) {
        C1221aj.m7069a(this.f5593a.f5591q);
        this.f5595c.mo6640f();
        mo4766a(c1071a);
    }

    /* JADX INFO: renamed from: c */
    public final Map<C1121bi<?>, C1125bm> m6825c() {
        return this.f5600h;
    }

    /* JADX INFO: renamed from: d */
    public final void m6826d() {
        C1221aj.m7069a(this.f5593a.f5591q);
        this.f5604l = null;
    }

    /* JADX INFO: renamed from: e */
    public final C1071a m6827e() {
        C1221aj.m7069a(this.f5593a.f5591q);
        return this.f5604l;
    }

    /* JADX INFO: renamed from: f */
    public final void m6828f() {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5603k) {
            m6831i();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6829g() {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5603k) {
            m6817p();
            m6820a(this.f5593a.f5583i.mo7040a(this.f5593a.f5582h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
            this.f5595c.mo6640f();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6830h() {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5595c.m6641g() && this.f5600h.size() == 0) {
            if (this.f5598f.m6986a()) {
                m6818q();
            } else {
                this.f5595c.mo6640f();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6831i() {
        C1221aj.m7069a(this.f5593a.f5591q);
        if (this.f5595c.m6641g() || this.f5595c.m6642h()) {
            return;
        }
        if (this.f5595c.mo6644j() && this.f5593a.f5584j != 0) {
            this.f5593a.f5584j = this.f5593a.f5583i.mo7040a(this.f5593a.f5582h);
            if (this.f5593a.f5584j != 0) {
                mo4766a(new C1071a(this.f5593a.f5584j, null));
                return;
            }
        }
        C1106au c1106au = new C1106au(this.f5593a, this.f5595c, this.f5597e);
        if (this.f5595c.mo6643i()) {
            this.f5602j.m6898a(c1106au);
        }
        this.f5595c.m6636a(c1106au);
    }

    /* JADX INFO: renamed from: j */
    final boolean m6832j() {
        return this.f5595c.m6641g();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6833k() {
        return this.f5595c.mo6643i();
    }

    /* JADX INFO: renamed from: l */
    public final int m6834l() {
        return this.f5601i;
    }

    /* JADX INFO: renamed from: m */
    final afq m6835m() {
        if (this.f5602j == null) {
            return null;
        }
        return this.f5602j.m6897a();
    }
}
