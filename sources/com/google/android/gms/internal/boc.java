package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class boc implements Iterator {

    /* JADX INFO: renamed from: a */
    private int f8515a = 0;

    /* JADX INFO: renamed from: b */
    private final int f8516b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bob f8517c;

    boc(bob bobVar) {
        this.f8517c = bobVar;
        this.f8516b = this.f8517c.mo9764a();
    }

    /* JADX INFO: renamed from: a */
    private final byte m9773a() {
        try {
            bob bobVar = this.f8517c;
            int i = this.f8515a;
            this.f8515a = i + 1;
            return bobVar.mo9763a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8515a < this.f8516b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(m9773a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
