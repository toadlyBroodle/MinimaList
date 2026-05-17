package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.C1560fm;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.ac */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0750ac implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JSONObject f4616a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC0749ab f4617b;

    RunnableC0750ac(RunnableC0749ab runnableC0749ab, JSONObject jSONObject) {
        this.f4617b = runnableC0749ab;
        this.f4616a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4617b.f4613a.mo5713a("fetchHttpRequestCompleted", this.f4616a);
        C1560fm.m11610b("Dispatched http response.");
    }
}
