package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p043a.AbstractC0655d;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cet extends AbstractC0655d<cdl> {
    public cet() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.p043a.AbstractC0655d
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ cdl mo5332a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof cdl ? (cdl) iInterfaceQueryLocalInterface : new cdm(iBinder);
    }
}
