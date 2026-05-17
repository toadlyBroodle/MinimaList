package com.google.firebase.iid;

import android.util.Log;

/* JADX INFO: renamed from: com.google.firebase.iid.i */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2297i implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2294f f13011a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC2296h f13012b;

    RunnableC2297i(BinderC2296h binderC2296h, C2294f c2294f) {
        this.f13012b = binderC2296h;
        this.f13011a = c2294f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f13012b.f13010a.mo13049b(this.f13011a.f13004a);
        this.f13011a.m13076a();
    }
}
