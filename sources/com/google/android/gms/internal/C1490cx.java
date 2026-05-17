package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.InterfaceC0880a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cx */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1490cx implements InterfaceC0880a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1479cm f10418a;

    public C1490cx(InterfaceC1479cm interfaceC1479cm) {
        this.f10418a = interfaceC1479cm;
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0880a
    /* JADX INFO: renamed from: a */
    public final String mo5916a() {
        if (this.f10418a == null) {
            return null;
        }
        try {
            return this.f10418a.mo10851a();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.InterfaceC0880a
    /* JADX INFO: renamed from: b */
    public final int mo5917b() {
        if (this.f10418a == null) {
            return 0;
        }
        try {
            return this.f10418a.mo10852b();
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
