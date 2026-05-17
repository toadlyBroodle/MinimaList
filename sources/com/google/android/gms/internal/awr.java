package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class awr implements ase {

    /* JADX INFO: renamed from: a */
    private final byte[] f7505a;

    /* JADX INFO: renamed from: b */
    private final byte[] f7506b;

    /* JADX INFO: renamed from: c */
    private final SecretKeySpec f7507c;

    /* JADX INFO: renamed from: d */
    private final int f7508d;

    public awr(byte[] bArr, int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f7508d = i;
        this.f7507c = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, this.f7507c);
        this.f7505a = m8639a(cipher.doFinal(new byte[16]));
        this.f7506b = m8639a(this.f7505a);
    }

    /* JADX INFO: renamed from: a */
    private final byte[] m8638a(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrM8640b;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m8640b(bArr2, this.f7505a));
        }
        int i4 = 0;
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2 + i4, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrM8640b = m8640b(bArrCopyOfRange, this.f7505a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f7506b, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrM8640b = bArrCopyOf;
        }
        return cipher.doFinal(m8640b(bArrDoFinal, bArrM8640b));
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8639a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 15; i++) {
            bArr2[i] = (byte) ((bArr[i] << 1) ^ ((bArr[i + 1] & 255) >>> 7));
        }
        bArr2[15] = (byte) (((bArr[0] & 128) != 0 ? 135 : 0) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m8640b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ase
    /* JADX INFO: renamed from: a */
    public final byte[] mo8266a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.f7508d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[this.f7508d + bArr.length + 16];
        byte[] bArrM8682a = ayd.m8682a(this.f7508d);
        System.arraycopy(bArrM8682a, 0, bArr3, 0, this.f7508d);
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, this.f7507c);
        byte[] bArrM8638a = m8638a(cipher, 0, bArrM8682a, 0, bArrM8682a.length);
        byte[] bArrM8638a2 = m8638a(cipher, 1, bArr2, 0, bArr2.length);
        Cipher cipher2 = Cipher.getInstance("AES/CTR/NOPADDING");
        cipher2.init(1, this.f7507c, new IvParameterSpec(bArrM8638a));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f7508d);
        byte[] bArrM8638a3 = m8638a(cipher, 2, bArr3, this.f7508d, bArr.length);
        int length = bArr.length + this.f7508d;
        for (int i = 0; i < 16; i++) {
            bArr3[length + i] = (byte) ((bArrM8638a2[i] ^ bArrM8638a[i]) ^ bArrM8638a3[i]);
        }
        return bArr3;
    }
}
