package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class cda extends bnr implements ccy {
    cda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo10604a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: b */
    public final Uri mo10605b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        Uri uri = (Uri) bnt.m9734a(parcelM9730a, Uri.CREATOR);
        parcelM9730a.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ccy
    /* JADX INFO: renamed from: c */
    public final double mo10606c() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        double d = parcelM9730a.readDouble();
        parcelM9730a.recycle();
        return d;
    }
}
