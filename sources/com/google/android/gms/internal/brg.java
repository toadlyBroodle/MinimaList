package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class brg {

    /* JADX INFO: renamed from: a */
    private static final brh f8723a;

    static {
        f8723a = bre.m10043a() && bre.m10047b() ? new brk() : new bri();
    }

    /* JADX INFO: renamed from: a */
    static int m10065a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new brj(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i) + 4294967296L).toString());
    }

    /* JADX INFO: renamed from: a */
    static int m10066a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f8723a.mo10074a(charSequence, bArr, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10067a(byte[] bArr, int i, int i2) {
        return f8723a.mo10073a(0, bArr, i, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m10068b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m10069b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m10070b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static int m10072c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m10068b(b);
            case 1:
                return m10069b(b, bArr[i]);
            case 2:
                return m10070b(b, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
