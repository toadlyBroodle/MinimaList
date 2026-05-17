package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.InterfaceC1894rw;

/* JADX INFO: renamed from: com.google.android.gms.internal.rt */
/* JADX INFO: loaded from: classes.dex */
public final class C1891rt<T extends Context & InterfaceC1894rw> {

    /* JADX INFO: renamed from: c */
    private static Boolean f11488c;

    /* JADX INFO: renamed from: a */
    private final Handler f11489a;

    /* JADX INFO: renamed from: b */
    private final T f11490b;

    public C1891rt(T t) {
        C1221aj.m7065a(t);
        this.f11490b = t;
        this.f11489a = new Handler();
    }

    /* JADX INFO: renamed from: a */
    private final void m12272a(Integer num, JobParameters jobParameters) {
        C1834pq c1834pqM12054a = C1834pq.m12054a(this.f11490b);
        c1834pqM12054a.m12063h().m12007a((InterfaceC1869qy) new C1892ru(this, num, c1834pqM12054a, c1834pqM12054a.m12060e(), jobParameters));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12273a(Context context) {
        C1221aj.m7065a(context);
        if (f11488c != null) {
            return f11488c.booleanValue();
        }
        boolean zM12291a = C1897rz.m12291a(context, "com.google.android.gms.analytics.AnalyticsService");
        f11488c = Boolean.valueOf(zM12291a);
        return zM12291a;
    }

    /* JADX INFO: renamed from: a */
    public final int m12275a(Intent intent, int i, int i2) {
        try {
            synchronized (C1890rs.f11485a) {
                agf agfVar = C1890rs.f11486b;
                if (agfVar != null && agfVar.m7840b()) {
                    agfVar.m7837a();
                }
            }
        } catch (SecurityException e) {
        }
        C1882rk c1882rkM12060e = C1834pq.m12054a(this.f11490b).m12060e();
        if (intent == null) {
            c1882rkM12060e.m12033e("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            c1882rkM12060e.m12021a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                m12272a(Integer.valueOf(i2), null);
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m12276a() {
        C1834pq.m12054a(this.f11490b).m12060e().m12023b("Local AnalyticsService is starting up");
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: a */
    public final boolean m12277a(JobParameters jobParameters) {
        C1882rk c1882rkM12060e = C1834pq.m12054a(this.f11490b).m12060e();
        String string = jobParameters.getExtras().getString("action");
        c1882rkM12060e.m12020a("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        m12272a(null, jobParameters);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m12278b() {
        C1834pq.m12054a(this.f11490b).m12060e().m12023b("Local AnalyticsService is shutting down");
    }
}
