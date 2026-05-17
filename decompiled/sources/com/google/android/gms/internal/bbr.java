package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bbr implements biw<Void, Integer> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bit f7748a;

    bbr(bbq bbqVar, bit bitVar) {
        this.f7748a = bitVar;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Integer mo8856a(bfa bfaVar, Void r3, Integer num) {
        Integer num2 = num;
        return Integer.valueOf(this.f7748a.m9422e(bfaVar) == null ? num2.intValue() + 1 : num2.intValue());
    }
}
