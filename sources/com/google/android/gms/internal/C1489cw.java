package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.cw */
/* JADX INFO: loaded from: classes.dex */
public final class C1489cw extends bnr implements InterfaceC1487cu {
    C1489cw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: a */
    public final void mo10798a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: a */
    public final void mo10799a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: a */
    public final void mo10800a(InterfaceC1479cm interfaceC1479cm) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC1479cm);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: b */
    public final void mo10801b() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: c */
    public final void mo10802c() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: d */
    public final void mo10803d() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1487cu
    /* JADX INFO: renamed from: e */
    public final void mo10804e() {
        m9731b(6, m9733o_());
    }
}
