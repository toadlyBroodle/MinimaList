package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bxu extends bnr implements bxs {
    bxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10364a() {
        m9731b(1, m9733o_());
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10365a(int i) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeInt(i);
        m9731b(2, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: b */
    public final void mo10366b() {
        m9731b(3, m9733o_());
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: c */
    public final void mo10367c() {
        m9731b(4, m9733o_());
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: d */
    public final void mo10368d() {
        m9731b(5, m9733o_());
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: e */
    public final void mo10369e() {
        m9731b(6, m9733o_());
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: f */
    public final void mo10370f() {
        m9731b(7, m9733o_());
    }
}
