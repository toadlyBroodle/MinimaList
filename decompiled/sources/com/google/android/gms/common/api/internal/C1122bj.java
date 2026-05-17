package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bj */
/* JADX INFO: loaded from: classes.dex */
public final class C1122bj {

    /* JADX INFO: renamed from: a */
    private final Set<C1120bh<?>> f5658a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public final void m6889a() {
        Iterator<C1120bh<?>> it = this.f5658a.iterator();
        while (it.hasNext()) {
            it.next().m6888a();
        }
        this.f5658a.clear();
    }
}
