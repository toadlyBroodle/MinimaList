package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.sn */
/* JADX INFO: loaded from: classes.dex */
public final class C1912sn extends bnr implements InterfaceC1911sm {
    C1912sn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appinvite.internal.IAppInviteService");
    }

    @Override // com.google.android.gms.internal.InterfaceC1911sm
    /* JADX INFO: renamed from: a */
    public final void mo12309a(InterfaceC1909sk interfaceC1909sk) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC1909sk);
        m9731b(3, parcelM9733o_);
    }
}
