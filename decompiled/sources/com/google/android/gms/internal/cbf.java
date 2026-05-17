package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class cbf extends bnr implements cbd {
    cbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: a */
    public final String mo10585a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: a */
    public final void mo10586a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: b */
    public final String mo10587b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: c */
    public final void mo10588c() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.cbd
    /* JADX INFO: renamed from: d */
    public final void mo10589d() {
        m9731b(5, m9733o_());
    }
}
