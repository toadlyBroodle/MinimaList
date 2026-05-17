package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ago implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agl f6733a;

    ago(agl aglVar) {
        this.f6733a = aglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6733a.f6722g.execute(new ags(this.f6733a, null));
    }
}
