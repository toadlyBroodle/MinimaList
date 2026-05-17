package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class biv<T> implements biw<T, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ List f8237a;

    biv(bit bitVar, List list) {
        this.f8237a = list;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, Object obj, Void r5) {
        this.f8237a.add(new AbstractMap.SimpleImmutableEntry(bfaVar, obj));
        return null;
    }
}
