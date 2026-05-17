package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class bxf {

    /* JADX INFO: renamed from: a */
    private bym f9260a;

    /* JADX INFO: renamed from: b */
    private final Object f9261b = new Object();

    /* JADX INFO: renamed from: c */
    private final bww f9262c;

    /* JADX INFO: renamed from: d */
    private final bwv f9263d;

    /* JADX INFO: renamed from: e */
    private final bzl f9264e;

    /* JADX INFO: renamed from: f */
    private final ces f9265f;

    /* JADX INFO: renamed from: g */
    private final C1491cy f9266g;

    /* JADX INFO: renamed from: h */
    private final ckh f9267h;

    /* JADX INFO: renamed from: i */
    private final cet f9268i;

    /* JADX INFO: renamed from: com.google.android.gms.internal.bxf$a */
    abstract class AbstractC1463a<T> {
        AbstractC1463a() {
        }

        /* JADX INFO: renamed from: a */
        protected abstract T mo10400a();

        /* JADX INFO: renamed from: a */
        protected abstract T mo10401a(bym bymVar);

        /* JADX INFO: renamed from: b */
        protected final T m10402b() {
            bym bymVarM10395b = bxf.this.m10395b();
            if (bymVarM10395b == null) {
                C1668jm.m11615e("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo10401a(bymVarM10395b);
            } catch (RemoteException e) {
                C1668jm.m11613c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        protected final T m10403c() {
            try {
                return mo10400a();
            } catch (RemoteException e) {
                C1668jm.m11613c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public bxf(bww bwwVar, bwv bwvVar, bzl bzlVar, ces cesVar, C1491cy c1491cy, ckh ckhVar, cet cetVar) {
        this.f9262c = bwwVar;
        this.f9263d = bwvVar;
        this.f9264e = bzlVar;
        this.f9265f = cesVar;
        this.f9266g = c1491cy;
        this.f9267h = ckhVar;
        this.f9268i = cetVar;
    }

    /* JADX INFO: renamed from: a */
    private static bym m10389a() {
        bym bymVarAsInterface;
        try {
            Object objNewInstance = bxf.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (objNewInstance instanceof IBinder) {
                bymVarAsInterface = byn.asInterface((IBinder) objNewInstance);
            } else {
                C1668jm.m11615e("ClientApi class is not an instance of IBinder");
                bymVarAsInterface = null;
            }
            return bymVarAsInterface;
        } catch (Exception e) {
            C1668jm.m11613c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static <T> T m10391a(Context context, boolean z, AbstractC1463a<T> abstractC1463a) {
        boolean z2 = z;
        if (!z2) {
            bxm.m10404a();
            if (!C1657jb.m11576c(context)) {
                C1668jm.m11610b("Google Play Services is not available");
                z2 = true;
            }
        }
        bxm.m10404a();
        int iM11578e = C1657jb.m11578e(context);
        bxm.m10404a();
        if (iM11578e <= C1657jb.m11577d(context) ? z2 : true) {
            T tM10402b = abstractC1463a.m10402b();
            return tM10402b == null ? abstractC1463a.m10403c() : tM10402b;
        }
        T tM10403c = abstractC1463a.m10403c();
        return tM10403c == null ? abstractC1463a.m10402b() : tM10403c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m10392a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        bxm.m10404a().m11583a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final bym m10395b() {
        bym bymVar;
        synchronized (this.f9261b) {
            if (this.f9260a == null) {
                this.f9260a = m10389a();
            }
            bymVar = this.f9260a;
        }
        return bymVar;
    }

    /* JADX INFO: renamed from: a */
    public final bxy m10398a(Context context, String str, cii ciiVar) {
        return (bxy) m10391a(context, false, (AbstractC1463a) new bxj(this, context, str, ciiVar));
    }

    /* JADX INFO: renamed from: a */
    public final cki m10399a(Activity activity) {
        boolean booleanExtra = false;
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            C1668jm.m11612c("useClientJar flag not found in activity intent extras.");
        }
        return (cki) m10391a(activity, booleanExtra, new bxl(this, activity));
    }
}
