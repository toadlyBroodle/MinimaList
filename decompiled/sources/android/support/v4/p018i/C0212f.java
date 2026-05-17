package android.support.v4.p018i;

/* JADX INFO: renamed from: android.support.v4.i.f */
/* JADX INFO: loaded from: classes.dex */
public class C0212f<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private static final Object f1234a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f1235b;

    /* JADX INFO: renamed from: c */
    private long[] f1236c;

    /* JADX INFO: renamed from: d */
    private Object[] f1237d;

    /* JADX INFO: renamed from: e */
    private int f1238e;

    public C0212f() {
        this(10);
    }

    public C0212f(int i) {
        this.f1235b = false;
        if (i == 0) {
            this.f1236c = C0209c.f1230b;
            this.f1237d = C0209c.f1231c;
        } else {
            int iM1533b = C0209c.m1533b(i);
            this.f1236c = new long[iM1533b];
            this.f1237d = new Object[iM1533b];
        }
        this.f1238e = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m1537d() {
        int i = this.f1238e;
        long[] jArr = this.f1236c;
        Object[] objArr = this.f1237d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1234a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1235b = false;
        this.f1238e = i2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0212f<E> clone() {
        try {
            C0212f<E> c0212f = (C0212f) super.clone();
            try {
                c0212f.f1236c = (long[]) this.f1236c.clone();
                c0212f.f1237d = (Object[]) this.f1237d.clone();
                return c0212f;
            } catch (CloneNotSupportedException e) {
                return c0212f;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public E m1539a(long j) {
        return m1540a(j, null);
    }

    /* JADX INFO: renamed from: a */
    public E m1540a(long j, E e) {
        int iM1531a = C0209c.m1531a(this.f1236c, this.f1238e, j);
        return (iM1531a < 0 || this.f1237d[iM1531a] == f1234a) ? e : (E) this.f1237d[iM1531a];
    }

    /* JADX INFO: renamed from: a */
    public void m1541a(int i) {
        if (this.f1237d[i] != f1234a) {
            this.f1237d[i] = f1234a;
            this.f1235b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m1542b() {
        if (this.f1235b) {
            m1537d();
        }
        return this.f1238e;
    }

    /* JADX INFO: renamed from: b */
    public long m1543b(int i) {
        if (this.f1235b) {
            m1537d();
        }
        return this.f1236c[i];
    }

    /* JADX INFO: renamed from: b */
    public void m1544b(long j) {
        int iM1531a = C0209c.m1531a(this.f1236c, this.f1238e, j);
        if (iM1531a < 0 || this.f1237d[iM1531a] == f1234a) {
            return;
        }
        this.f1237d[iM1531a] = f1234a;
        this.f1235b = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1545b(long j, E e) {
        int iM1531a = C0209c.m1531a(this.f1236c, this.f1238e, j);
        if (iM1531a >= 0) {
            this.f1237d[iM1531a] = e;
            return;
        }
        int iM1531a2 = iM1531a ^ (-1);
        if (iM1531a2 < this.f1238e && this.f1237d[iM1531a2] == f1234a) {
            this.f1236c[iM1531a2] = j;
            this.f1237d[iM1531a2] = e;
            return;
        }
        if (this.f1235b && this.f1238e >= this.f1236c.length) {
            m1537d();
            iM1531a2 = C0209c.m1531a(this.f1236c, this.f1238e, j) ^ (-1);
        }
        if (this.f1238e >= this.f1236c.length) {
            int iM1533b = C0209c.m1533b(this.f1238e + 1);
            long[] jArr = new long[iM1533b];
            Object[] objArr = new Object[iM1533b];
            System.arraycopy(this.f1236c, 0, jArr, 0, this.f1236c.length);
            System.arraycopy(this.f1237d, 0, objArr, 0, this.f1237d.length);
            this.f1236c = jArr;
            this.f1237d = objArr;
        }
        if (this.f1238e - iM1531a2 != 0) {
            System.arraycopy(this.f1236c, iM1531a2, this.f1236c, iM1531a2 + 1, this.f1238e - iM1531a2);
            System.arraycopy(this.f1237d, iM1531a2, this.f1237d, iM1531a2 + 1, this.f1238e - iM1531a2);
        }
        this.f1236c[iM1531a2] = j;
        this.f1237d[iM1531a2] = e;
        this.f1238e++;
    }

    /* JADX INFO: renamed from: c */
    public int m1546c(long j) {
        if (this.f1235b) {
            m1537d();
        }
        return C0209c.m1531a(this.f1236c, this.f1238e, j);
    }

    /* JADX INFO: renamed from: c */
    public E m1547c(int i) {
        if (this.f1235b) {
            m1537d();
        }
        return (E) this.f1237d[i];
    }

    /* JADX INFO: renamed from: c */
    public void m1548c() {
        int i = this.f1238e;
        Object[] objArr = this.f1237d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1238e = 0;
        this.f1235b = false;
    }

    public String toString() {
        if (m1542b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1238e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1238e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1543b(i));
            sb.append('=');
            E eM1547c = m1547c(i);
            if (eM1547c != this) {
                sb.append(eM1547c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
