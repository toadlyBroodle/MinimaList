package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.ac */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0786ac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0785ab f4693a;

    RunnableC0786ac(C0785ab c0785ab) {
        this.f4693a = c0785ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4693a.f4692b.f4690c.f4741a) {
            if (this.f4693a.f4692b.f4689b.m11662e() == -1 || this.f4693a.f4692b.f4689b.m11662e() == 1) {
                return;
            }
            this.f4693a.f4692b.f4689b.m11661d();
            C0710au.m5569e();
            C1596gv.m11394a(new RunnableC0787ad(this));
            C1560fm.m11343a("Could not receive loaded message in a timely manner. Rejecting.");
        }
    }
}
