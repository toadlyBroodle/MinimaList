package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aje implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aix f6923a;

    aje(aix aixVar) {
        this.f6923a = aixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6923a.f6890g.execute(new ajf(this));
    }
}
