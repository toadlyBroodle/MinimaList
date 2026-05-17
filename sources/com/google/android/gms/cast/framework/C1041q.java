package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1041q {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5375a = new C1992vm("DiscoveryManager");

    /* JADX INFO: renamed from: b */
    private final InterfaceC1048x f5376b;

    C1041q(InterfaceC1048x interfaceC1048x) {
        this.f5376b = interfaceC1048x;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0652a m6525a() {
        try {
            return this.f5376b.mo6537a();
        } catch (RemoteException e) {
            f5375a.m12446a(e, "Unable to call %s on %s.", "getWrappedThis", InterfaceC1048x.class.getSimpleName());
            return null;
        }
    }
}
