package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes.dex */
final class bmc extends ThreadLocal<CharsetEncoder> {
    bmc() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ CharsetEncoder initialValue() {
        CharsetEncoder charsetEncoderNewEncoder = Charset.forName("UTF8").newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetEncoderNewEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return charsetEncoderNewEncoder;
    }
}
