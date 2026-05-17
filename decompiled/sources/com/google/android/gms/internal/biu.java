package com.google.android.gms.internal;

import java.util.ArrayList;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class biu<T> implements biw<T, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ArrayList f8236a;

    biu(bit bitVar, ArrayList arrayList) {
        this.f8236a = arrayList;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, Object obj, Void r4) {
        this.f8236a.add(obj);
        return null;
    }
}
