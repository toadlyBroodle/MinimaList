package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class bug implements buo {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9029a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Bundle f9030b;

    bug(buf bufVar, Activity activity, Bundle bundle) {
        this.f9029a = activity;
        this.f9030b = bundle;
    }

    @Override // com.google.android.gms.internal.buo
    /* JADX INFO: renamed from: a */
    public final void mo10266a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f9029a, this.f9030b);
    }
}
