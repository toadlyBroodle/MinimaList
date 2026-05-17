package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bcc<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    private Iterator<Map.Entry<T, Void>> f7776a;

    public bcc(Iterator<Map.Entry<T, Void>> it) {
        this.f7776a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7776a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return this.f7776a.next().getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7776a.remove();
    }
}
