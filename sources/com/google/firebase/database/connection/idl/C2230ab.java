package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C2230ab extends bnr implements InterfaceC2265z {
    C2230ab(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IGetTokenCallback");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2265z
    /* JADX INFO: renamed from: a */
    public final void mo12976a(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(1, parcelM9733o_);
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2265z
    /* JADX INFO: renamed from: b */
    public final void mo12977b(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        m9731b(2, parcelM9733o_);
    }
}
