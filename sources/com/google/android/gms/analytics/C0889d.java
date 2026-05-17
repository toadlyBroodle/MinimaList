package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.design.C0025a;
import android.util.Log;
import com.google.android.gms.internal.C1834pq;
import com.google.android.gms.internal.C1872ra;
import com.google.android.gms.internal.C1881rj;
import com.google.android.gms.internal.C1899sa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.analytics.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0889d extends C0894i {

    /* JADX INFO: renamed from: b */
    private static List<Runnable> f4917b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f4918c;

    /* JADX INFO: renamed from: d */
    private Set<a> f4919d;

    /* JADX INFO: renamed from: e */
    private boolean f4920e;

    /* JADX INFO: renamed from: f */
    private boolean f4921f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f4922g;

    /* JADX INFO: renamed from: h */
    private boolean f4923h;

    /* JADX INFO: renamed from: com.google.android.gms.analytics.d$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo5980a(Activity activity);

        /* JADX INFO: renamed from: b */
        void mo5981b(Activity activity);
    }

    /* JADX INFO: renamed from: com.google.android.gms.analytics.d$b */
    @TargetApi(14)
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C0889d.this.m5969a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C0889d.this.m5974b(activity);
        }
    }

    public C0889d(C1834pq c1834pq) {
        super(c1834pq);
        this.f4919d = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public static C0889d m5964a(Context context) {
        return C1834pq.m12054a(context).m12065j();
    }

    /* JADX INFO: renamed from: c */
    public static void m5965c() {
        synchronized (C0889d.class) {
            if (f4917b != null) {
                Iterator<Runnable> it = f4917b.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                f4917b = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0893h m5966a(String str) {
        C0893h c0893h;
        synchronized (this) {
            c0893h = new C0893h(m6027g(), str, null);
            c0893h.m12053z();
        }
        return c0893h;
    }

    /* JADX INFO: renamed from: a */
    public final void m5967a() {
        C1899sa c1899saM12066k = m6027g().m12066k();
        c1899saM12066k.m12299d();
        if (c1899saM12066k.m12300e()) {
            m5973a(c1899saM12066k.m12301f());
        }
        c1899saM12066k.m12299d();
        this.f4918c = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5968a(int i) {
        m6027g().m12063h().m12006a(i);
    }

    /* JADX INFO: renamed from: a */
    final void m5969a(Activity activity) {
        Iterator<a> it = this.f4919d.iterator();
        while (it.hasNext()) {
            it.next().mo5980a(activity);
        }
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    public final void m5970a(Application application) {
        if (this.f4920e) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
        this.f4920e = true;
    }

    /* JADX INFO: renamed from: a */
    final void m5971a(a aVar) {
        this.f4919d.add(aVar);
        Context contextM12056a = m6027g().m12056a();
        if (contextM12056a instanceof Application) {
            m5970a((Application) contextM12056a);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m5972a(InterfaceC0891f interfaceC0891f) {
        C1881rj.m12220a(interfaceC0891f);
        if (this.f4923h) {
            return;
        }
        String strM12204a = C1872ra.f11418b.m12204a();
        String strM12204a2 = C1872ra.f11418b.m12204a();
        Log.i(strM12204a, new StringBuilder(String.valueOf(strM12204a2).length() + C0025a.j.AppCompatTheme_windowFixedHeightMajor).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(strM12204a2).append(" DEBUG").toString());
        this.f4923h = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5973a(boolean z) {
        this.f4921f = z;
    }

    /* JADX INFO: renamed from: b */
    final void m5974b(Activity activity) {
        Iterator<a> it = this.f4919d.iterator();
        while (it.hasNext()) {
            it.next().mo5981b(activity);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m5975b(a aVar) {
        this.f4919d.remove(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5976b() {
        return this.f4918c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5977d() {
        return this.f4921f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5978e() {
        return this.f4922g;
    }

    /* JADX INFO: renamed from: f */
    public final void m5979f() {
        m6027g().m12063h().m12011c();
    }
}
