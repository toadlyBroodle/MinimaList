package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mr */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1754mr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f11069a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f11070b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f11071c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f11072d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ AbstractC1751mo f11073e;

    RunnableC1754mr(AbstractC1751mo abstractC1751mo, String str, String str2, String str3, String str4) {
        this.f11073e = abstractC1751mo;
        this.f11069a = str;
        this.f11070b = str2;
        this.f11071c = str3;
        this.f11072d = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.f11069a);
        if (!TextUtils.isEmpty(this.f11070b)) {
            map.put("cachedSrc", this.f11070b);
        }
        AbstractC1751mo abstractC1751mo = this.f11073e;
        map.put("type", AbstractC1751mo.m11790b(this.f11071c));
        map.put("reason", this.f11071c);
        if (!TextUtils.isEmpty(this.f11072d)) {
            map.put("message", this.f11072d);
        }
        this.f11073e.m11789a("onPrecacheEvent", (Map<String, String>) map);
    }
}
