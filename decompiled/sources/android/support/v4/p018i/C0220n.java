package android.support.v4.p018i;

/* JADX INFO: renamed from: android.support.v4.i.n */
/* JADX INFO: loaded from: classes.dex */
public class C0220n<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private static final Object f1274a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f1275b;

    /* JADX INFO: renamed from: c */
    private int[] f1276c;

    /* JADX INFO: renamed from: d */
    private Object[] f1277d;

    /* JADX INFO: renamed from: e */
    private int f1278e;

    public C0220n() {
        this(10);
    }

    public C0220n(int i) {
        this.f1275b = false;
        if (i == 0) {
            this.f1276c = C0209c.f1229a;
            this.f1277d = C0209c.f1231c;
        } else {
            int iM1529a = C0209c.m1529a(i);
            this.f1276c = new int[iM1529a];
            this.f1277d = new Object[iM1529a];
        }
        this.f1278e = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m1586d() {
        int i = this.f1278e;
        int[] iArr = this.f1276c;
        Object[] objArr = this.f1277d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1274a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1275b = false;
        this.f1278e = i2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0220n<E> clone() {
        try {
            C0220n<E> c0220n = (C0220n) super.clone();
            try {
                c0220n.f1276c = (int[]) this.f1276c.clone();
                c0220n.f1277d = (Object[]) this.f1277d.clone();
                return c0220n;
            } catch (CloneNotSupportedException e) {
                return c0220n;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public E m1588a(int i) {
        return m1589a(i, null);
    }

    /* JADX INFO: renamed from: a */
    public E m1589a(int i, E e) {
        int iM1530a = C0209c.m1530a(this.f1276c, this.f1278e, i);
        return (iM1530a < 0 || this.f1277d[iM1530a] == f1274a) ? e : (E) this.f1277d[iM1530a];
    }

    /* JADX INFO: renamed from: b */
    public int m1590b() {
        if (this.f1275b) {
            m1586d();
        }
        return this.f1278e;
    }

    /* JADX INFO: renamed from: b */
    public void m1591b(int i) {
        int iM1530a = C0209c.m1530a(this.f1276c, this.f1278e, i);
        if (iM1530a < 0 || this.f1277d[iM1530a] == f1274a) {
            return;
        }
        this.f1277d[iM1530a] = f1274a;
        this.f1275b = true;
    }

    /* JADX INFO: renamed from: b */
    public void m1592b(int i, E e) {
        int iM1530a = C0209c.m1530a(this.f1276c, this.f1278e, i);
        if (iM1530a >= 0) {
            this.f1277d[iM1530a] = e;
            return;
        }
        int iM1530a2 = iM1530a ^ (-1);
        if (iM1530a2 < this.f1278e && this.f1277d[iM1530a2] == f1274a) {
            this.f1276c[iM1530a2] = i;
            this.f1277d[iM1530a2] = e;
            return;
        }
        if (this.f1275b && this.f1278e >= this.f1276c.length) {
            m1586d();
            iM1530a2 = C0209c.m1530a(this.f1276c, this.f1278e, i) ^ (-1);
        }
        if (this.f1278e >= this.f1276c.length) {
            int iM1529a = C0209c.m1529a(this.f1278e + 1);
            int[] iArr = new int[iM1529a];
            Object[] objArr = new Object[iM1529a];
            System.arraycopy(this.f1276c, 0, iArr, 0, this.f1276c.length);
            System.arraycopy(this.f1277d, 0, objArr, 0, this.f1277d.length);
            this.f1276c = iArr;
            this.f1277d = objArr;
        }
        if (this.f1278e - iM1530a2 != 0) {
            System.arraycopy(this.f1276c, iM1530a2, this.f1276c, iM1530a2 + 1, this.f1278e - iM1530a2);
            System.arraycopy(this.f1277d, iM1530a2, this.f1277d, iM1530a2 + 1, this.f1278e - iM1530a2);
        }
        this.f1276c[iM1530a2] = i;
        this.f1277d[iM1530a2] = e;
        this.f1278e++;
    }

    /* JADX INFO: renamed from: c */
    public void m1593c() {
        int i = this.f1278e;
        Object[] objArr = this.f1277d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1278e = 0;
        this.f1275b = false;
    }

    /* JADX INFO: renamed from: c */
    public void m1594c(int i) {
        m1591b(i);
    }

    /* JADX INFO: renamed from: c */
    public void m1595c(int i, E e) {
        if (this.f1278e != 0 && i <= this.f1276c[this.f1278e - 1]) {
            m1592b(i, e);
            return;
        }
        if (this.f1275b && this.f1278e >= this.f1276c.length) {
            m1586d();
        }
        int i2 = this.f1278e;
        if (i2 >= this.f1276c.length) {
            int iM1529a = C0209c.m1529a(i2 + 1);
            int[] iArr = new int[iM1529a];
            Object[] objArr = new Object[iM1529a];
            System.arraycopy(this.f1276c, 0, iArr, 0, this.f1276c.length);
            System.arraycopy(this.f1277d, 0, objArr, 0, this.f1277d.length);
            this.f1276c = iArr;
            this.f1277d = objArr;
        }
        this.f1276c[i2] = i;
        this.f1277d[i2] = e;
        this.f1278e = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public int m1596d(int i) {
        if (this.f1275b) {
            m1586d();
        }
        return this.f1276c[i];
    }

    /* JADX INFO: renamed from: e */
    public E m1597e(int i) {
        if (this.f1275b) {
            m1586d();
        }
        return (E) this.f1277d[i];
    }

    /* JADX INFO: renamed from: f */
    public int m1598f(int i) {
        if (this.f1275b) {
            m1586d();
        }
        return C0209c.m1530a(this.f1276c, this.f1278e, i);
    }

    public String toString() {
        if (m1590b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1278e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1278e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1596d(i));
            sb.append('=');
            E eM1597e = m1597e(i);
            if (eM1597e != this) {
                sb.append(eM1597e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
