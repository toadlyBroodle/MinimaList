package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class bqu<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    private int f8674a;

    /* JADX INFO: renamed from: b */
    private boolean f8675b;

    /* JADX INFO: renamed from: c */
    private Iterator<Map.Entry<K, V>> f8676c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bqo f8677d;

    private bqu(bqo bqoVar) {
        this.f8677d = bqoVar;
        this.f8674a = -1;
    }

    /* synthetic */ bqu(bqo bqoVar, bqp bqpVar) {
        this(bqoVar);
    }

    /* JADX INFO: renamed from: a */
    private final Iterator<Map.Entry<K, V>> m10002a() {
        if (this.f8676c == null) {
            this.f8676c = this.f8677d.f8665c.entrySet().iterator();
        }
        return this.f8676c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8674a + 1 < this.f8677d.f8664b.size() || (!this.f8677d.f8665c.isEmpty() && m10002a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f8675b = true;
        int i = this.f8674a + 1;
        this.f8674a = i;
        return i < this.f8677d.f8664b.size() ? (Map.Entry) this.f8677d.f8664b.get(this.f8674a) : m10002a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8675b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f8675b = false;
        this.f8677d.m9991e();
        if (this.f8674a >= this.f8677d.f8664b.size()) {
            m10002a().remove();
            return;
        }
        bqo bqoVar = this.f8677d;
        int i = this.f8674a;
        this.f8674a = i - 1;
        bqoVar.m9989c(i);
    }
}
