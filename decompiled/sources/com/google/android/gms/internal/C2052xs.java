package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xs */
/* JADX INFO: loaded from: classes.dex */
public final class C2052xs extends AbstractC2050xq<Boolean> {
    public C2052xs(int i, String str, Boolean bool) {
        super(0, str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.AbstractC2050xq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean mo12582a(InterfaceC2058xy interfaceC2058xy) {
        try {
            return Boolean.valueOf(interfaceC2058xy.getBooleanFlagValue(m12583a(), m12584b().booleanValue(), m12585c()));
        } catch (RemoteException e) {
            return m12584b();
        }
    }
}
