package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class bbv<K, V> implements Iterator<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    private int f7756a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f7757b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f7758c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bbu f7759d;

    bbv(bbu bbuVar, int i, boolean z) {
        this.f7759d = bbuVar;
        this.f7757b = i;
        this.f7758c = z;
        this.f7756a = this.f7757b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7758c ? this.f7756a >= 0 : this.f7756a < this.f7759d.f7753a.length;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj = this.f7759d.f7753a[this.f7756a];
        Object obj2 = this.f7759d.f7754b[this.f7756a];
        this.f7756a = this.f7758c ? this.f7756a - 1 : this.f7756a + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
