package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class awv implements aya {

    /* JADX INFO: renamed from: b */
    final axz f7513b;

    /* JADX INFO: renamed from: c */
    private static final byte[] f7512c = new byte[16];

    /* JADX INFO: renamed from: a */
    static final int[] f7511a = m8644a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));

    awv(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        this.f7513b = axz.m8676a(bArr);
    }

    /* JADX INFO: renamed from: a */
    static int m8642a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: a */
    private static void m8643a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, awz awzVar) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer2.hasRemaining()) {
            int iRemaining = byteBuffer2.remaining() < 64 ? byteBuffer2.remaining() : 64;
            byteBufferOrder.asIntBuffer().put(awzVar.m8659a());
            for (int i = 0; i < iRemaining; i++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBufferOrder.get(i)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static int[] m8644a(ByteBuffer byteBuffer) {
        IntBuffer intBufferAsIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    static awv m8645b(byte[] bArr) {
        return new awx(bArr);
    }

    /* JADX INFO: renamed from: a */
    abstract int mo8646a();

    /* JADX INFO: renamed from: a */
    final void m8647a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        }
        if (byteBuffer.remaining() < bArr.length + 12) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM8682a = ayd.m8682a(12);
        byteBuffer.put(bArrM8682a);
        m8643a(byteBuffer, ByteBuffer.wrap(bArr), mo8651c(bArrM8682a));
    }

    @Override // com.google.android.gms.internal.aya
    /* JADX INFO: renamed from: a */
    public final byte[] mo8637a(byte[] bArr) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 12);
        m8647a(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: a */
    abstract int[] mo8648a(byte[] bArr, int i);

    /* JADX INFO: renamed from: a */
    final int[] m8649a(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        mo8650b(iArrCopyOf);
        for (int i = 0; i < iArr.length; i++) {
            iArrCopyOf[i] = iArrCopyOf[i] + iArr[i];
        }
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    abstract void mo8650b(int[] iArr);

    /* JADX INFO: renamed from: c */
    abstract awz mo8651c(byte[] bArr);

    /* JADX INFO: renamed from: c */
    abstract void mo8652c(int[] iArr);
}
