package com.google.android.gms.analytics;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.analytics.s */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0904s implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0900o f4976a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0903r f4977b;

    RunnableC0904s(C0903r c0903r, C0900o c0900o) {
        this.f4977b = c0903r;
        this.f4976a = c0900o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4976a.m6062h().mo6024a(this.f4976a);
        Iterator it = this.f4977b.f4969c.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C0903r c0903r = this.f4977b;
        C0903r.m6075b(this.f4976a);
    }
}
