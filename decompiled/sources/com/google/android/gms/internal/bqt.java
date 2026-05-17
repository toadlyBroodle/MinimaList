package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class bqt<K, V> implements Comparable<bqt>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    /* JADX INFO: renamed from: a */
    private final Comparable f8671a;

    /* JADX INFO: renamed from: b */
    private V f8672b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bqo f8673c;

    /* JADX WARN: Multi-variable type inference failed */
    bqt(bqo bqoVar, K k, V v) {
        this.f8673c = bqoVar;
        this.f8671a = k;
        this.f8672b = v;
    }

    bqt(bqo bqoVar, Map.Entry<K, V> entry) {
        this(bqoVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10001a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(bqt bqtVar) {
        return ((Comparable) getKey()).compareTo((Comparable) bqtVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m10001a(this.f8671a, entry.getKey()) && m10001a(this.f8672b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f8671a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f8672b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.f8671a == null ? 0 : this.f8671a.hashCode()) ^ (this.f8672b != null ? this.f8672b.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f8673c.m9991e();
        V v2 = this.f8672b;
        this.f8672b = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8671a);
        String strValueOf2 = String.valueOf(this.f8672b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length()).append(strValueOf).append("=").append(strValueOf2).toString();
    }
}
