package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class brk extends brh {
    brk() {
    }

    /* JADX INFO: renamed from: a */
    private static int m10075a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return brg.m10068b(i);
            case 1:
                return brg.m10069b(i, bre.m10035a(bArr, j));
            case 2:
                return brg.m10070b(i, bre.m10035a(bArr, j), bre.m10035a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m10076a(byte[] bArr, long j, int i) {
        int i2;
        if (i >= 16) {
            i2 = 0;
            long j2 = j;
            while (true) {
                if (i2 >= i) {
                    i2 = i;
                    break;
                }
                long j3 = 1 + j2;
                if (bre.m10035a(bArr, j2) < 0) {
                    break;
                }
                i2++;
                j2 = j3;
            }
        } else {
            i2 = 0;
        }
        long j4 = ((long) i2) + j;
        int i3 = i - i2;
        while (true) {
            byte bM10035a = 0;
            long j5 = j4;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                long j6 = 1 + j5;
                bM10035a = bre.m10035a(bArr, j5);
                if (bM10035a < 0) {
                    j5 = j6;
                    break;
                }
                i3--;
                j5 = j6;
            }
            if (i3 != 0) {
                int i4 = i3 - 1;
                if (bM10035a >= -32) {
                    if (bM10035a >= -16) {
                        if (i4 >= 3) {
                            i3 = i4 - 3;
                            long j7 = 1 + j5;
                            byte bM10035a2 = bre.m10035a(bArr, j5);
                            if (bM10035a2 <= -65 && (((bM10035a << 28) + (bM10035a2 + 112)) >> 30) == 0) {
                                long j8 = 1 + j7;
                                if (bre.m10035a(bArr, j7) > -65) {
                                    break;
                                }
                                j4 = 1 + j8;
                                if (bre.m10035a(bArr, j8) > -65) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            return m10075a(bArr, bM10035a, j5, i4);
                        }
                    } else {
                        if (i4 < 2) {
                            return m10075a(bArr, bM10035a, j5, i4);
                        }
                        i3 = i4 - 2;
                        long j9 = j5 + 1;
                        byte bM10035a3 = bre.m10035a(bArr, j5);
                        if (bM10035a3 > -65 || ((bM10035a == -32 && bM10035a3 < -96) || (bM10035a == -19 && bM10035a3 >= -96))) {
                            break;
                        }
                        j4 = 1 + j9;
                        if (bre.m10035a(bArr, j9) > -65) {
                            break;
                        }
                    }
                } else if (i4 != 0) {
                    i3 = i4 - 1;
                    if (bM10035a < -62) {
                        break;
                    }
                    j4 = 1 + j5;
                    if (bre.m10035a(bArr, j5) > -65) {
                        break;
                    }
                } else {
                    return bM10035a;
                }
            } else {
                return 0;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.brh
    /* JADX INFO: renamed from: a */
    final int mo10073a(int i, byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j = i2;
        return m10076a(bArr, j, (int) (((long) i3) - j));
    }

    @Override // com.google.android.gms.internal.brh
    /* JADX INFO: renamed from: a */
    final int mo10074a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2 = i;
        long j3 = j2 + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charSequence.charAt(length - 1)).append(" at index ").append(i + i2).toString());
        }
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt >= 128) {
                break;
            }
            bre.m10042a(bArr, j2, (byte) cCharAt);
            i3++;
            j2 = 1 + j2;
        }
        if (i3 == length) {
            return (int) j2;
        }
        long j4 = j2;
        while (i3 < length) {
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 < 128 && j4 < j3) {
                j = 1 + j4;
                bre.m10042a(bArr, j4, (byte) cCharAt2);
            } else if (cCharAt2 < 2048 && j4 <= j3 - 2) {
                long j5 = j4 + 1;
                bre.m10042a(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                j = 1 + j5;
                bre.m10042a(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j3 - 3) {
                    if (j4 > j3 - 4) {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || (i3 + 1 != length && Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3 + 1)))) {
                            throw new ArrayIndexOutOfBoundsException(new StringBuilder(46).append("Failed writing ").append(cCharAt2).append(" at index ").append(j4).toString());
                        }
                        throw new brj(i3, length);
                    }
                    if (i3 + 1 != length) {
                        i3++;
                        char cCharAt3 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            long j6 = 1 + j4;
                            bre.m10042a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            long j7 = 1 + j6;
                            bre.m10042a(bArr, j6, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j8 = j7 + 1;
                            bre.m10042a(bArr, j7, (byte) (((codePoint >>> 6) & 63) | 128));
                            j = 1 + j8;
                            bre.m10042a(bArr, j8, (byte) ((codePoint & 63) | 128));
                        }
                    }
                    throw new brj(i3 - 1, length);
                }
                long j9 = 1 + j4;
                bre.m10042a(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                long j10 = 1 + j9;
                bre.m10042a(bArr, j9, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j = 1 + j10;
                bre.m10042a(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
            }
            i3++;
            j4 = j;
        }
        return (int) j4;
    }
}
