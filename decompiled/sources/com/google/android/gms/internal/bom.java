package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class bom extends bok {

    /* JADX INFO: renamed from: d */
    private final byte[] f8528d;

    /* JADX INFO: renamed from: e */
    private final boolean f8529e;

    /* JADX INFO: renamed from: f */
    private int f8530f;

    /* JADX INFO: renamed from: g */
    private int f8531g;

    /* JADX INFO: renamed from: h */
    private int f8532h;

    /* JADX INFO: renamed from: i */
    private int f8533i;

    /* JADX INFO: renamed from: j */
    private int f8534j;

    /* JADX INFO: renamed from: k */
    private int f8535k;

    private bom(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f8535k = Integer.MAX_VALUE;
        this.f8528d = bArr;
        this.f8530f = i + i2;
        this.f8532h = i;
        this.f8533i = this.f8532h;
        this.f8529e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r4[r3] < 0) goto L36;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m9798n() {
        long j;
        int i = this.f8532h;
        if (this.f8530f != i) {
            byte[] bArr = this.f8528d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f8532h = i2;
                return b;
            }
            if (this.f8530f - i2 >= 9) {
                int i3 = i2 + 1;
                int i4 = b ^ (bArr[i2] << 7);
                if (i4 < 0) {
                    j = i4 ^ (-128);
                } else {
                    int i5 = i3 + 1;
                    int i6 = i4 ^ (bArr[i3] << 14);
                    if (i6 >= 0) {
                        j = i6 ^ 16256;
                        i3 = i5;
                    } else {
                        i3 = i5 + 1;
                        int i7 = i6 ^ (bArr[i5] << 21);
                        if (i7 < 0) {
                            j = i7 ^ (-2080896);
                        } else {
                            int i8 = i3 + 1;
                            long j2 = ((long) i7) ^ (((long) bArr[i3]) << 28);
                            if (j2 >= 0) {
                                j = j2 ^ 266354560;
                                i3 = i8;
                            } else {
                                i3 = i8 + 1;
                                long j3 = j2 ^ (((long) bArr[i8]) << 35);
                                if (j3 < 0) {
                                    j = j3 ^ (-34093383808L);
                                } else {
                                    int i9 = i3 + 1;
                                    long j4 = j3 ^ (((long) bArr[i3]) << 42);
                                    if (j4 >= 0) {
                                        j = j4 ^ 4363953127296L;
                                        i3 = i9;
                                    } else {
                                        i3 = i9 + 1;
                                        long j5 = j4 ^ (((long) bArr[i9]) << 49);
                                        if (j5 < 0) {
                                            j = j5 ^ (-558586000294016L);
                                        } else {
                                            int i10 = i3 + 1;
                                            j = (j5 ^ (((long) bArr[i3]) << 56)) ^ 71499008037633920L;
                                            i3 = j < 0 ? i10 + 1 : i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f8532h = i3;
                return j;
            }
        }
        return mo9795k();
    }

    /* JADX INFO: renamed from: o */
    private final int m9799o() throws bpf {
        int i = this.f8532h;
        if (this.f8530f - i < 4) {
            throw bpf.m9935a();
        }
        byte[] bArr = this.f8528d;
        this.f8532h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: p */
    private final long m9800p() throws bpf {
        int i = this.f8532h;
        if (this.f8530f - i < 8) {
            throw bpf.m9935a();
        }
        byte[] bArr = this.f8528d;
        this.f8532h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: q */
    private final void m9801q() {
        this.f8530f += this.f8531g;
        int i = this.f8530f - this.f8533i;
        if (i <= this.f8535k) {
            this.f8531g = 0;
        } else {
            this.f8531g = i - this.f8535k;
            this.f8530f -= this.f8531g;
        }
    }

    /* JADX INFO: renamed from: r */
    private final byte m9802r() throws bpf {
        if (this.f8532h == this.f8530f) {
            throw bpf.m9935a();
        }
        byte[] bArr = this.f8528d;
        int i = this.f8532h;
        this.f8532h = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: a */
    public final int mo9781a() throws bpf {
        if (mo9796l()) {
            this.f8534j = 0;
            return 0;
        }
        this.f8534j = mo9794j();
        if ((this.f8534j >>> 3) == 0) {
            throw bpf.m9938d();
        }
        return this.f8534j;
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: a */
    public final <T extends boz<T, ?>> T mo9782a(T t, bor borVar) throws bpf {
        int iMo9794j = mo9794j();
        if (this.f8524a >= this.f8525b) {
            throw bpf.m9941g();
        }
        int iMo9784b = mo9784b(iMo9794j);
        this.f8524a++;
        T t2 = (T) boz.m9900a(t, this, borVar);
        mo9783a(0);
        this.f8524a--;
        mo9787c(iMo9784b);
        return t2;
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: a */
    public final void mo9783a(int i) throws bpf {
        if (this.f8534j != i) {
            throw bpf.m9939e();
        }
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: b */
    public final int mo9784b(int i) throws bpf {
        if (i < 0) {
            throw bpf.m9936b();
        }
        int iMo9797m = mo9797m() + i;
        int i2 = this.f8535k;
        if (iMo9797m > i2) {
            throw bpf.m9935a();
        }
        this.f8535k = iMo9797m;
        m9801q();
        return i2;
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: b */
    public final long mo9785b() {
        return m9798n();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: c */
    public final long mo9786c() {
        return m9800p();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: c */
    public final void mo9787c(int i) {
        this.f8535k = i;
        m9801q();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: d */
    public final int mo9788d() {
        return m9799o();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: e */
    public final boolean mo9789e() {
        return m9798n() != 0;
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: f */
    public final String mo9790f() throws bpf {
        int iMo9794j = mo9794j();
        if (iMo9794j <= 0 || iMo9794j > this.f8530f - this.f8532h) {
            if (iMo9794j == 0) {
                return "";
            }
            if (iMo9794j <= 0) {
                throw bpf.m9936b();
            }
            throw bpf.m9935a();
        }
        if (!brg.m10067a(this.f8528d, this.f8532h, this.f8532h + iMo9794j)) {
            throw bpf.m9942h();
        }
        int i = this.f8532h;
        this.f8532h += iMo9794j;
        return new String(this.f8528d, i, iMo9794j, bpb.f8621a);
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: g */
    public final bob mo9791g() throws bpf {
        byte[] bArrCopyOfRange;
        int iMo9794j = mo9794j();
        if (iMo9794j > 0 && iMo9794j <= this.f8530f - this.f8532h) {
            bob bobVarM9758a = bob.m9758a(this.f8528d, this.f8532h, iMo9794j);
            this.f8532h = iMo9794j + this.f8532h;
            return bobVarM9758a;
        }
        if (iMo9794j == 0) {
            return bob.f8512a;
        }
        if (iMo9794j > 0 && iMo9794j <= this.f8530f - this.f8532h) {
            int i = this.f8532h;
            this.f8532h = iMo9794j + this.f8532h;
            bArrCopyOfRange = Arrays.copyOfRange(this.f8528d, i, this.f8532h);
        } else {
            if (iMo9794j > 0) {
                throw bpf.m9935a();
            }
            if (iMo9794j != 0) {
                throw bpf.m9936b();
            }
            bArrCopyOfRange = bpb.f8622b;
        }
        return bob.m9760b(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: h */
    public final int mo9792h() {
        return mo9794j();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: i */
    public final int mo9793i() {
        return mo9794j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[PHI: r2
      0x0072: PHI (r2v7 int) = (r2v6 int), (r2v9 int), (r2v11 int) binds: [B:21:0x004c, B:25:0x0058, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo9794j() {
        int i;
        int i2 = this.f8532h;
        if (this.f8530f != i2) {
            byte[] bArr = this.f8528d;
            int i3 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f8532h = i3;
                return b;
            }
            if (this.f8530f - i3 >= 9) {
                int i4 = i3 + 1;
                int i5 = b ^ (bArr[i3] << 7);
                if (i5 < 0) {
                    i = i5 ^ (-128);
                } else {
                    int i6 = i4 + 1;
                    int i7 = i5 ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        i = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        i4 = i6 + 1;
                        int i8 = i7 ^ (bArr[i6] << 21);
                        if (i8 < 0) {
                            i = i8 ^ (-2080896);
                        } else {
                            int i9 = i4 + 1;
                            byte b2 = bArr[i4];
                            i = (i8 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i4 = i9 + 1;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i9 + 1;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 1;
                                            i4 = bArr[i4] < 0 ? i9 + 1 : i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f8532h = i4;
                return i;
            }
        }
        return (int) mo9795k();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: k */
    final long mo9795k() throws bpf {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM9802r = m9802r();
            j |= ((long) (bM9802r & 127)) << i;
            if ((bM9802r & 128) == 0) {
                return j;
            }
        }
        throw bpf.m9937c();
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: l */
    public final boolean mo9796l() {
        return this.f8532h == this.f8530f;
    }

    @Override // com.google.android.gms.internal.bok
    /* JADX INFO: renamed from: m */
    public final int mo9797m() {
        return this.f8532h - this.f8533i;
    }
}
