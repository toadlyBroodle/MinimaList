package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.p006a.ActivityC0155k;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C1116bd {

    /* JADX INFO: renamed from: a */
    private final Object f5647a;

    public C1116bd(Activity activity) {
        C1221aj.m7066a(activity, "Activity must not be null");
        this.f5647a = activity;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6878a() {
        return this.f5647a instanceof ActivityC0155k;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6879b() {
        return this.f5647a instanceof Activity;
    }

    /* JADX INFO: renamed from: c */
    public final Activity m6880c() {
        return (Activity) this.f5647a;
    }

    /* JADX INFO: renamed from: d */
    public final ActivityC0155k m6881d() {
        return (ActivityC0155k) this.f5647a;
    }
}
