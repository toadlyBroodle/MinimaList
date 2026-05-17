package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.ady;

/* JADX INFO: loaded from: classes.dex */
public final class adu<T extends Context & ady> {

    /* JADX INFO: renamed from: a */
    private final T f6462a;

    public adu(T t) {
        C1221aj.m7065a(t);
        this.f6462a = t;
    }

    /* JADX INFO: renamed from: a */
    private final void m7678a(Runnable runnable) {
        abd abdVarM7497a = abd.m7497a(this.f6462a);
        abdVarM7497a.m7540f();
        abdVarM7497a.m7542h().m7479a(new adx(this, abdVarM7497a, runnable));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7679a(Context context, boolean z) {
        C1221aj.m7065a(context);
        return Build.VERSION.SDK_INT >= 24 ? aek.m7719a(context, "com.google.android.gms.measurement.AppMeasurementJobService") : aek.m7719a(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: renamed from: c */
    private final aac m7680c() {
        return abd.m7497a(this.f6462a).m7540f();
    }

    /* JADX INFO: renamed from: a */
    public final int m7681a(final Intent intent, int i, final int i2) {
        final aac aacVarM7540f = abd.m7497a(this.f6462a).m7540f();
        if (intent == null) {
            aacVarM7540f.m7401A().m7412a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            aacVarM7540f.m7405E().m7414a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                m7678a(new Runnable(this, i2, aacVarM7540f, intent) { // from class: com.google.android.gms.internal.adv

                    /* JADX INFO: renamed from: a */
                    private final adu f6463a;

                    /* JADX INFO: renamed from: b */
                    private final int f6464b;

                    /* JADX INFO: renamed from: c */
                    private final aac f6465c;

                    /* JADX INFO: renamed from: d */
                    private final Intent f6466d;

                    {
                        this.f6463a = this;
                        this.f6464b = i2;
                        this.f6465c = aacVarM7540f;
                        this.f6466d = intent;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6463a.m7684a(this.f6464b, this.f6465c, this.f6466d);
                    }
                });
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m7682a(Intent intent) {
        if (intent == null) {
            m7680c().m7410y().m7412a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new abi(abd.m7497a(this.f6462a));
        }
        m7680c().m7401A().m7413a("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m7683a() {
        abd.m7497a(this.f6462a).m7540f().m7405E().m7412a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m7684a(int i, aac aacVar, Intent intent) {
        if (this.f6462a.mo7692a(i)) {
            aacVar.m7405E().m7413a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m7680c().m7405E().m7412a("Completed wakeful intent.");
            this.f6462a.mo7691a(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m7685a(aac aacVar, JobParameters jobParameters) {
        aacVar.m7405E().m7412a("AppMeasurementJobService processed last upload request.");
        this.f6462a.mo7690a(jobParameters, false);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: a */
    public final boolean m7686a(final JobParameters jobParameters) {
        final aac aacVarM7540f = abd.m7497a(this.f6462a).m7540f();
        String string = jobParameters.getExtras().getString("action");
        aacVarM7540f.m7405E().m7413a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m7678a(new Runnable(this, aacVarM7540f, jobParameters) { // from class: com.google.android.gms.internal.adw

            /* JADX INFO: renamed from: a */
            private final adu f6467a;

            /* JADX INFO: renamed from: b */
            private final aac f6468b;

            /* JADX INFO: renamed from: c */
            private final JobParameters f6469c;

            {
                this.f6467a = this;
                this.f6468b = aacVarM7540f;
                this.f6469c = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6467a.m7685a(this.f6468b, this.f6469c);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7687b() {
        abd.m7497a(this.f6462a).m7540f().m7405E().m7412a("Local AppMeasurementService is shutting down");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7688b(Intent intent) {
        if (intent == null) {
            m7680c().m7410y().m7412a("onUnbind called with null intent");
        } else {
            m7680c().m7405E().m7413a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m7689c(Intent intent) {
        if (intent == null) {
            m7680c().m7410y().m7412a("onRebind called with null intent");
        } else {
            m7680c().m7405E().m7413a("onRebind called. action", intent.getAction());
        }
    }
}
