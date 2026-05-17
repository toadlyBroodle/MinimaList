package com.google.android.gms.ads.internal.p048js;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.u */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0815u implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4734a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0811q f4735b;

    RunnableC0815u(C0811q c0811q, String str) {
        this.f4735b = c0811q;
        this.f4734a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4735b.f4726a.loadData(this.f4734a, "text/html", "UTF-8");
    }
}
