package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.crash.FirebaseCrash;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class bbb implements AppMeasurement.InterfaceC2116c {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f7706a;

    /* JADX INFO: renamed from: b */
    private final Context f7707b;

    /* JADX INFO: renamed from: c */
    private final FirebaseCrash.InterfaceC2215a f7708c;

    public bbb(Context context, ExecutorService executorService, FirebaseCrash.InterfaceC2215a interfaceC2215a) {
        this.f7707b = context.getApplicationContext();
        this.f7706a = executorService;
        this.f7708c = interfaceC2215a;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.InterfaceC2116c
    /* JADX INFO: renamed from: a */
    public final void mo8795a(String str, String str2, Bundle bundle, long j) {
        if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN) || this.f7708c == null) {
            return;
        }
        this.f7706a.submit(new bas(this.f7707b, this.f7708c, str2, j, bundle));
    }
}
