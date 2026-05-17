package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class apw implements aqx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f7055a;

    apw(aip aipVar, Activity activity) {
        this.f7055a = activity;
    }

    @Override // com.google.android.gms.internal.aqx
    /* JADX INFO: renamed from: a */
    public final void mo8058a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f7055a);
    }
}
