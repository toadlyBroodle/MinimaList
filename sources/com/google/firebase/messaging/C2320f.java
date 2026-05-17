package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: renamed from: com.google.firebase.messaging.f */
/* JADX INFO: loaded from: classes.dex */
final class C2320f {
    /* JADX INFO: renamed from: a */
    private static AppMeasurement m13163a(Context context) {
        try {
            return AppMeasurement.getInstance(context);
        } catch (NoClassDefFoundError e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13164a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("google.c.a.abt");
        if (stringExtra != null) {
            C2319e.m13158a(context, AppMeasurement.FCM_ORIGIN, Base64.decode(stringExtra, 0), new C2318d(), 1);
        }
        m13165a(context, "_nr", intent);
    }

    /* JADX INFO: renamed from: a */
    private static void m13165a(Context context, String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("from");
        if (stringExtra3 == null || !stringExtra3.startsWith("/topics/")) {
            stringExtra3 = null;
        }
        if (stringExtra3 != null) {
            bundle.putString("_nt", stringExtra3);
        }
        try {
            bundle.putInt("_nmt", Integer.valueOf(intent.getStringExtra("google.c.a.ts")).intValue());
        } catch (NumberFormatException e) {
            Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.valueOf(intent.getStringExtra("google.c.a.udt")).intValue());
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle);
            Log.d("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(strValueOf).length()).append("Sending event=").append(str).append(" params=").append(strValueOf).toString());
        }
        AppMeasurement appMeasurementM13163a = m13163a(context);
        if (appMeasurementM13163a != null) {
            appMeasurementM13163a.logEventInternal(AppMeasurement.FCM_ORIGIN, str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13166b(Context context, Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                AppMeasurement appMeasurementM13163a = m13163a(context);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (appMeasurementM13163a != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    appMeasurementM13163a.setUserPropertyInternal(AppMeasurement.FCM_ORIGIN, "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    appMeasurementM13163a.logEventInternal(AppMeasurement.FCM_ORIGIN, "_cmp", bundle);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        m13165a(context, "_no", intent);
    }

    /* JADX INFO: renamed from: c */
    public static void m13167c(Context context, Intent intent) {
        m13165a(context, "_nd", intent);
    }

    /* JADX INFO: renamed from: d */
    public static void m13168d(Context context, Intent intent) {
        m13165a(context, "_nf", intent);
    }
}
