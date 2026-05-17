package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class buf implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final Application f9026a;

    /* JADX INFO: renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f9027b;

    /* JADX INFO: renamed from: c */
    private boolean f9028c = false;

    public buf(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f9027b = new WeakReference<>(activityLifecycleCallbacks);
        this.f9026a = application;
    }

    /* JADX INFO: renamed from: a */
    private final void m10265a(buo buoVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f9027b.get();
            if (activityLifecycleCallbacks != null) {
                buoVar.mo10266a(activityLifecycleCallbacks);
            } else if (!this.f9028c) {
                this.f9026a.unregisterActivityLifecycleCallbacks(this);
                this.f9028c = true;
            }
        } catch (Exception e) {
            C1560fm.m11611b("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m10265a(new bug(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m10265a(new bun(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m10265a(new buj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m10265a(new bui(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m10265a(new bum(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m10265a(new buh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m10265a(new buk(this, activity));
    }
}
