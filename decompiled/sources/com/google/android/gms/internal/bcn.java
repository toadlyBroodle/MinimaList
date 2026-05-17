package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class bcn implements Iterable<bcp> {

    /* JADX INFO: renamed from: a */
    private long f7793a;

    /* JADX INFO: renamed from: b */
    private final int f7794b;

    public bcn(int i) {
        int i2 = i + 1;
        this.f7794b = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
        this.f7793a = ((long) i2) & (((long) Math.pow(2.0d, this.f7794b)) - 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<bcp> iterator() {
        return new bco(this);
    }
}
