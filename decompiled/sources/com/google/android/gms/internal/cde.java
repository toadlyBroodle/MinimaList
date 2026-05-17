package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class cde extends bnr implements cdc {
    cde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10722a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10723a() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10724a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10725a(InterfaceC0652a interfaceC0652a, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeInt(i);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdc
    /* JADX INFO: renamed from: a */
    public final void mo10726a(String str, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(1, parcelM9733o_);
    }
}
