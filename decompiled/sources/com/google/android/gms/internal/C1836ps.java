package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.ps */
/* JADX INFO: loaded from: classes.dex */
public final class C1836ps {

    /* JADX INFO: renamed from: a */
    private final Context f11321a;

    /* JADX INFO: renamed from: b */
    private final Context f11322b;

    public C1836ps(Context context) {
        C1221aj.m7065a(context);
        Context applicationContext = context.getApplicationContext();
        C1221aj.m7066a(applicationContext, "Application context can't be null");
        this.f11321a = applicationContext;
        this.f11322b = applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public final Context m12073a() {
        return this.f11321a;
    }

    /* JADX INFO: renamed from: b */
    public final Context m12074b() {
        return this.f11322b;
    }
}
