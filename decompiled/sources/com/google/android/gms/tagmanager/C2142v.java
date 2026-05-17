package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2142v extends bnr implements InterfaceC2140t {
    C2142v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    public final void initialize(InterfaceC0652a interfaceC0652a, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC2137q);
        bnt.m9735a(parcelM9733o_, interfaceC2128h);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    public final void preview(Intent intent, InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.tagmanager.InterfaceC2140t
    public final void previewIntent(Intent intent, InterfaceC0652a interfaceC0652a, InterfaceC0652a interfaceC0652a2, InterfaceC2137q interfaceC2137q, InterfaceC2128h interfaceC2128h) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, intent);
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9735a(parcelM9733o_, interfaceC0652a2);
        bnt.m9735a(parcelM9733o_, interfaceC2137q);
        bnt.m9735a(parcelM9733o_, interfaceC2128h);
        m9731b(3, parcelM9733o_);
    }
}
