package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: com.google.firebase.iid.g */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2295g implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Intent f13008a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2294f f13009b;

    RunnableC2295g(C2294f c2294f, Intent intent) {
        this.f13009b = c2294f;
        this.f13008a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String action = this.f13008a.getAction();
        Log.w("EnhancedIntentService", new StringBuilder(String.valueOf(action).length() + 61).append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.f13009b.m13076a();
    }
}
