package com.google.android.gms.ads.internal.p048js;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.v */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0816v implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4736a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0811q f4737b;

    RunnableC0816v(C0811q c0811q, String str) {
        this.f4737b = c0811q;
        this.f4736a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4737b.f4726a.loadUrl(this.f4736a);
    }
}
