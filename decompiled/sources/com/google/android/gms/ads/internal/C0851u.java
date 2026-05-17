package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.u */
/* JADX INFO: loaded from: classes.dex */
final class C0851u implements InterfaceC0748aa<InterfaceC1758mv> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CountDownLatch f4854a;

    C0851u(CountDownLatch countDownLatch) {
        this.f4854a = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        this.f4854a.countDown();
        if (interfaceC1758mv2 == null) {
            throw null;
        }
        ((View) interfaceC1758mv2).setVisibility(0);
    }
}
