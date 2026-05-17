package com.google.android.gms.common.api.internal;

import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import com.google.android.gms.p051b.InterfaceC0960a;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h */
/* JADX INFO: loaded from: classes.dex */
final class C1173h<TResult> implements InterfaceC0960a<TResult> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0965f f5772a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1171f f5773b;

    C1173h(C1171f c1171f, C0965f c0965f) {
        this.f5773b = c1171f;
        this.f5772a = c0965f;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0960a
    /* JADX INFO: renamed from: a */
    public final void mo4877a(AbstractC0964e<TResult> abstractC0964e) {
        this.f5773b.f5769b.remove(this.f5772a);
    }
}
