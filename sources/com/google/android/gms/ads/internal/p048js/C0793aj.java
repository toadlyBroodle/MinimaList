package com.google.android.gms.ads.internal.p048js;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1703ku;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.aj */
/* JADX INFO: loaded from: classes.dex */
final class C0793aj implements InterfaceC1703ku {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0800f f4705a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0820z f4706b;

    C0793aj(C0820z c0820z, C0800f c0800f) {
        this.f4706b = c0820z;
        this.f4705a = c0800f;
    }

    @Override // com.google.android.gms.internal.InterfaceC1703ku
    /* JADX INFO: renamed from: a */
    public final void mo5716a() {
        synchronized (this.f4706b.f4741a) {
            this.f4706b.f4748h = 1;
            C1560fm.m11343a("Failed loading new engine. Marking new engine destroyable.");
            this.f4705a.m5724c();
        }
    }
}
