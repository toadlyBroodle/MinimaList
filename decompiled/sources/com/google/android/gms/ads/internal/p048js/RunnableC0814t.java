package com.google.android.gms.ads.internal.p048js;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.t */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0814t implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4732a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0811q f4733b;

    RunnableC0814t(C0811q c0811q, String str) {
        this.f4733b = c0811q;
        this.f4732a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4733b.f4726a.loadData(this.f4732a, "text/html", "UTF-8");
    }
}
