package com.google.android.gms.internal;

import com.google.android.gms.internal.boz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class brc {

    /* JADX INFO: renamed from: a */
    private static final brc f8692a = new brc(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b */
    private int f8693b;

    /* JADX INFO: renamed from: c */
    private int[] f8694c;

    /* JADX INFO: renamed from: d */
    private Object[] f8695d;

    /* JADX INFO: renamed from: e */
    private int f8696e;

    /* JADX INFO: renamed from: f */
    private boolean f8697f;

    private brc() {
        this(0, new int[8], new Object[8], true);
    }

    private brc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8696e = -1;
        this.f8693b = i;
        this.f8694c = iArr;
        this.f8695d = objArr;
        this.f8697f = z;
    }

    /* JADX INFO: renamed from: a */
    public static brc m10023a() {
        return f8692a;
    }

    /* JADX INFO: renamed from: a */
    static brc m10024a(brc brcVar, brc brcVar2) {
        int i = brcVar.f8693b + brcVar2.f8693b;
        int[] iArrCopyOf = Arrays.copyOf(brcVar.f8694c, i);
        System.arraycopy(brcVar2.f8694c, 0, iArrCopyOf, brcVar.f8693b, brcVar2.f8693b);
        Object[] objArrCopyOf = Arrays.copyOf(brcVar.f8695d, i);
        System.arraycopy(brcVar2.f8695d, 0, objArrCopyOf, brcVar.f8693b, brcVar2.f8693b);
        return new brc(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    private void m10025a(int i, Object obj) {
        m10027f();
        if (this.f8693b == this.f8694c.length) {
            int i2 = (this.f8693b < 4 ? 8 : this.f8693b >> 1) + this.f8693b;
            this.f8694c = Arrays.copyOf(this.f8694c, i2);
            this.f8695d = Arrays.copyOf(this.f8695d, i2);
        }
        this.f8694c[this.f8693b] = i;
        this.f8695d[this.f8693b] = obj;
        this.f8693b++;
    }

    /* JADX INFO: renamed from: b */
    static brc m10026b() {
        return new brc();
    }

    /* JADX INFO: renamed from: f */
    private final void m10027f() {
        if (!this.f8697f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10028a(bon bonVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f8693b) {
                return;
            }
            int i3 = this.f8694c[i2];
            int i4 = i3 >>> 3;
            switch (i3 & 7) {
                case 0:
                    bonVar.mo9847a(i4, ((Long) this.f8695d[i2]).longValue());
                    break;
                case 1:
                    bonVar.mo9860b(i4, ((Long) this.f8695d[i2]).longValue());
                    break;
                case 2:
                    bonVar.mo9848a(i4, (bob) this.f8695d[i2]);
                    break;
                case 3:
                    bonVar.mo9846a(i4, 3);
                    ((brc) this.f8695d[i2]).m10028a(bonVar);
                    bonVar.mo9846a(i4, 4);
                    break;
                case 4:
                default:
                    throw bpf.m9940f();
                case 5:
                    bonVar.mo9867d(i4, ((Integer) this.f8695d[i2]).intValue());
                    break;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10029a(brs brsVar) {
        if (brsVar.mo9869a() == boz.C1447g.f8582l) {
            for (int i = this.f8693b - 1; i >= 0; i--) {
                brsVar.mo9870a(this.f8694c[i] >>> 3, this.f8695d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f8693b; i2++) {
            brsVar.mo9870a(this.f8694c[i2] >>> 3, this.f8695d[i2]);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10030a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f8693b; i2++) {
            bqd.m9967a(sb, i, String.valueOf(this.f8694c[i2] >>> 3), this.f8695d[i2]);
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m10031a(int i, bok bokVar) throws bpg {
        int iMo9781a;
        m10027f();
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                m10025a(i, Long.valueOf(bokVar.mo9785b()));
                return true;
            case 1:
                m10025a(i, Long.valueOf(bokVar.mo9786c()));
                return true;
            case 2:
                m10025a(i, bokVar.mo9791g());
                return true;
            case 3:
                brc brcVar = new brc();
                do {
                    iMo9781a = bokVar.mo9781a();
                    if (iMo9781a != 0) {
                    }
                    bokVar.mo9783a((i2 << 3) | 4);
                    m10025a(i, brcVar);
                    return true;
                } while (brcVar.m10031a(iMo9781a, bokVar));
                bokVar.mo9783a((i2 << 3) | 4);
                m10025a(i, brcVar);
                return true;
            case 4:
                return false;
            case 5:
                m10025a(i, Integer.valueOf(bokVar.mo9788d()));
                return true;
            default:
                throw bpf.m9940f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10032c() {
        this.f8697f = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m10033d() {
        int iM9825d = this.f8696e;
        if (iM9825d == -1) {
            iM9825d = 0;
            for (int i = 0; i < this.f8693b; i++) {
                iM9825d += bon.m9825d(this.f8694c[i] >>> 3, (bob) this.f8695d[i]);
            }
            this.f8696e = iM9825d;
        }
        return iM9825d;
    }

    /* JADX INFO: renamed from: e */
    public final int m10034e() {
        int iM10034e;
        int i = this.f8696e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.f8693b; i2++) {
                int i3 = this.f8694c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        iM10034e = bon.m9817c(i4, ((Long) this.f8695d[i2]).longValue());
                        break;
                    case 1:
                        iM10034e = bon.m9824d(i4, ((Long) this.f8695d[i2]).longValue());
                        break;
                    case 2:
                        iM10034e = bon.m9818c(i4, (bob) this.f8695d[i2]);
                        break;
                    case 3:
                        iM10034e = ((brc) this.f8695d[i2]).m10034e() + (bon.m9823d(i4) << 1);
                        break;
                    case 4:
                    default:
                        throw new IllegalStateException(bpf.m9940f());
                    case 5:
                        iM10034e = bon.m9832f(i4, ((Integer) this.f8695d[i2]).intValue());
                        break;
                }
                i += iM10034e;
            }
            this.f8696e = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof brc)) {
            brc brcVar = (brc) obj;
            if (this.f8693b == brcVar.f8693b) {
                int[] iArr = this.f8694c;
                int[] iArr2 = brcVar.f8694c;
                int i = this.f8693b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    Object[] objArr = this.f8695d;
                    Object[] objArr2 = brcVar.f8695d;
                    int i3 = this.f8693b;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        }
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8693b + 527) * 31) + Arrays.hashCode(this.f8694c)) * 31) + Arrays.deepHashCode(this.f8695d);
    }
}
