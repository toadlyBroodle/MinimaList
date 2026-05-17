package android.support.v4.p018i;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.i.a */
/* JADX INFO: loaded from: classes.dex */
public class C0207a<K, V> extends C0219m<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a */
    AbstractC0214h<K, V> f1215a;

    public C0207a() {
    }

    public C0207a(int i) {
        super(i);
    }

    public C0207a(C0219m c0219m) {
        super(c0219m);
    }

    /* JADX INFO: renamed from: b */
    private AbstractC0214h<K, V> m1509b() {
        if (this.f1215a == null) {
            this.f1215a = new AbstractC0214h<K, V>() { // from class: android.support.v4.i.a.1
                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected int mo1511a() {
                    return C0207a.this.f1273h;
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected int mo1512a(Object obj) {
                    return C0207a.this.m1577a(obj);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected Object mo1513a(int i, int i2) {
                    return C0207a.this.f1272g[(i << 1) + i2];
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected V mo1514a(int i, V v) {
                    return C0207a.this.m1579a(i, v);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected void mo1515a(int i) {
                    C0207a.this.m1585d(i);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: a */
                protected void mo1516a(K k, V v) {
                    C0207a.this.put(k, v);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: b */
                protected int mo1517b(Object obj) {
                    return C0207a.this.m1582b(obj);
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: b */
                protected Map<K, V> mo1518b() {
                    return C0207a.this;
                }

                @Override // android.support.v4.p018i.AbstractC0214h
                /* JADX INFO: renamed from: c */
                protected void mo1519c() {
                    C0207a.this.clear();
                }
            };
        }
        return this.f1215a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1510a(Collection<?> collection) {
        return AbstractC0214h.m1559c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m1509b().m1562d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m1509b().m1563e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m1580a(this.f1273h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m1509b().m1564f();
    }
}
