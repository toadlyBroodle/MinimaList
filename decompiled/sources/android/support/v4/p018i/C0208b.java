package android.support.v4.p018i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0208b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: a */
    static Object[] f1217a;

    /* JADX INFO: renamed from: b */
    static int f1218b;

    /* JADX INFO: renamed from: c */
    static Object[] f1219c;

    /* JADX INFO: renamed from: d */
    static int f1220d;

    /* JADX INFO: renamed from: j */
    private static final int[] f1221j = new int[0];

    /* JADX INFO: renamed from: k */
    private static final Object[] f1222k = new Object[0];

    /* JADX INFO: renamed from: e */
    final boolean f1223e;

    /* JADX INFO: renamed from: f */
    int[] f1224f;

    /* JADX INFO: renamed from: g */
    Object[] f1225g;

    /* JADX INFO: renamed from: h */
    int f1226h;

    /* JADX INFO: renamed from: i */
    AbstractC0214h<E, E> f1227i;

    public C0208b() {
        this(0, false);
    }

    public C0208b(int i) {
        this(i, false);
    }

    public C0208b(int i, boolean z) {
        this.f1223e = z;
        if (i == 0) {
            this.f1224f = f1221j;
            this.f1225g = f1222k;
        } else {
            m1524d(i);
        }
        this.f1226h = 0;
    }

    /* JADX INFO: renamed from: a */
    private int m1520a() {
        int i = this.f1226h;
        if (i == 0) {
            return -1;
        }
        int iM1530a = C0209c.m1530a(this.f1224f, i, 0);
        if (iM1530a < 0 || this.f1225g[iM1530a] == null) {
            return iM1530a;
        }
        int i2 = iM1530a + 1;
        while (i2 < i && this.f1224f[i2] == 0) {
            if (this.f1225g[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1530a - 1; i3 >= 0 && this.f1224f[i3] == 0; i3--) {
            if (this.f1225g[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    private int m1521a(Object obj, int i) {
        int i2 = this.f1226h;
        if (i2 == 0) {
            return -1;
        }
        int iM1530a = C0209c.m1530a(this.f1224f, i2, i);
        if (iM1530a < 0 || obj.equals(this.f1225g[iM1530a])) {
            return iM1530a;
        }
        int i3 = iM1530a + 1;
        while (i3 < i2 && this.f1224f[i3] == i) {
            if (obj.equals(this.f1225g[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1530a - 1; i4 >= 0 && this.f1224f[i4] == i; i4--) {
            if (obj.equals(this.f1225g[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    private static void m1522a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0208b.class) {
                if (f1220d < 10) {
                    objArr[0] = f1219c;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1219c = objArr;
                    f1220d++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0208b.class) {
                if (f1218b < 10) {
                    objArr[0] = f1217a;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1217a = objArr;
                    f1218b++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0214h<E, E> m1523b() {
        if (this.f1227i == null) {
            this.f1227i = new AbstractC0214h<E, E>() { // from class: android.support.v4.i.b.1
                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected int mo1511a() {
                    return C0208b.this.f1226h;
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected int mo1512a(Object obj) {
                    return C0208b.this.m1525a(obj);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected Object mo1513a(int i, int i2) {
                    return C0208b.this.f1225g[i];
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected E mo1514a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected void mo1515a(int i) {
                    C0208b.this.m1528c(i);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected void mo1516a(E e, E e2) {
                    C0208b.this.add(e);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: b */
                protected int mo1517b(Object obj) {
                    return C0208b.this.m1525a(obj);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: b */
                protected Map<E, E> mo1518b() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: c */
                protected void mo1519c() {
                    C0208b.this.clear();
                }
            };
        }
        return this.f1227i;
    }

    /* JADX INFO: renamed from: d */
    private void m1524d(int i) {
        if (i == 8) {
            synchronized (C0208b.class) {
                if (f1219c != null) {
                    Object[] objArr = f1219c;
                    this.f1225g = objArr;
                    f1219c = (Object[]) objArr[0];
                    this.f1224f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1220d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0208b.class) {
                if (f1217a != null) {
                    Object[] objArr2 = f1217a;
                    this.f1225g = objArr2;
                    f1217a = (Object[]) objArr2[0];
                    this.f1224f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1218b--;
                    return;
                }
            }
        }
        this.f1224f = new int[i];
        this.f1225g = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public int m1525a(Object obj) {
        if (obj == null) {
            return m1520a();
        }
        return m1521a(obj, this.f1223e ? System.identityHashCode(obj) : obj.hashCode());
    }

    /* JADX INFO: renamed from: a */
    public void m1526a(int i) {
        if (this.f1224f.length < i) {
            int[] iArr = this.f1224f;
            Object[] objArr = this.f1225g;
            m1524d(i);
            if (this.f1226h > 0) {
                System.arraycopy(iArr, 0, this.f1224f, 0, this.f1226h);
                System.arraycopy(objArr, 0, this.f1225g, 0, this.f1226h);
            }
            m1522a(iArr, objArr, this.f1226h);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iM1521a;
        if (e == null) {
            iM1521a = m1520a();
            i = 0;
        } else {
            int iIdentityHashCode = this.f1223e ? System.identityHashCode(e) : e.hashCode();
            i = iIdentityHashCode;
            iM1521a = m1521a(e, iIdentityHashCode);
        }
        if (iM1521a >= 0) {
            return false;
        }
        int i2 = iM1521a ^ (-1);
        if (this.f1226h >= this.f1224f.length) {
            int i3 = this.f1226h >= 8 ? this.f1226h + (this.f1226h >> 1) : this.f1226h >= 4 ? 8 : 4;
            int[] iArr = this.f1224f;
            Object[] objArr = this.f1225g;
            m1524d(i3);
            if (this.f1224f.length > 0) {
                System.arraycopy(iArr, 0, this.f1224f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1225g, 0, objArr.length);
            }
            m1522a(iArr, objArr, this.f1226h);
        }
        if (i2 < this.f1226h) {
            System.arraycopy(this.f1224f, i2, this.f1224f, i2 + 1, this.f1226h - i2);
            System.arraycopy(this.f1225g, i2, this.f1225g, i2 + 1, this.f1226h - i2);
        }
        this.f1224f[i2] = i;
        this.f1225g[i2] = e;
        this.f1226h++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m1526a(this.f1226h + collection.size());
        boolean zAdd = false;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public E m1527b(int i) {
        return (E) this.f1225g[i];
    }

    /* JADX INFO: renamed from: c */
    public E m1528c(int i) {
        E e = (E) this.f1225g[i];
        if (this.f1226h <= 1) {
            m1522a(this.f1224f, this.f1225g, this.f1226h);
            this.f1224f = f1221j;
            this.f1225g = f1222k;
            this.f1226h = 0;
        } else if (this.f1224f.length <= 8 || this.f1226h >= this.f1224f.length / 3) {
            this.f1226h--;
            if (i < this.f1226h) {
                System.arraycopy(this.f1224f, i + 1, this.f1224f, i, this.f1226h - i);
                System.arraycopy(this.f1225g, i + 1, this.f1225g, i, this.f1226h - i);
            }
            this.f1225g[this.f1226h] = null;
        } else {
            int i2 = this.f1226h > 8 ? this.f1226h + (this.f1226h >> 1) : 8;
            int[] iArr = this.f1224f;
            Object[] objArr = this.f1225g;
            m1524d(i2);
            this.f1226h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1224f, 0, i);
                System.arraycopy(objArr, 0, this.f1225g, 0, i);
            }
            if (i < this.f1226h) {
                System.arraycopy(iArr, i + 1, this.f1224f, i, this.f1226h - i);
                System.arraycopy(objArr, i + 1, this.f1225g, i, this.f1226h - i);
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (this.f1226h != 0) {
            m1522a(this.f1224f, this.f1225g, this.f1226h);
            this.f1224f = f1221j;
            this.f1225g = f1222k;
            this.f1226h = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m1525a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i = 0; i < this.f1226h; i++) {
            try {
                if (!set.contains(m1527b(i))) {
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

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1224f;
        int i = this.f1226h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1226h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m1523b().m1563e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iM1525a = m1525a(obj);
        if (iM1525a < 0) {
            return false;
        }
        m1528c(iM1525a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean zRemove = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1226h - 1; i >= 0; i--) {
            if (!collection.contains(this.f1225g[i])) {
                m1528c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1226h;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[this.f1226h];
        System.arraycopy(this.f1225g, 0, objArr, 0, this.f1226h);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        Object[] objArr = tArr.length < this.f1226h ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1226h)) : tArr;
        System.arraycopy(this.f1225g, 0, objArr, 0, this.f1226h);
        if (objArr.length > this.f1226h) {
            objArr[this.f1226h] = null;
        }
        return (T[]) objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1226h * 14);
        sb.append('{');
        for (int i = 0; i < this.f1226h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eM1527b = m1527b(i);
            if (eM1527b != this) {
                sb.append(eM1527b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
