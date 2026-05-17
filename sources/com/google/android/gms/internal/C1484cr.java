package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cr */
/* JADX INFO: loaded from: classes.dex */
public final class C1484cr extends bnr implements InterfaceC1482cp {
    C1484cr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10905a() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10906a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10907a(InterfaceC1487cu interfaceC1487cu) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC1487cu);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10908a(C1494da c1494da) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1494da);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10909a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: a */
    public final void mo10910a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(34, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: b */
    public final void mo10911b(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: b */
    public final boolean mo10912b() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: c */
    public final void mo10913c() {
        m9731b(6, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: c */
    public final void mo10914c(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(11, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: d */
    public final void mo10915d() {
        m9731b(7, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: e */
    public final void mo10916e() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1482cp
    /* JADX INFO: renamed from: f */
    public final String mo10917f() {
        Parcel parcelM9730a = m9730a(12, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }
}
