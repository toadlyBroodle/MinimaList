package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cgu {

    /* JADX INFO: renamed from: a */
    private static cgu f9967a = new cgu();

    /* JADX INFO: renamed from: b */
    private int f9968b;

    /* JADX INFO: renamed from: c */
    private int f9969c;

    /* JADX INFO: renamed from: d */
    private int f9970d;

    /* JADX INFO: renamed from: e */
    private int f9971e;

    /* JADX INFO: renamed from: f */
    private int f9972f;

    /* JADX INFO: renamed from: a */
    public static cgu m10834a() {
        return f9967a;
    }

    /* JADX INFO: renamed from: a */
    final void m10835a(int i) {
        this.f9968b += i;
    }

    /* JADX INFO: renamed from: b */
    final void m10836b() {
        this.f9969c++;
    }

    /* JADX INFO: renamed from: c */
    final void m10837c() {
        this.f9970d++;
    }

    /* JADX INFO: renamed from: d */
    final void m10838d() {
        this.f9971e++;
    }

    /* JADX INFO: renamed from: e */
    final void m10839e() {
        this.f9972f++;
    }

    /* JADX INFO: renamed from: f */
    public final int m10840f() {
        return this.f9969c;
    }

    /* JADX INFO: renamed from: g */
    public final int m10841g() {
        return this.f9970d;
    }

    /* JADX INFO: renamed from: h */
    public final int m10842h() {
        return this.f9971e;
    }

    /* JADX INFO: renamed from: i */
    public final int m10843i() {
        return this.f9972f;
    }

    /* JADX INFO: renamed from: j */
    public final Bundle m10844j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f9968b);
        bundle.putInt("ipds", this.f9969c);
        bundle.putInt("ipde", this.f9970d);
        bundle.putInt("iph", this.f9971e);
        bundle.putInt("ipm", this.f9972f);
        return bundle;
    }
}
