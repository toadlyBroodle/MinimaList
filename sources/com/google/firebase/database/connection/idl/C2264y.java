package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2264y extends bnr implements InterfaceC2262w {
    C2264y(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2262w
    /* JADX INFO: renamed from: a */
    public final void mo12987a(boolean z, InterfaceC2265z interfaceC2265z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        bnt.m9735a(parcelM9733o_, interfaceC2265z);
        m9731b(1, parcelM9733o_);
    }
}
