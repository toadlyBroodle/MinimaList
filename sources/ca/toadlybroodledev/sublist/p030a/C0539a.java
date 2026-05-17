package ca.toadlybroodledev.sublist.p030a;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0539a {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ boolean f3749a;

    /* JADX INFO: renamed from: b */
    private static final byte[] f3750b;

    /* JADX INFO: renamed from: c */
    private static final byte[] f3751c;

    /* JADX INFO: renamed from: d */
    private static final byte[] f3752d;

    /* JADX INFO: renamed from: e */
    private static final byte[] f3753e;

    static {
        f3749a = !C0539a.class.desiredAssertionStatus();
        f3750b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f3751c = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f3752d = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f3753e = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private C0539a() {
    }

    /* JADX INFO: renamed from: a */
    private static int m4804a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        if (bArr[i + 2] == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12)) >>> 16);
            return 1;
        }
        if (bArr[i + 3] == 61) {
            int i3 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18);
            bArr2[i2] = (byte) (i3 >>> 16);
            bArr2[i2 + 1] = (byte) (i3 >>> 8);
            return 2;
        }
        int i4 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18) | ((bArr3[bArr[i + 3]] << 24) >>> 24);
        bArr2[i2] = (byte) (i4 >> 16);
        bArr2[i2 + 1] = (byte) (i4 >> 8);
        bArr2[i2 + 2] = (byte) i4;
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4805a(String str) {
        byte[] bytes = str.getBytes();
        return m4806a(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4806a(byte[] bArr, int i, int i2) {
        return m4807a(bArr, i, i2, f3752d);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4807a(byte[] bArr, int i, int i2, byte[] bArr2) throws C0540b {
        int i3;
        int iM4804a;
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i4 = 0;
        int i5 = 0;
        int iM4804a2 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            byte b = (byte) (bArr[i4 + i] & 127);
            byte b2 = bArr2[b];
            if (b2 < -5) {
                throw new C0540b("Bad Base64 input character at " + i4 + ": " + ((int) bArr[i4 + i]) + "(decimal)");
            }
            if (b2 < -1) {
                i3 = i5;
                iM4804a = iM4804a2;
            } else if (b == 61) {
                int i6 = i2 - i4;
                byte b3 = (byte) (bArr[(i2 - 1) + i] & 127);
                if (i5 == 0 || i5 == 1) {
                    throw new C0540b("invalid padding byte '=' at byte offset " + i4);
                }
                if ((i5 == 3 && i6 > 2) || (i5 == 4 && i6 > 1)) {
                    throw new C0540b("padding byte '=' falsely signals end of encoded value at offset " + i4);
                }
                if (b3 != 61 && b3 != 10) {
                    throw new C0540b("encoded value has invalid trailing byte");
                }
            } else {
                i3 = i5 + 1;
                bArr4[i5] = b;
                if (i3 == 4) {
                    iM4804a = m4804a(bArr4, 0, bArr3, iM4804a2, bArr2) + iM4804a2;
                    i3 = 0;
                } else {
                    iM4804a = iM4804a2;
                }
            }
            i4++;
            iM4804a2 = iM4804a;
            i5 = i3;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                throw new C0540b("single trailing character at offset " + (i2 - 1));
            }
            int i7 = i5 + 1;
            bArr4[i5] = 61;
            iM4804a2 += m4804a(bArr4, 0, bArr3, iM4804a2, bArr2);
        }
        byte[] bArr5 = new byte[iM4804a2];
        System.arraycopy(bArr3, 0, bArr5, 0, iM4804a2);
        return bArr5;
    }
}
