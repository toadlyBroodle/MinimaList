package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.zn */
/* JADX INFO: loaded from: classes.dex */
final class C2101zn implements Iterator<String> {

    /* JADX INFO: renamed from: a */
    private Iterator<String> f12687a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2100zm f12688b;

    C2101zn(C2100zm c2100zm) {
        this.f12688b = c2100zm;
        this.f12687a = this.f12688b.f12686a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12687a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f12687a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
