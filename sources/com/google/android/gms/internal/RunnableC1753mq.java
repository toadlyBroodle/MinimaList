package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mq */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1753mq implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f11065a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f11066b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f11067c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ AbstractC1751mo f11068d;

    RunnableC1753mq(AbstractC1751mo abstractC1751mo, String str, String str2, int i) {
        this.f11068d = abstractC1751mo;
        this.f11065a = str;
        this.f11066b = str2;
        this.f11067c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f11065a);
        map.put("cachedSrc", this.f11066b);
        map.put("totalBytes", Integer.toString(this.f11067c));
        this.f11068d.m11789a("onPrecacheEvent", (Map<String, String>) map);
    }
}
