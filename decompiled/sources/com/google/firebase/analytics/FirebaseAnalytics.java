package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.abd;
import com.google.android.gms.p051b.AbstractC0964e;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseAnalytics {
    private final abd zziwf;

    /* JADX INFO: renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    public static class C2152a {
    }

    /* JADX INFO: renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    public static class C2153b {
    }

    /* JADX INFO: renamed from: com.google.firebase.analytics.FirebaseAnalytics$c */
    public static class C2154c {
    }

    public FirebaseAnalytics(abd abdVar) {
        C1221aj.m7065a(abdVar);
        this.zziwf = abdVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        return abd.m7497a(context).m7548n();
    }

    public final AbstractC0964e<String> getAppInstanceId() {
        return this.zziwf.m7546l().m7626y();
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zziwf.m7547m().logEvent(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zziwf.m7546l().m7604A();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zziwf.m7547m().setMeasurementEnabled(z);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zziwf.m7556v().m7635a(activity, str, str2);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zziwf.m7547m().setMinimumSessionDuration(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zziwf.m7547m().setSessionTimeoutDuration(j);
    }

    public final void setUserId(String str) {
        this.zziwf.m7547m().setUserPropertyInternal("app", "_id", str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zziwf.m7547m().setUserProperty(str, str2);
    }
}
