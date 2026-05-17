package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class awq implements aya {

    /* JADX INFO: renamed from: a */
    private final SecretKeySpec f7502a;

    /* JADX INFO: renamed from: b */
    private final int f7503b;

    /* JADX INFO: renamed from: c */
    private final int f7504c = axo.f7550a.m8673a("AES/CTR/NoPadding").getBlockSize();

    public awq(byte[] bArr, int i) throws GeneralSecurityException {
        this.f7502a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f7504c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f7503b = i;
    }

    @Override // com.google.android.gms.internal.aya
    /* JADX INFO: renamed from: a */
    public final byte[] mo8637a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - this.f7503b) {
            throw new GeneralSecurityException(new StringBuilder(43).append("plaintext length can not exceed ").append(Integer.MAX_VALUE - this.f7503b).toString());
        }
        byte[] bArr2 = new byte[this.f7503b + bArr.length];
        byte[] bArrM8682a = ayd.m8682a(this.f7503b);
        System.arraycopy(bArrM8682a, 0, bArr2, 0, this.f7503b);
        int length = bArr.length;
        int i = this.f7503b;
        Cipher cipherM8673a = axo.f7550a.m8673a("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.f7504c];
        System.arraycopy(bArrM8682a, 0, bArr3, 0, this.f7503b);
        cipherM8673a.init(1, this.f7502a, new IvParameterSpec(bArr3));
        if (cipherM8673a.doFinal(bArr, 0, length, bArr2, i) != length) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        return bArr2;
    }
}
