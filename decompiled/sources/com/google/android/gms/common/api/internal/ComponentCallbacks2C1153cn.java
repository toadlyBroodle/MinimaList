package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C1310n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cn */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1153cn implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    private static final ComponentCallbacks2C1153cn f5724a = new ComponentCallbacks2C1153cn();

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f5725b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f5726c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private final ArrayList<InterfaceC1154co> f5727d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private boolean f5728e = false;

    private ComponentCallbacks2C1153cn() {
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C1153cn m6939a() {
        return f5724a;
    }

    /* JADX INFO: renamed from: a */
    public static void m6940a(Application application) {
        synchronized (f5724a) {
            if (!f5724a.f5728e) {
                application.registerActivityLifecycleCallbacks(f5724a);
                application.registerComponentCallbacks(f5724a);
                f5724a.f5728e = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6941b(boolean z) {
        synchronized (f5724a) {
            ArrayList<InterfaceC1154co> arrayList = this.f5727d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                InterfaceC1154co interfaceC1154co = arrayList.get(i);
                i++;
                interfaceC1154co.mo6809a(z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6942a(InterfaceC1154co interfaceC1154co) {
        synchronized (f5724a) {
            this.f5727d.add(interfaceC1154co);
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    public final boolean m6943a(boolean z) {
        if (!this.f5726c.get()) {
            if (!C1310n.m7279b()) {
                return true;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5726c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5725b.set(true);
            }
        }
        return this.f5725b.get();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6944b() {
        return this.f5725b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f5725b.compareAndSet(true, false);
        this.f5726c.set(true);
        if (zCompareAndSet) {
            m6941b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f5725b.compareAndSet(true, false);
        this.f5726c.set(true);
        if (zCompareAndSet) {
            m6941b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5725b.compareAndSet(false, true)) {
            this.f5726c.set(true);
            m6941b(true);
        }
    }
}
