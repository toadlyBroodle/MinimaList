package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ceh extends bnr implements cef {
    ceh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.cef
    /* JADX INFO: renamed from: a */
    public final void mo10751a(cdv cdvVar, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdvVar);
        parcelM9733o_.writeString(str);
        m9731b(1, parcelM9733o_);
    }
}
