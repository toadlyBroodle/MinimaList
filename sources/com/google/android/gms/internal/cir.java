package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cir extends bnr implements cip {
    cir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10868a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10869a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10870a(cdv cdvVar, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdvVar);
        parcelM9733o_.writeString(str);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10873a(cis cisVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cisVar);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: a */
    public final void mo10874a(String str, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: b */
    public final void mo10875b() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: c */
    public final void mo10876c() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: d */
    public final void mo10877d() {
        m9731b(5, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: e */
    public final void mo10878e() {
        m9731b(6, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: f */
    public final void mo10879f() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.cip
    /* JADX INFO: renamed from: g */
    public final void mo10880g() {
        m9731b(11, m9733o_());
    }
}
