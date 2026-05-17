package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.bnr;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1270q extends bnr implements InterfaceC1268o {
    C1270q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1268o
    /* JADX INFO: renamed from: a */
    public final Account mo7055a() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        Account account = (Account) bnt.m9734a(parcelM9730a, Account.CREATOR);
        parcelM9730a.recycle();
        return account;
    }
}
