package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ajn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ajk f6944a;

    ajn(ajk ajkVar) {
        this.f6944a = ajkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6944a.f6932a.isEmpty()) {
            ahs.m7944b("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        Iterator it = this.f6944a.f6932a.values().iterator();
        while (it.hasNext()) {
            ((agl) it.next()).m7874a();
        }
    }
}
