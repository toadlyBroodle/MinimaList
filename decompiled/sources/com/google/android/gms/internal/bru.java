package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class bru {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f8768a;

    private bru(ByteBuffer byteBuffer) {
        this.f8768a = byteBuffer;
        this.f8768a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private bru(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public static int m10102a(int i) {
        if (i >= 0) {
            return m10120d(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: a */
    public static int m10103a(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: a */
    private static int m10104a(CharSequence charSequence) {
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
                                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
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
    private static int m10105a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) cCharAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) cCharAt2;
            } else if (cCharAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i5 - 3) {
                    if (i6 > i5 - 4) {
                        throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(cCharAt2).append(" at index ").append(i6).toString());
                    }
                    if (i4 + 1 != charSequence.length()) {
                        i4++;
                        char cCharAt3 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            int i8 = i6 + 1;
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i3 = i10 + 1;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i4 - 1).toString());
                }
                int i11 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    /* JADX INFO: renamed from: a */
    public static int m10106a(String str) {
        int iM10104a = m10104a((CharSequence) str);
        return iM10104a + m10120d(iM10104a);
    }

    /* JADX INFO: renamed from: a */
    public static bru m10107a(byte[] bArr) {
        return m10108a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static bru m10108a(byte[] bArr, int i, int i2) {
        return new bru(bArr, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    private static void m10109a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            m10117b(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(m10105a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10110b(int i) {
        return m10120d(i << 3);
    }

    /* JADX INFO: renamed from: b */
    public static int m10111b(int i, int i2) {
        return m10110b(i) + m10102a(i2);
    }

    /* JADX INFO: renamed from: b */
    public static int m10112b(int i, bsc bscVar) {
        int iM10110b = m10110b(i);
        int iM10166f = bscVar.m10166f();
        return iM10110b + iM10166f + m10120d(iM10166f);
    }

    /* JADX INFO: renamed from: b */
    public static int m10113b(int i, String str) {
        return m10110b(i) + m10106a(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m10114b(int i, byte[] bArr) {
        return m10110b(i) + m10115b(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m10115b(byte[] bArr) {
        return m10120d(bArr.length) + bArr.length;
    }

    /* JADX INFO: renamed from: b */
    private final void m10116b(long j) throws brv {
        while (((-128) & j) != 0) {
            m10121e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m10121e((int) j);
    }

    /* JADX INFO: renamed from: b */
    private static void m10117b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    if (i + 1 != charSequence.length()) {
                        i++;
                        char cCharAt2 = charSequence.charAt(i);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                        }
                    }
                    throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i - 1).toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m10118c(int i, long j) {
        return m10110b(i) + m10103a(j);
    }

    /* JADX INFO: renamed from: c */
    private final void m10119c(long j) throws brv {
        if (this.f8768a.remaining() < 8) {
            throw new brv(this.f8768a.position(), this.f8768a.limit());
        }
        this.f8768a.putLong(j);
    }

    /* JADX INFO: renamed from: d */
    public static int m10120d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: e */
    private final void m10121e(int i) throws brv {
        byte b = (byte) i;
        if (!this.f8768a.hasRemaining()) {
            throw new brv(this.f8768a.position(), this.f8768a.limit());
        }
        this.f8768a.put(b);
    }

    /* JADX INFO: renamed from: a */
    public final void m10122a() {
        if (this.f8768a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f8768a.remaining())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10123a(int i, double d) throws brv {
        m10134c(i, 1);
        m10119c(Double.doubleToLongBits(d));
    }

    /* JADX INFO: renamed from: a */
    public final void m10124a(int i, float f) throws brv {
        m10134c(i, 5);
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (this.f8768a.remaining() < 4) {
            throw new brv(this.f8768a.position(), this.f8768a.limit());
        }
        this.f8768a.putInt(iFloatToIntBits);
    }

    /* JADX INFO: renamed from: a */
    public final void m10125a(int i, int i2) throws brv {
        m10134c(i, 0);
        if (i2 >= 0) {
            m10133c(i2);
        } else {
            m10116b(i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10126a(int i, long j) throws brv {
        m10134c(i, 0);
        m10116b(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m10127a(int i, bsc bscVar) throws brv {
        m10134c(i, 2);
        m10131a(bscVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m10128a(int i, String str) throws brv {
        m10134c(i, 2);
        try {
            int iM10120d = m10120d(str.length());
            if (iM10120d != m10120d(str.length() * 3)) {
                m10133c(m10104a((CharSequence) str));
                m10109a(str, this.f8768a);
                return;
            }
            int iPosition = this.f8768a.position();
            if (this.f8768a.remaining() < iM10120d) {
                throw new brv(iM10120d + iPosition, this.f8768a.limit());
            }
            this.f8768a.position(iPosition + iM10120d);
            m10109a(str, this.f8768a);
            int iPosition2 = this.f8768a.position();
            this.f8768a.position(iPosition);
            m10133c((iPosition2 - iPosition) - iM10120d);
            this.f8768a.position(iPosition2);
        } catch (BufferOverflowException e) {
            brv brvVar = new brv(this.f8768a.position(), this.f8768a.limit());
            brvVar.initCause(e);
            throw brvVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10129a(int i, boolean z) throws brv {
        m10134c(i, 0);
        byte b = (byte) (z ? 1 : 0);
        if (!this.f8768a.hasRemaining()) {
            throw new brv(this.f8768a.position(), this.f8768a.limit());
        }
        this.f8768a.put(b);
    }

    /* JADX INFO: renamed from: a */
    public final void m10130a(int i, byte[] bArr) throws brv {
        m10134c(i, 2);
        m10133c(bArr.length);
        m10135c(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m10131a(bsc bscVar) throws brv {
        m10133c(bscVar.m10165e());
        bscVar.mo7777a(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m10132b(int i, long j) throws brv {
        m10134c(i, 0);
        m10116b(j);
    }

    /* JADX INFO: renamed from: c */
    public final void m10133c(int i) throws brv {
        while ((i & (-128)) != 0) {
            m10121e((i & 127) | 128);
            i >>>= 7;
        }
        m10121e(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m10134c(int i, int i2) throws brv {
        m10133c((i << 3) | i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m10135c(byte[] bArr) throws brv {
        int length = bArr.length;
        if (this.f8768a.remaining() < length) {
            throw new brv(this.f8768a.position(), this.f8768a.limit());
        }
        this.f8768a.put(bArr, 0, length);
    }
}
