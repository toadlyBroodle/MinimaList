package android.arch.p000a.p001a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: android.arch.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0001b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    private c<K, V> f1a;

    /* JADX INFO: renamed from: b */
    private c<K, V> f2b;

    /* JADX INFO: renamed from: c */
    private WeakHashMap<Object<K, V>, Boolean> f3c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    private int f4d = 0;

    /* JADX INFO: renamed from: android.arch.a.a.b$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.p000a.p001a.C0001b.e
        /* JADX INFO: renamed from: a */
        c<K, V> mo7a(c<K, V> cVar) {
            return cVar.f7c;
        }
    }

    /* JADX INFO: renamed from: android.arch.a.a.b$b */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.p000a.p001a.C0001b.e
        /* JADX INFO: renamed from: a */
        c<K, V> mo7a(c<K, V> cVar) {
            return cVar.f8d;
        }
    }

    /* JADX INFO: renamed from: android.arch.a.a.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        final K f5a;

        /* JADX INFO: renamed from: b */
        final V f6b;

        /* JADX INFO: renamed from: c */
        c<K, V> f7c;

        /* JADX INFO: renamed from: d */
        c<K, V> f8d;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5a.equals(cVar.f5a) && this.f6b.equals(cVar.f6b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f5a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f5a + "=" + this.f6b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: android.arch.a.a.b$d */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b */
        private c<K, V> f10b;

        /* JADX INFO: renamed from: c */
        private boolean f11c;

        private d() {
            this.f11c = true;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f11c) {
                this.f11c = false;
                this.f10b = C0001b.this.f1a;
            } else {
                this.f10b = this.f10b != null ? this.f10b.f7c : null;
            }
            return this.f10b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11c ? C0001b.this.f1a != null : (this.f10b == null || this.f10b.f7c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: android.arch.a.a.b$e */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        c<K, V> f12a;

        /* JADX INFO: renamed from: b */
        c<K, V> f13b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f12a = cVar2;
            this.f13b = cVar;
        }

        /* JADX INFO: renamed from: b */
        private c<K, V> m9b() {
            if (this.f13b == this.f12a || this.f12a == null) {
                return null;
            }
            return mo7a(this.f13b);
        }

        /* JADX INFO: renamed from: a */
        abstract c<K, V> mo7a(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f13b;
            this.f13b = m9b();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13b != null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2a() {
        return this.f4d;
    }

    /* JADX INFO: renamed from: b */
    public Iterator<Map.Entry<K, V>> m3b() {
        b bVar = new b(this.f2b, this.f1a);
        this.f3c.put(bVar, false);
        return bVar;
    }

    /* JADX INFO: renamed from: c */
    public C0001b<K, V>.d m4c() {
        C0001b<K, V>.d dVar = new d();
        this.f3c.put(dVar, false);
        return dVar;
    }

    /* JADX INFO: renamed from: d */
    public Map.Entry<K, V> m5d() {
        return this.f1a;
    }

    /* JADX INFO: renamed from: e */
    public Map.Entry<K, V> m6e() {
        return this.f2b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0001b)) {
            return false;
        }
        C0001b c0001b = (C0001b) obj;
        if (m2a() != c0001b.m2a()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0001b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null && next2 != null) {
                return false;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1a, this.f2b);
        this.f3c.put(aVar, false);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
