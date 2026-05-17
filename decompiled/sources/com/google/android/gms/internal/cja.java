package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cja extends bnr implements ciy {
    cja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: a */
    public final String mo10987a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: a */
    public final void mo10988a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: b */
    public final List mo10989b() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        ArrayList arrayListM9739b = bnt.m9739b(parcelM9730a);
        parcelM9730a.recycle();
        return arrayListM9739b;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: b */
    public final void mo10990b(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(10, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: c */
    public final String mo10991c() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: c */
    public final void mo10992c(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: d */
    public final ccy mo10993d() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        ccy ccyVarM10738a = ccz.m10738a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ccyVarM10738a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: e */
    public final String mo10994e() {
        Parcel parcelM9730a = m9730a(6, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: f */
    public final String mo10995f() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: g */
    public final void mo10996g() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: h */
    public final boolean mo10997h() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: i */
    public final boolean mo10998i() {
        Parcel parcelM9730a = m9730a(12, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: j */
    public final Bundle mo10999j() {
        Parcel parcelM9730a = m9730a(13, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: k */
    public final InterfaceC0652a mo11000k() {
        Parcel parcelM9730a = m9730a(15, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: l */
    public final byx mo11001l() {
        Parcel parcelM9730a = m9730a(16, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: m */
    public final ccu mo11002m() {
        Parcel parcelM9730a = m9730a(19, m9733o_());
        ccu ccuVarM10737a = ccv.m10737a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ccuVarM10737a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: n */
    public final InterfaceC0652a mo11003n() {
        Parcel parcelM9730a = m9730a(20, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: o */
    public final InterfaceC0652a mo11004o() {
        Parcel parcelM9730a = m9730a(21, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
