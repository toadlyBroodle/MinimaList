package com.google.android.gms.internal;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class bqo<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    private final int f8663a;

    /* JADX INFO: renamed from: b */
    private List<bqt> f8664b;

    /* JADX INFO: renamed from: c */
    private Map<K, V> f8665c;

    /* JADX INFO: renamed from: d */
    private boolean f8666d;

    /* JADX INFO: renamed from: e */
    private volatile bqv f8667e;

    /* JADX INFO: renamed from: f */
    private Map<K, V> f8668f;

    private bqo(int i) {
        this.f8663a = i;
        this.f8664b = Collections.emptyList();
        this.f8665c = Collections.emptyMap();
        this.f8668f = Collections.emptyMap();
    }

    /* synthetic */ bqo(int i, bqp bqpVar) {
        this(i);
    }

    /* JADX INFO: renamed from: a */
    private final int m9984a(K k) {
        int size = this.f8664b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((Comparable) this.f8664b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            int iCompareTo2 = k.compareTo((Comparable) this.f8664b.get(i3).getKey());
            if (iCompareTo2 < 0) {
                i2 = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i = i3 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: a */
    static <FieldDescriptorType extends box<FieldDescriptorType>> bqo<FieldDescriptorType, Object> m9985a(int i) {
        return new bqp(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final V m9989c(int i) {
        m9991e();
        V v = (V) this.f8664b.remove(i).getValue();
        if (!this.f8665c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m9992f().entrySet().iterator();
            this.f8664b.add(new bqt(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m9991e() {
        if (this.f8666d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: f */
    private final SortedMap<K, V> m9992f() {
        m9991e();
        if (this.f8665c.isEmpty() && !(this.f8665c instanceof TreeMap)) {
            this.f8665c = new TreeMap();
            this.f8668f = ((TreeMap) this.f8665c).descendingMap();
        }
        return (SortedMap) this.f8665c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        m9991e();
        int iM9984a = m9984a(k);
        if (iM9984a >= 0) {
            return (V) this.f8664b.get(iM9984a).setValue(v);
        }
        m9991e();
        if (this.f8664b.isEmpty() && !(this.f8664b instanceof ArrayList)) {
            this.f8664b = new ArrayList(this.f8663a);
        }
        int i = -(iM9984a + 1);
        if (i >= this.f8663a) {
            return m9992f().put(k, v);
        }
        if (this.f8664b.size() == this.f8663a) {
            bqt bqtVarRemove = this.f8664b.remove(this.f8663a - 1);
            m9992f().put((Comparable) bqtVarRemove.getKey(), bqtVarRemove.getValue());
        }
        this.f8664b.add(i, new bqt(this, k, v));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo9994a() {
        if (this.f8666d) {
            return;
        }
        this.f8665c = this.f8665c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8665c);
        this.f8668f = this.f8668f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8668f);
        this.f8666d = true;
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry<K, V> m9995b(int i) {
        return this.f8664b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9996b() {
        return this.f8666d;
    }

    /* JADX INFO: renamed from: c */
    public final int m9997c() {
        return this.f8664b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m9991e();
        if (!this.f8664b.isEmpty()) {
            this.f8664b.clear();
        }
        if (this.f8665c.isEmpty()) {
            return;
        }
        this.f8665c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9984a(comparable) >= 0 || this.f8665c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable<Map.Entry<K, V>> m9998d() {
        return this.f8665c.isEmpty() ? bqq.m9999a() : this.f8665c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f8667e == null) {
            this.f8667e = new bqv(this, null);
        }
        return this.f8667e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqo)) {
            return super.equals(obj);
        }
        bqo bqoVar = (bqo) obj;
        int size = size();
        if (size != bqoVar.size()) {
            return false;
        }
        int iM9997c = m9997c();
        if (iM9997c != bqoVar.m9997c()) {
            return entrySet().equals(bqoVar.entrySet());
        }
        for (int i = 0; i < iM9997c; i++) {
            if (!m9995b(i).equals(bqoVar.m9995b(i))) {
                return false;
            }
        }
        if (iM9997c != size) {
            return this.f8665c.equals(bqoVar.f8665c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9984a = m9984a(comparable);
        return iM9984a >= 0 ? (V) this.f8664b.get(iM9984a).getValue() : this.f8665c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM9997c = m9997c();
        int iHashCode = 0;
        for (int i = 0; i < iM9997c; i++) {
            iHashCode += this.f8664b.get(i).hashCode();
        }
        return this.f8665c.size() > 0 ? this.f8665c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m9991e();
        Comparable comparable = (Comparable) obj;
        int iM9984a = m9984a(comparable);
        if (iM9984a >= 0) {
            return m9989c(iM9984a);
        }
        if (this.f8665c.isEmpty()) {
            return null;
        }
        return this.f8665c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8664b.size() + this.f8665c.size();
    }
}
