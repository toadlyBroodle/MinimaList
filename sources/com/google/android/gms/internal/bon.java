package com.google.android.gms.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class bon extends boa {

    /* JADX INFO: renamed from: b */
    private static final Logger f8536b = Logger.getLogger(bon.class.getName());

    /* JADX INFO: renamed from: c */
    private static final boolean f8537c = bre.m10043a();

    /* JADX INFO: renamed from: a */
    bop f8538a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.bon$a */
    static class C1439a extends bon {

        /* JADX INFO: renamed from: b */
        private final byte[] f8539b;

        /* JADX INFO: renamed from: c */
        private final int f8540c;

        /* JADX INFO: renamed from: d */
        private final int f8541d;

        /* JADX INFO: renamed from: e */
        private int f8542e;

        C1439a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2 | (bArr.length - (i + i2))) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f8539b = bArr;
            this.f8540c = i;
            this.f8542e = i;
            this.f8541d = i + i2;
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final int mo9843a() {
            return this.f8541d - this.f8542e;
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9844a(byte b) throws C1440b {
            try {
                byte[] bArr = this.f8539b;
                int i = this.f8542e;
                this.f8542e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9845a(int i) {
            if (i >= 0) {
                mo9858b(i);
            } else {
                mo9852a(i);
            }
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9846a(int i, int i2) {
            mo9858b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i, long j) {
            mo9846a(i, 0);
            mo9852a(j);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9848a(int i, bob bobVar) {
            mo9846a(i, 2);
            mo9853a(bobVar);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9849a(int i, bqa bqaVar) {
            mo9846a(i, 2);
            mo9854a(bqaVar);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9850a(int i, String str) {
            mo9846a(i, 2);
            mo9855a(str);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9851a(int i, boolean z) {
            mo9846a(i, 0);
            mo9844a((byte) (z ? 1 : 0));
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9852a(long j) throws C1440b {
            if (bon.f8537c && mo9843a() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f8539b;
                    int i = this.f8542e;
                    this.f8542e = i + 1;
                    bre.m10042a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f8539b;
                int i2 = this.f8542e;
                this.f8542e = i2 + 1;
                bre.m10042a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f8539b;
                    int i3 = this.f8542e;
                    this.f8542e = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), 1), e);
                }
            }
            byte[] bArr4 = this.f8539b;
            int i4 = this.f8542e;
            this.f8542e = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9853a(bob bobVar) {
            mo9858b(bobVar.mo9764a());
            bobVar.mo9767a(this);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9854a(bqa bqaVar) {
            mo9858b(bqaVar.mo8344d());
            bqaVar.mo8341a(this);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: a */
        public final void mo9855a(String str) throws C1440b {
            int i = this.f8542e;
            try {
                int iF = m9831f(str.length() * 3);
                int iF2 = m9831f(str.length());
                if (iF2 == iF) {
                    this.f8542e = i + iF2;
                    int iM10066a = brg.m10066a(str, this.f8539b, this.f8542e, mo9843a());
                    this.f8542e = i;
                    mo9858b((iM10066a - i) - iF2);
                    this.f8542e = iM10066a;
                } else {
                    mo9858b(brg.m10065a(str));
                    this.f8542e = brg.m10066a(str, this.f8539b, this.f8542e, mo9843a());
                }
            } catch (brj e) {
                this.f8542e = i;
                m9856a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C1440b(e2);
            }
        }

        @Override // com.google.android.gms.internal.boa
        /* JADX INFO: renamed from: a */
        public final void mo9755a(byte[] bArr, int i, int i2) {
            mo9866c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9858b(int i) throws C1440b {
            if (bon.f8537c && mo9843a() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f8539b;
                    int i2 = this.f8542e;
                    this.f8542e = i2 + 1;
                    bre.m10042a(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f8539b;
                int i3 = this.f8542e;
                this.f8542e = i3 + 1;
                bre.m10042a(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f8539b;
                    int i4 = this.f8542e;
                    this.f8542e = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), 1), e);
                }
            }
            byte[] bArr4 = this.f8539b;
            int i5 = this.f8542e;
            this.f8542e = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9859b(int i, int i2) {
            mo9846a(i, 0);
            mo9845a(i2);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9860b(int i, long j) {
            mo9846a(i, 1);
            mo9863b(j);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9861b(int i, bob bobVar) {
            mo9846a(1, 3);
            mo9865c(2, i);
            mo9848a(3, bobVar);
            mo9846a(1, 4);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9862b(int i, bqa bqaVar) {
            mo9846a(1, 3);
            mo9865c(2, i);
            mo9849a(3, bqaVar);
            mo9846a(1, 4);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: b */
        public final void mo9863b(long j) throws C1440b {
            try {
                byte[] bArr = this.f8539b;
                int i = this.f8542e;
                this.f8542e = i + 1;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.f8539b;
                int i2 = this.f8542e;
                this.f8542e = i2 + 1;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.f8539b;
                int i3 = this.f8542e;
                this.f8542e = i3 + 1;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.f8539b;
                int i4 = this.f8542e;
                this.f8542e = i4 + 1;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.f8539b;
                int i5 = this.f8542e;
                this.f8542e = i5 + 1;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.f8539b;
                int i6 = this.f8542e;
                this.f8542e = i6 + 1;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.f8539b;
                int i7 = this.f8542e;
                this.f8542e = i7 + 1;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.f8539b;
                int i8 = this.f8542e;
                this.f8542e = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: c */
        public final void mo9864c(int i) throws C1440b {
            try {
                byte[] bArr = this.f8539b;
                int i2 = this.f8542e;
                this.f8542e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f8539b;
                int i3 = this.f8542e;
                this.f8542e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f8539b;
                int i4 = this.f8542e;
                this.f8542e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f8539b;
                int i5 = this.f8542e;
                this.f8542e = i5 + 1;
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: c */
        public final void mo9865c(int i, int i2) {
            mo9846a(i, 0);
            mo9858b(i2);
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: c */
        public final void mo9866c(byte[] bArr, int i, int i2) throws C1440b {
            try {
                System.arraycopy(bArr, i, this.f8539b, this.f8542e, i2);
                this.f8542e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C1440b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8542e), Integer.valueOf(this.f8541d), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.bon
        /* JADX INFO: renamed from: d */
        public final void mo9867d(int i, int i2) {
            mo9846a(i, 5);
            mo9864c(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.bon$b */
    public static class C1440b extends IOException {
        C1440b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        C1440b(String str, Throwable th) {
            String strValueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String strValueOf2 = String.valueOf(str);
            super(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
        }

        C1440b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private bon() {
    }

    /* JADX INFO: renamed from: a */
    public static int m9803a(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: a */
    public static int m9804a(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: a */
    public static int m9805a(int i, bpl bplVar) {
        int iM9823d = m9823d(i);
        int iM9948b = bplVar.m9948b();
        return iM9823d + iM9948b + m9831f(iM9948b);
    }

    /* JADX INFO: renamed from: a */
    public static int m9806a(bpl bplVar) {
        int iM9948b = bplVar.m9948b();
        return iM9948b + m9831f(iM9948b);
    }

    /* JADX INFO: renamed from: a */
    public static int m9807a(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public static bon m9808a(byte[] bArr) {
        return m9816b(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public static int m9809b(int i, bpl bplVar) {
        return (m9823d(1) << 1) + m9829e(2, i) + m9805a(3, bplVar);
    }

    /* JADX INFO: renamed from: b */
    public static int m9810b(int i, String str) {
        return m9823d(i) + m9814b(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m9811b(int i, boolean z) {
        return m9823d(i) + 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m9812b(bob bobVar) {
        int iMo9764a = bobVar.mo9764a();
        return iMo9764a + m9831f(iMo9764a);
    }

    /* JADX INFO: renamed from: b */
    public static int m9813b(bqa bqaVar) {
        int iMo8344d = bqaVar.mo8344d();
        return iMo8344d + m9831f(iMo8344d);
    }

    /* JADX INFO: renamed from: b */
    public static int m9814b(String str) {
        int length;
        try {
            length = brg.m10065a(str);
        } catch (brj e) {
            length = str.getBytes(bpb.f8621a).length;
        }
        return length + m9831f(length);
    }

    /* JADX INFO: renamed from: b */
    public static int m9815b(byte[] bArr) {
        int length = bArr.length;
        return length + m9831f(length);
    }

    /* JADX INFO: renamed from: b */
    public static bon m9816b(byte[] bArr, int i, int i2) {
        return new C1439a(bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static int m9817c(int i, long j) {
        return m9823d(i) + m9827d(j);
    }

    /* JADX INFO: renamed from: c */
    public static int m9818c(int i, bob bobVar) {
        int iM9823d = m9823d(i);
        int iMo9764a = bobVar.mo9764a();
        return iM9823d + iMo9764a + m9831f(iMo9764a);
    }

    /* JADX INFO: renamed from: c */
    public static int m9819c(int i, bqa bqaVar) {
        return m9823d(i) + m9813b(bqaVar);
    }

    /* JADX INFO: renamed from: c */
    public static int m9820c(long j) {
        return m9827d(j);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m9821c(bqa bqaVar) {
        return bqaVar.mo8344d();
    }

    /* JADX INFO: renamed from: d */
    public static int m9823d(int i) {
        return m9831f(i << 3);
    }

    /* JADX INFO: renamed from: d */
    public static int m9824d(int i, long j) {
        return m9823d(i) + 8;
    }

    /* JADX INFO: renamed from: d */
    public static int m9825d(int i, bob bobVar) {
        return (m9823d(1) << 1) + m9829e(2, i) + m9818c(3, bobVar);
    }

    /* JADX INFO: renamed from: d */
    public static int m9826d(int i, bqa bqaVar) {
        return (m9823d(1) << 1) + m9829e(2, i) + m9819c(3, bqaVar);
    }

    /* JADX INFO: renamed from: d */
    public static int m9827d(long j) {
        long j2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: e */
    public static int m9828e(int i) {
        if (i >= 0) {
            return m9831f(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: e */
    public static int m9829e(int i, int i2) {
        return m9823d(i) + m9831f(i2);
    }

    /* JADX INFO: renamed from: e */
    public static int m9830e(long j) {
        return m9827d(m9838h(j));
    }

    /* JADX INFO: renamed from: f */
    public static int m9831f(int i) {
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

    /* JADX INFO: renamed from: f */
    public static int m9832f(int i, int i2) {
        return m9823d(i) + 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m9833f(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: g */
    public static int m9834g(int i) {
        return m9831f(m9842l(i));
    }

    /* JADX INFO: renamed from: g */
    public static int m9835g(int i, int i2) {
        return m9823d(i) + m9828e(i2);
    }

    /* JADX INFO: renamed from: g */
    public static int m9836g(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m9837h(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    private static long m9838h(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* JADX INFO: renamed from: i */
    public static int m9839i(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: j */
    public static int m9840j(int i) {
        return m9828e(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static int m9841k(int i) {
        return m9831f(i);
    }

    /* JADX INFO: renamed from: l */
    private static int m9842l(int i) {
        return (i << 1) ^ (i >> 31);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo9843a();

    /* JADX INFO: renamed from: a */
    public abstract void mo9844a(byte b);

    /* JADX INFO: renamed from: a */
    public abstract void mo9845a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo9846a(int i, int i2);

    /* JADX INFO: renamed from: a */
    public abstract void mo9847a(int i, long j);

    /* JADX INFO: renamed from: a */
    public abstract void mo9848a(int i, bob bobVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9849a(int i, bqa bqaVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9850a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo9851a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo9852a(long j);

    /* JADX INFO: renamed from: a */
    public abstract void mo9853a(bob bobVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9854a(bqa bqaVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9855a(String str);

    /* JADX INFO: renamed from: a */
    final void m9856a(String str, brj brjVar) throws C1440b {
        f8536b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) brjVar);
        byte[] bytes = str.getBytes(bpb.f8621a);
        try {
            mo9858b(bytes.length);
            mo9755a(bytes, 0, bytes.length);
        } catch (C1440b e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C1440b(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9857b() {
        if (mo9843a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo9858b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo9859b(int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo9860b(int i, long j);

    /* JADX INFO: renamed from: b */
    public abstract void mo9861b(int i, bob bobVar);

    /* JADX INFO: renamed from: b */
    public abstract void mo9862b(int i, bqa bqaVar);

    /* JADX INFO: renamed from: b */
    public abstract void mo9863b(long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo9864c(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo9865c(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract void mo9866c(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract void mo9867d(int i, int i2);
}
