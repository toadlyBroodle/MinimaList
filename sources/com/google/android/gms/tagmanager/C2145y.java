package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ahp;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2145y extends bnr implements InterfaceC2143w {
    C2145y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2143w
    public final aho getService(InterfaceC0652a interfaceC0652a, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2137q);
        bnt.m9735a(parcelM9733o_, interfaceC2128h);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        aho ahoVarM7938a = ahp.m7938a(parcelM9730a.readStrongBinder());
        parcelM9730a.recycle();
        return ahoVarM7938a;
    }
}
