package com.google.ads;

import com.google.android.gms.ads.C0681d;

/* JADX INFO: renamed from: com.google.ads.b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0632b {

    /* JADX INFO: renamed from: a */
    public static final C0632b f4295a = new C0632b(-1, -2, "mb");

    /* JADX INFO: renamed from: b */
    public static final C0632b f4296b = new C0632b(320, 50, "mb");

    /* JADX INFO: renamed from: c */
    public static final C0632b f4297c = new C0632b(300, 250, "as");

    /* JADX INFO: renamed from: d */
    public static final C0632b f4298d = new C0632b(468, 60, "as");

    /* JADX INFO: renamed from: e */
    public static final C0632b f4299e = new C0632b(728, 90, "as");

    /* JADX INFO: renamed from: f */
    public static final C0632b f4300f = new C0632b(160, 600, "as");

    /* JADX INFO: renamed from: g */
    private final C0681d f4301g;

    private C0632b(int i, int i2, String str) {
        this(new C0681d(i, i2));
    }

    public C0632b(C0681d c0681d) {
        this.f4301g = c0681d;
    }

    /* JADX INFO: renamed from: a */
    public final int m5300a() {
        return this.f4301g.m5416b();
    }

    /* JADX INFO: renamed from: b */
    public final int m5301b() {
        return this.f4301g.m5414a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0632b) {
            return this.f4301g.equals(((C0632b) obj).f4301g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4301g.hashCode();
    }

    public final String toString() {
        return this.f4301g.toString();
    }
}
