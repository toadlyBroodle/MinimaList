package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1338n extends bnr implements InterfaceC1337m {
    C1338n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1337m
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo7345a(InterfaceC0652a interfaceC0652a, String str, int i, InterfaceC0652a interfaceC0652a2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeInt(i);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
