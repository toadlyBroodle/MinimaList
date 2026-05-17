package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class cdk extends bnr implements cdh {
    cdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.cdh
    /* JADX INFO: renamed from: a */
    public final void mo10735a() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.cdh
    /* JADX INFO: renamed from: a */
    public final void mo10736a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(1, parcelM9733o_);
    }
}
