package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C2233ae extends bnr implements InterfaceC2231ac {
    C2233ae(IBinder iBinder) {
        super(iBinder, "com.google.firebase.database.connection.idl.IListenHashProvider");
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: a */
    public final String mo12978a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: b */
    public final boolean mo12979b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: c */
    public final C2228a mo12980c() {
        Parcel parcelM9730a = m9730a(3, m9733o_());
        C2228a c2228a = (C2228a) bnt.m9734a(parcelM9730a, C2228a.CREATOR);
        parcelM9730a.recycle();
        return c2228a;
    }
}
