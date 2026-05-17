package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.lb */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class ViewTreeObserverOnScrollChangedListenerC1711lb extends AbstractC1712lc implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f10913a;

    public ViewTreeObserverOnScrollChangedListenerC1711lb(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f10913a = new WeakReference<>(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.AbstractC1712lc
    /* JADX INFO: renamed from: a */
    protected final void mo11667a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.AbstractC1712lc
    /* JADX INFO: renamed from: b */
    protected final void mo11668b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f10913a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m11671b();
        }
    }
}
