package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2250k extends bnr implements InterfaceC2248i {
    C2250k(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IRequestResultCallback");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2248i
    /* JADX INFO: renamed from: a */
    public final void mo12988a(String str, String str2) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        parcelM9733o_.writeString(str2);
        m9731b(1, parcelM9733o_);
    }
}
