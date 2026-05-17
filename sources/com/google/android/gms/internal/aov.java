package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class aov implements aqx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f7004a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Bundle f7005b;

    aov(aip aipVar, Activity activity, Bundle bundle) {
        this.f7004a = activity;
        this.f7005b = bundle;
    }

    @Override // com.google.android.gms.internal.aqx
    /* JADX INFO: renamed from: a */
    public final void mo8058a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7004a, this.f7005b);
    }
}
