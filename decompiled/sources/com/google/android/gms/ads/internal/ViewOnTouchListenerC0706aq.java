package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.aq */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnTouchListenerC0706aq implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BinderC0704ao f4460a;

    ViewOnTouchListenerC0706aq(BinderC0704ao binderC0704ao) {
        this.f4460a = binderC0704ao;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f4460a.f4457h == null) {
            return false;
        }
        this.f4460a.f4457h.m7811a(motionEvent);
        return false;
    }
}
