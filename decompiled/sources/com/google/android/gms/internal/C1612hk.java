package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebSettings;

/* JADX INFO: renamed from: com.google.android.gms.internal.hk */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public class C1612hk extends C1608hg {
    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final void mo11465a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        mo11467a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final void mo11466a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public final void mo11467a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.C1606he, com.google.android.gms.internal.C1603hb
    /* JADX INFO: renamed from: a */
    public boolean mo11469a(Context context, WebSettings webSettings) {
        super.mo11469a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
