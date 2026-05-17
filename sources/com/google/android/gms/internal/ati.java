package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ati {

    /* JADX INFO: renamed from: a */
    public static final awo f7240a = awo.m8632b().mo9750a(asw.f7232a).m8635a(asg.m8268a("TinkHybrid", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).m8635a(asg.m8268a("TinkHybrid", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).m8636a("TINK_HYBRID_1_0_0").m9912d();

    static {
        try {
            asu.m8293a("TinkHybrid", new ath());
            asw.m8299a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
