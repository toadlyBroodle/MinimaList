package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class afm {

    /* JADX INFO: renamed from: b */
    private static Cipher f6654b = null;

    /* JADX INFO: renamed from: c */
    private static final Object f6655c = new Object();

    /* JADX INFO: renamed from: d */
    private static final Object f6656d = new Object();

    /* JADX INFO: renamed from: a */
    private final SecureRandom f6657a = null;

    public afm(SecureRandom secureRandom) {
    }

    /* JADX INFO: renamed from: a */
    private static Cipher m7814a() {
        Cipher cipher;
        synchronized (f6656d) {
            if (f6654b == null) {
                f6654b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f6654b;
        }
        return cipher;
    }

    /* JADX INFO: renamed from: a */
    public final String m7815a(byte[] bArr, byte[] bArr2) throws agm {
        byte[] bArrDoFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new agm(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6655c) {
                m7814a().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = m7814a().doFinal(bArr2);
                iv = m7814a().getIV();
            }
            int length = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length];
            byteBufferAllocate.get(bArr3);
            return C2042xi.m12565a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new agm(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new agm(this, e2);
        } catch (BadPaddingException e3) {
            throw new agm(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new agm(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new agm(this, e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m7816a(String str) throws agm {
        try {
            byte[] bArrM12566a = C2042xi.m12566a(str, false);
            if (bArrM12566a.length != 32) {
                throw new agm(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(bArrM12566a, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new agm(this, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m7817a(byte[] bArr, String str) throws agm {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new agm(this);
        }
        try {
            byte[] bArrM12566a = C2042xi.m12566a(str, false);
            if (bArrM12566a.length <= 16) {
                throw new agm(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrM12566a.length);
            byteBufferAllocate.put(bArrM12566a);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrM12566a.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6655c) {
                m7814a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m7814a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new agm(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new agm(this, e2);
        } catch (InvalidKeyException e3) {
            throw new agm(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new agm(this, e4);
        } catch (BadPaddingException e5) {
            throw new agm(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new agm(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new agm(this, e7);
        }
    }
}
