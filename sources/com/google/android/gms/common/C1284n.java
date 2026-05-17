package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC1213ab;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.InterfaceC1212aa;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: renamed from: com.google.android.gms.common.n */
/* JADX INFO: loaded from: classes.dex */
final class C1284n {

    /* JADX INFO: renamed from: a */
    private static InterfaceC1212aa f5984a;

    /* JADX INFO: renamed from: b */
    private static final Object f5985b = new Object();

    /* JADX INFO: renamed from: c */
    private static Context f5986c;

    /* JADX INFO: renamed from: a */
    static synchronized void m7228a(Context context) {
        if (f5986c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f5986c = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7229a() {
        boolean z = true;
        if (f5984a == null) {
            C1221aj.m7065a(f5986c);
            synchronized (f5985b) {
                if (f5984a == null) {
                    try {
                        f5984a = AbstractBinderC1213ab.m7057a(DynamiteModule.m7328a(f5986c, DynamiteModule.f6065c, "com.google.android.gms.googlecertificates").m7339a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    } catch (DynamiteModule.C1323c e) {
                        Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    static boolean m7230a(String str, AbstractBinderC1285o abstractBinderC1285o) {
        return m7231a(str, abstractBinderC1285o, false);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7231a(String str, AbstractBinderC1285o abstractBinderC1285o, boolean z) {
        if (!m7229a()) {
            return false;
        }
        C1221aj.m7065a(f5986c);
        try {
            return f5984a.mo7056a(new C1296u(str, abstractBinderC1285o, z), BinderC0654c.m5329a(f5986c.getPackageManager()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m7232b(String str, AbstractBinderC1285o abstractBinderC1285o) {
        return m7231a(str, abstractBinderC1285o, true);
    }
}
