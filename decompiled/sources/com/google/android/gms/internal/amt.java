package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class amt implements aqx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f6974a;

    amt(aip aipVar, Activity activity) {
        this.f6974a = activity;
    }

    @Override // com.google.android.gms.internal.aqx
    /* JADX INFO: renamed from: a */
    public final void mo8058a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f6974a);
    }
}
