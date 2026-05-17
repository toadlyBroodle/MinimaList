package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class bax extends bnr implements baw {
    bax(IBinder iBinder) {
        super(iBinder, "com.google.firebase.crash.internal.IFirebaseCrashApi");
    }

    @Override // com.google.android.gms.internal.baw
    /* JADX INFO: renamed from: a */
    public final void mo8787a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.baw
    /* JADX INFO: renamed from: a */
    public final void mo8788a(InterfaceC0652a interfaceC0652a, bau bauVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bauVar);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.baw
    /* JADX INFO: renamed from: a */
    public final void mo8789a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(6, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.baw
    /* JADX INFO: renamed from: a */
    public final void mo8790a(String str, long j, Bundle bundle) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeLong(j);
        bnt.m9736a(parcelM9733o_, bundle);
        m9731b(7, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.baw
    /* JADX INFO: renamed from: a */
    public final boolean mo8791a() {
        Parcel parcelM9730a = m9730a(9, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
