package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1224am;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.C1250bl;
import com.google.android.gms.common.internal.InterfaceC1268o;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import com.google.android.gms.internal.agd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1179n implements InterfaceC1093ah {

    /* JADX INFO: renamed from: a */
    private final C1094ai f5781a;

    /* JADX INFO: renamed from: b */
    private final Lock f5782b;

    /* JADX INFO: renamed from: c */
    private final Context f5783c;

    /* JADX INFO: renamed from: d */
    private final C1283m f5784d;

    /* JADX INFO: renamed from: e */
    private C1071a f5785e;

    /* JADX INFO: renamed from: f */
    private int f5786f;

    /* JADX INFO: renamed from: h */
    private int f5788h;

    /* JADX INFO: renamed from: k */
    private afq f5791k;

    /* JADX INFO: renamed from: l */
    private boolean f5792l;

    /* JADX INFO: renamed from: m */
    private boolean f5793m;

    /* JADX INFO: renamed from: n */
    private boolean f5794n;

    /* JADX INFO: renamed from: o */
    private InterfaceC1268o f5795o;

    /* JADX INFO: renamed from: p */
    private boolean f5796p;

    /* JADX INFO: renamed from: q */
    private boolean f5797q;

    /* JADX INFO: renamed from: r */
    private final C1248bj f5798r;

    /* JADX INFO: renamed from: s */
    private final Map<C1074a<?>, Boolean> f5799s;

    /* JADX INFO: renamed from: t */
    private final C1074a.b<? extends afq, afr> f5800t;

    /* JADX INFO: renamed from: g */
    private int f5787g = 0;

    /* JADX INFO: renamed from: i */
    private final Bundle f5789i = new Bundle();

    /* JADX INFO: renamed from: j */
    private final Set<C1074a.d> f5790j = new HashSet();

    /* JADX INFO: renamed from: u */
    private ArrayList<Future<?>> f5801u = new ArrayList<>();

    public C1179n(C1094ai c1094ai, C1248bj c1248bj, Map<C1074a<?>, Boolean> map, C1283m c1283m, C1074a.b<? extends afq, afr> bVar, Lock lock, Context context) {
        this.f5781a = c1094ai;
        this.f5798r = c1248bj;
        this.f5799s = map;
        this.f5784d = c1283m;
        this.f5800t = bVar;
        this.f5782b = lock;
        this.f5783c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6997a(agd agdVar) {
        if (m7004b(0)) {
            C1071a c1071aM7834a = agdVar.m7834a();
            if (!c1071aM7834a.m6612b()) {
                if (!m6999a(c1071aM7834a)) {
                    m7002b(c1071aM7834a);
                    return;
                } else {
                    m7015g();
                    m7010e();
                    return;
                }
            }
            C1224am c1224amM7835b = agdVar.m7835b();
            C1071a c1071aM7079b = c1224amM7835b.m7079b();
            if (!c1071aM7079b.m6612b()) {
                String strValueOf = String.valueOf(c1071aM7079b);
                Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strValueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(strValueOf).toString(), new Exception());
                m7002b(c1071aM7079b);
            } else {
                this.f5794n = true;
                this.f5795o = c1224amM7835b.m7078a();
                this.f5796p = c1224amM7835b.m7080c();
                this.f5797q = c1224amM7835b.m7081d();
                m7010e();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m6998a(boolean z) {
        if (this.f5791k != null) {
            if (this.f5791k.m6641g() && z) {
                this.f5791k.mo7820e();
            }
            this.f5791k.mo6640f();
            this.f5795o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final boolean m6999a(C1071a c1071a) {
        return this.f5792l && !c1071a.m6611a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m7002b(C1071a c1071a) {
        m7017h();
        m6998a(!c1071a.m6611a());
        this.f5781a.m6761a(c1071a);
        this.f5781a.f5561e.mo6742a(c1071a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7003b(C1071a c1071a, C1074a<?> c1074a, boolean z) {
        boolean z2 = true;
        int iM6635a = c1074a.m6629a().m6635a();
        if (z) {
            boolean z3 = c1071a.m6611a() || this.f5784d.m7227c(c1071a.m6613c()) != null;
            if (z3) {
            }
        } else if (this.f5785e != null && iM6635a >= this.f5786f) {
            z2 = false;
        }
        if (z2) {
            this.f5785e = c1071a;
            this.f5786f = iM6635a;
        }
        this.f5781a.f5558b.put(c1074a.m6631c(), c1071a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final boolean m7004b(int i) {
        if (this.f5787g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f5781a.f5560d.m6745n());
        String strValueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strValueOf).length() + 23).append("Unexpected callback in ").append(strValueOf).toString());
        Log.w("GoogleApiClientConnecting", new StringBuilder(33).append("mRemainingConnections=").append(this.f5788h).toString());
        String strM7006c = m7006c(this.f5787g);
        String strM7006c2 = m7006c(i);
        Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(strM7006c).length() + 70 + String.valueOf(strM7006c2).length()).append("GoogleApiClient connecting is in step ").append(strM7006c).append(" but received callback for step ").append(strM7006c2).toString(), new Exception());
        m7002b(new C1071a(8, null));
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static String m7006c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final boolean m7009d() {
        this.f5788h--;
        if (this.f5788h > 0) {
            return false;
        }
        if (this.f5788h < 0) {
            Log.w("GoogleApiClientConnecting", this.f5781a.f5560d.m6745n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m7002b(new C1071a(8, null));
            return false;
        }
        if (this.f5785e == null) {
            return true;
        }
        this.f5781a.f5559c = this.f5786f;
        m7002b(this.f5785e);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m7010e() {
        if (this.f5788h != 0) {
            return;
        }
        if (!this.f5793m || this.f5794n) {
            ArrayList arrayList = new ArrayList();
            this.f5787g = 1;
            this.f5788h = this.f5781a.f5557a.size();
            for (C1074a.d<?> dVar : this.f5781a.f5557a.keySet()) {
                if (!this.f5781a.f5558b.containsKey(dVar)) {
                    arrayList.add(this.f5781a.f5557a.get(dVar));
                } else if (m7009d()) {
                    m7013f();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f5801u.add(C1097al.m6778a().submit(new C1185t(this, arrayList)));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m7013f() {
        this.f5781a.m6774h();
        C1097al.m6778a().execute(new RunnableC1180o(this));
        if (this.f5791k != null) {
            if (this.f5796p) {
                this.f5791k.mo7818a(this.f5795o, this.f5797q);
            }
            m6998a(false);
        }
        Iterator<C1074a.d<?>> it = this.f5781a.f5558b.keySet().iterator();
        while (it.hasNext()) {
            this.f5781a.f5557a.get(it.next()).mo6640f();
        }
        this.f5781a.f5561e.mo6741a(this.f5789i.isEmpty() ? null : this.f5789i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m7015g() {
        this.f5793m = false;
        this.f5781a.f5560d.f5523c = Collections.emptySet();
        for (C1074a.d<?> dVar : this.f5790j) {
            if (!this.f5781a.f5558b.containsKey(dVar)) {
                this.f5781a.f5558b.put(dVar, new C1071a(17, null));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m7017h() {
        ArrayList<Future<?>> arrayList = this.f5801u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f5801u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Set<Scope> m7018i() {
        if (this.f5798r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f5798r.m7151d());
        Map<C1074a<?>, C1250bl> mapM7153f = this.f5798r.m7153f();
        for (C1074a<?> c1074a : mapM7153f.keySet()) {
            if (!this.f5781a.f5558b.containsKey(c1074a.m6631c())) {
                hashSet.addAll(mapM7153f.get(c1074a).f5919a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6749a(T t) {
        this.f5781a.f5560d.f5521a.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6750a() {
        RunnableC1180o runnableC1180o = null;
        this.f5781a.f5558b.clear();
        this.f5793m = false;
        this.f5785e = null;
        this.f5787g = 0;
        this.f5792l = true;
        this.f5794n = false;
        this.f5796p = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (C1074a<?> c1074a : this.f5799s.keySet()) {
            C1074a.f fVar = this.f5781a.f5557a.get(c1074a.m6631c());
            boolean z2 = (c1074a.m6629a().m6635a() == 1) | z;
            boolean zBooleanValue = this.f5799s.get(c1074a).booleanValue();
            if (fVar.mo6643i()) {
                this.f5793m = true;
                if (zBooleanValue) {
                    this.f5790j.add(c1074a.m6631c());
                } else {
                    this.f5792l = false;
                }
            }
            map.put(fVar, new C1181p(this, c1074a, zBooleanValue));
            z = z2;
        }
        if (z) {
            this.f5793m = false;
        }
        if (this.f5793m) {
            this.f5798r.m7148a(Integer.valueOf(System.identityHashCode(this.f5781a.f5560d)));
            C1188w c1188w = new C1188w(this, runnableC1180o);
            this.f5791k = (afq) this.f5800t.mo6098a(this.f5783c, this.f5781a.f5560d.mo6677c(), this.f5798r, this.f5798r.m7156i(), c1188w, c1188w);
        }
        this.f5788h = this.f5781a.f5557a.size();
        this.f5801u.add(C1097al.m6778a().submit(new C1182q(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6751a(int i) {
        m7002b(new C1071a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6752a(Bundle bundle) {
        if (m7004b(1)) {
            if (bundle != null) {
                this.f5789i.putAll(bundle);
            }
            if (m7009d()) {
                m7013f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: a */
    public final void mo6753a(C1071a c1071a, C1074a<?> c1074a, boolean z) {
        if (m7004b(1)) {
            m7003b(c1071a, c1074a, z);
            if (m7009d()) {
                m7013f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6754b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: b */
    public final boolean mo6755b() {
        m7017h();
        m6998a(true);
        this.f5781a.m6761a((C1071a) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1093ah
    /* JADX INFO: renamed from: c */
    public final void mo6756c() {
    }
}
