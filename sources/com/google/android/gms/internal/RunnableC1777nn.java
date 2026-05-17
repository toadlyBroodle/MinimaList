package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.nn */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1777nn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1775nl f11179a;

    RunnableC1777nn(ViewTreeObserverOnGlobalLayoutListenerC1775nl viewTreeObserverOnGlobalLayoutListenerC1775nl) {
        this.f11179a = viewTreeObserverOnGlobalLayoutListenerC1775nl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
