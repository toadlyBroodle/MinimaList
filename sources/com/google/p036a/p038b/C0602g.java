package com.google.p036a.p038b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.google.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0602g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ boolean f4176f;

    /* JADX INFO: renamed from: g */
    private static final Comparator<Comparable> f4177g;

    /* JADX INFO: renamed from: a */
    Comparator<? super K> f4178a;

    /* JADX INFO: renamed from: b */
    d<K, V> f4179b;

    /* JADX INFO: renamed from: c */
    int f4180c;

    /* JADX INFO: renamed from: d */
    int f4181d;

    /* JADX INFO: renamed from: e */
    final d<K, V> f4182e;

    /* JADX INFO: renamed from: h */
    private C0602g<K, V>.a f4183h;

    /* JADX INFO: renamed from: i */
    private C0602g<K, V>.b f4184i;

    /* JADX INFO: renamed from: com.google.a.b.g$a */
    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0602g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C0602g.this.m5180a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0602g<K, V>.c<Map.Entry<K, V>>() { // from class: com.google.a.b.g.a.1
                {
                    C0602g c0602g = C0602g.this;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> next() {
                    return m5185b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            d<K, V> dVarM5180a;
            if (!(obj instanceof Map.Entry) || (dVarM5180a = C0602g.this.m5180a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            C0602g.this.m5181a((d) dVarM5180a, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0602g.this.f4180c;
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.g$b */
    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0602g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0602g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C0602g<K, V>.c<K>() { // from class: com.google.a.b.g.b.1
                {
                    C0602g c0602g = C0602g.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m5185b().f4198f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C0602g.this.m5182b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0602g.this.f4180c;
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.g$c */
    private abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        d<K, V> f4189b;

        /* JADX INFO: renamed from: c */
        d<K, V> f4190c = null;

        /* JADX INFO: renamed from: d */
        int f4191d;

        c() {
            this.f4189b = C0602g.this.f4182e.f4196d;
            this.f4191d = C0602g.this.f4181d;
        }

        /* JADX INFO: renamed from: b */
        final d<K, V> m5185b() {
            d<K, V> dVar = this.f4189b;
            if (dVar == C0602g.this.f4182e) {
                throw new NoSuchElementException();
            }
            if (C0602g.this.f4181d != this.f4191d) {
                throw new ConcurrentModificationException();
            }
            this.f4189b = dVar.f4196d;
            this.f4190c = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4189b != C0602g.this.f4182e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f4190c == null) {
                throw new IllegalStateException();
            }
            C0602g.this.m5181a((d) this.f4190c, true);
            this.f4190c = null;
            this.f4191d = C0602g.this.f4181d;
        }
    }

    /* JADX INFO: renamed from: com.google.a.b.g$d */
    static final class d<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        d<K, V> f4193a;

        /* JADX INFO: renamed from: b */
        d<K, V> f4194b;

        /* JADX INFO: renamed from: c */
        d<K, V> f4195c;

        /* JADX INFO: renamed from: d */
        d<K, V> f4196d;

        /* JADX INFO: renamed from: e */
        d<K, V> f4197e;

        /* JADX INFO: renamed from: f */
        final K f4198f;

        /* JADX INFO: renamed from: g */
        V f4199g;

        /* JADX INFO: renamed from: h */
        int f4200h;

        d() {
            this.f4198f = null;
            this.f4197e = this;
            this.f4196d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.f4193a = dVar;
            this.f4198f = k;
            this.f4200h = 1;
            this.f4196d = dVar2;
            this.f4197e = dVar3;
            dVar3.f4196d = this;
            dVar2.f4197e = this;
        }

        /* JADX INFO: renamed from: a */
        public d<K, V> m5186a() {
            for (d<K, V> dVar = this.f4194b; dVar != null; dVar = dVar.f4194b) {
                this = dVar;
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public d<K, V> m5187b() {
            for (d<K, V> dVar = this.f4195c; dVar != null; dVar = dVar.f4195c) {
                this = dVar;
            }
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.f4198f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f4198f.equals(entry.getKey())) {
                return false;
            }
            if (this.f4199g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.f4199g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4198f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4199g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (this.f4198f == null ? 0 : this.f4198f.hashCode()) ^ (this.f4199g != null ? this.f4199g.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f4199g;
            this.f4199g = v;
            return v2;
        }

        public String toString() {
            return this.f4198f + "=" + this.f4199g;
        }
    }

    static {
        f4176f = !C0602g.class.desiredAssertionStatus();
        f4177g = new Comparator<Comparable>() { // from class: com.google.a.b.g.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Comparable comparable, Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }
        };
    }

    public C0602g() {
        this(f4177g);
    }

    public C0602g(Comparator<? super K> comparator) {
        this.f4180c = 0;
        this.f4181d = 0;
        this.f4182e = new d<>();
        this.f4178a = comparator == null ? f4177g : comparator;
    }

    /* JADX INFO: renamed from: a */
    private void m5173a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f4194b;
        d<K, V> dVar3 = dVar.f4195c;
        d<K, V> dVar4 = dVar3.f4194b;
        d<K, V> dVar5 = dVar3.f4195c;
        dVar.f4195c = dVar4;
        if (dVar4 != null) {
            dVar4.f4193a = dVar;
        }
        m5174a((d) dVar, (d) dVar3);
        dVar3.f4194b = dVar;
        dVar.f4193a = dVar3;
        dVar.f4200h = Math.max(dVar2 != null ? dVar2.f4200h : 0, dVar4 != null ? dVar4.f4200h : 0) + 1;
        dVar3.f4200h = Math.max(dVar.f4200h, dVar5 != null ? dVar5.f4200h : 0) + 1;
    }

    /* JADX INFO: renamed from: a */
    private void m5174a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f4193a;
        dVar.f4193a = null;
        if (dVar2 != null) {
            dVar2.f4193a = dVar3;
        }
        if (dVar3 == null) {
            this.f4179b = dVar2;
            return;
        }
        if (dVar3.f4194b == dVar) {
            dVar3.f4194b = dVar2;
        } else {
            if (!f4176f && dVar3.f4195c != dVar) {
                throw new AssertionError();
            }
            dVar3.f4195c = dVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m5175a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: b */
    private void m5176b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f4194b;
        d<K, V> dVar3 = dVar.f4195c;
        d<K, V> dVar4 = dVar2.f4194b;
        d<K, V> dVar5 = dVar2.f4195c;
        dVar.f4194b = dVar5;
        if (dVar5 != null) {
            dVar5.f4193a = dVar;
        }
        m5174a((d) dVar, (d) dVar2);
        dVar2.f4195c = dVar;
        dVar.f4193a = dVar2;
        dVar.f4200h = Math.max(dVar3 != null ? dVar3.f4200h : 0, dVar5 != null ? dVar5.f4200h : 0) + 1;
        dVar2.f4200h = Math.max(dVar.f4200h, dVar4 != null ? dVar4.f4200h : 0) + 1;
    }

    /* JADX INFO: renamed from: b */
    private void m5177b(d<K, V> dVar, boolean z) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f4194b;
            d<K, V> dVar3 = dVar.f4195c;
            int i = dVar2 != null ? dVar2.f4200h : 0;
            int i2 = dVar3 != null ? dVar3.f4200h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                d<K, V> dVar4 = dVar3.f4194b;
                d<K, V> dVar5 = dVar3.f4195c;
                int i4 = (dVar4 != null ? dVar4.f4200h : 0) - (dVar5 != null ? dVar5.f4200h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m5173a((d) dVar);
                } else {
                    if (!f4176f && i4 != 1) {
                        throw new AssertionError();
                    }
                    m5176b((d) dVar3);
                    m5173a((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                d<K, V> dVar6 = dVar2.f4194b;
                d<K, V> dVar7 = dVar2.f4195c;
                int i5 = (dVar6 != null ? dVar6.f4200h : 0) - (dVar7 != null ? dVar7.f4200h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m5176b((d) dVar);
                } else {
                    if (!f4176f && i5 != -1) {
                        throw new AssertionError();
                    }
                    m5173a((d) dVar2);
                    m5176b((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                dVar.f4200h = i + 1;
                if (z) {
                    return;
                }
            } else {
                if (!f4176f && i3 != -1 && i3 != 1) {
                    throw new AssertionError();
                }
                dVar.f4200h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.f4193a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    d<K, V> m5178a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m5179a(obj, false);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    d<K, V> m5179a(K k, boolean z) {
        d<K, V> dVar;
        int i;
        d<K, V> dVar2;
        Comparator<? super K> comparator = this.f4178a;
        d<K, V> dVar3 = this.f4179b;
        if (dVar3 != null) {
            Comparable comparable = comparator == f4177g ? (Comparable) k : null;
            while (true) {
                int iCompareTo = comparable != null ? comparable.compareTo(dVar3.f4198f) : comparator.compare(k, dVar3.f4198f);
                if (iCompareTo == 0) {
                    return dVar3;
                }
                d<K, V> dVar4 = iCompareTo < 0 ? dVar3.f4194b : dVar3.f4195c;
                if (dVar4 == null) {
                    int i2 = iCompareTo;
                    dVar = dVar3;
                    i = i2;
                    break;
                }
                dVar3 = dVar4;
            }
        } else {
            dVar = dVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar5 = this.f4182e;
        if (dVar != null) {
            dVar2 = new d<>(dVar, k, dVar5, dVar5.f4197e);
            if (i < 0) {
                dVar.f4194b = dVar2;
            } else {
                dVar.f4195c = dVar2;
            }
            m5177b(dVar, true);
        } else {
            if (comparator == f4177g && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            dVar2 = new d<>(dVar, k, dVar5, dVar5.f4197e);
            this.f4179b = dVar2;
        }
        this.f4180c++;
        this.f4181d++;
        return dVar2;
    }

    /* JADX INFO: renamed from: a */
    d<K, V> m5180a(Map.Entry<?, ?> entry) {
        d<K, V> dVarM5178a = m5178a(entry.getKey());
        if (dVarM5178a != null && m5175a(dVarM5178a.f4199g, entry.getValue())) {
            return dVarM5178a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m5181a(d<K, V> dVar, boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            dVar.f4197e.f4196d = dVar.f4196d;
            dVar.f4196d.f4197e = dVar.f4197e;
        }
        d<K, V> dVar2 = dVar.f4194b;
        d<K, V> dVar3 = dVar.f4195c;
        d<K, V> dVar4 = dVar.f4193a;
        if (dVar2 == null || dVar3 == null) {
            if (dVar2 != null) {
                m5174a((d) dVar, (d) dVar2);
                dVar.f4194b = null;
            } else if (dVar3 != null) {
                m5174a((d) dVar, (d) dVar3);
                dVar.f4195c = null;
            } else {
                m5174a((d) dVar, (d) null);
            }
            m5177b(dVar4, false);
            this.f4180c--;
            this.f4181d++;
            return;
        }
        d<K, V> dVarM5187b = dVar2.f4200h > dVar3.f4200h ? dVar2.m5187b() : dVar3.m5186a();
        m5181a((d) dVarM5187b, false);
        d<K, V> dVar5 = dVar.f4194b;
        if (dVar5 != null) {
            i = dVar5.f4200h;
            dVarM5187b.f4194b = dVar5;
            dVar5.f4193a = dVarM5187b;
            dVar.f4194b = null;
        } else {
            i = 0;
        }
        d<K, V> dVar6 = dVar.f4195c;
        if (dVar6 != null) {
            i2 = dVar6.f4200h;
            dVarM5187b.f4195c = dVar6;
            dVar6.f4193a = dVarM5187b;
            dVar.f4195c = null;
        }
        dVarM5187b.f4200h = Math.max(i, i2) + 1;
        m5174a((d) dVar, (d) dVarM5187b);
    }

    /* JADX INFO: renamed from: b */
    d<K, V> m5182b(Object obj) {
        d<K, V> dVarM5178a = m5178a(obj);
        if (dVarM5178a != null) {
            m5181a((d) dVarM5178a, true);
        }
        return dVarM5178a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f4179b = null;
        this.f4180c = 0;
        this.f4181d++;
        d<K, V> dVar = this.f4182e;
        dVar.f4197e = dVar;
        dVar.f4196d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m5178a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C0602g<K, V>.a aVar = this.f4183h;
        if (aVar != null) {
            return aVar;
        }
        C0602g<K, V>.a aVar2 = new a();
        this.f4183h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        d<K, V> dVarM5178a = m5178a(obj);
        if (dVarM5178a != null) {
            return dVarM5178a.f4199g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C0602g<K, V>.b bVar = this.f4184i;
        if (bVar != null) {
            return bVar;
        }
        C0602g<K, V>.b bVar2 = new b();
        this.f4184i = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> dVarM5179a = m5179a((Object) k, true);
        V v2 = dVarM5179a.f4199g;
        dVarM5179a.f4199g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        d<K, V> dVarM5182b = m5182b(obj);
        if (dVarM5182b != null) {
            return dVarM5182b.f4199g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4180c;
    }
}
