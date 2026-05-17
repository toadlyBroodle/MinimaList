package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class cig implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ chz f10124a;

    cig(cif cifVar, chz chzVar) {
        this.f10124a = chzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10124a.f10081c.mo10954c();
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not destroy mediation adapter.", e);
        }
    }
}
