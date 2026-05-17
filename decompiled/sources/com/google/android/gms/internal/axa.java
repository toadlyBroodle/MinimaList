package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class axa implements ase {

    /* JADX INFO: renamed from: a */
    private final awv f7520a;

    private axa(awv awvVar) {
        this.f7520a = awvVar;
    }

    /* JADX INFO: renamed from: a */
    public static axa m8661a(byte[] bArr) {
        return new axc(awv.m8645b(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m8662b(int i) {
        return (((i + 16) - 1) / 16) << 4;
    }

    /* JADX INFO: renamed from: a */
    abstract byte[] mo8663a(byte[] bArr, ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ase
    /* JADX INFO: renamed from: a */
    public final byte[] mo8266a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f7520a.mo8646a() + bArr.length + 16);
        if (byteBufferAllocate.remaining() < bArr.length + this.f7520a.mo8646a() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.f7520a.m8647a(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.f7520a.mo8646a()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        byte[] bArrM8681a = ayc.m8681a(new awz(this.f7520a, bArr3, 0).m8658a(32), mo8663a(bArr2, byteBufferAllocate));
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrM8681a);
        return byteBufferAllocate.array();
    }
}
