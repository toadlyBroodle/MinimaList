package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: renamed from: com.google.firebase.iid.h */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2296h extends Binder {

    /* JADX INFO: renamed from: a */
    private final AbstractServiceC2292d f13010a;

    BinderC2296h(AbstractServiceC2292d abstractServiceC2292d) {
        this.f13010a = abstractServiceC2292d;
    }

    /* JADX INFO: renamed from: a */
    public final void m13078a(C2294f c2294f) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (this.f13010a.mo13075c(c2294f.f13004a)) {
            c2294f.m13076a();
            return;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.f13010a.f12996a.execute(new RunnableC2297i(this, c2294f));
    }
}
