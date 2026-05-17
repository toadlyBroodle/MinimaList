package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class buk implements buo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9034a;

    buk(buf bufVar, Activity activity) {
        this.f9034a = activity;
    }

    @Override // com.google.android.gms.internal.buo
    /* JADX INFO: renamed from: a */
    public final void mo10266a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f9034a);
    }
}
