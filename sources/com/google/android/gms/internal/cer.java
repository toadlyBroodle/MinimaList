package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class cer extends bnr implements cep {
    cer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.cep
    /* JADX INFO: renamed from: a */
    public final void mo10779a(byd bydVar, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bydVar);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(1, parcelM9733o_);
    }
}
