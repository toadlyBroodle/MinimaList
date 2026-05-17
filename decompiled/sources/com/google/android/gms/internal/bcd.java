package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcd<K, V> extends bcj<K, V> {

    /* JADX INFO: renamed from: a */
    private int f7777a;

    bcd(K k, V v, bcf<K, V> bcfVar, bcf<K, V> bcfVar2) {
        super(k, v, bcfVar, bcfVar2);
        this.f7777a = -1;
    }

    @Override // com.google.android.gms.internal.bcj
    /* JADX INFO: renamed from: a */
    protected final int mo8891a() {
        return bcg.f7780b;
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
        return new bcd(k, v, bcfVar, bcfVar2);
    }

    @Override // com.google.android.gms.internal.bcj
    /* JADX INFO: renamed from: a */
    final void mo8893a(bcf<K, V> bcfVar) {
        if (this.f7777a != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.mo8893a(bcfVar);
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: b */
    public final boolean mo8894b() {
        return false;
    }

    @Override // com.google.android.gms.internal.bcf
    /* JADX INFO: renamed from: c */
    public final int mo8895c() {
        if (this.f7777a == -1) {
            this.f7777a = mo8904g().mo8895c() + 1 + mo8905h().mo8895c();
        }
        return this.f7777a;
    }
}
