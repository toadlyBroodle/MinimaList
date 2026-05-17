package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ari implements Iterator<arh<?>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Iterator f7144a;

    ari(arh arhVar, Iterator it) {
        this.f7144a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7144a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ arh<?> next() {
        return new art((String) this.f7144a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7144a.remove();
    }
}
