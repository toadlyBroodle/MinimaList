package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.ag */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0790ag implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0809o f4700a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC0784aa f4701b;

    RunnableC0790ag(RunnableC0784aa runnableC0784aa, InterfaceC0809o interfaceC0809o) {
        this.f4701b = runnableC0784aa;
        this.f4700a = interfaceC0809o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4701b.f4690c.f4741a) {
            if (this.f4701b.f4689b.m11662e() == -1 || this.f4701b.f4689b.m11662e() == 1) {
                return;
            }
            this.f4701b.f4689b.m11661d();
            C0710au.m5569e();
            C1596gv.m11394a(new RunnableC0791ah(this));
            C1560fm.m11343a("Could not receive loaded message in a timely manner. Rejecting.");
        }
    }
}
