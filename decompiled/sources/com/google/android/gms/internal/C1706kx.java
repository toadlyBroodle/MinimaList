package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.kx */
/* JADX INFO: loaded from: classes.dex */
@cnb
public class C1706kx<T> implements InterfaceC1702kt<T> {

    /* JADX INFO: renamed from: a */
    private final Object f10906a = new Object();

    /* JADX INFO: renamed from: b */
    private int f10907b = 0;

    /* JADX INFO: renamed from: c */
    private BlockingQueue<C1707ky> f10908c = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: d */
    private T f10909d;

    @Override // com.google.android.gms.internal.InterfaceC1702kt
    /* JADX INFO: renamed from: a */
    public final void mo11659a(InterfaceC1705kw<T> interfaceC1705kw, InterfaceC1703ku interfaceC1703ku) {
        synchronized (this.f10906a) {
            if (this.f10907b == 1) {
                interfaceC1705kw.mo5715a(this.f10909d);
            } else if (this.f10907b == -1) {
                interfaceC1703ku.mo5716a();
            } else if (this.f10907b == 0) {
                this.f10908c.add(new C1707ky(this, interfaceC1705kw, interfaceC1703ku));
            }
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1702kt
    /* JADX INFO: renamed from: a */
    public final void mo11660a(T t) {
        synchronized (this.f10906a) {
            if (this.f10907b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f10909d = t;
            this.f10907b = 1;
            Iterator it = this.f10908c.iterator();
            while (it.hasNext()) {
                ((C1707ky) it.next()).f10910a.mo5715a(t);
            }
            this.f10908c.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11661d() {
        synchronized (this.f10906a) {
            if (this.f10907b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f10907b = -1;
            Iterator it = this.f10908c.iterator();
            while (it.hasNext()) {
                ((C1707ky) it.next()).f10911b.mo5716a();
            }
            this.f10908c.clear();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m11662e() {
        return this.f10907b;
    }
}
