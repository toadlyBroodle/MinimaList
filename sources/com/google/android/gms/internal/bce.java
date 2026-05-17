package com.google.android.gms.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class bce<K, V> implements bcf<K, V> {

    /* JADX INFO: renamed from: a */
    private static final bce f7778a = new bce();

    private bce() {
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> bce<K, V> m8896a() {
        return f7778a;
    }

    /* JADX WARN: Incorrect types in method signature: (TK;TV;Ljava/lang/Integer;Lcom/google/android/gms/internal/bcf<TK;TV;>;Lcom/google/android/gms/internal/bcf<TK;TV;>;)Lcom/google/android/gms/internal/bcf<TK;TV;>; */
    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final bcf mo8897a(Object obj, Object obj2, int i, bcf bcfVar, bcf bcfVar2) {
        return this;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final bcf<K, V> mo8898a(K k, V v, Comparator<K> comparator) {
        return new bci(k, v);
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final bcf<K, V> mo8899a(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: a */
    public final void mo8900a(bch<K, V> bchVar) {
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: b */
    public final boolean mo8894b() {
        return false;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: c */
    public final int mo8895c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: d */
    public final boolean mo8901d() {
        return true;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: e */
    public final K mo8902e() {
        return null;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: f */
    public final V mo8903f() {
        return null;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: g */
    public final bcf<K, V> mo8904g() {
        return this;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: h */
    public final bcf<K, V> mo8905h() {
        return this;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: i */
    public final bcf<K, V> mo8906i() {
        return this;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: j */
    public final bcf<K, V> mo8907j() {
        return this;
    }
}
