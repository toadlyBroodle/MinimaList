package com.google.android.gms.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class ayd {

    /* JADX INFO: renamed from: a */
    private static final SecureRandom f7568a = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public static byte[] m8682a(int i) {
        byte[] bArr = new byte[i];
        f7568a.nextBytes(bArr);
        return bArr;
    }
}
