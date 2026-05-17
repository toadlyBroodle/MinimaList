package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.InterfaceC1268o;

/* JADX INFO: loaded from: classes.dex */
public final class afz extends bnr implements afy {
    afz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.internal.afy
    /* JADX INFO: renamed from: a */
    public final void mo7830a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.afy
    /* JADX INFO: renamed from: a */
    public final void mo7831a(InterfaceC1268o interfaceC1268o, int i, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC1268o);
        parcelM9733o_.writeInt(i);
        bnt.m9737a(parcelM9733o_, z);
        m9731b(9, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.afy
    /* JADX INFO: renamed from: a */
    public final void mo7832a(agb agbVar, afw afwVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, agbVar);
        bnt.m9735a(parcelM9733o_, afwVar);
        m9731b(12, parcelM9733o_);
    }
}
