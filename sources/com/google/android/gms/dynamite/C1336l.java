package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1336l extends bnr implements InterfaceC1335k {
    C1336l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1335k
    /* JADX INFO: renamed from: a */
    public final int mo7343a(InterfaceC0652a interfaceC0652a, String str, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        bnt.m9737a(parcelM9733o_, z);
        Parcel parcelM9730a = m9730a(3, parcelM9733o_);
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1335k
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo7344a(InterfaceC0652a interfaceC0652a, String str, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeInt(i);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
