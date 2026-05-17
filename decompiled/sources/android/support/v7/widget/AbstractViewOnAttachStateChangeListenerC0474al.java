package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.InterfaceC0416s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v7.widget.al */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnAttachStateChangeListenerC0474al implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private final float f3083a;

    /* JADX INFO: renamed from: b */
    private final int f3084b;

    /* JADX INFO: renamed from: c */
    final View f3085c;

    /* JADX INFO: renamed from: d */
    private final int f3086d;

    /* JADX INFO: renamed from: e */
    private Runnable f3087e;

    /* JADX INFO: renamed from: f */
    private Runnable f3088f;

    /* JADX INFO: renamed from: g */
    private boolean f3089g;

    /* JADX INFO: renamed from: h */
    private int f3090h;

    /* JADX INFO: renamed from: i */
    private final int[] f3091i = new int[2];

    /* JADX INFO: renamed from: android.support.v7.widget.al$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnAttachStateChangeListenerC0474al.this.f3085c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.al$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnAttachStateChangeListenerC0474al.this.m3910d();
        }
    }

    public AbstractViewOnAttachStateChangeListenerC0474al(View view) {
        this.f3085c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3083a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3084b = ViewConfiguration.getTapTimeout();
        this.f3086d = (this.f3084b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3903a(MotionEvent motionEvent) {
        View view = this.f3085c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3090h = motionEvent.getPointerId(0);
                if (this.f3087e == null) {
                    this.f3087e = new a();
                }
                view.postDelayed(this.f3087e, this.f3084b);
                if (this.f3088f == null) {
                    this.f3088f = new b();
                }
                view.postDelayed(this.f3088f, this.f3086d);
                break;
            case 1:
            case 3:
                m3908e();
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3090h);
                if (iFindPointerIndex >= 0 && !m3904a(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f3083a)) {
                    m3908e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3904a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3905a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f3091i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m3906b(MotionEvent motionEvent) {
        C0471ai c0471ai;
        View view = this.f3085c;
        InterfaceC0416s interfaceC0416sMo3168a = mo3168a();
        if (interfaceC0416sMo3168a == null || !interfaceC0416sMo3168a.mo3214f() || (c0471ai = (C0471ai) interfaceC0416sMo3168a.mo3215g()) == null || !c0471ai.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m3907b(view, motionEventObtainNoHistory);
        m3905a(c0471ai, motionEventObtainNoHistory);
        boolean zMo3871a = c0471ai.mo3871a(motionEventObtainNoHistory, this.f3090h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo3871a && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX INFO: renamed from: b */
    private boolean m3907b(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f3091i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: e */
    private void m3908e() {
        if (this.f3088f != null) {
            this.f3085c.removeCallbacks(this.f3088f);
        }
        if (this.f3087e != null) {
            this.f3085c.removeCallbacks(this.f3087e);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0416s mo3168a();

    /* JADX INFO: renamed from: b */
    protected boolean mo3169b() {
        InterfaceC0416s interfaceC0416sMo3168a = mo3168a();
        if (interfaceC0416sMo3168a == null || interfaceC0416sMo3168a.mo3214f()) {
            return true;
        }
        interfaceC0416sMo3168a.mo3212d();
        return true;
    }

    /* JADX INFO: renamed from: c */
    protected boolean mo3909c() {
        InterfaceC0416s interfaceC0416sMo3168a = mo3168a();
        if (interfaceC0416sMo3168a == null || !interfaceC0416sMo3168a.mo3214f()) {
            return true;
        }
        interfaceC0416sMo3168a.mo3213e();
        return true;
    }

    /* JADX INFO: renamed from: d */
    void m3910d() {
        m3908e();
        View view = this.f3085c;
        if (view.isEnabled() && !view.isLongClickable() && mo3169b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f3089g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3089g;
        if (z2) {
            z = m3906b(motionEvent) || !mo3909c();
        } else {
            boolean z3 = m3903a(motionEvent) && mo3169b();
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3085c.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            z = z3;
        }
        this.f3089g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3089g = false;
        this.f3090h = -1;
        if (this.f3087e != null) {
            this.f3085c.removeCallbacks(this.f3087e);
        }
    }
}
