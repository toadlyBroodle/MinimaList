package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bbm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7738a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Throwable f7739b;

    bbm(bbl bblVar, String str, Throwable th) {
        this.f7738a = str;
        this.f7739b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new RuntimeException(this.f7738a, this.f7739b);
    }
}
