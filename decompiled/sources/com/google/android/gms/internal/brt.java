package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class brt {

    /* JADX INFO: renamed from: a */
    private final byte[] f8757a;

    /* JADX INFO: renamed from: b */
    private final int f8758b;

    /* JADX INFO: renamed from: c */
    private final int f8759c;

    /* JADX INFO: renamed from: d */
    private int f8760d;

    /* JADX INFO: renamed from: e */
    private int f8761e;

    /* JADX INFO: renamed from: f */
    private int f8762f;

    /* JADX INFO: renamed from: g */
    private int f8763g;

    /* JADX INFO: renamed from: i */
    private int f8765i;

    /* JADX INFO: renamed from: h */
    private int f8764h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    private int f8766j = 64;

    /* JADX INFO: renamed from: k */
    private int f8767k = 67108864;

    private brt(byte[] bArr, int i, int i2) {
        this.f8757a = bArr;
        this.f8758b = i;
        int i3 = i + i2;
        this.f8760d = i3;
        this.f8759c = i3;
        this.f8762f = i;
    }

    /* JADX INFO: renamed from: a */
    public static brt m10078a(byte[] bArr, int i, int i2) {
        return new brt(bArr, 0, i2);
    }

    /* JADX INFO: renamed from: f */
    private final void m10079f(int i) throws bsb {
        if (i < 0) {
            throw bsb.m10159b();
        }
        if (this.f8762f + i > this.f8764h) {
            m10079f(this.f8764h - this.f8762f);
            throw bsb.m10158a();
        }
        if (i > this.f8760d - this.f8762f) {
            throw bsb.m10158a();
        }
        this.f8762f += i;
    }

    /* JADX INFO: renamed from: m */
    private final void m10080m() {
        this.f8760d += this.f8761e;
        int i = this.f8760d;
        if (i <= this.f8764h) {
            this.f8761e = 0;
        } else {
            this.f8761e = i - this.f8764h;
            this.f8760d -= this.f8761e;
        }
    }

    /* JADX INFO: renamed from: n */
    private final byte m10081n() throws bsb {
        if (this.f8762f == this.f8760d) {
            throw bsb.m10158a();
        }
        byte[] bArr = this.f8757a;
        int i = this.f8762f;
        this.f8762f = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: a */
    public final int m10082a() throws bsb {
        if (this.f8762f == this.f8760d) {
            this.f8763g = 0;
            return 0;
        }
        this.f8763g = m10096g();
        if (this.f8763g == 0) {
            throw new bsb("Protocol message contained an invalid tag (zero).");
        }
        return this.f8763g;
    }

    /* JADX INFO: renamed from: a */
    public final void m10083a(int i) throws bsb {
        if (this.f8763g != i) {
            throw new bsb("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10084a(bsc bscVar) throws bsb {
        int iM10096g = m10096g();
        if (this.f8765i >= this.f8766j) {
            throw bsb.m10161d();
        }
        int iM10090c = m10090c(iM10096g);
        this.f8765i++;
        bscVar.mo7776a(this);
        m10083a(0);
        this.f8765i--;
        m10091d(iM10090c);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m10085a(int i, int i2) {
        if (i2 == 0) {
            return bsf.f8823h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f8757a, this.f8758b + i, bArr, 0, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public final long m10086b() {
        return m10097h();
    }

    /* JADX INFO: renamed from: b */
    final void m10087b(int i, int i2) {
        if (i > this.f8762f - this.f8758b) {
            throw new IllegalArgumentException(new StringBuilder(50).append("Position ").append(i).append(" is beyond current ").append(this.f8762f - this.f8758b).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(24).append("Bad position ").append(i).toString());
        }
        this.f8762f = this.f8758b + i;
        this.f8763g = i2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10088b(int i) throws bsb {
        int iM10082a;
        switch (i & 7) {
            case 0:
                m10096g();
                return true;
            case 1:
                m10099j();
                return true;
            case 2:
                m10079f(m10096g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m10098i();
                return true;
            default:
                throw new bsb("Protocol message tag had invalid wire type.");
        }
        do {
            iM10082a = m10082a();
            if (iM10082a != 0) {
            }
            m10083a(((i >>> 3) << 3) | 4);
            return true;
        } while (m10088b(iM10082a));
        m10083a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m10089c() {
        return m10096g();
    }

    /* JADX INFO: renamed from: c */
    public final int m10090c(int i) throws bsb {
        if (i < 0) {
            throw bsb.m10159b();
        }
        int i2 = this.f8762f + i;
        int i3 = this.f8764h;
        if (i2 > i3) {
            throw bsb.m10158a();
        }
        this.f8764h = i2;
        m10080m();
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public final void m10091d(int i) {
        this.f8764h = i;
        m10080m();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10092d() {
        return m10096g() != 0;
    }

    /* JADX INFO: renamed from: e */
    public final String m10093e() throws bsb {
        int iM10096g = m10096g();
        if (iM10096g < 0) {
            throw bsb.m10159b();
        }
        if (iM10096g > this.f8760d - this.f8762f) {
            throw bsb.m10158a();
        }
        String str = new String(this.f8757a, this.f8762f, iM10096g, bsa.f8810a);
        this.f8762f = iM10096g + this.f8762f;
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final void m10094e(int i) {
        m10087b(i, this.f8763g);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m10095f() throws bsb {
        int iM10096g = m10096g();
        if (iM10096g < 0) {
            throw bsb.m10159b();
        }
        if (iM10096g == 0) {
            return bsf.f8823h;
        }
        if (iM10096g > this.f8760d - this.f8762f) {
            throw bsb.m10158a();
        }
        byte[] bArr = new byte[iM10096g];
        System.arraycopy(this.f8757a, this.f8762f, bArr, 0, iM10096g);
        this.f8762f = iM10096g + this.f8762f;
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public final int m10096g() throws bsb {
        byte bM10081n = m10081n();
        if (bM10081n >= 0) {
            return bM10081n;
        }
        int i = bM10081n & 127;
        byte bM10081n2 = m10081n();
        if (bM10081n2 >= 0) {
            return i | (bM10081n2 << 7);
        }
        int i2 = i | ((bM10081n2 & 127) << 7);
        byte bM10081n3 = m10081n();
        if (bM10081n3 >= 0) {
            return i2 | (bM10081n3 << 14);
        }
        int i3 = i2 | ((bM10081n3 & 127) << 14);
        byte bM10081n4 = m10081n();
        if (bM10081n4 >= 0) {
            return i3 | (bM10081n4 << 21);
        }
        int i4 = i3 | ((bM10081n4 & 127) << 21);
        byte bM10081n5 = m10081n();
        int i5 = i4 | (bM10081n5 << 28);
        if (bM10081n5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (m10081n() >= 0) {
                return i5;
            }
        }
        throw bsb.m10160c();
    }

    /* JADX INFO: renamed from: h */
    public final long m10097h() throws bsb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM10081n = m10081n();
            j |= ((long) (bM10081n & 127)) << i;
            if ((bM10081n & 128) == 0) {
                return j;
            }
        }
        throw bsb.m10160c();
    }

    /* JADX INFO: renamed from: i */
    public final int m10098i() throws bsb {
        return (m10081n() & 255) | ((m10081n() & 255) << 8) | ((m10081n() & 255) << 16) | ((m10081n() & 255) << 24);
    }

    /* JADX INFO: renamed from: j */
    public final long m10099j() throws bsb {
        byte bM10081n = m10081n();
        return ((((long) m10081n()) & 255) << 8) | (((long) bM10081n) & 255) | ((((long) m10081n()) & 255) << 16) | ((((long) m10081n()) & 255) << 24) | ((((long) m10081n()) & 255) << 32) | ((((long) m10081n()) & 255) << 40) | ((((long) m10081n()) & 255) << 48) | ((((long) m10081n()) & 255) << 56);
    }

    /* JADX INFO: renamed from: k */
    public final int m10100k() {
        if (this.f8764h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f8764h - this.f8762f;
    }

    /* JADX INFO: renamed from: l */
    public final int m10101l() {
        return this.f8762f - this.f8758b;
    }
}
