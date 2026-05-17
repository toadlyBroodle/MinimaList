package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bck<K, V> extends bbw<K, V> {

    /* JADX INFO: renamed from: a */
    private bcf<K, V> f7786a;

    /* JADX INFO: renamed from: b */
    private Comparator<K> f7787b;

    private bck(bcf<K, V> bcfVar, Comparator<K> comparator) {
        this.f7786a = bcfVar;
        this.f7787b = comparator;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> bck<A, B> m8917a(Map<A, B> map, Comparator<A> comparator) {
        return bcm.m8920a(new ArrayList(map.keySet()), map, bbx.m8882a(), comparator);
    }

    /* JADX INFO: renamed from: e */
    private final bcf<K, V> m8918e(K k) {
        bcf<K, V> bcfVarMo8904g = this.f7786a;
        while (!bcfVarMo8904g.mo8901d()) {
            int iCompare = this.f7787b.compare(k, bcfVarMo8904g.mo8902e());
            if (iCompare < 0) {
                bcfVarMo8904g = bcfVarMo8904g.mo8904g();
            } else {
                if (iCompare == 0) {
                    return bcfVarMo8904g;
                }
                bcfVarMo8904g = bcfVarMo8904g.mo8905h();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final bbw<K, V> mo8867a(K k, V v) {
        return new bck(this.f7786a.mo8898a(k, v, this.f7787b).mo8897a(null, null, bcg.f7780b, null, null), this.f7787b);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final K mo8868a() {
        return this.f7786a.mo8906i().mo8902e();
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final void mo8869a(bch<K, V> bchVar) {
        this.f7786a.mo8900a(bchVar);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: a */
    public final boolean mo8870a(K k) {
        return m8918e(k) != null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: b */
    public final K mo8871b() {
        return this.f7786a.mo8907j().mo8902e();
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: b */
    public final V mo8872b(K k) {
        bcf<K, V> bcfVarM8918e = m8918e(k);
        if (bcfVarM8918e != null) {
            return bcfVarM8918e.mo8903f();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: c */
    public final int mo8873c() {
        return this.f7786a.mo8895c();
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: c */
    public final bbw<K, V> mo8874c(K k) {
        return !mo8870a(k) ? this : new bck(this.f7786a.mo8899a(k, this.f7787b).mo8897a(null, null, bcg.f7780b, null, null), this.f7787b);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: d */
    public final K mo8875d(K k) {
        bcf<K, V> bcfVarMo8904g = this.f7786a;
        bcf<K, V> bcfVar = null;
        while (!bcfVarMo8904g.mo8901d()) {
            int iCompare = this.f7787b.compare(k, bcfVarMo8904g.mo8902e());
            if (iCompare == 0) {
                if (bcfVarMo8904g.mo8904g().mo8901d()) {
                    if (bcfVar != null) {
                        return bcfVar.mo8902e();
                    }
                    return null;
                }
                bcf<K, V> bcfVarMo8904g2 = bcfVarMo8904g.mo8904g();
                while (!bcfVarMo8904g2.mo8905h().mo8901d()) {
                    bcfVarMo8904g2 = bcfVarMo8904g2.mo8905h();
                }
                return bcfVarMo8904g2.mo8902e();
            }
            if (iCompare < 0) {
                bcfVarMo8904g = bcfVarMo8904g.mo8904g();
            } else {
                bcf<K, V> bcfVar2 = bcfVarMo8904g;
                bcfVarMo8904g = bcfVarMo8904g.mo8905h();
                bcfVar = bcfVar2;
            }
        }
        String strValueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(strValueOf).toString());
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: d */
    public final boolean mo8876d() {
        return this.f7786a.mo8901d();
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: e */
    public final Iterator<Map.Entry<K, V>> mo8877e() {
        return new bca(this.f7786a, null, this.f7787b, true);
    }

    @Override // com.google.android.gms.internal.bbw
    /* JADX INFO: renamed from: f */
    public final Comparator<K> mo8878f() {
        return this.f7787b;
    }

    @Override // com.google.android.gms.internal.bbw, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new bca(this.f7786a, null, this.f7787b, false);
    }
}
