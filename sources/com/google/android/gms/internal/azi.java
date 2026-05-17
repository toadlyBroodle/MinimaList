package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.auth.C2204r;

/* JADX INFO: loaded from: classes.dex */
public final class azi extends bnr implements azh {
    azi(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    @Override // com.google.android.gms.internal.azh
    /* JADX INFO: renamed from: a */
    public final void mo8730a(bao baoVar, azf azfVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, baoVar);
        bnt.m9735a(parcelM9733o_, azfVar);
        m9731b(3, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.azh
    /* JADX INFO: renamed from: a */
    public final void mo8731a(C2204r c2204r, azf azfVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2204r);
        bnt.m9735a(parcelM9733o_, azfVar);
        m9731b(23, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.azh
    /* JADX INFO: renamed from: a */
    public final void mo8732a(String str, azf azfVar) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, azfVar);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.azh
    /* JADX INFO: renamed from: a */
    public final void mo8733a(String str, String str2, azf azfVar) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        bnt.m9735a(parcelM9733o_, azfVar);
        m9731b(8, parcelM9733o_);
    }
}
