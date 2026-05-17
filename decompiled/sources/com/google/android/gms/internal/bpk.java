package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bpk<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a */
    private Iterator<Map.Entry<K, Object>> f8628a;

    public bpk(Iterator<Map.Entry<K, Object>> it) {
        this.f8628a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8628a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f8628a.next();
        return next.getValue() instanceof bph ? new bpj(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8628a.remove();
    }
}
