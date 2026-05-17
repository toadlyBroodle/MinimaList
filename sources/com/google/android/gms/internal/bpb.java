package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class bpb {

    /* JADX INFO: renamed from: b */
    public static final byte[] f8622b;

    /* JADX INFO: renamed from: d */
    private static ByteBuffer f8624d;

    /* JADX INFO: renamed from: e */
    private static bok f8625e;

    /* JADX INFO: renamed from: a */
    static final Charset f8621a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    private static Charset f8623c = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        f8622b = bArr;
        f8624d = ByteBuffer.wrap(bArr);
        f8625e = bok.m9779a(f8622b);
    }

    /* JADX INFO: renamed from: a */
    static int m9929a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m9930a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: a */
    static <T> T m9931a(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    static <T> T m9932a(T t, String str) {
        if (t == null) {
            throw new NullPointerException(str);
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    static boolean m9933a(bqa bqaVar) {
        return false;
    }
}
