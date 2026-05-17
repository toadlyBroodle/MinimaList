package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C0710au;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.la */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class ViewTreeObserverOnGlobalLayoutListenerC1710la extends AbstractC1712lc implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f10912a;

    public ViewTreeObserverOnGlobalLayoutListenerC1710la(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f10912a = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.AbstractC1712lc
    /* JADX INFO: renamed from: a */
    protected final void mo11667a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.AbstractC1712lc
    /* JADX INFO: renamed from: b */
    protected final void mo11668b(ViewTreeObserver viewTreeObserver) {
        C0710au.m5571g().mo11467a(viewTreeObserver, this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10912a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m11671b();
        }
    }
}
