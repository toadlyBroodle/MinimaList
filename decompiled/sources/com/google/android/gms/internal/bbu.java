package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bbu<K, V> extends bbw<K, V> {

    /* JADX INFO: renamed from: a */
    private final K[] f7753a;

    /* JADX INFO: renamed from: b */
    private final V[] f7754b;

    /* JADX INFO: renamed from: c */
    private final Comparator<K> f7755c;

    public bbu(Comparator<K> comparator) {
        this.f7753a = (K[]) new Object[0];
        this.f7754b = (V[]) new Object[0];
        this.f7755c = comparator;
    }

    private bbu(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f7753a = kArr;
        this.f7754b = vArr;
        this.f7755c = comparator;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B, C> bbu<A, C> m8858a(List<A> list, Map<B, C> map, bbz<A, B> bbzVar, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(bbzVar.mo8883a(a));
            i++;
        }
        return new bbu<>(comparator, objArr, objArr2);
    }

    /* JADX INFO: renamed from: a */
    private final Iterator<Map.Entry<K, V>> m8859a(int i, boolean z) {
        return new bbv(this, i, z);
    }

    /* JADX INFO: renamed from: a */
    private static <T> T[] m8861a(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T[] m8862a(T[] tArr, int i, T t) {
        T[] tArr2 = (T[]) new Object[tArr.length + 1];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (r0 - i) - 1);
        return tArr2;
    }

    /* JADX INFO: renamed from: b */
    private static <T> T[] m8864b(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    /* JADX INFO: renamed from: e */
    private final int m8865e(K k) {
        int i = 0;
        while (i < this.f7753a.length && this.f7755c.compare(this.f7753a[i], k) < 0) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    private final int m8866f(K k) {
        int i = 0;
        K[] kArr = this.f7753a;
        int length = kArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.f7755c.compare(k, kArr[i2]) == 0) {
                return i;
            }
            i2++;
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final bbw<K, V> mo8867a(K k, V v) {
        int iM8866f = m8866f(k);
        if (iM8866f != -1) {
            if (this.f7753a[iM8866f] == k && this.f7754b[iM8866f] == v) {
                return this;
            }
            return new bbu(this.f7755c, m8864b(this.f7753a, iM8866f, k), m8864b(this.f7754b, iM8866f, v));
        }
        if (this.f7753a.length <= 25) {
            int iM8865e = m8865e(k);
            return new bbu(this.f7755c, m8862a(this.f7753a, iM8865e, k), m8862a(this.f7754b, iM8865e, v));
        }
        HashMap map = new HashMap(this.f7753a.length + 1);
        for (int i = 0; i < this.f7753a.length; i++) {
            map.put(this.f7753a[i], this.f7754b[i]);
        }
        map.put(k, v);
        return bck.m8917a((Map) map, (Comparator) this.f7755c);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final K mo8868a() {
        if (this.f7753a.length > 0) {
            return this.f7753a[0];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final void mo8869a(bch<K, V> bchVar) {
        for (int i = 0; i < this.f7753a.length; i++) {
            bchVar.mo8908a(this.f7753a[i], this.f7754b[i]);
        }
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final boolean mo8870a(K k) {
        return m8866f(k) != -1;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: b */
    public final K mo8871b() {
        if (this.f7753a.length > 0) {
            return this.f7753a[this.f7753a.length - 1];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: b */
    public final V mo8872b(K k) {
        int iM8866f = m8866f(k);
        if (iM8866f != -1) {
            return this.f7754b[iM8866f];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: c */
    public final int mo8873c() {
        return this.f7753a.length;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: c */
    public final bbw<K, V> mo8874c(K k) {
        int iM8866f = m8866f(k);
        if (iM8866f == -1) {
            return this;
        }
        return new bbu(this.f7755c, m8861a(this.f7753a, iM8866f), m8861a(this.f7754b, iM8866f));
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: d */
    public final K mo8875d(K k) {
        int iM8866f = m8866f(k);
        if (iM8866f == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iM8866f > 0) {
            return this.f7753a[iM8866f - 1];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: d */
    public final boolean mo8876d() {
        return this.f7753a.length == 0;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: e */
    public final Iterator<Map.Entry<K, V>> mo8877e() {
        return m8859a(this.f7753a.length - 1, true);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: f */
    public final Comparator<K> mo8878f() {
        return this.f7755c;
    }

    @Override // com.google.android.gms.internal.bbw, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return m8859a(0, false);
    }
}
