package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cee extends bnr implements cec {
    cee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.cec
    /* JADX INFO: renamed from: a */
    public final void mo10749a(cdr cdrVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdrVar);
        m9731b(1, parcelM9733o_);
    }
}
