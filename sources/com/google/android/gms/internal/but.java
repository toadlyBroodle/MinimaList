package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
final class but implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private Activity f9064a;

    /* JADX INFO: renamed from: b */
    private Context f9065b;

    /* JADX INFO: renamed from: h */
    private Runnable f9071h;

    /* JADX INFO: renamed from: j */
    private long f9073j;

    /* JADX INFO: renamed from: c */
    private final Object f9066c = new Object();

    /* JADX INFO: renamed from: d */
    private boolean f9067d = true;

    /* JADX INFO: renamed from: e */
    private boolean f9068e = false;

    /* JADX INFO: renamed from: f */
    private final List<buv> f9069f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List<bvi> f9070g = new ArrayList();

    /* JADX INFO: renamed from: i */
    private boolean f9072i = false;

    but() {
    }

    /* JADX INFO: renamed from: a */
    private final void m10291a(Activity activity) {
        synchronized (this.f9066c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f9064a = activity;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m10292a(but butVar, boolean z) {
        butVar.f9067d = false;
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final Activity m10296a() {
        return this.f9064a;
    }

    /* JADX INFO: renamed from: a */
    public final void m10297a(Application application, Context context) {
        if (this.f9072i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m10291a((Activity) context);
        }
        this.f9065b = application;
        this.f9073j = ((Long) bxm.m10409f().m10546a(can.f9475av)).longValue();
        this.f9072i = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m10298a(buv buvVar) {
        synchronized (this.f9066c) {
            this.f9069f.add(buvVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Context m10299b() {
        return this.f9065b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f9066c) {
            if (this.f9064a == null) {
                return;
            }
            if (this.f9064a.equals(activity)) {
                this.f9064a = null;
            }
            Iterator<bvi> it = this.f9070g.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().m10322a(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    C0710au.m5573i().m11292a(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    C1560fm.m11611b("onActivityStateChangedListener threw exception.", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m10291a(activity);
        synchronized (this.f9066c) {
            Iterator<bvi> it = this.f9070g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.f9068e = true;
        if (this.f9071h != null) {
            C1596gv.f10711a.removeCallbacks(this.f9071h);
        }
        Handler handler = C1596gv.f10711a;
        buu buuVar = new buu(this);
        this.f9071h = buuVar;
        handler.postDelayed(buuVar, this.f9073j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m10291a(activity);
        this.f9068e = false;
        boolean z = this.f9067d ? false : true;
        this.f9067d = true;
        if (this.f9071h != null) {
            C1596gv.f10711a.removeCallbacks(this.f9071h);
        }
        synchronized (this.f9066c) {
            Iterator<bvi> it = this.f9070g.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                Iterator<buv> it2 = this.f9069f.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().mo10300d(true);
                    } catch (Exception e) {
                        C1560fm.m11611b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                C1560fm.m11610b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m10291a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
