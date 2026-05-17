package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ajm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aha f6942a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ajk f6943b;

    ajm(ajk ajkVar, aha ahaVar) {
        this.f6943b = ajkVar;
        this.f6942a = ahaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6943b.f6932a.isEmpty()) {
            ahs.m7942a("TagManagerBackend emit called without loaded container.");
            return;
        }
        Iterator it = this.f6943b.f6932a.values().iterator();
        while (it.hasNext()) {
            ((agl) it.next()).m7875a(this.f6942a);
        }
    }
}
