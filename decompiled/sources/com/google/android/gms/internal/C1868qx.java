package com.google.android.gms.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.qx */
/* JADX INFO: loaded from: classes.dex */
public final class C1868qx extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private boolean f11395a;

    /* JADX INFO: renamed from: b */
    private boolean f11396b;

    /* JADX INFO: renamed from: c */
    private final AlarmManager f11397c;

    /* JADX INFO: renamed from: d */
    private Integer f11398d;

    protected C1868qx(C1834pq c1834pq) {
        super(c1834pq);
        this.f11397c = (AlarmManager) m12038j().getSystemService("alarm");
    }

    /* JADX INFO: renamed from: f */
    private final PendingIntent m12192f() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(m12038j(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(m12038j(), 0, intent, 0);
    }

    /* JADX INFO: renamed from: g */
    private final int m12193g() {
        if (this.f11398d == null) {
            String strValueOf = String.valueOf(m12038j().getPackageName());
            this.f11398d = Integer.valueOf((strValueOf.length() != 0 ? "analytics".concat(strValueOf) : new String("analytics")).hashCode());
        }
        return this.f11398d.intValue();
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        ActivityInfo receiverInfo;
        try {
            m12197e();
            if (C1863qs.m12173e() <= 0 || (receiverInfo = m12038j().getPackageManager().getReceiverInfo(new ComponentName(m12038j(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2)) == null || !receiverInfo.enabled) {
                return;
            }
            m12023b("Receiver registered for local dispatch.");
            this.f11395a = true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12194b() {
        return this.f11395a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12195c() {
        return this.f11396b;
    }

    /* JADX INFO: renamed from: d */
    public final void m12196d() {
        m12052y();
        C1221aj.m7071a(this.f11395a, "Receiver not registered");
        long jM12173e = C1863qs.m12173e();
        if (jM12173e > 0) {
            m12197e();
            long jMo7253b = m12037i().mo7253b() + jM12173e;
            this.f11396b = true;
            if (Build.VERSION.SDK_INT < 24) {
                m12023b("Scheduling upload with AlarmManager");
                this.f11397c.setInexactRepeating(2, jMo7253b, jM12173e, m12192f());
                return;
            }
            m12023b("Scheduling upload with JobScheduler");
            ComponentName componentName = new ComponentName(m12038j(), "com.google.android.gms.analytics.AnalyticsJobService");
            JobScheduler jobScheduler = (JobScheduler) m12038j().getSystemService("jobscheduler");
            JobInfo.Builder builder = new JobInfo.Builder(m12193g(), componentName);
            builder.setMinimumLatency(jM12173e);
            builder.setOverrideDeadline(jM12173e << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            builder.setExtras(persistableBundle);
            JobInfo jobInfoBuild = builder.build();
            m12020a("Scheduling job. JobID", Integer.valueOf(m12193g()));
            jobScheduler.schedule(jobInfoBuild);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12197e() {
        this.f11396b = false;
        this.f11397c.cancel(m12192f());
        if (Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) m12038j().getSystemService("jobscheduler");
            m12020a("Cancelling job. JobID", Integer.valueOf(m12193g()));
            jobScheduler.cancel(m12193g());
        }
    }
}
