package android.support.v4.p006a;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: android.support.v4.a.ae */
/* JADX INFO: loaded from: classes.dex */
class ViewOnAttachStateChangeListenerC0139ae implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    private final View f733a;

    /* JADX INFO: renamed from: b */
    private ViewTreeObserver f734b;

    /* JADX INFO: renamed from: c */
    private final Runnable f735c;

    private ViewOnAttachStateChangeListenerC0139ae(View view, Runnable runnable) {
        this.f733a = view;
        this.f734b = view.getViewTreeObserver();
        this.f735c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ViewOnAttachStateChangeListenerC0139ae m805a(View view, Runnable runnable) {
        ViewOnAttachStateChangeListenerC0139ae viewOnAttachStateChangeListenerC0139ae = new ViewOnAttachStateChangeListenerC0139ae(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewOnAttachStateChangeListenerC0139ae);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0139ae);
        return viewOnAttachStateChangeListenerC0139ae;
    }

    /* JADX INFO: renamed from: a */
    public void m806a() {
        if (this.f734b.isAlive()) {
            this.f734b.removeOnPreDrawListener(this);
        } else {
            this.f733a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f733a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m806a();
        this.f735c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f734b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m806a();
    }
}
