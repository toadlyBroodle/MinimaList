package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bzc extends bnr implements bza {
    bzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.bza
    /* JADX INFO: renamed from: a */
    public final void mo10433a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.bza
    /* JADX INFO: renamed from: a */
    public final void mo10434a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, z);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bza
    /* JADX INFO: renamed from: b */
    public final void mo10435b() {
        m9731b(2, m9733o_());
    }

    @Override // com.google.android.gms.internal.bza
    /* JADX INFO: renamed from: c */
    public final void mo10436c() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.bza
    /* JADX INFO: renamed from: d */
    public final void mo10437d() {
        m9731b(4, m9733o_());
    }
}
