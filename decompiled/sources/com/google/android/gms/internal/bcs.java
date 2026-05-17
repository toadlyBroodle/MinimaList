package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bcs {

    /* JADX INFO: renamed from: a */
    private final List<List<String>> f7802a;

    /* JADX INFO: renamed from: b */
    private final List<String> f7803b;

    public bcs(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f7802a = list;
        this.f7803b = list2;
    }

    /* JADX INFO: renamed from: a */
    public final List<List<String>> m8926a() {
        return Collections.unmodifiableList(this.f7802a);
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m8927b() {
        return Collections.unmodifiableList(this.f7803b);
    }
}
