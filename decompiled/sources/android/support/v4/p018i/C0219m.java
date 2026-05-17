package android.support.v4.p018i;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.i.m */
/* JADX INFO: loaded from: classes.dex */
public class C0219m<K, V> {

    /* JADX INFO: renamed from: b */
    static Object[] f1267b;

    /* JADX INFO: renamed from: c */
    static int f1268c;

    /* JADX INFO: renamed from: d */
    static Object[] f1269d;

    /* JADX INFO: renamed from: e */
    static int f1270e;

    /* JADX INFO: renamed from: f */
    int[] f1271f;

    /* JADX INFO: renamed from: g */
    Object[] f1272g;

    /* JADX INFO: renamed from: h */
    int f1273h;

    public C0219m() {
        this.f1271f = C0209c.f1229a;
        this.f1272g = C0209c.f1231c;
        this.f1273h = 0;
    }

    public C0219m(int i) {
        if (i == 0) {
            this.f1271f = C0209c.f1229a;
            this.f1272g = C0209c.f1231c;
        } else {
            m1575e(i);
        }
        this.f1273h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0219m(C0219m<K, V> c0219m) {
        this();
        if (c0219m != 0) {
            m1581a((C0219m) c0219m);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m1573a(int[] iArr, int i, int i2) {
        try {
            return C0209c.m1530a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1574a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0207a.class) {
                if (f1270e < 10) {
                    objArr[0] = f1269d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1269d = objArr;
                    f1270e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0207a.class) {
                if (f1268c < 10) {
                    objArr[0] = f1267b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1267b = objArr;
                    f1268c++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1575e(int i) {
        if (i == 8) {
            synchronized (C0207a.class) {
                if (f1269d != null) {
                    Object[] objArr = f1269d;
                    this.f1272g = objArr;
                    f1269d = (Object[]) objArr[0];
                    this.f1271f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1270e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0207a.class) {
                if (f1267b != null) {
                    Object[] objArr2 = f1267b;
                    this.f1272g = objArr2;
                    f1267b = (Object[]) objArr2[0];
                    this.f1271f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1268c--;
                    return;
                }
            }
        }
        this.f1271f = new int[i];
        this.f1272g = new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    int m1576a() {
        int i = this.f1273h;
        if (i == 0) {
            return -1;
        }
        int iM1573a = m1573a(this.f1271f, i, 0);
        if (iM1573a < 0 || this.f1272g[iM1573a << 1] == null) {
            return iM1573a;
        }
        int i2 = iM1573a + 1;
        while (i2 < i && this.f1271f[i2] == 0) {
            if (this.f1272g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1573a - 1; i3 >= 0 && this.f1271f[i3] == 0; i3--) {
            if (this.f1272g[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    public int m1577a(Object obj) {
        return obj == null ? m1576a() : m1578a(obj, obj.hashCode());
    }

    /* JADX INFO: renamed from: a */
    int m1578a(Object obj, int i) {
        int i2 = this.f1273h;
        if (i2 == 0) {
            return -1;
        }
        int iM1573a = m1573a(this.f1271f, i2, i);
        if (iM1573a < 0 || obj.equals(this.f1272g[iM1573a << 1])) {
            return iM1573a;
        }
        int i3 = iM1573a + 1;
        while (i3 < i2 && this.f1271f[i3] == i) {
            if (obj.equals(this.f1272g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1573a - 1; i4 >= 0 && this.f1271f[i4] == i; i4--) {
            if (obj.equals(this.f1272g[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    public V m1579a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.f1272g[i2];
        this.f1272g[i2] = v;
        return v2;
    }

    /* JADX INFO: renamed from: a */
    public void m1580a(int i) {
        int i2 = this.f1273h;
        if (this.f1271f.length < i) {
            int[] iArr = this.f1271f;
            Object[] objArr = this.f1272g;
            m1575e(i);
            if (this.f1273h > 0) {
                System.arraycopy(iArr, 0, this.f1271f, 0, i2);
                System.arraycopy(objArr, 0, this.f1272g, 0, i2 << 1);
            }
            m1574a(iArr, objArr, i2);
        }
        if (this.f1273h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1581a(C0219m<? extends K, ? extends V> c0219m) {
        int i = c0219m.f1273h;
        m1580a(this.f1273h + i);
        if (this.f1273h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0219m.m1583b(i2), c0219m.m1584c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0219m.f1271f, 0, this.f1271f, 0, i);
            System.arraycopy(c0219m.f1272g, 0, this.f1272g, 0, i << 1);
            this.f1273h = i;
        }
    }

    /* JADX INFO: renamed from: b */
    int m1582b(Object obj) {
        int i = 1;
        int i2 = this.f1273h * 2;
        Object[] objArr = this.f1272g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public K m1583b(int i) {
        return (K) this.f1272g[i << 1];
    }

    /* JADX INFO: renamed from: c */
    public V m1584c(int i) {
        return (V) this.f1272g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f1273h > 0) {
            int[] iArr = this.f1271f;
            Object[] objArr = this.f1272g;
            int i = this.f1273h;
            this.f1271f = C0209c.f1229a;
            this.f1272g = C0209c.f1231c;
            this.f1273h = 0;
            m1574a(iArr, objArr, i);
        }
        if (this.f1273h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1577a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1582b(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public V m1585d(int i) {
        int i2;
        V v = (V) this.f1272g[(i << 1) + 1];
        int i3 = this.f1273h;
        if (i3 <= 1) {
            m1574a(this.f1271f, this.f1272g, i3);
            this.f1271f = C0209c.f1229a;
            this.f1272g = C0209c.f1231c;
            i2 = 0;
        } else {
            int i4 = i3 - 1;
            if (this.f1271f.length <= 8 || this.f1273h >= this.f1271f.length / 3) {
                if (i < i4) {
                    System.arraycopy(this.f1271f, i + 1, this.f1271f, i, i4 - i);
                    System.arraycopy(this.f1272g, (i + 1) << 1, this.f1272g, i << 1, (i4 - i) << 1);
                }
                this.f1272g[i4 << 1] = null;
                this.f1272g[(i4 << 1) + 1] = null;
                i2 = i4;
            } else {
                int i5 = i3 > 8 ? (i3 >> 1) + i3 : 8;
                int[] iArr = this.f1271f;
                Object[] objArr = this.f1272g;
                m1575e(i5);
                if (i3 != this.f1273h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1271f, 0, i);
                    System.arraycopy(objArr, 0, this.f1272g, 0, i << 1);
                }
                if (i < i4) {
                    System.arraycopy(iArr, i + 1, this.f1271f, i, i4 - i);
                    System.arraycopy(objArr, (i + 1) << 1, this.f1272g, i << 1, (i4 - i) << 1);
                }
                i2 = i4;
            }
        }
        if (i3 != this.f1273h) {
            throw new ConcurrentModificationException();
        }
        this.f1273h = i2;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0219m) {
            C0219m c0219m = (C0219m) obj;
            if (size() != c0219m.size()) {
                return false;
            }
            for (int i = 0; i < this.f1273h; i++) {
                try {
                    K kM1583b = m1583b(i);
                    V vM1584c = m1584c(i);
                    Object obj2 = c0219m.get(kM1583b);
                    if (vM1584c == null) {
                        if (obj2 != null || !c0219m.containsKey(kM1583b)) {
                            return false;
                        }
                    } else if (!vM1584c.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                } catch (NullPointerException e2) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1273h; i2++) {
            try {
                K kM1583b2 = m1583b(i2);
                V vM1584c2 = m1584c(i2);
                Object obj3 = map.get(kM1583b2);
                if (vM1584c2 == null) {
                    if (obj3 != null || !map.containsKey(kM1583b2)) {
                        return false;
                    }
                } else if (!vM1584c2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException e3) {
                return false;
            } catch (NullPointerException e4) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        int iM1577a = m1577a(obj);
        if (iM1577a >= 0) {
            return (V) this.f1272g[(iM1577a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f1271f;
        Object[] objArr = this.f1272g;
        int i = this.f1273h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f1273h <= 0;
    }

    public V put(K k, V v) {
        int iHashCode;
        int iM1578a;
        int i = 8;
        int i2 = this.f1273h;
        if (k == null) {
            iM1578a = m1576a();
            iHashCode = 0;
        } else {
            iHashCode = k.hashCode();
            iM1578a = m1578a(k, iHashCode);
        }
        if (iM1578a >= 0) {
            int i3 = (iM1578a << 1) + 1;
            V v2 = (V) this.f1272g[i3];
            this.f1272g[i3] = v;
            return v2;
        }
        int i4 = iM1578a ^ (-1);
        if (i2 >= this.f1271f.length) {
            if (i2 >= 8) {
                i = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i = 4;
            }
            int[] iArr = this.f1271f;
            Object[] objArr = this.f1272g;
            m1575e(i);
            if (i2 != this.f1273h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1271f.length > 0) {
                System.arraycopy(iArr, 0, this.f1271f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1272g, 0, objArr.length);
            }
            m1574a(iArr, objArr, i2);
        }
        if (i4 < i2) {
            System.arraycopy(this.f1271f, i4, this.f1271f, i4 + 1, i2 - i4);
            System.arraycopy(this.f1272g, i4 << 1, this.f1272g, (i4 + 1) << 1, (this.f1273h - i4) << 1);
        }
        if (i2 != this.f1273h || i4 >= this.f1271f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1271f[i4] = iHashCode;
        this.f1272g[i4 << 1] = k;
        this.f1272g[(i4 << 1) + 1] = v;
        this.f1273h++;
        return null;
    }

    public V remove(Object obj) {
        int iM1577a = m1577a(obj);
        if (iM1577a >= 0) {
            return m1585d(iM1577a);
        }
        return null;
    }

    public int size() {
        return this.f1273h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1273h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1273h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM1583b = m1583b(i);
            if (kM1583b != this) {
                sb.append(kM1583b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM1584c = m1584c(i);
            if (vM1584c != this) {
                sb.append(vM1584c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
