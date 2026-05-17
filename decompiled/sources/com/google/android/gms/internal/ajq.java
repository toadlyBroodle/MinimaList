package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class ajq implements aqx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f6946a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Bundle f6947b;

    ajq(aip aipVar, Activity activity, Bundle bundle) {
        this.f6946a = activity;
        this.f6947b = bundle;
    }

    @Override // com.google.android.gms.internal.aqx
    /* JADX INFO: renamed from: a */
    public final void mo8058a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f6946a, this.f6947b);
    }
}
