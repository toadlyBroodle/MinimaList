package com.google.android.gms.internal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class bbw<K, V> implements Iterable<Map.Entry<K, V>> {
    /* JADX INFO: renamed from: a */
    public abstract bbw<K, V> mo8867a(K k, V v);

    /* JADX INFO: renamed from: a */
    public abstract K mo8868a();

    /* JADX INFO: renamed from: a */
    public abstract void mo8869a(bch<K, V> bchVar);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo8870a(K k);

    /* JADX INFO: renamed from: b */
    public abstract K mo8871b();

    /* JADX INFO: renamed from: b */
    public abstract V mo8872b(K k);

    /* JADX INFO: renamed from: c */
    public abstract int mo8873c();

    /* JADX INFO: renamed from: c */
    public abstract bbw<K, V> mo8874c(K k);

    /* JADX INFO: renamed from: d */
    public abstract K mo8875d(K k);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo8876d();

    /* JADX INFO: renamed from: e */
    public abstract Iterator<Map.Entry<K, V>> mo8877e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbw)) {
            return false;
        }
        bbw bbwVar = (bbw) obj;
        if (mo8878f().equals(bbwVar.mo8878f()) && mo8873c() == bbwVar.mo8873c()) {
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bbwVar.iterator();
            while (it.hasNext()) {
                if (!it.next().equals(it2.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract Comparator<K> mo8878f();

    public int hashCode() {
        int iHashCode = mo8878f().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            iHashCode = it.next().hashCode() + (i * 31);
        }
    }

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        boolean z = true;
        for (Map.Entry<K, V> entry : this) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
