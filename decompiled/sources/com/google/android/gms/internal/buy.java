package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class buy implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ buq f9093a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ WebView f9094b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f9095c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ buw f9096d;

    /* JADX INFO: renamed from: e */
    private ValueCallback<String> f9097e = new buz(this);

    buy(buw buwVar, buq buqVar, WebView webView, boolean z) {
        this.f9096d = buwVar;
        this.f9093a = buqVar;
        this.f9094b = webView;
        this.f9095c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9094b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f9094b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f9097e);
            } catch (Throwable th) {
                this.f9097e.onReceiveValue("");
            }
        }
    }
}
