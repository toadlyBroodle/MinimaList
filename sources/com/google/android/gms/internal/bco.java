package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class bco implements Iterator<bcp> {

    /* JADX INFO: renamed from: a */
    private int f7795a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bcn f7796b;

    bco(bcn bcnVar) {
        this.f7796b = bcnVar;
        this.f7795a = this.f7796b.f7794b - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7795a >= 0;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ bcp next() {
        long j = this.f7796b.f7793a & ((long) (1 << this.f7795a));
        bcp bcpVar = new bcp();
        bcpVar.f7797a = j == 0;
        bcpVar.f7798b = (int) Math.pow(2.0d, this.f7795a);
        this.f7795a--;
        return bcpVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
