package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bi */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnTouchListenerC0725bi implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0734br f4562a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC0723bg f4563b;

    ViewOnTouchListenerC0725bi(RunnableC0723bg runnableC0723bg, C0734br c0734br) {
        this.f4563b = runnableC0723bg;
        this.f4562a = c0734br;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f4562a.m5643a();
        if (this.f4563b.f4558b == null) {
            return false;
        }
        this.f4563b.f4558b.mo11213c();
        return false;
    }
}
