package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.C1283m;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C1094ai implements InterfaceC1114bb, InterfaceC1163cx {

    /* JADX INFO: renamed from: a */
    final Map<C1074a.d<?>, C1074a.f> f5557a;

    /* JADX INFO: renamed from: c */
    int f5559c;

    /* JADX INFO: renamed from: d */
    final C1086aa f5560d;

    /* JADX INFO: renamed from: e */
    final InterfaceC1115bc f5561e;

    /* JADX INFO: renamed from: f */
    private final Lock f5562f;

    /* JADX INFO: renamed from: g */
    private final Condition f5563g;

    /* JADX INFO: renamed from: h */
    private final Context f5564h;

    /* JADX INFO: renamed from: i */
    private final C1283m f5565i;

    /* JADX INFO: renamed from: j */
    private final HandlerC1096ak f5566j;

    /* JADX INFO: renamed from: k */
    private C1248bj f5567k;

    /* JADX INFO: renamed from: l */
    private Map<C1074a<?>, Boolean> f5568l;

    /* JADX INFO: renamed from: m */
    private C1074a.b<? extends afq, afr> f5569m;

    /* JADX INFO: renamed from: n */
    private volatile InterfaceC1093ah f5570n;

    /* JADX INFO: renamed from: b */
    final Map<C1074a.d<?>, C1071a> f5558b = new HashMap();

    /* JADX INFO: renamed from: o */
    private C1071a f5571o = null;

    public C1094ai(Context context, C1086aa c1086aa, Lock lock, Looper looper, C1283m c1283m, Map<C1074a.d<?>, C1074a.f> map, C1248bj c1248bj, Map<C1074a<?>, Boolean> map2, C1074a.b<? extends afq, afr> bVar, ArrayList<C1162cw> arrayList, InterfaceC1115bc interfaceC1115bc) {
        this.f5564h = context;
        this.f5562f = lock;
        this.f5565i = c1283m;
        this.f5557a = map;
        this.f5567k = c1248bj;
        this.f5568l = map2;
        this.f5569m = bVar;
        this.f5560d = c1086aa;
        this.f5561e = interfaceC1115bc;
        ArrayList<C1162cw> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            C1162cw c1162cw = arrayList2.get(i);
            i++;
            c1162cw.m6956a(this);
        }
        this.f5566j = new HandlerC1096ak(this, looper);
        this.f5563g = lock.newCondition();
        this.f5570n = new C1190y(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, R extends InterfaceC1193k, T extends AbstractC1155cp<R, A>> T mo6759a(T t) {
        t.m6712f();
        return (T) this.f5570n.mo6749a(t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6760a() {
        this.f5570n.mo6756c();
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
        this.f5562f.lock();
        try {
            this.f5570n.mo6751a(i);
        } finally {
            this.f5562f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        this.f5562f.lock();
        try {
            this.f5570n.mo6752a(bundle);
        } finally {
            this.f5562f.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m6761a(C1071a c1071a) {
        this.f5562f.lock();
        try {
            this.f5571o = c1071a;
            this.f5570n = new C1190y(this);
            this.f5570n.mo6750a();
            this.f5563g.signalAll();
        } finally {
            this.f5562f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1163cx
    /* JADX INFO: renamed from: a */
    public final void mo6762a(C1071a c1071a, C1074a<?> c1074a, boolean z) {
        this.f5562f.lock();
        try {
            this.f5570n.mo6753a(c1071a, c1074a, z);
        } finally {
            this.f5562f.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m6763a(AbstractC1095aj abstractC1095aj) {
        this.f5566j.sendMessage(this.f5566j.obtainMessage(1, abstractC1095aj));
    }

    /* JADX INFO: renamed from: a */
    final void m6764a(RuntimeException runtimeException) {
        this.f5566j.sendMessage(this.f5566j.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final void mo6765a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f5570n);
        for (C1074a<?> c1074a : this.f5568l.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c1074a.m6632d()).println(":");
            this.f5557a.get(c1074a.m6631c()).m6639a(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: a */
    public final boolean mo6766a(InterfaceC1128bp interfaceC1128bp) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final C1071a mo6767b() {
        mo6760a();
        while (m6775i()) {
            try {
                this.f5563g.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new C1071a(15, null);
            }
        }
        return mo6770d() ? C1071a.f5439a : this.f5571o != null ? this.f5571o : new C1071a(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T mo6768b(T t) {
        t.m6712f();
        return (T) this.f5570n.mo6754b(t);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: c */
    public final void mo6769c() {
        if (this.f5570n.mo6755b()) {
            this.f5558b.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: d */
    public final boolean mo6770d() {
        return this.f5570n instanceof C1176k;
    }

    /* JADX INFO: renamed from: e */
    final void m6771e() {
        this.f5562f.lock();
        try {
            this.f5570n = new C1179n(this, this.f5567k, this.f5568l, this.f5565i, this.f5569m, this.f5562f, this.f5564h);
            this.f5570n.mo6750a();
            this.f5563g.signalAll();
        } finally {
            this.f5562f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: f */
    public final void mo6772f() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1114bb
    /* JADX INFO: renamed from: g */
    public final void mo6773g() {
        if (mo6770d()) {
            ((C1176k) this.f5570n).m6992d();
        }
    }

    /* JADX INFO: renamed from: h */
    final void m6774h() {
        this.f5562f.lock();
        try {
            this.f5560d.m6743l();
            this.f5570n = new C1176k(this);
            this.f5570n.mo6750a();
            this.f5563g.signalAll();
        } finally {
            this.f5562f.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6775i() {
        return this.f5570n instanceof C1179n;
    }
}
