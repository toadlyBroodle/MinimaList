package com.google.android.gms.ads.internal.p048js;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.s */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0813s implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f4729a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ JSONObject f4730b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C0811q f4731c;

    RunnableC0813s(C0811q c0811q, String str, JSONObject jSONObject) {
        this.f4731c = c0811q;
        this.f4729a = str;
        this.f4730b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4731c.f4726a.mo5728b(this.f4729a, this.f4730b);
    }
}
