package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mp */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1752mp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f11059a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f11060b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f11061c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ int f11062d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f11063e = false;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ AbstractC1751mo f11064f;

    RunnableC1752mp(AbstractC1751mo abstractC1751mo, String str, String str2, int i, int i2, boolean z) {
        this.f11064f = abstractC1751mo;
        this.f11059a = str;
        this.f11060b = str2;
        this.f11061c = i;
        this.f11062d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f11059a);
        map.put("cachedSrc", this.f11060b);
        map.put("bytesLoaded", Integer.toString(this.f11061c));
        map.put("totalBytes", Integer.toString(this.f11062d));
        map.put("cacheReady", this.f11063e ? "1" : "0");
        this.f11064f.m11789a("onPrecacheEvent", (Map<String, String>) map);
    }
}
