package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C1299c;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.stats.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1290a {

    /* JADX INFO: renamed from: b */
    private static volatile C1290a f6008b;

    /* JADX INFO: renamed from: d */
    private final List<String> f6010d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    private final List<String> f6011e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    private final List<String> f6012f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: g */
    private final List<String> f6013g = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    private static final Object f6007a = new Object();

    /* JADX INFO: renamed from: c */
    private static boolean f6009c = false;

    private C1290a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1290a m7240a() {
        if (f6008b == null) {
            synchronized (f6007a) {
                if (f6008b == null) {
                    f6008b = new C1290a();
                }
            }
        }
        return f6008b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7241a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m7242a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7242a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C1299c.m7251a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
