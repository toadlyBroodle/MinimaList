package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cix extends bnr implements civ {
    cix(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: a */
    public final String mo10967a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: a */
    public final void mo10968a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(11, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: b */
    public final List mo10969b() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        ArrayList arrayListM9739b = bnt.m9739b(parcelM9730a);
        parcelM9730a.recycle();
        return arrayListM9739b;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: b */
    public final void mo10970b(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: c */
    public final String mo10971c() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: c */
    public final void mo10972c(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(16, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: d */
    public final ccy mo10973d() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        ccy ccyVarM10738a = ccz.m10738a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ccyVarM10738a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: e */
    public final String mo10974e() {
        Parcel parcelM9730a = m9730a(6, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: f */
    public final double mo10975f() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        double d = parcelM9730a.readDouble();
        parcelM9730a.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: g */
    public final String mo10976g() {
        Parcel parcelM9730a = m9730a(8, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: h */
    public final String mo10977h() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: i */
    public final void mo10978i() {
        m9731b(10, m9733o_());
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: j */
    public final boolean mo10979j() {
        Parcel parcelM9730a = m9730a(13, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: k */
    public final boolean mo10980k() {
        Parcel parcelM9730a = m9730a(14, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: l */
    public final Bundle mo10981l() {
        Parcel parcelM9730a = m9730a(15, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: m */
    public final byx mo10982m() {
        Parcel parcelM9730a = m9730a(17, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: n */
    public final InterfaceC0652a mo10983n() {
        Parcel parcelM9730a = m9730a(18, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: o */
    public final ccu mo10984o() {
        Parcel parcelM9730a = m9730a(19, m9733o_());
        ccu ccuVarM10737a = ccv.m10737a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ccuVarM10737a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: p */
    public final InterfaceC0652a mo10985p() {
        Parcel parcelM9730a = m9730a(20, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: q */
    public final InterfaceC0652a mo10986q() {
        Parcel parcelM9730a = m9730a(21, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
