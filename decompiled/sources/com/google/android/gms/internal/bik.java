package com.google.android.gms.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class bik<T> implements biw<Boolean, T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ biw f8216a;

    bik(bih bihVar, biw biwVar) {
        this.f8216a = biwVar;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo8856a(bfa bfaVar, Boolean bool, Object obj) {
        return !bool.booleanValue() ? this.f8216a.mo8856a(bfaVar, null, obj) : obj;
    }
}
