package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class bfb implements Iterator<bkp> {

    /* JADX INFO: renamed from: a */
    private int f7990a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f7991b;

    bfb(bfa bfaVar) {
        this.f7991b = bfaVar;
        this.f7990a = this.f7991b.f7988b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7990a < this.f7991b.f7989c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bkp next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements.");
        }
        bkp bkpVar = this.f7991b.f7987a[this.f7990a];
        this.f7990a++;
        return bkpVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove component from immutable Path!");
    }
}
