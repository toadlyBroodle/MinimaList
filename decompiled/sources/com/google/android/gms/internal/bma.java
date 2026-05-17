package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes.dex */
final class bma implements blz {

    /* JADX INFO: renamed from: a */
    private static ThreadLocal<CharsetDecoder> f8401a = new bmb();

    /* JADX INFO: renamed from: b */
    private static ThreadLocal<CharsetEncoder> f8402b = new bmc();

    /* JADX INFO: renamed from: c */
    private StringBuilder f8403c = new StringBuilder();

    bma() {
    }

    /* JADX INFO: renamed from: b */
    private static String m9637b(byte[] bArr) {
        try {
            return f8401a.get().decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException e) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.blz
    /* JADX INFO: renamed from: a */
    public final bmn mo9635a() {
        return new bmn(this.f8403c.toString());
    }

    @Override // com.google.android.gms.internal.blz
    /* JADX INFO: renamed from: a */
    public final boolean mo9636a(byte[] bArr) {
        String strM9637b = m9637b(bArr);
        if (strM9637b == null) {
            return false;
        }
        this.f8403c.append(strM9637b);
        return true;
    }
}
