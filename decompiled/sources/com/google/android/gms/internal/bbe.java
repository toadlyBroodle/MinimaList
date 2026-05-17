package com.google.android.gms.internal;

import com.google.firebase.C2213b;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bbe implements bel {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f7724a;

    /* JADX INFO: renamed from: b */
    private final C2213b f7725b;

    public bbe(C2213b c2213b, ScheduledExecutorService scheduledExecutorService) {
        this.f7725b = c2213b;
        this.f7724a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.bel
    /* JADX INFO: renamed from: a */
    public final void mo8801a(ben benVar) {
        this.f7725b.m12932a(new bbh(this, benVar));
    }

    @Override // com.google.android.gms.internal.bel
    /* JADX INFO: renamed from: a */
    public final void mo8802a(boolean z, bem bemVar) {
        this.f7725b.m12935b(z).mo6212a(this.f7724a, new bbg(this, bemVar)).mo6211a(this.f7724a, new bbf(this, bemVar));
    }
}
