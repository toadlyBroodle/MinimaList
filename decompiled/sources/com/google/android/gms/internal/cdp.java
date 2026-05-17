package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cdp extends bnr implements cdn {
    cdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: a */
    public final String mo10609a() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: a */
    public final void mo10610a(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(14, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdn, com.google.android.gms.internal.ccc
    /* JADX INFO: renamed from: b */
    public final List mo10612b() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        ArrayList arrayListM9739b = bnt.m9739b(parcelM9730a);
        parcelM9730a.recycle();
        return arrayListM9739b;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: b */
    public final boolean mo10613b(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        Parcel parcelM9730a = m9730a(15, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: c */
    public final String mo10614c() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: c */
    public final void mo10615c(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(16, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: d */
    public final ccy mo10616d() {
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

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: e */
    public final String mo10617e() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: f */
    public final double mo10618f() {
        Parcel parcelM9730a = m9730a(8, m9733o_());
        double d = parcelM9730a.readDouble();
        parcelM9730a.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: g */
    public final String mo10619g() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: h */
    public final String mo10620h() {
        Parcel parcelM9730a = m9730a(10, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: i */
    public final byx mo10621i() {
        Parcel parcelM9730a = m9730a(13, m9733o_());
        byx byxVarM10432a = byy.m10432a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return byxVarM10432a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo10622j() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: n */
    public final Bundle mo10626n() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        Bundle bundle = (Bundle) bnt.m9734a(parcelM9730a, Bundle.CREATOR);
        parcelM9730a.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: p */
    public final InterfaceC0652a mo10628p() {
        Parcel parcelM9730a = m9730a(18, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: q */
    public final String mo10629q() {
        Parcel parcelM9730a = m9730a(19, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: r */
    public final ccu mo10630r() {
        ccu ccwVar;
        Parcel parcelM9730a = m9730a(17, m9733o_());
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

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: s */
    public final void mo10631s() {
        m9731b(12, m9733o_());
    }
}
