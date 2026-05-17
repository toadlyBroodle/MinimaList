package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.C1891rt;
import com.google.android.gms.internal.InterfaceC1894rw;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AnalyticsJobService extends JobService implements InterfaceC1894rw {

    /* JADX INFO: renamed from: a */
    private C1891rt<AnalyticsJobService> f4905a;

    /* JADX INFO: renamed from: a */
    private final C1891rt<AnalyticsJobService> m5926a() {
        if (this.f4905a == null) {
            this.f4905a = new C1891rt<>(this);
        }
        return this.f4905a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1894rw
    @TargetApi(24)
    /* JADX INFO: renamed from: a */
    public final void mo5927a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.internal.InterfaceC1894rw
    /* JADX INFO: renamed from: a */
    public final boolean mo5928a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m5926a().m12276a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m5926a().m12278b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m5926a().m12275a(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return m5926a().m12277a(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
