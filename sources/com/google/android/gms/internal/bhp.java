package com.google.android.gms.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class bhp {

    /* JADX INFO: renamed from: a */
    private final bfa f8176a;

    /* JADX INFO: renamed from: b */
    private final bhm f8177b;

    public bhp(bfa bfaVar, bhm bhmVar) {
        this.f8176a = bfaVar;
        this.f8177b = bhmVar;
    }

    /* JADX INFO: renamed from: a */
    public final bhp m9334a(bkp bkpVar) {
        return new bhp(this.f8176a.m9153a(bkpVar), this.f8177b);
    }

    /* JADX INFO: renamed from: a */
    public final blm m9335a(bln blnVar, blm blmVar, boolean z, ble bleVar) {
        return this.f8177b.m9324a(this.f8176a, blnVar, blmVar, z, bleVar);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9336a(bfa bfaVar) {
        return this.f8177b.m9331b(this.f8176a.m9152a(bfaVar));
    }

    /* JADX INFO: renamed from: a */
    public final bln m9337a(bfa bfaVar, bln blnVar, bln blnVar2) {
        return this.f8177b.m9325a(this.f8176a, bfaVar, blnVar, blnVar2);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9338a(bkp bkpVar, bje bjeVar) {
        return this.f8177b.m9326a(this.f8176a, bkpVar, bjeVar);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9339a(bln blnVar) {
        return this.f8177b.m9328a(this.f8176a, blnVar, Collections.emptyList(), false);
    }

    /* JADX INFO: renamed from: b */
    public final bln m9340b(bln blnVar) {
        return this.f8177b.m9327a(this.f8176a, blnVar);
    }
}
