package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.zw */
/* JADX INFO: loaded from: classes.dex */
public final class C2110zw extends bnr implements InterfaceC2108zu {
    C2110zw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7567a(C2084yx c2084yx, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2084yx);
        bnt.m9737a(parcelM9733o_, z);
        Parcel parcelM9730a = m9730a(7, parcelM9733o_);
        ArrayList arrayListCreateTypedArrayList = parcelM9730a.createTypedArrayList(aeh.CREATOR);
        parcelM9730a.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<C2088za> mo7568a(String str, String str2, C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9736a(parcelM9733o_, c2084yx);
        Parcel parcelM9730a = m9730a(16, parcelM9733o_);
        ArrayList arrayListCreateTypedArrayList = parcelM9730a.createTypedArrayList(C2088za.CREATOR);
        parcelM9730a.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<C2088za> mo7569a(String str, String str2, String str3) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeString(str3);
        Parcel parcelM9730a = m9730a(17, parcelM9733o_);
        ArrayList arrayListCreateTypedArrayList = parcelM9730a.createTypedArrayList(C2088za.CREATOR);
        parcelM9730a.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7570a(String str, String str2, String str3, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeString(str3);
        bnt.m9737a(parcelM9733o_, z);
        Parcel parcelM9730a = m9730a(15, parcelM9733o_);
        ArrayList arrayListCreateTypedArrayList = parcelM9730a.createTypedArrayList(aeh.CREATOR);
        parcelM9730a.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final List<aeh> mo7571a(String str, String str2, boolean z, C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9737a(parcelM9733o_, z);
        bnt.m9736a(parcelM9733o_, c2084yx);
        Parcel parcelM9730a = m9730a(14, parcelM9733o_);
        ArrayList arrayListCreateTypedArrayList = parcelM9730a.createTypedArrayList(aeh.CREATOR);
        parcelM9730a.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7572a(long j, String str, String str2, String str3) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeLong(j);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeString(str3);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7573a(aeh aehVar, C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, aehVar);
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7574a(C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7575a(C2088za c2088za) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2088za);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7576a(C2088za c2088za, C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2088za);
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7577a(C2104zq c2104zq, C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2104zq);
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final void mo7578a(C2104zq c2104zq, String str, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2104zq);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: a */
    public final byte[] mo7579a(C2104zq c2104zq, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2104zq);
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(9, parcelM9733o_);
        byte[] bArrCreateByteArray = parcelM9730a.createByteArray();
        parcelM9730a.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: b */
    public final void mo7580b(C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: c */
    public final String mo7581c(C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2084yx);
        Parcel parcelM9730a = m9730a(11, parcelM9733o_);
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.InterfaceC2108zu
    /* JADX INFO: renamed from: d */
    public final void mo7582d(C2084yx c2084yx) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2084yx);
        m9731b(18, parcelM9733o_);
    }
}
