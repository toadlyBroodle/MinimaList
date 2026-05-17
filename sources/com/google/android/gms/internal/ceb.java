package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ceb extends bnr implements cdz {
    ceb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.cdz
    /* JADX INFO: renamed from: a */
    public final void mo10746a(cdn cdnVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdnVar);
        m9731b(1, parcelM9733o_);
    }
}
