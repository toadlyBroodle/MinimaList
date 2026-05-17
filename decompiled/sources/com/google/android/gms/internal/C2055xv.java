package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xv */
/* JADX INFO: loaded from: classes.dex */
public final class C2055xv extends AbstractC2050xq<String> {
    public C2055xv(int i, String str, String str2) {
        super(0, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.AbstractC2050xq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String mo12582a(InterfaceC2058xy interfaceC2058xy) {
        try {
            return interfaceC2058xy.getStringFlagValue(m12583a(), m12584b(), m12585c());
        } catch (RemoteException e) {
            return m12584b();
        }
    }
}
