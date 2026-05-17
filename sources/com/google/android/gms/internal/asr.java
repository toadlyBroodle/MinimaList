package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import com.google.android.gms.internal.awa;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class asr {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static final asm m8281a(byte[] bArr) throws GeneralSecurityException {
        try {
            awa awaVarM8561a = awa.m8561a(bArr);
            for (awa.C1410b c1410b : awaVarM8561a.m8564b()) {
                if (c1410b.m8569b().m8520c() == avq.EnumC1405b.UNKNOWN_KEYMATERIAL || c1410b.m8569b().m8520c() == avq.EnumC1405b.SYMMETRIC || c1410b.m8569b().m8520c() == avq.EnumC1405b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return asm.m8275a(awaVarM8561a);
        } catch (bpf e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
