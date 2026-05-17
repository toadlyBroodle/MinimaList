package com.google.android.gms.cast;

import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.internal.C1973uu;

/* JADX INFO: renamed from: com.google.android.gms.cast.ad */
/* JADX INFO: loaded from: classes.dex */
final class C0983ad extends C0991e.f {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f5182a;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1051g f5183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0983ad(C0991e.b.a aVar, AbstractC1079f abstractC1079f, String str, C1051g c1051g) {
        super(abstractC1079f);
        this.f5182a = str;
        this.f5183c = c1051g;
    }

    @Override // com.google.android.gms.cast.C0991e.f, com.google.android.gms.common.api.internal.AbstractC1155cp
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6178a(C1074a.c cVar) {
        mo6178a((C1973uu) cVar);
    }

    @Override // com.google.android.gms.cast.C0991e.f
    /* JADX INFO: renamed from: a */
    public final void mo6178a(C1973uu c1973uu) {
        try {
            c1973uu.m12404a(this.f5182a, this.f5183c, this);
        } catch (IllegalStateException e) {
            m12366a(2001);
        }
    }
}
