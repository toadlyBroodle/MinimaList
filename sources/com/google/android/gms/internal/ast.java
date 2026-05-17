package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ast<P> {

    /* JADX INFO: renamed from: a */
    private final P f7224a;

    /* JADX INFO: renamed from: b */
    private final byte[] f7225b;

    /* JADX INFO: renamed from: c */
    private final avu f7226c;

    /* JADX INFO: renamed from: d */
    private final awm f7227d;

    public ast(P p, byte[] bArr, avu avuVar, awm awmVar) {
        this.f7224a = p;
        this.f7225b = Arrays.copyOf(bArr, bArr.length);
        this.f7226c = avuVar;
        this.f7227d = awmVar;
    }

    /* JADX INFO: renamed from: a */
    public final P m8285a() {
        return this.f7224a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8286b() {
        if (this.f7225b == null) {
            return null;
        }
        return Arrays.copyOf(this.f7225b, this.f7225b.length);
    }
}
