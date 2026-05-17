package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0710au;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(14)
public final class bua implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    private static final long f8996a = ((Long) bxm.m10409f().m10546a(can.f9453aZ)).longValue();

    /* JADX INFO: renamed from: b */
    private final Context f8997b;

    /* JADX INFO: renamed from: c */
    private Application f8998c;

    /* JADX INFO: renamed from: d */
    private final WindowManager f8999d;

    /* JADX INFO: renamed from: e */
    private final PowerManager f9000e;

    /* JADX INFO: renamed from: f */
    private final KeyguardManager f9001f;

    /* JADX INFO: renamed from: g */
    private BroadcastReceiver f9002g;

    /* JADX INFO: renamed from: h */
    private WeakReference<ViewTreeObserver> f9003h;

    /* JADX INFO: renamed from: i */
    private WeakReference<View> f9004i;

    /* JADX INFO: renamed from: j */
    private buf f9005j;

    /* JADX INFO: renamed from: k */
    private C1647is f9006k = new C1647is(f8996a);

    /* JADX INFO: renamed from: l */
    private boolean f9007l = false;

    /* JADX INFO: renamed from: m */
    private int f9008m = -1;

    /* JADX INFO: renamed from: n */
    private HashSet<bue> f9009n = new HashSet<>();

    /* JADX INFO: renamed from: o */
    private DisplayMetrics f9010o;

    public bua(Context context, View view) {
        this.f8997b = context.getApplicationContext();
        this.f8999d = (WindowManager) context.getSystemService("window");
        this.f9000e = (PowerManager) this.f8997b.getSystemService("power");
        this.f9001f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f8997b instanceof Application) {
            this.f8998c = (Application) this.f8997b;
            this.f9005j = new buf((Application) this.f8997b, this);
        }
        this.f9010o = context.getResources().getDisplayMetrics();
        View view2 = this.f9004i != null ? this.f9004i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m10260b(view2);
        }
        this.f9004i = new WeakReference<>(view);
        if (view != null) {
            if (C0710au.m5571g().mo11470a(view)) {
                m10256a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: a */
    private final Rect m10253a(Rect rect) {
        return new Rect(m10258b(rect.left), m10258b(rect.top), m10258b(rect.right), m10258b(rect.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m10254a(int i) {
        if (this.f9009n.size() == 0 || this.f9004i == null) {
            return;
        }
        View view = this.f9004i.get();
        boolean z = i == 1;
        boolean z2 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = false;
        Rect rect3 = new Rect();
        boolean localVisibleRect = false;
        Rect rect4 = new Rect();
        Rect rect5 = new Rect();
        rect5.right = this.f8999d.getDefaultDisplay().getWidth();
        rect5.bottom = this.f8999d.getDefaultDisplay().getHeight();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            globalVisibleRect = view.getGlobalVisibleRect(rect2);
            localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                C1560fm.m11611b("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
        }
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        if (this.f9008m != -1) {
            windowVisibility = this.f9008m;
        }
        boolean z3 = !z2 && C0710au.m5569e().m11447a(view, this.f9000e, this.f9001f) && globalVisibleRect && localVisibleRect && windowVisibility == 0;
        if (z && !this.f9006k.m11540a() && z3 == this.f9007l) {
            return;
        }
        if (z3 || this.f9007l || i != 1) {
            bud budVar = new bud(C0710au.m5575k().mo7253b(), this.f9000e.isScreenOn(), view != null ? C0710au.m5571g().mo11470a(view) : false, view != null ? view.getWindowVisibility() : 8, m10253a(rect5), m10253a(rect), m10253a(rect2), globalVisibleRect, m10253a(rect3), localVisibleRect, m10253a(rect4), this.f9010o.density, z3);
            Iterator<bue> it = this.f9009n.iterator();
            while (it.hasNext()) {
                it.next().mo10264a(budVar);
            }
            this.f9007l = z3;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m10255a(Activity activity, int i) {
        Window window;
        if (this.f9004i == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f9004i.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f9008m = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m10256a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f9003h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f9002g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f9002g = new buc(this);
            C0710au.m5563C().m11550a(this.f8997b, this.f9002g, intentFilter);
        }
        if (this.f8998c != null) {
            try {
                this.f8998c.registerActivityLifecycleCallbacks(this.f9005j);
            } catch (Exception e) {
                C1560fm.m11611b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final int m10258b(int i) {
        return (int) (i / this.f9010o.density);
    }

    /* JADX INFO: renamed from: b */
    private final void m10259b() {
        C0710au.m5569e();
        C1596gv.f10711a.post(new bub(this));
    }

    /* JADX INFO: renamed from: b */
    private final void m10260b(View view) {
        try {
            if (this.f9003h != null) {
                ViewTreeObserver viewTreeObserver = this.f9003h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9003h = null;
            }
        } catch (Exception e) {
            C1560fm.m11611b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C1560fm.m11611b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f9002g != null) {
            try {
                C0710au.m5563C().m11549a(this.f8997b, this.f9002g);
            } catch (IllegalStateException e3) {
                C1560fm.m11611b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C0710au.m5573i().m11292a(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f9002g = null;
        }
        if (this.f8998c != null) {
            try {
                this.f8998c.unregisterActivityLifecycleCallbacks(this.f9005j);
            } catch (Exception e5) {
                C1560fm.m11611b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10261a() {
        m10254a(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m10262a(bue bueVar) {
        this.f9009n.add(bueVar);
        m10254a(3);
    }

    /* JADX INFO: renamed from: b */
    public final void m10263b(bue bueVar) {
        this.f9009n.remove(bueVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m10255a(activity, 0);
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m10255a(activity, 4);
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m10255a(activity, 0);
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m10255a(activity, 0);
        m10254a(3);
        m10259b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m10254a(3);
        m10259b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m10254a(2);
        m10259b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m10254a(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f9008m = -1;
        m10256a(view);
        m10254a(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9008m = -1;
        m10254a(3);
        m10259b();
        m10260b(view);
    }
}
