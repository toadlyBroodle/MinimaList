package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.C0990d;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1047w extends bnr implements InterfaceC1046v {
    C1047w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: a */
    public final void mo6530a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: a */
    public final void mo6531a(Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: a */
    public final void mo6532a(C0990d c0990d, String str, String str2, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c0990d);
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9737a(parcelM9733o_, z);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: a */
    public final void mo6533a(C1071a c1071a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1071a);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: a */
    public final void mo6534a(boolean z, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        parcelM9733o_.writeInt(0);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.cast.framework.InterfaceC1046v
    /* JADX INFO: renamed from: b */
    public final void mo6535b(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(5, parcelM9733o_);
    }
}
