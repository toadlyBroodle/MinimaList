package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes.dex */
final class bmb extends ThreadLocal<CharsetDecoder> {
    bmb() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ CharsetDecoder initialValue() {
        CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF8").newDecoder();
        charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return charsetDecoderNewDecoder;
    }
}
