package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bkv implements Iterator<blm> {

    /* JADX INFO: renamed from: a */
    private final Iterator<Map.Entry<bkp, bln>> f8344a;

    public bkv(Iterator<Map.Entry<bkp, bln>> it) {
        this.f8344a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8344a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ blm next() {
        Map.Entry<bkp, bln> next = this.f8344a.next();
        return new blm(next.getKey(), next.getValue());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8344a.remove();
    }
}
