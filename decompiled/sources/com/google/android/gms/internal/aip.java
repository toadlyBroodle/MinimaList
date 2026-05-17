package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class aip implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final Application f6873a;

    /* JADX INFO: renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f6874b;

    /* JADX INFO: renamed from: c */
    private boolean f6875c = false;

    public aip(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f6874b = new WeakReference<>(activityLifecycleCallbacks);
        this.f6873a = application;
    }

    /* JADX INFO: renamed from: a */
    private final void m8024a(aqx aqxVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f6874b.get();
            if (activityLifecycleCallbacks != null) {
                aqxVar.mo8058a(activityLifecycleCallbacks);
            } else if (!this.f6875c) {
                this.f6873a.unregisterActivityLifecycleCallbacks(this);
                this.f6875c = true;
            }
        } catch (Exception e) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m8024a(new ajq(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m8024a(new apw(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m8024a(new amt(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m8024a(new als(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m8024a(new aov(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m8024a(new akr(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m8024a(new anu(this, activity));
    }
}
