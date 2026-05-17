package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.adu;
import com.google.android.gms.internal.ady;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements ady {

    /* JADX INFO: renamed from: a */
    private adu<AppMeasurementJobService> f12763a;

    /* JADX INFO: renamed from: a */
    private final adu<AppMeasurementJobService> m12801a() {
        if (this.f12763a == null) {
            this.f12763a = new adu<>(this);
        }
        return this.f12763a;
    }

    @Override // com.google.android.gms.internal.ady
    @TargetApi(24)
    /* JADX INFO: renamed from: a */
    public final void mo7690a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.internal.ady
    /* JADX INFO: renamed from: a */
    public final void mo7691a(Intent intent) {
    }

    @Override // com.google.android.gms.internal.ady
    /* JADX INFO: renamed from: a */
    public final boolean mo7692a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m12801a().m7683a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m12801a().m7687b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m12801a().m7689c(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return m12801a().m7686a(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m12801a().m7688b(intent);
    }
}
