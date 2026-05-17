package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class aav implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ abd f6184a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f6185b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Bundle f6186c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Context f6187d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ aac f6188e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ BroadcastReceiver.PendingResult f6189f;

    aav(aau aauVar, abd abdVar, long j, Bundle bundle, Context context, aac aacVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f6184a = abdVar;
        this.f6185b = j;
        this.f6186c = bundle;
        this.f6187d = context;
        this.f6188e = aacVar;
        this.f6189f = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aej aejVarM12738c = this.f6184a.m7551q().m12738c(this.f6184a.m7559y().m12786z(), "_fot");
        long jLongValue = (aejVarM12738c == null || !(aejVarM12738c.f6500e instanceof Long)) ? 0L : ((Long) aejVarM12738c.f6500e).longValue();
        long j = this.f6185b;
        long j2 = (jLongValue <= 0 || (j < jLongValue && j > 0)) ? j : jLongValue - 1;
        if (j2 > 0) {
            this.f6186c.putLong("click_timestamp", j2);
        }
        AppMeasurement.getInstance(this.f6187d).logEventInternal("auto", "_cmp", this.f6186c);
        this.f6188e.m7405E().m7412a("Install campaign recorded");
        if (this.f6189f != null) {
            this.f6189f.finish();
        }
    }
}
