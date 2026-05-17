package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class aru implements Iterator<arh<?>> {

    /* JADX INFO: renamed from: a */
    private int f7170a = 0;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ art f7171b;

    aru(art artVar) {
        this.f7171b = artVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7170a < this.f7171b.f7169b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ arh<?> next() {
        if (this.f7170a >= this.f7171b.f7169b.length()) {
            throw new NoSuchElementException();
        }
        int i = this.f7170a;
        this.f7170a = i + 1;
        return new arl(Double.valueOf(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
