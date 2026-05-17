package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class cmg implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ WeakReference f10353a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cly f10354b;

    cmg(cly clyVar, WeakReference weakReference) {
        this.f10354b = clyVar;
        this.f10353a = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.f10354b.m11121a((WeakReference<InterfaceC1758mv>) this.f10353a, true);
    }
}
