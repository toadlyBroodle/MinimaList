package android.support.v7.widget;

import android.support.v4.p019j.C0246q;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: android.support.v7.widget.bl */
/* JADX INFO: loaded from: classes.dex */
class ViewOnAttachStateChangeListenerC0501bl implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: i */
    private static ViewOnAttachStateChangeListenerC0501bl f3498i;

    /* JADX INFO: renamed from: a */
    private final View f3499a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f3500b;

    /* JADX INFO: renamed from: c */
    private final Runnable f3501c = new Runnable() { // from class: android.support.v7.widget.bl.1
        @Override // java.lang.Runnable
        public void run() {
            ViewOnAttachStateChangeListenerC0501bl.this.m4546a(false);
        }
    };

    /* JADX INFO: renamed from: d */
    private final Runnable f3502d = new Runnable() { // from class: android.support.v7.widget.bl.2
        @Override // java.lang.Runnable
        public void run() {
            ViewOnAttachStateChangeListenerC0501bl.this.m4542a();
        }
    };

    /* JADX INFO: renamed from: e */
    private int f3503e;

    /* JADX INFO: renamed from: f */
    private int f3504f;

    /* JADX INFO: renamed from: g */
    private C0502bm f3505g;

    /* JADX INFO: renamed from: h */
    private boolean f3506h;

    private ViewOnAttachStateChangeListenerC0501bl(View view, CharSequence charSequence) {
        this.f3499a = view;
        this.f3500b = charSequence;
        this.f3499a.setOnLongClickListener(this);
        this.f3499a.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4542a() {
        if (f3498i == this) {
            f3498i = null;
            if (this.f3505g != null) {
                this.f3505g.m4549a();
                this.f3505g = null;
                this.f3499a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        this.f3499a.removeCallbacks(this.f3501c);
        this.f3499a.removeCallbacks(this.f3502d);
    }

    /* JADX INFO: renamed from: a */
    public static void m4545a(View view, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnAttachStateChangeListenerC0501bl(view, charSequence);
            return;
        }
        if (f3498i != null && f3498i.f3499a == view) {
            f3498i.m4542a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4546a(boolean z) {
        if (C0246q.m1780z(this.f3499a)) {
            if (f3498i != null) {
                f3498i.m4542a();
            }
            f3498i = this;
            this.f3506h = z;
            this.f3505g = new C0502bm(this.f3499a.getContext());
            this.f3505g.m4550a(this.f3499a, this.f3503e, this.f3504f, this.f3506h, this.f3500b);
            this.f3499a.addOnAttachStateChangeListener(this);
            long longPressTimeout = this.f3506h ? 2500L : (C0246q.m1768n(this.f3499a) & 1) == 1 ? 3000 - ((long) ViewConfiguration.getLongPressTimeout()) : 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            this.f3499a.removeCallbacks(this.f3502d);
            this.f3499a.postDelayed(this.f3502d, longPressTimeout);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3505g == null || !this.f3506h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3499a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.f3499a.isEnabled() && this.f3505g == null) {
                            this.f3503e = (int) motionEvent.getX();
                            this.f3504f = (int) motionEvent.getY();
                            this.f3499a.removeCallbacks(this.f3501c);
                            this.f3499a.postDelayed(this.f3501c, ViewConfiguration.getLongPressTimeout());
                        }
                        break;
                    case 10:
                        m4542a();
                        break;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f3503e = view.getWidth() / 2;
        this.f3504f = view.getHeight() / 2;
        m4546a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m4542a();
    }
}
