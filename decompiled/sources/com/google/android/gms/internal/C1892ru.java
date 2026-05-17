package com.google.android.gms.internal;

import android.app.job.JobParameters;

/* JADX INFO: renamed from: com.google.android.gms.internal.ru */
/* JADX INFO: loaded from: classes.dex */
final class C1892ru implements InterfaceC1869qy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Integer f11491a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1882rk f11492b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ JobParameters f11493c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C1891rt f11494d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ C1834pq f11495e;

    C1892ru(C1891rt c1891rt, Integer num, C1834pq c1834pq, C1882rk c1882rk, JobParameters jobParameters) {
        this.f11494d = c1891rt;
        this.f11491a = num;
        this.f11495e = c1834pq;
        this.f11492b = c1882rk;
        this.f11493c = jobParameters;
    }

    @Override // com.google.android.gms.internal.InterfaceC1869qy
    /* JADX INFO: renamed from: a */
    public final void mo12148a(Throwable th) {
        this.f11494d.f11489a.post(new RunnableC1893rv(this));
    }
}
