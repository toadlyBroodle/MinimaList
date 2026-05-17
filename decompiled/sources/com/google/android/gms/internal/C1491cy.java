package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p043a.AbstractC0655d;

/* JADX INFO: renamed from: com.google.android.gms.internal.cy */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1491cy extends AbstractC0655d<InterfaceC1485cs> {
    public C1491cy() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ InterfaceC1485cs mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1485cs ? (InterfaceC1485cs) iInterfaceQueryLocalInterface : new C1486ct(iBinder);
    }
}
