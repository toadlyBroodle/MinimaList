package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1211a extends AbstractBinderC1269p {
    /* JADX INFO: renamed from: a */
    public static Account m7054a(InterfaceC1268o interfaceC1268o) {
        Account accountMo7055a = null;
        if (interfaceC1268o != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                accountMo7055a = interfaceC1268o.mo7055a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountMo7055a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1268o
    /* JADX INFO: renamed from: a */
    public final Account mo7055a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
