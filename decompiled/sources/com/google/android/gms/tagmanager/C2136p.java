package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2136p extends bnr implements InterfaceC2134n {
    C2136p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2134n
    /* JADX INFO: renamed from: a */
    public final void mo8052a(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9736a(parcelM9733o_, bundle);
        parcelM9733o_.writeLong(j);
        m9731b(2, parcelM9733o_);
    }
}
