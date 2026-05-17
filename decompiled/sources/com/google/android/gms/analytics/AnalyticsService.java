package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.C1891rt;
import com.google.android.gms.internal.InterfaceC1894rw;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsService extends Service implements InterfaceC1894rw {

    /* JADX INFO: renamed from: a */
    private C1891rt<AnalyticsService> f4907a;

    /* JADX INFO: renamed from: a */
    private final C1891rt<AnalyticsService> m5929a() {
        if (this.f4907a == null) {
            this.f4907a = new C1891rt<>(this);
        }
        return this.f4907a;
    }

    @Override // com.google.android.gms.internal.InterfaceC1894rw
    /* JADX INFO: renamed from: a */
    public final void mo5927a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.InterfaceC1894rw
    /* JADX INFO: renamed from: a */
    public final boolean mo5928a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m5929a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m5929a().m12276a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m5929a().m12278b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m5929a().m12275a(intent, i, i2);
    }
}
