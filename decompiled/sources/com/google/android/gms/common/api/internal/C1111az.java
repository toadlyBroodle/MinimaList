package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.C0651a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1217af;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1232au;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.az */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1111az {

    /* JADX INFO: renamed from: a */
    private static final Object f5622a = new Object();

    /* JADX INFO: renamed from: b */
    private static C1111az f5623b;

    /* JADX INFO: renamed from: c */
    private final String f5624c;

    /* JADX INFO: renamed from: d */
    private final Status f5625d;

    /* JADX INFO: renamed from: e */
    private final boolean f5626e;

    /* JADX INFO: renamed from: f */
    private final boolean f5627f;

    private C1111az(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C0651a.d.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z = resources.getInteger(identifier) != 0;
            this.f5627f = z ? false : true;
            z = z;
        } else {
            this.f5627f = false;
        }
        this.f5626e = z;
        String strM7059a = C1217af.m7059a(context);
        strM7059a = strM7059a == null ? new C1232au(context).m7088a("google_app_id") : strM7059a;
        if (TextUtils.isEmpty(strM7059a)) {
            this.f5625d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5624c = null;
        } else {
            this.f5624c = strM7059a;
            this.f5625d = Status.f5451a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Status m6847a(Context context) {
        Status status;
        C1221aj.m7066a(context, "Context must not be null.");
        synchronized (f5622a) {
            if (f5623b == null) {
                f5623b = new C1111az(context);
            }
            status = f5623b.f5625d;
        }
        return status;
    }

    /* JADX INFO: renamed from: a */
    private static C1111az m6848a(String str) {
        C1111az c1111az;
        synchronized (f5622a) {
            if (f5623b == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            c1111az = f5623b;
        }
        return c1111az;
    }

    /* JADX INFO: renamed from: a */
    public static String m6849a() {
        return m6848a("getGoogleAppId").f5624c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6850b() {
        return m6848a("isMeasurementExplicitlyDisabled").f5627f;
    }
}
