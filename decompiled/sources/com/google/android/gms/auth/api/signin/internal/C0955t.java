package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0955t extends bnr implements InterfaceC0954s {
    C0955t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0954s
    /* JADX INFO: renamed from: a */
    public final void mo6190a(InterfaceC0952q interfaceC0952q, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0952q);
        bnt.m9736a(parcelM9733o_, googleSignInOptions);
        m9731b(102, parcelM9733o_);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0954s
    /* JADX INFO: renamed from: b */
    public final void mo6191b(InterfaceC0952q interfaceC0952q, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0952q);
        bnt.m9736a(parcelM9733o_, googleSignInOptions);
        m9731b(103, parcelM9733o_);
    }
}
