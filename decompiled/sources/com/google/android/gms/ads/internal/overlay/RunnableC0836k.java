package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.k */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0836k implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Drawable f4831a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0835j f4832b;

    RunnableC0836k(C0835j c0835j, Drawable drawable) {
        this.f4832b = c0835j;
        this.f4831a = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4832b.f4830a.f4804c.getWindow().setBackgroundDrawable(this.f4831a);
    }
}
