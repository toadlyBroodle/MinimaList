package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.common.internal.C1250bl;
import com.google.android.gms.internal.ExecutorC2035xb;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1112b implements InterfaceC1114bb {

    /* JADX INFO: renamed from: c */
    private final Map<C1074a<?>, Boolean> f5630c;

    /* JADX INFO: renamed from: d */
    private final C1098am f5631d;

    /* JADX INFO: renamed from: e */
    private final C1086aa f5632e;

    /* JADX INFO: renamed from: f */
    private final Lock f5633f;

    /* JADX INFO: renamed from: g */
    private final Looper f5634g;

    /* JADX INFO: renamed from: h */
    private final C1283m f5635h;

    /* JADX INFO: renamed from: i */
    private final Condition f5636i;

    /* JADX INFO: renamed from: j */
    private final C1248bj f5637j;

    /* JADX INFO: renamed from: k */
    private final boolean f5638k;

    /* JADX INFO: renamed from: l */
    private final boolean f5639l;

    /* JADX INFO: renamed from: n */
    private boolean f5641n;

    /* JADX INFO: renamed from: o */
    private Map<C1150ck<?>, C1071a> f5642o;

    /* JADX INFO: renamed from: p */
    private Map<C1150ck<?>, C1071a> f5643p;

    /* JADX INFO: renamed from: q */
    private C1170e f5644q;

    /* JADX INFO: renamed from: r */
    private C1071a f5645r;

    /* JADX INFO: renamed from: a */
    private final Map<C1074a.d<?>, C1169dc<?>> f5628a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<C1074a.d<?>, C1169dc<?>> f5629b = new HashMap();

    /* JADX INFO: renamed from: m */
    private final Queue<AbstractC1155cp<?, ?>> f5640m = new LinkedList();

    public C1112b(Context context, Lock lock, Looper looper, C1283m c1283m, Map<C1074a.d<?>, C1074a.f> map, C1248bj c1248bj, Map<C1074a<?>, Boolean> map2, C1074a.b<? extends afq, afr> bVar, ArrayList<C1162cw> arrayList, C1086aa c1086aa, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f5633f = lock;
        this.f5634g = looper;
        this.f5636i = lock.newCondition();
        this.f5635h = c1283m;
        this.f5632e = c1086aa;
        this.f5630c = map2;
        this.f5637j = c1248bj;
        this.f5638k = z;
        HashMap map3 = new HashMap();
        for (C1074a<?> c1074a : map2.keySet()) {
            map3.put(c1074a.m6631c(), c1074a);
        }
        HashMap map4 = new HashMap();
        ArrayList<C1162cw> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            C1162cw c1162cw = arrayList2.get(i);
            i++;
            C1162cw c1162cw2 = c1162cw;
            map4.put(c1162cw2.f5741a, c1162cw2);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = false;
        for (Map.Entry<C1074a.d<?>, C1074a.f> entry : map.entrySet()) {
            C1074a c1074a2 = (C1074a) map3.get(entry.getKey());
            C1074a.f value = entry.getValue();
            if (value.mo6644j()) {
                z2 = true;
                if (this.f5630c.get(c1074a2).booleanValue()) {
                    z3 = z5;
                    z4 = z6;
                } else {
                    z3 = z5;
                    z4 = true;
                }
            } else {
                z2 = z7;
                z3 = false;
                z4 = z6;
            }
            C1169dc<?> c1169dc = new C1169dc<>(context, c1074a2, looper, value, (C1162cw) map4.get(c1074a2), c1248bj, bVar);
            this.f5628a.put(entry.getKey(), c1169dc);
            if (value.mo6643i()) {
                this.f5629b.put(entry.getKey(), c1169dc);
            }
            z7 = z2;
            z5 = z3;
            z6 = z4;
        }
        this.f5639l = (!z7 || z5 || z6) ? false : true;
        this.f5631d = C1098am.m6781a();
    }

    /* JADX INFO: renamed from: a */
    private final C1071a m6851a(C1074a.d<?> dVar) {
        this.f5633f.lock();
        try {
            C1169dc<?> c1169dc = this.f5628a.get(dVar);
            if (this.f5642o != null && c1169dc != null) {
                return this.f5642o.get(c1169dc.m6659b());
            }
            this.f5633f.unlock();
            return null;
        } finally {
            this.f5633f.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m6856a(C1112b c1112b, boolean z) {
        c1112b.f5641n = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final boolean m6857a(C1169dc<?> c1169dc, C1071a c1071a) {
        return !c1071a.m6612b() && !c1071a.m6611a() && this.f5630c.get(c1169dc.m6655a()).booleanValue() && c1169dc.m6979f().mo6644j() && this.f5635h.mo7045a(c1071a.m6613c());
    }

    /* JADX INFO: renamed from: c */
    private final <T extends AbstractC1155cp<? extends InterfaceC1193k, ? extends C1074a.c>> boolean m6861c(T t) {
        C1074a.d<?> dVarM6948g = t.m6948g();
        C1071a c1071aM6851a = m6851a(dVarM6948g);
        if (c1071aM6851a == null || c1071aM6851a.m6613c() != 4) {
            return false;
        }
        t.m6946b(new Status(4, null, this.f5631d.m6797a(this.f5628a.get(dVarM6948g).m6659b(), System.identityHashCode(this.f5632e))));
        return true;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m6867h() {
        this.f5633f.lock();
        try {
            if (!this.f5641n || !this.f5638k) {
                return false;
            }
            Iterator<C1074a.d<?>> it = this.f5629b.keySet().iterator();
            while (it.hasNext()) {
                C1071a c1071aM6851a = m6851a(it.next());
                if (c1071aM6851a == null || !c1071aM6851a.m6612b()) {
                    return false;
                }
            }
            this.f5633f.unlock();
            return true;
        } finally {
            this.f5633f.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m6868i() {
        if (this.f5637j == null) {
            this.f5632e.f5523c = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f5637j.m7151d());
        Map<C1074a<?>, C1250bl> mapM7153f = this.f5637j.m7153f();
        for (C1074a<?> c1074a : mapM7153f.keySet()) {
            C1071a c1071aM6876a = m6876a(c1074a);
            if (c1071aM6876a != null && c1071aM6876a.m6612b()) {
                hashSet.addAll(mapM7153f.get(c1074a).f5919a);
            }
        }
        this.f5632e.f5523c = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m6870j() {
        while (!this.f5640m.isEmpty()) {
            mo6768b(this.f5640m.remove());
        }
        this.f5632e.mo6741a((Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C1071a m6872k() {
        C1071a c1071a;
        int i;
        int i2 = 0;
        C1071a c1071a2 = null;
        int i3 = 0;
        C1071a c1071a3 = null;
        for (C1169dc<?> c1169dc : this.f5628a.values()) {
            C1074a<?> c1074aM6655a = c1169dc.m6655a();
            C1071a c1071a4 = this.f5642o.get(c1169dc.m6659b());
            if (!c1071a4.m6612b() && (!this.f5630c.get(c1074aM6655a).booleanValue() || c1071a4.m6611a() || this.f5635h.mo7045a(c1071a4.m6613c()))) {
                if (c1071a4.m6613c() == 4 && this.f5638k) {
                    int iM6635a = c1074aM6655a.m6629a().m6635a();
                    if (c1071a2 == null || i2 > iM6635a) {
                        i2 = iM6635a;
                        c1071a2 = c1071a4;
                    }
                } else {
                    int iM6635a2 = c1074aM6655a.m6629a().m6635a();
                    if (c1071a3 == null || i3 > iM6635a2) {
                        c1071a = c1071a4;
                        i = iM6635a2;
                    } else {
                        i = i3;
                        c1071a = c1071a3;
                    }
                    i3 = i;
                    c1071a3 = c1071a;
                }
            }
        }
        return (c1071a3 == null || c1071a2 == null || i3 <= i2) ? c1071a3 : c1071a2;
    }

    /* JADX INFO: renamed from: a */
    public final C1071a m6876a(C1074a<?> c1074a) {
        return m6851a(c1074a.m6631c());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6759a(T t) {
        if (this.f5638k && m6861c(t)) {
            return t;
        }
        if (mo6770d()) {
            this.f5632e.f5525e.m6921a(t);
            return (T) this.f5628a.get(t.m6948g()).m6657a(t);
        }
        this.f5640m.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6760a() {
        this.f5633f.lock();
        try {
            if (this.f5641n) {
                return;
            }
            this.f5641n = true;
            this.f5642o = null;
            this.f5643p = null;
            this.f5644q = null;
            this.f5645r = null;
            this.f5631d.m6807d();
            this.f5631d.m6798a(this.f5628a.values()).mo6210a(new ExecutorC2035xb(this.f5634g), new C1166d(this));
        } finally {
            this.f5633f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6765a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final boolean mo6766a(InterfaceC1128bp interfaceC1128bp) {
        this.f5633f.lock();
        try {
            if (!this.f5641n || m6867h()) {
                this.f5633f.unlock();
                return false;
            }
            this.f5631d.m6807d();
            this.f5644q = new C1170e(this, interfaceC1128bp);
            this.f5631d.m6798a(this.f5629b.values()).mo6210a(new ExecutorC2035xb(this.f5634g), this.f5644q);
            this.f5633f.unlock();
            return true;
        } catch (Throwable th) {
            this.f5633f.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final C1071a mo6767b() {
        mo6760a();
        while (m6877e()) {
            try {
                this.f5636i.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new C1071a(15, null);
            }
        }
        return mo6770d() ? C1071a.f5439a : this.f5645r != null ? this.f5645r : new C1071a(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6768b(T t) {
        C1074a.d<A> dVarM6948g = t.m6948g();
        if (this.f5638k && m6861c(t)) {
            return t;
        }
        this.f5632e.f5525e.m6921a(t);
        return (T) this.f5628a.get(dVarM6948g).m6660b(t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: c */
    public final void mo6769c() {
        this.f5633f.lock();
        try {
            this.f5641n = false;
            this.f5642o = null;
            this.f5643p = null;
            if (this.f5644q != null) {
                this.f5644q.m6980a();
                this.f5644q = null;
            }
            this.f5645r = null;
            while (!this.f5640m.isEmpty()) {
                AbstractC1155cp<?, ?> abstractC1155cpRemove = this.f5640m.remove();
                abstractC1155cpRemove.m6707a((InterfaceC1145cf) null);
                abstractC1155cpRemove.mo6694a();
            }
            this.f5636i.signalAll();
        } finally {
            this.f5633f.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6770d() {
        boolean z;
        this.f5633f.lock();
        try {
            if (this.f5642o != null) {
                z = this.f5645r == null;
            }
            return z;
        } finally {
            this.f5633f.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6877e() {
        boolean z;
        this.f5633f.lock();
        try {
            if (this.f5642o == null) {
                z = this.f5641n;
            }
            return z;
        } finally {
            this.f5633f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: f */
    public final void mo6772f() {
        this.f5633f.lock();
        try {
            this.f5631d.m6808e();
            if (this.f5644q != null) {
                this.f5644q.m6980a();
                this.f5644q = null;
            }
            if (this.f5643p == null) {
                this.f5643p = new C0207a(this.f5629b.size());
            }
            C1071a c1071a = new C1071a(4);
            Iterator<C1169dc<?>> it = this.f5629b.values().iterator();
            while (it.hasNext()) {
                this.f5643p.put(it.next().m6659b(), c1071a);
            }
            if (this.f5642o != null) {
                this.f5642o.putAll(this.f5643p);
            }
        } finally {
            this.f5633f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: g */
    public final void mo6773g() {
    }
}
