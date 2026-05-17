package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xu */
/* JADX INFO: loaded from: classes.dex */
public final class C2054xu extends AbstractC2050xq<Long> {
    public C2054xu(int i, String str, Long l) {
        super(0, str, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.AbstractC2050xq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long mo12582a(InterfaceC2058xy interfaceC2058xy) {
        try {
            return Long.valueOf(interfaceC2058xy.getLongFlagValue(m12583a(), m12584b().longValue(), m12585c()));
        } catch (RemoteException e) {
            return m12584b();
        }
    }
}
