package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class axy {
    /* JADX INFO: renamed from: a */
    public static byte[] m8675a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        Mac macM8673a = axo.f7551b.m8673a(str);
        if (i > macM8673a.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            macM8673a.init(new SecretKeySpec(new byte[macM8673a.getMacLength()], str));
        } else {
            macM8673a.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        macM8673a.init(new SecretKeySpec(macM8673a.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            macM8673a.update(bArrDoFinal);
            macM8673a.update(bArr3);
            macM8673a.update((byte) i2);
            bArrDoFinal = macM8673a.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }
}
