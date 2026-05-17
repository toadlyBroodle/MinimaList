package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.InterfaceC1193k;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ca */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1140ca implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1193k f5694a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1138bz f5695b;

    RunnableC1140ca(C1138bz c1138bz, InterfaceC1193k interfaceC1193k) {
        this.f5695b = c1138bz;
        this.f5694a = interfaceC1193k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                BasePendingResult.f5502b.set(true);
                this.f5695b.f5692h.sendMessage(this.f5695b.f5692h.obtainMessage(0, this.f5695b.f5685a.m7027a(this.f5694a)));
                BasePendingResult.f5502b.set(false);
                C1138bz c1138bz = this.f5695b;
                C1138bz.m6913b(this.f5694a);
                AbstractC1079f abstractC1079f = (AbstractC1079f) this.f5695b.f5691g.get();
                if (abstractC1079f != null) {
                    abstractC1079f.mo6676b(this.f5695b);
                }
            } catch (RuntimeException e) {
                this.f5695b.f5692h.sendMessage(this.f5695b.f5692h.obtainMessage(1, e));
                BasePendingResult.f5502b.set(false);
                C1138bz c1138bz2 = this.f5695b;
                C1138bz.m6913b(this.f5694a);
                AbstractC1079f abstractC1079f2 = (AbstractC1079f) this.f5695b.f5691g.get();
                if (abstractC1079f2 != null) {
                    abstractC1079f2.mo6676b(this.f5695b);
                }
            }
        } finally {
        }
    }
}
