package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.crash.FirebaseCrash;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bbc {

    /* JADX INFO: renamed from: a */
    private final AppMeasurement f7709a;

    private bbc(AppMeasurement appMeasurement) {
        this.f7709a = appMeasurement;
    }

    /* JADX INFO: renamed from: a */
    public static bbc m8796a(Context context) {
        try {
            return new bbc(AppMeasurement.getInstance(context));
        } catch (NoClassDefFoundError e) {
            String strValueOf = String.valueOf(e);
            Log.w("FirebaseCrashAnalytics", new StringBuilder(String.valueOf(strValueOf).length() + 50).append("Unable to log event, missing measurement library: ").append(strValueOf).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8797a(Context context, ExecutorService executorService, FirebaseCrash.InterfaceC2215a interfaceC2215a) {
        this.f7709a.registerOnMeasurementEventListener(new bbb(context, executorService, interfaceC2215a));
    }

    /* JADX INFO: renamed from: a */
    public final void m8798a(boolean z, long j) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("fatal", 1);
        } else {
            bundle.putInt("fatal", 0);
        }
        bundle.putLong("timestamp", j);
        this.f7709a.logEventInternal(AppMeasurement.CRASH_ORIGIN, "_ae", bundle);
    }
}
