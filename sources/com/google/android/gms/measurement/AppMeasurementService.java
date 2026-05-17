package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.adu;
import com.google.android.gms.internal.ady;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements ady {

    /* JADX INFO: renamed from: a */
    private adu<AppMeasurementService> f12765a;

    /* JADX INFO: renamed from: a */
    private final adu<AppMeasurementService> m12802a() {
        if (this.f12765a == null) {
            this.f12765a = new adu<>(this);
        }
        return this.f12765a;
    }

    @Override // com.google.android.gms.internal.ady
    /* JADX INFO: renamed from: a */
    public final void mo7690a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ady
    /* JADX INFO: renamed from: a */
    public final void mo7691a(Intent intent) {
        AppMeasurementReceiver.m1375a(intent);
    }

    @Override // com.google.android.gms.internal.ady
    /* JADX INFO: renamed from: a */
    public final boolean mo7692a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return m12802a().m7682a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m12802a().m7683a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m12802a().m7687b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m12802a().m7689c(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m12802a().m7681a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m12802a().m7688b(intent);
    }
}
