package android.support.v4.p018i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.i.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0214h<K, V> {

    /* JADX INFO: renamed from: b */
    AbstractC0214h<K, V>.b f1247b;

    /* JADX INFO: renamed from: c */
    AbstractC0214h<K, V>.c f1248c;

    /* JADX INFO: renamed from: d */
    AbstractC0214h<K, V>.e f1249d;

    /* JADX INFO: renamed from: android.support.v4.i.h$a */
    final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        final int f1250a;

        /* JADX INFO: renamed from: b */
        int f1251b;

        /* JADX INFO: renamed from: c */
        int f1252c;

        /* JADX INFO: renamed from: d */
        boolean f1253d = false;

        a(int i) {
            this.f1250a = i;
            this.f1251b = AbstractC0214h.this.mo1511a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1252c < this.f1251b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0214h.this.mo1513a(this.f1252c, this.f1250a);
            this.f1252c++;
            this.f1253d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1253d) {
                throw new IllegalStateException();
            }
            this.f1252c--;
            this.f1251b--;
            this.f1253d = false;
            AbstractC0214h.this.mo1515a(this.f1252c);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.i.h$b */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo1511a = AbstractC0214h.this.mo1511a();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0214h.this.mo1516a(entry.getKey(), entry.getValue());
            }
            return iMo1511a != AbstractC0214h.this.mo1511a();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0214h.this.mo1519c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo1512a = AbstractC0214h.this.mo1512a(entry.getKey());
            if (iMo1512a >= 0) {
                return C0209c.m1532a(AbstractC0214h.this.mo1513a(iMo1512a, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0214h.m1557a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iMo1511a = AbstractC0214h.this.mo1511a() - 1;
            int iHashCode = 0;
            while (iMo1511a >= 0) {
                Object objMo1513a = AbstractC0214h.this.mo1513a(iMo1511a, 0);
                Object objMo1513a2 = AbstractC0214h.this.mo1513a(iMo1511a, 1);
                iMo1511a--;
                iHashCode += (objMo1513a2 == null ? 0 : objMo1513a2.hashCode()) ^ (objMo1513a == null ? 0 : objMo1513a.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0214h.this.mo1511a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0214h.this.mo1511a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.i.h$c */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0214h.this.mo1519c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0214h.this.mo1512a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0214h.m1556a((Map) AbstractC0214h.this.mo1518b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0214h.m1557a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo1511a = AbstractC0214h.this.mo1511a() - 1; iMo1511a >= 0; iMo1511a--) {
                Object objMo1513a = AbstractC0214h.this.mo1513a(iMo1511a, 0);
                iHashCode += objMo1513a == null ? 0 : objMo1513a.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0214h.this.mo1511a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo1512a = AbstractC0214h.this.mo1512a(obj);
            if (iMo1512a < 0) {
                return false;
            }
            AbstractC0214h.this.mo1515a(iMo1512a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0214h.m1558b(AbstractC0214h.this.mo1518b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0214h.m1559c(AbstractC0214h.this.mo1518b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0214h.this.mo1511a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0214h.this.m1561b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0214h.this.m1560a(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.i.h$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        int f1257a;

        /* JADX INFO: renamed from: c */
        boolean f1259c = false;

        /* JADX INFO: renamed from: b */
        int f1258b = -1;

        d() {
            this.f1257a = AbstractC0214h.this.mo1511a() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1258b++;
            this.f1259c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f1259c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0209c.m1532a(entry.getKey(), AbstractC0214h.this.mo1513a(this.f1258b, 0)) && C0209c.m1532a(entry.getValue(), AbstractC0214h.this.mo1513a(this.f1258b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1259c) {
                return (K) AbstractC0214h.this.mo1513a(this.f1258b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1259c) {
                return (V) AbstractC0214h.this.mo1513a(this.f1258b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1258b < this.f1257a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f1259c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo1513a = AbstractC0214h.this.mo1513a(this.f1258b, 0);
            Object objMo1513a2 = AbstractC0214h.this.mo1513a(this.f1258b, 1);
            return (objMo1513a2 != null ? objMo1513a2.hashCode() : 0) ^ (objMo1513a == null ? 0 : objMo1513a.hashCode());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1259c) {
                throw new IllegalStateException();
            }
            AbstractC0214h.this.mo1515a(this.f1258b);
            this.f1258b--;
            this.f1257a--;
            this.f1259c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1259c) {
                return (V) AbstractC0214h.this.mo1514a(this.f1258b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.i.h$e */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0214h.this.mo1519c();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0214h.this.mo1517b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0214h.this.mo1511a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo1517b = AbstractC0214h.this.mo1517b(obj);
            if (iMo1517b < 0) {
                return false;
            }
            AbstractC0214h.this.mo1515a(iMo1517b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int iMo1511a = AbstractC0214h.this.mo1511a();
            boolean z = false;
            while (i < iMo1511a) {
                if (collection.contains(AbstractC0214h.this.mo1513a(i, 1))) {
                    AbstractC0214h.this.mo1515a(i);
                    i--;
                    iMo1511a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int iMo1511a = AbstractC0214h.this.mo1511a();
            boolean z = false;
            while (i < iMo1511a) {
                if (!collection.contains(AbstractC0214h.this.mo1513a(i, 1))) {
                    AbstractC0214h.this.mo1515a(i);
                    i--;
                    iMo1511a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0214h.this.mo1511a();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0214h.this.m1561b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0214h.this.m1560a(tArr, 1);
        }
    }

    AbstractC0214h() {
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> boolean m1556a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> boolean m1557a(Set<T> set, Object obj) {
        boolean z;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                z = set.containsAll(set2);
            }
            return z;
        } catch (ClassCastException e2) {
            return false;
        } catch (NullPointerException e3) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> boolean m1558b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> boolean m1559c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo1511a();

    /* JADX INFO: renamed from: a */
    protected abstract int mo1512a(Object obj);

    /* JADX INFO: renamed from: a */
    protected abstract Object mo1513a(int i, int i2);

    /* JADX INFO: renamed from: a */
    protected abstract V mo1514a(int i, V v);

    /* JADX INFO: renamed from: a */
    protected abstract void mo1515a(int i);

    /* JADX INFO: renamed from: a */
    protected abstract void mo1516a(K k, V v);

    /* JADX INFO: renamed from: a */
    public <T> T[] m1560a(T[] tArr, int i) {
        int iMo1511a = mo1511a();
        Object[] objArr = tArr.length < iMo1511a ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo1511a)) : tArr;
        for (int i2 = 0; i2 < iMo1511a; i2++) {
            objArr[i2] = mo1513a(i2, i);
        }
        if (objArr.length > iMo1511a) {
            objArr[iMo1511a] = null;
        }
        return (T[]) objArr;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo1517b(Object obj);

    /* JADX INFO: renamed from: b */
    protected abstract Map<K, V> mo1518b();

    /* JADX INFO: renamed from: b */
    public Object[] m1561b(int i) {
        int iMo1511a = mo1511a();
        Object[] objArr = new Object[iMo1511a];
        for (int i2 = 0; i2 < iMo1511a; i2++) {
            objArr[i2] = mo1513a(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo1519c();

    /* JADX INFO: renamed from: d */
    public Set<Map.Entry<K, V>> m1562d() {
        if (this.f1247b == null) {
            this.f1247b = new b();
        }
        return this.f1247b;
    }

    /* JADX INFO: renamed from: e */
    public Set<K> m1563e() {
        if (this.f1248c == null) {
            this.f1248c = new c();
        }
        return this.f1248c;
    }

    /* JADX INFO: renamed from: f */
    public Collection<V> m1564f() {
        if (this.f1249d == null) {
            this.f1249d = new e();
        }
        return this.f1249d;
    }
}
