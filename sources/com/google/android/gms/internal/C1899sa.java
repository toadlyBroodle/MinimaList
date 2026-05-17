package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.sa */
/* JADX INFO: loaded from: classes.dex */
public final class C1899sa extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    protected boolean f11502a;

    /* JADX INFO: renamed from: b */
    protected int f11503b;

    /* JADX INFO: renamed from: c */
    private String f11504c;

    /* JADX INFO: renamed from: d */
    private String f11505d;

    /* JADX INFO: renamed from: e */
    private int f11506e;

    /* JADX INFO: renamed from: f */
    private boolean f11507f;

    /* JADX INFO: renamed from: g */
    private boolean f11508g;

    public C1899sa(C1834pq c1834pq) {
        super(c1834pq);
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        ApplicationInfo applicationInfo;
        int i;
        C1876re c1876reM12164a;
        Context contextM12038j = m12038j();
        try {
            applicationInfo = contextM12038j.getPackageManager().getApplicationInfo(contextM12038j.getPackageName(), 129);
        } catch (PackageManager.NameNotFoundException e) {
            m12031d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            m12033e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0 || (c1876reM12164a = new C1874rc(m12036h()).m12164a(i)) == null) {
            return;
        }
        m12023b("Loading global XML config values");
        if (c1876reM12164a.f11447a != null) {
            String str = c1876reM12164a.f11447a;
            this.f11505d = str;
            m12024b("XML config - app name", str);
        }
        if (c1876reM12164a.f11448b != null) {
            String str2 = c1876reM12164a.f11448b;
            this.f11504c = str2;
            m12024b("XML config - app version", str2);
        }
        if (c1876reM12164a.f11449c != null) {
            String lowerCase = c1876reM12164a.f11449c.toLowerCase();
            int i2 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
            if (i2 >= 0) {
                this.f11506e = i2;
                m12020a("XML config - log level", Integer.valueOf(i2));
            }
        }
        if (c1876reM12164a.f11450d >= 0) {
            int i3 = c1876reM12164a.f11450d;
            this.f11503b = i3;
            this.f11502a = true;
            m12024b("XML config - dispatch period (sec)", Integer.valueOf(i3));
        }
        if (c1876reM12164a.f11451e != -1) {
            boolean z = c1876reM12164a.f11451e == 1;
            this.f11508g = z;
            this.f11507f = true;
            m12024b("XML config - dry run", Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m12297b() {
        m12052y();
        return this.f11504c;
    }

    /* JADX INFO: renamed from: c */
    public final String m12298c() {
        m12052y();
        return this.f11505d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12299d() {
        m12052y();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12300e() {
        m12052y();
        return this.f11507f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12301f() {
        m12052y();
        return this.f11508g;
    }
}
