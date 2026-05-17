package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ab */
/* JADX INFO: loaded from: classes.dex */
final class C0691ab extends TimerTask {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CountDownLatch f4410a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Timer f4411b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractBinderC0689a f4412c;

    C0691ab(AbstractBinderC0689a abstractBinderC0689a, CountDownLatch countDownLatch, Timer timer) {
        this.f4412c = abstractBinderC0689a;
        this.f4410a = countDownLatch;
        this.f4411b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (((Integer) bxm.m10409f().m10546a(can.f9506bZ)).intValue() != this.f4410a.getCount()) {
            C1560fm.m11610b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f4410a.getCount() == 0) {
                this.f4411b.cancel();
                return;
            }
        }
        String strConcat = String.valueOf(this.f4412c.f4405e.f4517c.getPackageName()).concat("_adsTrace_");
        try {
            C1560fm.m11610b("Starting method tracing");
            this.f4410a.countDown();
            Debug.startMethodTracing(new StringBuilder(String.valueOf(strConcat).length() + 20).append(strConcat).append(C0710au.m5575k().mo7252a()).toString(), ((Integer) bxm.m10409f().m10546a(can.f9560ca)).intValue());
        } catch (Exception e) {
            C1560fm.m11613c("Exception occurred while starting method tracing.", e);
        }
    }
}
