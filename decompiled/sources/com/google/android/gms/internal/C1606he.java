package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.he */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(11)
public class C1606he extends C1605hd {
    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public C1759mw mo11461a(InterfaceC1758mv interfaceC1758mv, boolean z) {
        return new C1796of(interfaceC1758mv, z);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final Set<String> mo11464a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    @Override // com.google.android.gms.internal.C1605hd, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final boolean mo11468a(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public boolean mo11469a(Context context, WebSettings webSettings) {
        super.mo11469a(context, webSettings);
        return ((Boolean) C1649iu.m11543a(context, new CallableC1607hf(this, context, webSettings))).booleanValue();
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final boolean mo11471a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: b */
    public final boolean mo11474b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: c */
    public WebChromeClient mo11477c(InterfaceC1758mv interfaceC1758mv) {
        return new C1787nx(interfaceC1758mv);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: c */
    public final boolean mo11478c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
