package com.google.android.gms.ads.internal;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bj */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0726bj implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0734br f4564a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ RunnableC0723bg f4565b;

    ViewOnClickListenerC0726bj(RunnableC0723bg runnableC0723bg, C0734br c0734br) {
        this.f4565b = runnableC0723bg;
        this.f4564a = c0734br;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4564a.m5643a();
        if (this.f4565b.f4558b != null) {
            this.f4565b.f4558b.mo11213c();
        }
    }
}
