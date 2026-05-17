package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class bui implements buo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9032a;

    bui(buf bufVar, Activity activity) {
        this.f9032a = activity;
    }

    @Override // com.google.android.gms.internal.buo
    /* JADX INFO: renamed from: a */
    public final void mo10266a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f9032a);
    }
}
