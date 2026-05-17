package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

/* JADX INFO: renamed from: com.google.android.gms.internal.hg */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public class C1608hg extends C1606he {
    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final String mo11463a(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // com.google.android.gms.internal.C1606he, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: c */
    public final WebChromeClient mo11477c(InterfaceC1758mv interfaceC1758mv) {
        return new C1797og(interfaceC1758mv);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: f */
    public int mo11480f() {
        return 1;
    }
}
