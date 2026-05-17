package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ats {

    /* JADX INFO: renamed from: a */
    public static final awo f7253a = awo.m8632b().m8636a("TINK_MAC_1_0_0").m8635a(asg.m8268a("TinkMac", "Mac", "HmacKey", 0, true)).m9912d();

    static {
        try {
            m8329a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8329a() {
        asu.m8293a("TinkMac", new atr());
    }
}
