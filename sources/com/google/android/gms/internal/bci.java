package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bci<K, V> extends bcj<K, V> {
    bci(K k, V v) {
        super(k, v, bce.m8896a(), bce.m8896a());
    }

    bci(K k, V v, bcf<K, V> bcfVar, bcf<K, V> bcfVar2) {
        super(k, v, bcfVar, bcfVar2);
    }

    @Override // com.google.android.gms.internal.bcj
    /* JADX INFO: renamed from: a */
    protected final int mo8891a() {
        return bcg.f7779a;
    }

    @Override // com.google.android.gms.internal.bcj
    /* JADX INFO: renamed from: a */
    protected final bcj<K, V> mo8892a(K k, V v, bcf<K, V> bcfVar, bcf<K, V> bcfVar2) {
        if (k == null) {
            k = mo8902e();
        }
        if (v == null) {
            v = mo8903f();
        }
        if (bcfVar == null) {
            bcfVar = mo8904g();
        }
        if (bcfVar2 == null) {
            bcfVar2 = mo8905h();
        }
        return new bci(k, v, bcfVar, bcfVar2);
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: b */
    public final boolean mo8894b() {
        return true;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: c */
    public final int mo8895c() {
        return mo8904g().mo8895c() + 1 + mo8905h().mo8895c();
    }
}
