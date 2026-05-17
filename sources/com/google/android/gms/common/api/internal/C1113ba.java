package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1155cp;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C1113ba<A extends AbstractC1155cp<? extends InterfaceC1193k, C1074a.c>> extends AbstractC1085a {

    /* JADX INFO: renamed from: a */
    private A f5646a;

    public C1113ba(int i, A a) {
        super(i);
        this.f5646a = a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6726a(Status status) {
        this.f5646a.m6946b(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6727a(C1100ao<?> c1100ao) throws DeadObjectException {
        this.f5646a.m6947b(c1100ao.m6823b());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1085a
    /* JADX INFO: renamed from: a */
    public final void mo6728a(C1171f c1171f, boolean z) {
        c1171f.m6985a(this.f5646a, z);
    }
}
