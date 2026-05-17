package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.to */
/* JADX INFO: loaded from: classes.dex */
public final class C1940to extends bnr implements InterfaceC1939tn {
    C1940to(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // com.google.android.gms.internal.InterfaceC1939tn
    /* JADX INFO: renamed from: a */
    public final void mo12334a(String str, Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1939tn
    /* JADX INFO: renamed from: a */
    public final void mo12335a(String str, Bundle bundle, int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        parcelM9733o_.writeInt(i);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1939tn
    /* JADX INFO: renamed from: b */
    public final void mo12336b(String str, Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1939tn
    /* JADX INFO: renamed from: c */
    public final void mo12337c(String str, Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1939tn
    /* JADX INFO: renamed from: d */
    public final void mo12338d(String str, Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(4, parcelM9733o_);
    }
}
