package com.google.android.gms.cast;

import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1984ve;

/* JADX INFO: renamed from: com.google.android.gms.cast.ac */
/* JADX INFO: loaded from: classes.dex */
final class C0982ac extends C1984ve {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f5180a;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f5181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0982ac(C0991e.b.a aVar, AbstractC1079f abstractC1079f, String str, String str2) {
        super(abstractC1079f);
        this.f5180a = str;
        this.f5181c = str2;
    }

    @Override // com.google.android.gms.internal.C1984ve, com.google.android.gms.common.api.internal.AbstractC1155cp
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6178a(C1074a.c cVar) {
        mo6178a((C1973uu) cVar);
    }

    @Override // com.google.android.gms.internal.C1984ve
    /* JADX INFO: renamed from: a */
    public final void mo6178a(C1973uu c1973uu) {
        try {
            c1973uu.m12407a(this.f5180a, this.f5181c, this);
        } catch (IllegalArgumentException | IllegalStateException e) {
            m12366a(2001);
        }
    }
}
