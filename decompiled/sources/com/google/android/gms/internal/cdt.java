package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cdt extends bnr implements cdr {
    cdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: a */
    public final String mo10634a() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: a */
    public final void mo10635a(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdr, com.google.android.gms.internal.ccc
    /* JADX INFO: renamed from: b */
    public final List mo10612b() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        ArrayList arrayListM9739b = bnt.m9739b(parcelM9730a);
        parcelM9730a.recycle();
        return arrayListM9739b;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: b */
    public final boolean mo10636b(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        Parcel parcelM9730a = m9730a(13, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: c */
    public final InterfaceC0652a mo10637c() {
        Parcel parcelM9730a = m9730a(16, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: c */
    public final void mo10638c(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: d */
    public final String mo10639d() {
        Parcel parcelM9730a = m9730a(17, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: e */
    public final String mo10640e() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: f */
    public final ccy mo10641f() {
        ccy cdaVar;
        Parcel parcelM9730a = m9730a(6, m9733o_());
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

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: g */
    public final String mo10642g() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: h */
    public final String mo10643h() {
        Parcel parcelM9730a = m9730a(8, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: i */
    public final byx mo10644i() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo10645j() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: n */
    public final Bundle mo10646n() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: p */
    public final ccu mo10647p() {
        ccu ccwVar;
        Parcel parcelM9730a = m9730a(15, m9733o_());
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            ccwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            ccwVar = iInterfaceQueryLocalInterface instanceof ccu ? (ccu) iInterfaceQueryLocalInterface : new ccw(strongBinder);
        }
        parcelM9730a.recycle();
        return ccwVar;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: q */
    public final void mo10648q() {
        m9731b(10, m9733o_());
    }
}
