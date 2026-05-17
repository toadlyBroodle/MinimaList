package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ank extends akb {
    /* JADX INFO: renamed from: a */
    static String m8092a(String str, String str2) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Charset charsetForName = Charset.forName("UTF-8");
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (str2.indexOf(cCharAt) != -1) {
                sb.append(cCharAt);
                i++;
            } else {
                int i2 = 1;
                if (Character.isHighSurrogate(cCharAt)) {
                    if (i + 1 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    }
                    if (!Character.isLowSurrogate(str.charAt(i + 1))) {
                        throw new UnsupportedEncodingException();
                    }
                    i2 = 2;
                }
                byte[] bytes = str.substring(i, i + i2).getBytes(charsetForName);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i3] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i3] & 15, 16)));
                }
                i += i2;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        try {
            return new art(m8092a(aka.m8083d(arhVarArr.length > 0 ? (arh) C1221aj.m7065a(arhVarArr[0]) : arn.f7154e), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException e) {
            return arn.f7154e;
        }
    }
}
