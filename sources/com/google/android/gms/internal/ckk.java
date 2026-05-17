package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class ckk extends bnr implements cki {
    ckk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5782a(int i, int i2, Intent intent) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        parcelM9733o_.writeInt(i2);
        bnt.m9736a(parcelM9733o_, intent);
        m9731b(12, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5783a(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: a */
    public final void mo5785a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(13, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: b */
    public final void mo5788b(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        Parcel parcelM9730a = m9730a(6, parcelM9733o_);
        if (parcelM9730a.readInt() != 0) {
            bundle.readFromParcel(parcelM9730a);
        }
        parcelM9730a.recycle();
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: d */
    public final void mo5790d() {
        m9731b(10, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: e */
    public final boolean mo5791e() {
        Parcel parcelM9730a = m9730a(11, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: f */
    public final void mo5792f() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: g */
    public final void mo5793g() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: h */
    public final void mo5794h() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: i */
    public final void mo5795i() {
        m9731b(5, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: j */
    public final void mo5796j() {
        m9731b(7, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: k */
    public final void mo5797k() {
        m9731b(8, m9733o_());
    }

    @Override // com.google.android.gms.internal.cki
    /* JADX INFO: renamed from: l */
    public final void mo5798l() {
        m9731b(9, m9733o_());
    }
}
