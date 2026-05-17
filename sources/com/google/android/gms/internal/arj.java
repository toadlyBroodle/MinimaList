package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class arj implements Iterator<arh<?>> {
    private arj() {
    }

    /* synthetic */ arj(ari ariVar) {
        this();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ arh<?> next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
