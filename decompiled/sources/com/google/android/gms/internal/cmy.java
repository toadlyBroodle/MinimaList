package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cmy implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1669jn f10404a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10405b;

    cmy(cmv cmvVar, C1669jn c1669jn, String str) {
        this.f10404a = c1669jn;
        this.f10405b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10404a.mo11455a(this.f10405b);
    }
}
