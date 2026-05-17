package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ahm extends bnr implements ahk {
    ahm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.ahk
    /* JADX INFO: renamed from: a */
    public final void mo7930a(boolean z, String str) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        parcelM9733o_.writeString(str);
        m9732c(1, parcelM9733o_);
    }
}
