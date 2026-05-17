package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.of */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(11)
public final class C1796of extends C1798oh {
    public C1796of(InterfaceC1758mv interfaceC1758mv, boolean z) {
        super(interfaceC1758mv, z);
    }

    @Override // com.google.android.gms.internal.C1759mw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m11918a(webView, str, (Map<String, String>) null);
    }
}
