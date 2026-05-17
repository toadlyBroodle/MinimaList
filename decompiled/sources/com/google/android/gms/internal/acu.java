package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
final class acu implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ acf f6380a;

    private acu(acf acfVar) {
        this.f6380a = acfVar;
    }

    /* synthetic */ acu(acf acfVar, acg acgVar) {
        this(acfVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2;
        Uri data;
        try {
            this.f6380a.mo7393t().m7405E().m7412a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                if (bundle == null) {
                    Bundle bundleM7745a = this.f6380a.mo7389p().m7745a(data);
                    this.f6380a.mo7389p();
                    String str = aek.m7720a(intent) ? "gs" : "auto";
                    if (bundleM7745a != null) {
                        this.f6380a.m7614a(str, "_cmp", bundleM7745a);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                    this.f6380a.mo7393t().m7404D().m7412a("Activity created with data 'referrer' param without gclid and at least one utm field");
                    return;
                } else {
                    this.f6380a.mo7393t().m7404D().m7413a("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.f6380a.m7617a("auto", "_ldl", (Object) queryParameter);
                    }
                }
            }
        } catch (Throwable th) {
            this.f6380a.mo7393t().m7410y().m7413a("Throwable caught in onActivityCreated", th);
        }
        acv acvVarMo7383j = this.f6380a.mo7383j();
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.firebase.analytics.screen_service")) == null) {
            return;
        }
        acy acyVarM7633a = acvVarMo7383j.m7633a(activity);
        acyVarM7633a.f12761d = bundle2.getLong("id");
        acyVarM7633a.f12759b = bundle2.getString("name");
        acyVarM7633a.f12760c = bundle2.getString("referrer_name");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f6380a.mo7383j().m7641d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f6380a.mo7383j().m7640c(activity);
        adz adzVarMo7391r = this.f6380a.mo7391r();
        adzVarMo7391r.mo7392s().m7479a(new aed(adzVarMo7391r, adzVarMo7391r.mo7384k().mo7253b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f6380a.mo7383j().m7638b(activity);
        adz adzVarMo7391r = this.f6380a.mo7391r();
        adzVarMo7391r.mo7392s().m7479a(new aec(adzVarMo7391r, adzVarMo7391r.mo7384k().mo7253b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f6380a.mo7383j().m7634a(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
