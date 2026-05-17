package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.cast.C0992f;
import com.google.android.gms.cast.framework.AbstractC1005g;
import com.google.android.gms.cast.framework.AbstractC1007i;
import com.google.android.gms.cast.framework.C1000b;
import com.google.android.gms.cast.framework.C1001c;

/* JADX INFO: renamed from: com.google.android.gms.internal.tg */
/* JADX INFO: loaded from: classes.dex */
public final class C1932tg extends AbstractC1007i {

    /* JADX INFO: renamed from: a */
    private final C1000b f11542a;

    /* JADX INFO: renamed from: b */
    private final BinderC1942tq f11543b;

    public C1932tg(Context context, C1000b c1000b, BinderC1942tq binderC1942tq) {
        super(context, c1000b.m6355b().isEmpty() ? C0992f.m6328a(c1000b.m6354a()) : C0992f.m6330a(c1000b.m6354a(), c1000b.m6355b()));
        this.f11542a = c1000b;
        this.f11543b = binderC1942tq;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1007i
    /* JADX INFO: renamed from: a */
    public final AbstractC1005g mo6407a(String str) {
        return new C1001c(m6406a(), m6408b(), str, this.f11542a, C0991e.f5206b, new C1933th(), new C1955uc(m6406a(), this.f11542a, this.f11543b));
    }

    @Override // com.google.android.gms.cast.framework.AbstractC1007i
    /* JADX INFO: renamed from: c */
    public final boolean mo6409c() {
        return this.f11542a.m6358e();
    }
}
