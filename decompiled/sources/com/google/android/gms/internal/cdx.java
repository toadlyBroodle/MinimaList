package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cdx extends bnr implements cdv {
    cdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final String mo10651a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final List<String> mo10652a() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        ArrayList<String> arrayListCreateStringArrayList = parcelM9730a.createStringArrayList();
        parcelM9730a.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: a */
    public final boolean mo10653a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(10, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: b */
    public final InterfaceC0652a mo10654b() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: b */
    public final ccy mo10655b(String str) {
        ccy cdaVar;
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            cdaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            cdaVar = iInterfaceQueryLocalInterface instanceof ccy ? (ccy) iInterfaceQueryLocalInterface : new cda(strongBinder);
        }
        parcelM9730a.recycle();
        return cdaVar;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: c */
    public final byx mo10656c() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: c */
    public final void mo10657c(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: d */
    public final void mo10658d() {
        m9731b(6, m9733o_());
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: e */
    public final InterfaceC0652a mo10659e() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdv
    /* JADX INFO: renamed from: f */
    public final void mo10660f() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.cdv, com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: l */
    public final String mo10624l() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }
}
