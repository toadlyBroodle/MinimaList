package com.google.firebase.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.google.firebase.iid.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2287a {
    /* JADX INFO: renamed from: a */
    public static KeyPair m13050a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
