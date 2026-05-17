package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C1973uu;
import com.google.android.gms.internal.C1984ve;

/* JADX INFO: renamed from: com.google.android.gms.cast.af */
/* JADX INFO: loaded from: classes.dex */
final class C0985af extends C1984ve {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f5187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0985af(C0991e.b.a aVar, AbstractC1079f abstractC1079f, String str) {
        super(abstractC1079f);
        this.f5187a = str;
    }

    @Override // com.google.android.gms.internal.C1984ve, com.google.android.gms.common.api.internal.AbstractC1155cp
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6178a(C1074a.c cVar) {
        mo6178a((C1973uu) cVar);
    }

    @Override // com.google.android.gms.internal.C1984ve
    /* JADX INFO: renamed from: a */
    public final void mo6178a(C1973uu c1973uu) {
        if (TextUtils.isEmpty(this.f5187a)) {
            m6708a(mo6177a(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null)));
            return;
        }
        try {
            c1973uu.m12405a(this.f5187a, this);
        } catch (IllegalStateException e) {
            m12366a(2001);
        }
    }
}
