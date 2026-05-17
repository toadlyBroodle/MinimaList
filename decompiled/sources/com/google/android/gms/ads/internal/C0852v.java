package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.v */
/* JADX INFO: loaded from: classes.dex */
final class C0852v implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CountDownLatch f4855a;

    C0852v(CountDownLatch countDownLatch) {
        this.f4855a = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        C1560fm.m11615e("Adapter returned an ad, but assets substitution failed");
        this.f4855a.countDown();
        interfaceC1758mv.destroy();
    }
}
