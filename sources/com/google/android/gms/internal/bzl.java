package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p043a.AbstractC0655d;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzl extends AbstractC0655d<byv> {
    public bzl() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ byv mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof byv ? (byv) iInterfaceQueryLocalInterface : new byw(iBinder);
    }
}
