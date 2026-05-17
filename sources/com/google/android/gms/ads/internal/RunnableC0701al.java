package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.bwx;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.al */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0701al implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ WeakReference f4447a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0700ak f4448b;

    RunnableC0701al(C0700ak c0700ak, WeakReference weakReference) {
        this.f4448b = c0700ak;
        this.f4447a = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0700ak.m5526a(this.f4448b, false);
        AbstractBinderC0689a abstractBinderC0689a = (AbstractBinderC0689a) this.f4447a.get();
        if (abstractBinderC0689a != null) {
            bwx bwxVar = this.f4448b.f4443c;
            if (abstractBinderC0689a.mo5475c(bwxVar)) {
                abstractBinderC0689a.mo5473b(bwxVar);
            } else {
                C1560fm.m11614d("Ad is not visible. Not refreshing ad.");
                abstractBinderC0689a.f4404d.m5531b(bwxVar);
            }
        }
    }
}
