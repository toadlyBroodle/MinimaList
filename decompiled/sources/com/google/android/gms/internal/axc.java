package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
final class axc extends axa {
    private axc(awv awvVar) {
        super(awvVar);
    }

    @Override // com.google.android.gms.internal.axa
    /* JADX INFO: renamed from: a */
    final byte[] mo8663a(byte[] bArr, ByteBuffer byteBuffer) {
        int iM8662b = axa.m8662b(bArr.length);
        int iRemaining = byteBuffer.remaining();
        int iM8662b2 = axa.m8662b(iRemaining);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iM8662b + iM8662b2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(iM8662b);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iM8662b + iM8662b2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }
}
