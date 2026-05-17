package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.google.android.gms.internal.oi */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(21)
public final class C1799oi extends C1798oh {
    public C1799oi(InterfaceC1758mv interfaceC1758mv, boolean z) {
        super(interfaceC1758mv, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m11918a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
