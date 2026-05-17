package com.google.android.gms.internal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.at */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1380at implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JSONObject f7234a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f7235b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1377ar f7236c;

    RunnableC1380at(C1377ar c1377ar, JSONObject jSONObject, String str) {
        this.f7236c = c1377ar;
        this.f7234a = jSONObject;
        this.f7235b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7236c.f7123l = C1377ar.f7115d.m5751b((afk) null);
        this.f7236c.f7123l.mo11659a(new C1385au(this), new C1397av(this));
    }
}
