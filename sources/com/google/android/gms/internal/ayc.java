package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class ayc {
    /* JADX INFO: renamed from: a */
    private static long m8678a(byte[] bArr, int i) {
        return ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24))) & 4294967295L;
    }

    /* JADX INFO: renamed from: a */
    private static long m8679a(byte[] bArr, int i, int i2) {
        return (m8678a(bArr, i) >> i2) & 67108863;
    }

    /* JADX INFO: renamed from: a */
    private static void m8680a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX INFO: renamed from: a */
    static byte[] m8681a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long jM8679a = 67108863 & m8679a(bArr, 0, 0);
        long jM8679a2 = 67108611 & m8679a(bArr, 3, 2);
        long jM8679a3 = 67092735 & m8679a(bArr, 6, 4);
        long jM8679a4 = 66076671 & m8679a(bArr, 9, 6);
        long jM8679a5 = 1048575 & m8679a(bArr, 12, 8);
        long j6 = jM8679a2 * 5;
        long j7 = jM8679a3 * 5;
        long j8 = jM8679a4 * 5;
        long j9 = jM8679a5 * 5;
        byte[] bArr3 = new byte[17];
        for (int i = 0; i < bArr2.length; i += 16) {
            int iMin = Math.min(16, bArr2.length - i);
            System.arraycopy(bArr2, i, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jM8679a6 = j + m8679a(bArr3, 0, 0);
            long jM8679a7 = j2 + m8679a(bArr3, 3, 2);
            long jM8679a8 = j3 + m8679a(bArr3, 6, 4);
            long jM8679a9 = j4 + m8679a(bArr3, 9, 6);
            long jM8679a10 = j5 + (m8679a(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j10 = (jM8679a6 * jM8679a) + (jM8679a7 * j9) + (jM8679a8 * j8) + (jM8679a9 * j7) + (jM8679a10 * j6);
            long j11 = (jM8679a6 * jM8679a2) + (jM8679a7 * jM8679a) + (jM8679a8 * j9) + (jM8679a9 * j8) + (jM8679a10 * j7);
            long j12 = (jM8679a6 * jM8679a3) + (jM8679a7 * jM8679a2) + (jM8679a8 * jM8679a) + (jM8679a9 * j9) + (jM8679a10 * j8);
            long j13 = (jM8679a6 * jM8679a4) + (jM8679a7 * jM8679a3) + (jM8679a8 * jM8679a2) + (jM8679a9 * jM8679a) + (jM8679a10 * j9);
            long j14 = jM8679a8 * jM8679a3;
            long j15 = jM8679a9 * jM8679a2;
            long j16 = jM8679a10 * jM8679a;
            long j17 = j16 + j15 + j14 + (jM8679a7 * jM8679a4) + (jM8679a6 * jM8679a5);
            long j18 = j10 & 67108863;
            long j19 = (j10 >> 26) + j11;
            long j20 = j19 & 67108863;
            long j21 = j12 + (j19 >> 26);
            j3 = 67108863 & j21;
            long j22 = j13 + (j21 >> 26);
            long j23 = j22 >> 26;
            j4 = j22 & 67108863;
            long j24 = j17 + j23;
            long j25 = j24 >> 26;
            j5 = j24 & 67108863;
            long j26 = j18 + (j25 * 5);
            j = 67108863 & j26;
            j2 = j20 + (j26 >> 26);
        }
        long j27 = (j2 >> 26) + j3;
        long j28 = j27 >> 26;
        long j29 = j27 & 67108863;
        long j30 = j4 + j28;
        long j31 = j30 >> 26;
        long j32 = j30 & 67108863;
        long j33 = j5 + j31;
        long j34 = j33 >> 26;
        long j35 = j33 & 67108863;
        long j36 = (j34 * 5) + j;
        long j37 = j36 >> 26;
        long j38 = j36 & 67108863;
        long j39 = (j2 & 67108863) + j37;
        long j40 = 5 + j38;
        long j41 = (j40 >> 26) + j39;
        long j42 = (j41 >> 26) + j29;
        long j43 = (j42 >> 26) + j32;
        long j44 = ((j43 >> 26) + j35) - 67108864;
        long j45 = j44 >> 63;
        long j46 = j38 & j45;
        long j47 = j39 & j45;
        long j48 = j29 & j45;
        long j49 = j32 & j45;
        long j50 = j35 & j45;
        long j51 = j45 ^ (-1);
        long j52 = j47 | (j41 & 67108863 & j51);
        long j53 = j48 | (j42 & 67108863 & j51);
        long j54 = j49 | (j43 & 67108863 & j51);
        long j55 = (j46 | (j40 & 67108863 & j51) | (j52 << 26)) & 4294967295L;
        long j56 = ((j52 >> 6) | (j53 << 20)) & 4294967295L;
        long j57 = ((j53 >> 12) | (j54 << 14)) & 4294967295L;
        long j58 = (((j50 | (j44 & j51)) << 8) | (j54 >> 18)) & 4294967295L;
        long jM8678a = m8678a(bArr, 16) + j55;
        long j59 = 4294967295L & jM8678a;
        long jM8678a2 = (jM8678a >> 32) + j56 + m8678a(bArr, 20);
        long j60 = 4294967295L & jM8678a2;
        long jM8678a3 = j57 + m8678a(bArr, 24) + (jM8678a2 >> 32);
        long j61 = 4294967295L & jM8678a3;
        long jM8678a4 = ((jM8678a3 >> 32) + j58 + m8678a(bArr, 28)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m8680a(bArr4, j59, 0);
        m8680a(bArr4, j60, 4);
        m8680a(bArr4, j61, 8);
        m8680a(bArr4, jM8678a4, 12);
        return bArr4;
    }
}
