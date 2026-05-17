package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bft implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bjs f8039a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bhc f8040b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bfs f8041c;

    bft(bfs bfsVar, bjs bjsVar, bhc bhcVar) {
        this.f8041c = bfsVar;
        this.f8039a = bjsVar;
        this.f8040b = bhcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bln blnVarM9240a = this.f8041c.f8038a.f7995d.m9240a(this.f8039a.m9482a());
        if (blnVarM9240a.mo9568b()) {
            return;
        }
        this.f8041c.f8038a.m9182a((List<? extends bjj>) this.f8041c.f8038a.f8006o.m9291a(this.f8039a.m9482a(), blnVarM9240a));
        this.f8040b.mo9302a(null);
    }
}
