package com.google.android.gms.cast;

import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.internal.C1973uu;

/* JADX INFO: renamed from: com.google.android.gms.cast.ae */
/* JADX INFO: loaded from: classes.dex */
final class C0984ae extends C0991e.f {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f5184a;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f5185c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1058n f5186d = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0984ae(C0991e.b.a aVar, AbstractC1079f abstractC1079f, String str, String str2, C1058n c1058n) {
        super(abstractC1079f);
        this.f5184a = str;
        this.f5185c = str2;
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
            c1973uu.m12406a(this.f5184a, this.f5185c, this.f5186d, this);
        } catch (IllegalStateException e) {
            m12366a(2001);
        }
    }
}
