package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class asw {

    /* JADX INFO: renamed from: a */
    public static final awo f7232a = awo.m8632b().mo9750a(ats.f7253a).m8635a(asg.m8268a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).m8635a(asg.m8268a("TinkAead", "Aead", "AesEaxKey", 0, true)).m8635a(asg.m8268a("TinkAead", "Aead", "AesGcmKey", 0, true)).m8635a(asg.m8268a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).m8635a(asg.m8268a("TinkAead", "Aead", "KmsAeadKey", 0, true)).m8635a(asg.m8268a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).m8636a("TINK_AEAD_1_0_0").m9912d();

    static {
        try {
            m8299a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8299a() {
        asu.m8293a("TinkAead", new asv());
        ats.m8329a();
    }
}
