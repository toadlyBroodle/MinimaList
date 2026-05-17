package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bg */
/* JADX INFO: loaded from: classes.dex */
public final class C1245bg extends AbstractC1234aw {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1233av f5902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245bg(AbstractC1233av abstractC1233av, int i, Bundle bundle) {
        super(abstractC1233av, i, null);
        this.f5902a = abstractC1233av;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1234aw
    /* JADX INFO: renamed from: a */
    protected final void mo7133a(C1071a c1071a) {
        this.f5902a.f5863b.mo6842a(c1071a);
        this.f5902a.mo7111a(c1071a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1234aw
    /* JADX INFO: renamed from: a */
    protected final boolean mo7135a() {
        this.f5902a.f5863b.mo6842a(C1071a.f5439a);
        return true;
    }
}
