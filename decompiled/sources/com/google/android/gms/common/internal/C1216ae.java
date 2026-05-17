package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C1216ae extends bnr implements InterfaceC1215ad {
    C1216ae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1215ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a mo7058a(InterfaceC0652a interfaceC0652a, C1226ao c1226ao) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, c1226ao);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return interfaceC0652aM5328a;
    }
}
