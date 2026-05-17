package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g */
/* JADX INFO: loaded from: classes.dex */
final class C1172g implements AbstractC1080g.a {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BasePendingResult f5770a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1171f f5771b;

    C1172g(C1171f c1171f, BasePendingResult basePendingResult) {
        this.f5771b = c1171f;
        this.f5770a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC1080g.a
    /* JADX INFO: renamed from: a */
    public final void mo6699a(Status status) {
        this.f5771b.f5768a.remove(this.f5770a);
    }
}
