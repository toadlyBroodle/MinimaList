package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p018i.C0207a;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cy */
/* JADX INFO: loaded from: classes.dex */
final class C1164cy implements InterfaceC1114bb {

    /* JADX INFO: renamed from: a */
    private final Context f5744a;

    /* JADX INFO: renamed from: b */
    private final C1086aa f5745b;

    /* JADX INFO: renamed from: c */
    private final Looper f5746c;

    /* JADX INFO: renamed from: d */
    private final C1094ai f5747d;

    /* JADX INFO: renamed from: e */
    private final C1094ai f5748e;

    /* JADX INFO: renamed from: f */
    private final Map<C1074a.d<?>, C1094ai> f5749f;

    /* JADX INFO: renamed from: h */
    private final C1074a.f f5751h;

    /* JADX INFO: renamed from: i */
    private Bundle f5752i;

    /* JADX INFO: renamed from: m */
    private final Lock f5756m;

    /* JADX INFO: renamed from: g */
    private final Set<InterfaceC1128bp> f5750g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j */
    private C1071a f5753j = null;

    /* JADX INFO: renamed from: k */
    private C1071a f5754k = null;

    /* JADX INFO: renamed from: l */
    private boolean f5755l = false;

    /* JADX INFO: renamed from: n */
    private int f5757n = 0;

    private C1164cy(Context context, C1086aa c1086aa, Lock lock, Looper looper, C1283m c1283m, Map<C1074a.d<?>, C1074a.f> map, Map<C1074a.d<?>, C1074a.f> map2, C1248bj c1248bj, C1074a.b<? extends afq, afr> bVar, C1074a.f fVar, ArrayList<C1162cw> arrayList, ArrayList<C1162cw> arrayList2, Map<C1074a<?>, Boolean> map3, Map<C1074a<?>, Boolean> map4) {
        this.f5744a = context;
        this.f5745b = c1086aa;
        this.f5756m = lock;
        this.f5746c = looper;
        this.f5751h = fVar;
        this.f5747d = new C1094ai(context, this.f5745b, lock, looper, c1283m, map2, null, map4, null, arrayList2, new C1167da(this, null));
        this.f5748e = new C1094ai(context, this.f5745b, lock, looper, c1283m, map, c1248bj, map3, bVar, arrayList, new C1168db(this, null));
        C0207a c0207a = new C0207a();
        Iterator<C1074a.d<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            c0207a.put(it.next(), this.f5747d);
        }
        Iterator<C1074a.d<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c0207a.put(it2.next(), this.f5748e);
        }
        this.f5749f = Collections.unmodifiableMap(c0207a);
    }

    /* JADX INFO: renamed from: a */
    public static C1164cy m6958a(Context context, C1086aa c1086aa, Lock lock, Looper looper, C1283m c1283m, Map<C1074a.d<?>, C1074a.f> map, C1248bj c1248bj, Map<C1074a<?>, Boolean> map2, C1074a.b<? extends afq, afr> bVar, ArrayList<C1162cw> arrayList) {
        C1074a.f fVar = null;
        C0207a c0207a = new C0207a();
        C0207a c0207a2 = new C0207a();
        for (Map.Entry<C1074a.d<?>, C1074a.f> entry : map.entrySet()) {
            C1074a.f value = entry.getValue();
            if (value.mo6168c()) {
                fVar = value;
            }
            if (value.mo6643i()) {
                c0207a.put(entry.getKey(), value);
            } else {
                c0207a2.put(entry.getKey(), value);
            }
        }
        C1221aj.m7071a(!c0207a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0207a c0207a3 = new C0207a();
        C0207a c0207a4 = new C0207a();
        for (C1074a<?> c1074a : map2.keySet()) {
            C1074a.d<?> dVarM6631c = c1074a.m6631c();
            if (c0207a.containsKey(dVarM6631c)) {
                c0207a3.put(c1074a, map2.get(c1074a));
            } else {
                if (!c0207a2.containsKey(dVarM6631c)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c0207a4.put(c1074a, map2.get(c1074a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<C1162cw> arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            C1162cw c1162cw = arrayList4.get(i);
            i++;
            C1162cw c1162cw2 = c1162cw;
            if (c0207a3.containsKey(c1162cw2.f5741a)) {
                arrayList2.add(c1162cw2);
            } else {
                if (!c0207a4.containsKey(c1162cw2.f5741a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(c1162cw2);
            }
        }
        return new C1164cy(context, c1086aa, lock, looper, c1283m, c0207a, c0207a2, c1248bj, bVar, fVar, arrayList2, arrayList3, c0207a3, c0207a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6960a(int i, boolean z) {
        this.f5745b.mo6740a(i, z);
        this.f5754k = null;
        this.f5753j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m6961a(Bundle bundle) {
        if (this.f5752i == null) {
            this.f5752i = bundle;
        } else if (bundle != null) {
            this.f5752i.putAll(bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m6962a(C1071a c1071a) {
        switch (this.f5757n) {
            case 2:
                this.f5745b.mo6742a(c1071a);
            case 1:
                m6975i();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.f5757n = 0;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6968b(C1071a c1071a) {
        return c1071a != null && c1071a.m6612b();
    }

    /* JADX INFO: renamed from: c */
    private final boolean m6969c(AbstractC1155cp<? extends InterfaceC1193k, ? extends C1074a.c> abstractC1155cp) {
        Object objM6948g = abstractC1155cp.m6948g();
        C1221aj.m7075b(this.f5749f.containsKey(objM6948g), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f5749f.get(objM6948g).equals(this.f5748e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m6974h() {
        if (!m6968b(this.f5753j)) {
            if (this.f5753j != null && m6968b(this.f5754k)) {
                this.f5748e.mo6769c();
                m6962a(this.f5753j);
                return;
            } else {
                if (this.f5753j == null || this.f5754k == null) {
                    return;
                }
                C1071a c1071a = this.f5753j;
                if (this.f5748e.f5559c < this.f5747d.f5559c) {
                    c1071a = this.f5754k;
                }
                m6962a(c1071a);
                return;
            }
        }
        if (m6968b(this.f5754k) || m6976j()) {
            switch (this.f5757n) {
                case 2:
                    this.f5745b.mo6741a(this.f5752i);
                case 1:
                    m6975i();
                    break;
                default:
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    break;
            }
            this.f5757n = 0;
            return;
        }
        if (this.f5754k != null) {
            if (this.f5757n == 1) {
                m6975i();
            } else {
                m6962a(this.f5754k);
                this.f5747d.mo6769c();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m6975i() {
        Iterator<InterfaceC1128bp> it = this.f5750g.iterator();
        while (it.hasNext()) {
            it.next().mo6164t();
        }
        this.f5750g.clear();
    }

    /* JADX INFO: renamed from: j */
    private final boolean m6976j() {
        return this.f5754k != null && this.f5754k.m6613c() == 4;
    }

    /* JADX INFO: renamed from: k */
    private final PendingIntent m6977k() {
        if (this.f5751h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f5744a, System.identityHashCode(this.f5745b), this.f5751h.mo6169d(), 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6759a(T t) {
        if (!m6969c((AbstractC1155cp<? extends InterfaceC1193k, ? extends C1074a.c>) t)) {
            return (T) this.f5747d.mo6759a(t);
        }
        if (!m6976j()) {
            return (T) this.f5748e.mo6759a(t);
        }
        t.m6946b(new Status(4, null, m6977k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6760a() {
        this.f5757n = 2;
        this.f5755l = false;
        this.f5754k = null;
        this.f5753j = null;
        this.f5747d.mo6760a();
        this.f5748e.mo6760a();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6765a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f5748e.mo6765a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f5747d.mo6765a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final boolean mo6766a(InterfaceC1128bp interfaceC1128bp) {
        this.f5756m.lock();
        try {
            if ((!m6978e() && !mo6770d()) || this.f5748e.mo6770d()) {
                this.f5756m.unlock();
                return false;
            }
            this.f5750g.add(interfaceC1128bp);
            if (this.f5757n == 0) {
                this.f5757n = 1;
            }
            this.f5754k = null;
            this.f5748e.mo6760a();
            return true;
        } finally {
            this.f5756m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final C1071a mo6767b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6768b(T t) {
        if (!m6969c((AbstractC1155cp<? extends InterfaceC1193k, ? extends C1074a.c>) t)) {
            return (T) this.f5747d.mo6768b(t);
        }
        if (!m6976j()) {
            return (T) this.f5748e.mo6768b(t);
        }
        t.m6946b(new Status(4, null, m6977k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: c */
    public final void mo6769c() {
        this.f5754k = null;
        this.f5753j = null;
        this.f5757n = 0;
        this.f5747d.mo6769c();
        this.f5748e.mo6769c();
        m6975i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6770d() {
        boolean z = true;
        this.f5756m.lock();
        try {
            if (!this.f5747d.mo6770d()) {
                z = false;
            } else if (!this.f5748e.mo6770d() && !m6976j()) {
                if (this.f5757n != 1) {
                }
            }
            return z;
        } finally {
            this.f5756m.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6978e() {
        this.f5756m.lock();
        try {
            return this.f5757n == 2;
        } finally {
            this.f5756m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: f */
    public final void mo6772f() {
        this.f5756m.lock();
        try {
            boolean zM6978e = m6978e();
            this.f5748e.mo6769c();
            this.f5754k = new C1071a(4);
            if (zM6978e) {
                new Handler(this.f5746c).post(new RunnableC1165cz(this));
            } else {
                m6975i();
            }
        } finally {
            this.f5756m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: g */
    public final void mo6773g() {
        this.f5747d.mo6773g();
        this.f5748e.mo6773g();
    }
}
