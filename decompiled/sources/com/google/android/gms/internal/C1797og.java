package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;

/* JADX INFO: renamed from: com.google.android.gms.internal.og */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class C1797og extends C1787nx {
    public C1797og(InterfaceC1758mv interfaceC1758mv) {
        super(interfaceC1758mv);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        m11917a(view, i, customViewCallback);
    }
}
