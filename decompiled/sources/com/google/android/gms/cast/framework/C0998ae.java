package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0998ae extends bnr implements InterfaceC0997ad {
    C0998ae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0997ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo6348a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0997ad
    /* JADX INFO: renamed from: a */
    public final void mo6349a(boolean z, boolean z2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, true);
        bnt.m9737a(parcelM9733o_, z2);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC0997ad
    /* JADX INFO: renamed from: b */
    public final InterfaceC0652a mo6350b() {
        Parcel parcelM9730a = m9730a(7, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
