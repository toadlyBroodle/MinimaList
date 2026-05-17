package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.lc */
/* JADX INFO: loaded from: classes.dex */
@cnb
abstract class AbstractC1712lc {

    /* JADX INFO: renamed from: a */
    private final WeakReference<View> f10914a;

    public AbstractC1712lc(View view) {
        this.f10914a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: c */
    private final ViewTreeObserver m11669c() {
        View view = this.f10914a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* JADX INFO: renamed from: a */
    public final void m11670a() {
        ViewTreeObserver viewTreeObserverM11669c = m11669c();
        if (viewTreeObserverM11669c != null) {
            mo11667a(viewTreeObserverM11669c);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo11667a(ViewTreeObserver viewTreeObserver);

    /* JADX INFO: renamed from: b */
    public final void m11671b() {
        ViewTreeObserver viewTreeObserverM11669c = m11669c();
        if (viewTreeObserverM11669c != null) {
            mo11668b(viewTreeObserverM11669c);
        }
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo11668b(ViewTreeObserver viewTreeObserver);
}
