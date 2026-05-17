package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.p045b.C0673j;

/* JADX INFO: loaded from: classes.dex */
public final class bya extends bnr implements bxy {
    bya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final bxv mo5752a() {
        bxv bxxVar;
        Parcel parcelM9730a = m9730a(1, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            bxxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            bxxVar = iInterfaceQueryLocalInterface instanceof bxv ? (bxv) iInterfaceQueryLocalInterface : new bxx(strongBinder);
        }
        parcelM9730a.recycle();
        return bxxVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5753a(C0673j c0673j) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c0673j);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5754a(bxs bxsVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bxsVar);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5755a(byp bypVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, bypVar);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5756a(ccm ccmVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, ccmVar);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5757a(cdz cdzVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdzVar);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5758a(cec cecVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cecVar);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5759a(cem cemVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cemVar);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5760a(cep cepVar, bxb bxbVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cepVar);
        bnt.m9736a(parcelM9733o_, bxbVar);
        m9731b(8, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5761a(String str, cei ceiVar, cef cefVar) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ceiVar);
        bnt.m9735a(parcelM9733o_, cefVar);
        m9731b(5, parcelM9733o_);
    }
}
