package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class arp implements Iterator<arh<?>> {

    /* JADX INFO: renamed from: a */
    private int f7160a = 0;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aro f7161b;

    arp(aro aroVar) {
        this.f7161b = aroVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        for (int i = this.f7160a; i < this.f7161b.f7159b.size(); i++) {
            if (this.f7161b.f7159b.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ arh<?> next() {
        if (this.f7160a >= this.f7161b.f7159b.size()) {
            throw new NoSuchElementException();
        }
        for (int i = this.f7160a; i < this.f7161b.f7159b.size(); i++) {
            if (this.f7161b.f7159b.get(i) != null) {
                this.f7160a = i;
                int i2 = this.f7160a;
                this.f7160a = i2 + 1;
                return new arl(Double.valueOf(i2));
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
