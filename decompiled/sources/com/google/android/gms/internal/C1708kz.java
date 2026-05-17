package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.gms.internal.kz */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1708kz {
    /* JADX INFO: renamed from: a */
    public static void m11663a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new ViewTreeObserverOnGlobalLayoutListenerC1710la(view, onGlobalLayoutListener).m11670a();
    }

    /* JADX INFO: renamed from: a */
    public static void m11664a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new ViewTreeObserverOnScrollChangedListenerC1711lb(view, onScrollChangedListener).m11670a();
    }
}
