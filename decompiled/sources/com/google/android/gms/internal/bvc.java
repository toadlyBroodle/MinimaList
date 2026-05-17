package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class bvc {

    /* JADX INFO: renamed from: b */
    private static MessageDigest f9108b = null;

    /* JADX INFO: renamed from: a */
    protected Object f9109a = new Object();

    /* JADX INFO: renamed from: a */
    protected final MessageDigest m10315a() {
        MessageDigest messageDigest;
        synchronized (this.f9109a) {
            if (f9108b != null) {
                messageDigest = f9108b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f9108b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f9108b;
            }
        }
        return messageDigest;
    }

    /* JADX INFO: renamed from: a */
    abstract byte[] mo10316a(String str);
}
