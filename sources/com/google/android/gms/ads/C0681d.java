package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.C1657jb;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxm;

/* JADX INFO: renamed from: com.google.android.gms.ads.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0681d {

    /* JADX INFO: renamed from: a */
    public static final C0681d f4380a = new C0681d(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: b */
    public static final C0681d f4381b = new C0681d(468, 60, "468x60_as");

    /* JADX INFO: renamed from: c */
    public static final C0681d f4382c = new C0681d(320, 100, "320x100_as");

    /* JADX INFO: renamed from: d */
    public static final C0681d f4383d = new C0681d(728, 90, "728x90_as");

    /* JADX INFO: renamed from: e */
    public static final C0681d f4384e = new C0681d(300, 250, "300x250_as");

    /* JADX INFO: renamed from: f */
    public static final C0681d f4385f = new C0681d(160, 600, "160x600_as");

    /* JADX INFO: renamed from: g */
    public static final C0681d f4386g = new C0681d(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: h */
    public static final C0681d f4387h = new C0681d(-3, -4, "fluid");

    /* JADX INFO: renamed from: i */
    public static final C0681d f4388i = new C0681d(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: j */
    public static final C0681d f4389j = new C0681d(-3, 0, "search_v2");

    /* JADX INFO: renamed from: k */
    private final int f4390k;

    /* JADX INFO: renamed from: l */
    private final int f4391l;

    /* JADX INFO: renamed from: m */
    private final String f4392m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0681d(int i, int i2) {
        String strValueOf = i == -1 ? "FULL" : String.valueOf(i);
        String strValueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        this(i, i2, new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + String.valueOf("_as").length()).append(strValueOf).append("x").append(strValueOf2).append("_as").toString());
    }

    C0681d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(new StringBuilder(37).append("Invalid width for AdSize: ").append(i).toString());
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(new StringBuilder(38).append("Invalid height for AdSize: ").append(i2).toString());
        }
        this.f4390k = i;
        this.f4391l = i2;
        this.f4392m = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m5414a() {
        return this.f4391l;
    }

    /* JADX INFO: renamed from: a */
    public final int m5415a(Context context) {
        switch (this.f4391l) {
            case -4:
            case -3:
                return -1;
            case -2:
                return bxb.m10382b(context.getResources().getDisplayMetrics());
            default:
                bxm.m10404a();
                return C1657jb.m11560a(context, this.f4391l);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5416b() {
        return this.f4390k;
    }

    /* JADX INFO: renamed from: b */
    public final int m5417b(Context context) {
        switch (this.f4390k) {
            case -4:
            case -3:
                return -1;
            case -2:
            default:
                bxm.m10404a();
                return C1657jb.m11560a(context, this.f4390k);
            case -1:
                return bxb.m10379a(context.getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5418c() {
        return this.f4390k == -3 && this.f4391l == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0681d)) {
            return false;
        }
        C0681d c0681d = (C0681d) obj;
        return this.f4390k == c0681d.f4390k && this.f4391l == c0681d.f4391l && this.f4392m.equals(c0681d.f4392m);
    }

    public final int hashCode() {
        return this.f4392m.hashCode();
    }

    public final String toString() {
        return this.f4392m;
    }
}
