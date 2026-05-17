package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.hf */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1607hf implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10728a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ WebSettings f10729b;

    CallableC1607hf(C1606he c1606he, Context context, WebSettings webSettings) {
        this.f10728a = context;
        this.f10729b = webSettings;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        if (this.f10728a.getCacheDir() != null) {
            this.f10729b.setAppCachePath(this.f10728a.getCacheDir().getAbsolutePath());
            this.f10729b.setAppCacheMaxSize(0L);
            this.f10729b.setAppCacheEnabled(true);
        }
        this.f10729b.setDatabasePath(this.f10728a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f10729b.setDatabaseEnabled(true);
        this.f10729b.setDomStorageEnabled(true);
        this.f10729b.setDisplayZoomControls(false);
        this.f10729b.setBuiltInZoomControls(true);
        this.f10729b.setSupportZoom(true);
        this.f10729b.setAllowContentAccess(false);
        return true;
    }
}
