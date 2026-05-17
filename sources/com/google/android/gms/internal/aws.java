package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class aws implements ase {

    /* JADX INFO: renamed from: a */
    private final SecretKey f7509a;

    public aws(byte[] bArr) {
        this.f7509a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ase
    /* JADX INFO: renamed from: a */
    public final byte[] mo8266a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrM8682a = ayd.m8682a(12);
        System.arraycopy(bArrM8682a, 0, bArr3, 0, 12);
        Cipher cipherM8673a = axo.f7550a.m8673a("AES/GCM/NoPadding");
        cipherM8673a.init(1, this.f7509a, new GCMParameterSpec(128, bArrM8682a));
        cipherM8673a.updateAAD(bArr2);
        cipherM8673a.doFinal(bArr, 0, bArr.length, bArr3, 12);
        return bArr3;
    }
}
