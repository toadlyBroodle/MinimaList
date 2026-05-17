package com.google.android.gms.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class agk {
    /* JADX INFO: renamed from: a */
    public static String m7852a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if ((b & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7853a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 16);
            int iDigit2 = Character.digit(str.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }
}
