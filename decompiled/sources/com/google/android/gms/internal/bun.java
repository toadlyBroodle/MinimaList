package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class bun implements buo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9041a;

    bun(buf bufVar, Activity activity) {
        this.f9041a = activity;
    }

    @Override // com.google.android.gms.internal.buo
    /* JADX INFO: renamed from: a */
    public final void mo10266a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f9041a);
    }
}
