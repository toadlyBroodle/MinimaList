package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.cast.C1058n;

/* JADX INFO: renamed from: com.google.android.gms.internal.vg */
/* JADX INFO: loaded from: classes.dex */
public final class C1986vg extends bnr implements InterfaceC1985vf {
    C1986vg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: a */
    public final void mo12435a() {
        m9732c(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: a */
    public final void mo12436a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9732c(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: a */
    public final void mo12437a(String str, C1051g c1051g) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, c1051g);
        m9732c(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: a */
    public final void mo12438a(String str, String str2, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeLong(j);
        m9732c(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: a */
    public final void mo12439a(String str, String str2, C1058n c1058n) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9736a(parcelM9733o_, c1058n);
        m9732c(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: b */
    public final void mo12440b(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9732c(11, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1985vf
    /* JADX INFO: renamed from: c */
    public final void mo12441c(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9732c(12, parcelM9733o_);
    }
}
