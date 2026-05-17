package com.google.android.gms.p051b;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.android.gms.b.p */
/* JADX INFO: loaded from: classes.dex */
final class C0975p<TResult> {

    /* JADX INFO: renamed from: a */
    private final Object f5128a = new Object();

    /* JADX INFO: renamed from: b */
    private Queue<InterfaceC0974o<TResult>> f5129b;

    /* JADX INFO: renamed from: c */
    private boolean f5130c;

    C0975p() {
    }

    /* JADX INFO: renamed from: a */
    public final void m6239a(AbstractC0964e<TResult> abstractC0964e) {
        InterfaceC0974o<TResult> interfaceC0974oPoll;
        synchronized (this.f5128a) {
            if (this.f5129b == null || this.f5130c) {
                return;
            }
            this.f5130c = true;
            while (true) {
                synchronized (this.f5128a) {
                    interfaceC0974oPoll = this.f5129b.poll();
                    if (interfaceC0974oPoll == null) {
                        this.f5130c = false;
                        return;
                    }
                }
                interfaceC0974oPoll.mo6234a(abstractC0964e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6240a(InterfaceC0974o<TResult> interfaceC0974o) {
        synchronized (this.f5128a) {
            if (this.f5129b == null) {
                this.f5129b = new ArrayDeque();
            }
            this.f5129b.add(interfaceC0974o);
        }
    }
}
