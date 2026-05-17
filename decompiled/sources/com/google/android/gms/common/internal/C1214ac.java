package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.C1296u;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C1214ac extends bnr implements InterfaceC1212aa {
    C1214ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1212aa
    /* JADX INFO: renamed from: a */
    public final boolean mo7056a(C1296u c1296u, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1296u);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(5, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
