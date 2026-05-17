package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bdg implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bdf f7855a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f7856b;

    bdg(bdf bdfVar, boolean z) {
        this.f7855a = bdfVar;
        this.f7856b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7855a.f7849u.m9540a("Trying to fetch auth token", null, new Object[0]);
        bda.m8952a(this.f7855a.f7837i == bdp.Disconnected, "Not in disconnected state: %s", this.f7855a.f7837i);
        this.f7855a.f7837i = bdp.GettingToken;
        bdf.m9000c(this.f7855a);
        this.f7855a.f7847s.mo8939a(this.f7856b, new bdh(this, this.f7855a.f7852x));
    }
}
