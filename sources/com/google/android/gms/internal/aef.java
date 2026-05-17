package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
public final class aef extends acd {

    /* JADX INFO: renamed from: a */
    private final AlarmManager f6484a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2095zh f6485b;

    /* JADX INFO: renamed from: c */
    private Integer f6486c;

    protected aef(abd abdVar) {
        super(abdVar);
        this.f6484a = (AlarmManager) mo7385l().getSystemService("alarm");
        this.f6485b = new aeg(this, abdVar);
    }

    /* JADX INFO: renamed from: A */
    private final int m7707A() {
        if (this.f6486c == null) {
            String strValueOf = String.valueOf(mo7385l().getPackageName());
            this.f6486c = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f6486c.intValue();
    }

    /* JADX INFO: renamed from: B */
    private final PendingIntent m7708B() {
        Intent className = new Intent().setClassName(mo7385l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(mo7385l(), 0, className, 0);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: z */
    private final void m7709z() {
        JobScheduler jobScheduler = (JobScheduler) mo7385l().getSystemService("jobscheduler");
        mo7393t().m7405E().m7413a("Cancelling job. JobID", Integer.valueOf(m7707A()));
        jobScheduler.cancel(m7707A());
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7710a(long j) {
        m7584Q();
        if (!aau.m7450a(mo7385l())) {
            mo7393t().m7404D().m7412a("Receiver not registered/enabled");
        }
        if (!adu.m7679a(mo7385l(), false)) {
            mo7393t().m7404D().m7412a("Service not registered/enabled");
        }
        m7711y();
        long jMo7253b = mo7384k().mo7253b() + j;
        if (j < Math.max(0L, C2106zs.f12734z.m12779b().longValue()) && !this.f6485b.m12755b()) {
            mo7393t().m7405E().m7412a("Scheduling upload with DelayedRunnable");
            this.f6485b.m12754a(j);
        }
        if (Build.VERSION.SDK_INT < 24) {
            mo7393t().m7405E().m7412a("Scheduling upload with AlarmManager");
            this.f6484a.setInexactRepeating(2, jMo7253b, Math.max(C2106zs.f12729u.m12779b().longValue(), j), m7708B());
            return;
        }
        mo7393t().m7405E().m7412a("Scheduling upload with JobScheduler");
        ComponentName componentName = new ComponentName(mo7385l(), "com.google.android.gms.measurement.AppMeasurementJobService");
        JobScheduler jobScheduler = (JobScheduler) mo7385l().getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(m7707A(), componentName);
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j << 1);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        builder.setExtras(persistableBundle);
        JobInfo jobInfoBuild = builder.build();
        mo7393t().m7405E().m7413a("Scheduling job. JobID", Integer.valueOf(m7707A()));
        jobScheduler.schedule(jobInfoBuild);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        this.f6484a.cancel(m7708B());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m7709z();
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m7711y() {
        m7584Q();
        this.f6484a.cancel(m7708B());
        this.f6485b.m12756c();
        if (Build.VERSION.SDK_INT >= 24) {
            m7709z();
        }
    }
}
