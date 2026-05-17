package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class cme implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ WeakReference f10351a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cly f10352b;

    cme(cly clyVar, WeakReference weakReference) {
        this.f10352b = clyVar;
        this.f10351a = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f10352b.m11121a((WeakReference<InterfaceC1758mv>) this.f10351a, false);
    }
}
