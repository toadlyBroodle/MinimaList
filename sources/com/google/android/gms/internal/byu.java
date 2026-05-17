package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class byu extends bnr implements bys {
    byu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5821a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5822a(float f) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeFloat(f);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5823a(InterfaceC0652a interfaceC0652a, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5824a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5825a(String str, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: a */
    public final void mo5826a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: b */
    public final float mo5827b() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        float f = parcelM9730a.readFloat();
        parcelM9730a.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.bys
    /* JADX INFO: renamed from: c */
    public final boolean mo5828c() {
        Parcel parcelM9730a = m9730a(8, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
