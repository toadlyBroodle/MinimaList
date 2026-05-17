package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1071a;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.av */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1107av implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1071a f5617a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1106au f5618b;

    RunnableC1107av(C1106au c1106au, C1071a c1071a) {
        this.f5618b = c1106au;
        this.f5617a = c1071a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f5617a.m6612b()) {
            ((C1100ao) this.f5618b.f5611a.f5587m.get(this.f5618b.f5613c)).mo4766a(this.f5617a);
            return;
        }
        C1106au.m6839a(this.f5618b, true);
        if (this.f5618b.f5612b.mo6643i()) {
            this.f5618b.m6838a();
        } else {
            this.f5618b.f5612b.m6638a(null, Collections.emptySet());
        }
    }
}
