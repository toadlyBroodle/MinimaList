package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cel extends bnr implements cei {
    cel(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.cei
    /* JADX INFO: renamed from: a */
    public final void mo10753a(cdv cdvVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, cdvVar);
        m9731b(1, parcelM9733o_);
    }
}
