package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.my */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC1761my implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1528eh f11113a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1759mw f11114b;

    ViewOnAttachStateChangeListenerC1761my(C1759mw c1759mw, InterfaceC1528eh interfaceC1528eh) {
        this.f11114b = c1759mw;
        this.f11113a = interfaceC1528eh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11114b.m11842a(view, this.f11113a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
