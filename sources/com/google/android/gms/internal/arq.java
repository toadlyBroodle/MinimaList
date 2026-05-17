package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class arq implements Iterator<arh<?>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Iterator f7162a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Iterator f7163b;

    arq(aro aroVar, Iterator it, Iterator it2) {
        this.f7162a = it;
        this.f7163b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7162a.hasNext() || this.f7163b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ arh<?> next() {
        return this.f7162a.hasNext() ? (arh) this.f7162a.next() : (arh) this.f7163b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
