package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1049y extends bnr implements InterfaceC1048x {
    C1049y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1048x
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo6537a() {
        Parcel parcelM9730a = m9730a(5, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
