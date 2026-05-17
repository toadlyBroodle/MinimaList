package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cbj extends bnr implements cbh {
    cbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.cbh
    /* JADX INFO: renamed from: a */
    public final void mo10590a(cbd cbdVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cbdVar);
        m9731b(1, parcelM9733o_);
    }
}
