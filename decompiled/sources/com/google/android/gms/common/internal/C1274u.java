package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1274u extends bnr implements InterfaceC1272s {
    C1274u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1272s
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo7215a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1272s
    /* JADX INFO: renamed from: b */
    public final int mo7216b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }
}
