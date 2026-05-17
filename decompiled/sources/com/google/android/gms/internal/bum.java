package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class bum implements buo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9039a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Bundle f9040b;

    bum(buf bufVar, Activity activity, Bundle bundle) {
        this.f9039a = activity;
        this.f9040b = bundle;
    }

    @Override // com.google.android.gms.internal.buo
    /* JADX INFO: renamed from: a */
    public final void mo10266a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f9039a, this.f9040b);
    }
}
