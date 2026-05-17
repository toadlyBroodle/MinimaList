package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2133m extends bnr implements InterfaceC2131k {
    C2133m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2131k
    /* JADX INFO: renamed from: a */
    public final void mo8053a(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9736a(parcelM9733o_, bundle);
        parcelM9733o_.writeLong(j);
        m9731b(1, parcelM9733o_);
    }
}
