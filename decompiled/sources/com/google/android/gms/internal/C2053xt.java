package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xt */
/* JADX INFO: loaded from: classes.dex */
public final class C2053xt extends AbstractC2050xq<Integer> {
    public C2053xt(int i, String str, Integer num) {
        super(0, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.AbstractC2050xq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer mo12582a(InterfaceC2058xy interfaceC2058xy) {
        try {
            return Integer.valueOf(interfaceC2058xy.getIntFlagValue(m12583a(), m12584b().intValue(), m12585c()));
        } catch (RemoteException e) {
            return m12584b();
        }
    }
}
