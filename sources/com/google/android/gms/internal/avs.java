package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class avs implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    private static final Handler f7408a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private final Context f7409b;

    /* JADX INFO: renamed from: c */
    private Application f7410c;

    /* JADX INFO: renamed from: d */
    private final PowerManager f7411d;

    /* JADX INFO: renamed from: e */
    private final KeyguardManager f7412e;

    /* JADX INFO: renamed from: f */
    private final arz f7413f;

    /* JADX INFO: renamed from: g */
    private BroadcastReceiver f7414g;

    /* JADX INFO: renamed from: h */
    private WeakReference<ViewTreeObserver> f7415h;

    /* JADX INFO: renamed from: i */
    private WeakReference<View> f7416i;

    /* JADX INFO: renamed from: j */
    private aip f7417j;

    /* JADX INFO: renamed from: k */
    private boolean f7418k = false;

    /* JADX INFO: renamed from: l */
    private int f7419l = -1;

    /* JADX INFO: renamed from: m */
    private long f7420m = -3;

    public avs(arz arzVar, View view) {
        this.f7413f = arzVar;
        this.f7409b = arzVar.f7178a;
        this.f7411d = (PowerManager) this.f7409b.getSystemService("power");
        this.f7412e = (KeyguardManager) this.f7409b.getSystemService("keyguard");
        if (this.f7409b instanceof Application) {
            this.f7410c = (Application) this.f7409b;
            this.f7417j = new aip((Application) this.f7409b, this);
        }
        m8532a(view);
    }

    /* JADX INFO: renamed from: a */
    private final void m8525a(Activity activity, int i) {
        Window window;
        if (this.f7416i == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f7416i.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f7419l = i;
    }

    /* JADX INFO: renamed from: b */
    private final void m8527b() {
        f7408a.post(new awt(this));
    }

    /* JADX INFO: renamed from: b */
    private final void m8528b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7415h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7414g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f7414g = new axu(this);
            this.f7409b.registerReceiver(this.f7414g, intentFilter);
        }
        if (this.f7410c != null) {
            try {
                this.f7410c.registerActivityLifecycleCallbacks(this.f7417j);
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8529c() {
        boolean z;
        boolean z2;
        if (this.f7416i == null) {
            return;
        }
        View view = this.f7416i.get();
        if (view == null) {
            this.f7420m = -3L;
            this.f7418k = false;
            return;
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
        if (this.f7413f.m8260j()) {
            z = true;
        } else {
            if (this.f7412e.inKeyguardRestrictedInputMode()) {
                Activity activityM8322a = atq.m8322a(view);
                if (activityM8322a == null) {
                    z2 = false;
                    if (!z2) {
                    }
                } else {
                    Window window = activityM8322a.getWindow();
                    WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                    if (attributes != null && (attributes.flags & 524288) != 0) {
                        z2 = true;
                    }
                    if (!z2) {
                    }
                }
            }
            z = false;
        }
        int windowVisibility = view.getWindowVisibility();
        if (this.f7419l != -1) {
            windowVisibility = this.f7419l;
        }
        boolean z3 = view.getVisibility() == 0 && view.isShown() && this.f7411d.isScreenOn() && z && localVisibleRect && globalVisibleRect && windowVisibility == 0;
        if (this.f7418k != z3) {
            this.f7420m = z3 ? SystemClock.elapsedRealtime() : -2L;
            this.f7418k = z3;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m8530c(View view) {
        try {
            if (this.f7415h != null) {
                ViewTreeObserver viewTreeObserver = this.f7415h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7415h = null;
            }
        } catch (Exception e) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
        }
        if (this.f7414g != null) {
            try {
                this.f7409b.unregisterReceiver(this.f7414g);
            } catch (Exception e3) {
            }
            this.f7414g = null;
        }
        if (this.f7410c != null) {
            try {
                this.f7410c.unregisterActivityLifecycleCallbacks(this.f7417j);
            } catch (Exception e4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m8531a() {
        if (this.f7420m == -2 && this.f7416i.get() == null) {
            this.f7420m = -3L;
        }
        return this.f7420m;
    }

    /* JADX INFO: renamed from: a */
    final void m8532a(View view) {
        View view2 = this.f7416i != null ? this.f7416i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m8530c(view2);
        }
        this.f7416i = new WeakReference<>(view);
        if (view == null) {
            this.f7420m = -3L;
            return;
        }
        if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
            m8528b(view);
        }
        view.addOnAttachStateChangeListener(this);
        this.f7420m = -2L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m8525a(activity, 0);
        m8529c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m8529c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m8525a(activity, 4);
        m8529c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m8525a(activity, 0);
        m8529c();
        m8527b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m8529c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m8525a(activity, 0);
        m8529c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m8529c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m8529c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m8529c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7419l = -1;
        m8528b(view);
        m8529c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7419l = -1;
        m8529c();
        m8527b();
        m8530c(view);
    }
}
