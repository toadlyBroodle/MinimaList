package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cil {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f10126a;

    /* JADX INFO: renamed from: b */
    private final Set<cej<?>> f10127b;

    /* JADX INFO: renamed from: c */
    private final PriorityBlockingQueue<cej<?>> f10128c;

    /* JADX INFO: renamed from: d */
    private final PriorityBlockingQueue<cej<?>> f10129d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1957ue f10130e;

    /* JADX INFO: renamed from: f */
    private final bzk f10131f;

    /* JADX INFO: renamed from: g */
    private final cmf f10132g;

    /* JADX INFO: renamed from: h */
    private final caf[] f10133h;

    /* JADX INFO: renamed from: i */
    private aio f10134i;

    /* JADX INFO: renamed from: j */
    private final List<Object> f10135j;

    public cil(InterfaceC1957ue interfaceC1957ue, bzk bzkVar) {
        this(interfaceC1957ue, bzkVar, 4);
    }

    private cil(InterfaceC1957ue interfaceC1957ue, bzk bzkVar, int i) {
        this(interfaceC1957ue, bzkVar, 4, new bvm(new Handler(Looper.getMainLooper())));
    }

    private cil(InterfaceC1957ue interfaceC1957ue, bzk bzkVar, int i, cmf cmfVar) {
        this.f10126a = new AtomicInteger();
        this.f10127b = new HashSet();
        this.f10128c = new PriorityBlockingQueue<>();
        this.f10129d = new PriorityBlockingQueue<>();
        this.f10135j = new ArrayList();
        this.f10130e = interfaceC1957ue;
        this.f10131f = bzkVar;
        this.f10133h = new caf[4];
        this.f10132g = cmfVar;
    }

    /* JADX INFO: renamed from: a */
    public final <T> cej<T> m10938a(cej<T> cejVar) {
        cejVar.m10756a(this);
        synchronized (this.f10127b) {
            this.f10127b.add(cejVar);
        }
        cejVar.m10755a(this.f10126a.incrementAndGet());
        cejVar.m10765b("add-to-queue");
        if (cejVar.m10771g()) {
            this.f10128c.add(cejVar);
        } else {
            this.f10129d.add(cejVar);
        }
        return cejVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10939a() {
        if (this.f10134i != null) {
            this.f10134i.m8023a();
        }
        for (caf cafVar : this.f10133h) {
            if (cafVar != null) {
                cafVar.m10538a();
            }
        }
        this.f10134i = new aio(this.f10128c, this.f10129d, this.f10130e, this.f10132g);
        this.f10134i.start();
        for (int i = 0; i < this.f10133h.length; i++) {
            caf cafVar2 = new caf(this.f10129d, this.f10131f, this.f10130e, this.f10132g);
            this.f10133h[i] = cafVar2;
            cafVar2.start();
        }
    }

    /* JADX INFO: renamed from: b */
    final <T> void m10940b(cej<T> cejVar) {
        synchronized (this.f10127b) {
            this.f10127b.remove(cejVar);
        }
        synchronized (this.f10135j) {
            Iterator<Object> it = this.f10135j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
