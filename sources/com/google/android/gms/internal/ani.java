package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ani extends akb {
    /* JADX INFO: renamed from: a */
    private static byte m8090a(String str, int i) throws UnsupportedEncodingException {
        if (i + 3 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String strSubstring = str.substring(i + 1, i + 3);
        if (strSubstring.charAt(0) == '+' || strSubstring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(strSubstring, 16);
        } catch (NumberFormatException e) {
            throw new UnsupportedEncodingException();
        }
    }

    /* JADX INFO: renamed from: a */
    static String m8091a(String str, String str2) throws UnsupportedEncodingException {
        Charset charsetForName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%') {
                sb.append(cCharAt);
                i++;
            } else {
                byte bM8090a = m8090a(str, i);
                int i2 = i + 3;
                if ((bM8090a & 128) != 0) {
                    int i3 = 0;
                    while (((bM8090a << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = bM8090a;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte bM8090a2 = m8090a(str, i2);
                        int i5 = i2 + 3;
                        if ((bM8090a2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = bM8090a2;
                        i4++;
                        i2 = i5;
                    }
                    CharBuffer charBufferDecode = charsetForName.decode(ByteBuffer.wrap(bArr));
                    if (charBufferDecode.length() != 1 || str2.indexOf(charBufferDecode.charAt(0)) == -1) {
                        sb.append((CharSequence) charBufferDecode);
                        i = i2;
                    } else {
                        sb.append(str.substring(i, i2));
                        i = i2;
                    }
                } else if (str2.indexOf(bM8090a) == -1) {
                    sb.append((char) bM8090a);
                    i = i2;
                } else {
                    sb.append(str.substring(i2 - 3, i2));
                    i = i2;
                }
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        try {
            return new art(m8091a(aka.m8083d(arhVarArr.length > 0 ? (arh) C1221aj.m7065a(arhVarArr[0]) : arn.f7154e), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException e) {
            return arn.f7154e;
        }
    }
}
