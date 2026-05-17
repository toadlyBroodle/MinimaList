package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.wy */
/* JADX INFO: loaded from: classes.dex */
public final class C2031wy extends bnr implements InterfaceC2030wx {
    C2031wy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // com.google.android.gms.internal.InterfaceC2030wx
    /* JADX INFO: renamed from: a */
    public final void mo12542a(InterfaceC2028wv interfaceC2028wv) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC2028wv);
        m9732c(1, parcelM9733o_);
    }
}
