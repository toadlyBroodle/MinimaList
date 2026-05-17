package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xm */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2046xm implements Runnable {
    private RunnableC2046xm() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageDigest unused = C2044xk.f12301c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        } finally {
            C2044xk.f12299a.countDown();
        }
    }
}
