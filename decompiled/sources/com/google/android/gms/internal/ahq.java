package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ahq extends bnr implements aho {
    ahq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7933a() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7934a(String str, Bundle bundle, String str2, long j, boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9736a(parcelM9733o_, bundle);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeLong(j);
        bnt.m9737a(parcelM9733o_, z);
        m9731b(101, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7935a(String str, String str2, String str3) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeString(str3);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: a */
    public final void mo7936a(String str, String str2, String str3, ahk ahkVar) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        parcelM9733o_.writeString(str3);
        bnt.m9735a(parcelM9733o_, ahkVar);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.aho
    /* JADX INFO: renamed from: b */
    public final void mo7937b() {
        m9731b(102, m9733o_());
    }
}
