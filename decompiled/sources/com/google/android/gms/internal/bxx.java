package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bxx extends bnr implements bxv {
    bxx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final String mo5707a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5708a(bwx bwxVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bwxVar);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: a */
    public final void mo5709a(bwx bwxVar, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bwxVar);
        parcelM9733o_.writeInt(i);
        m9731b(5, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: b */
    public final String mo5710b() {
        Parcel parcelM9730a = m9730a(4, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.bxv
    /* JADX INFO: renamed from: c */
    public final boolean mo5711c() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
