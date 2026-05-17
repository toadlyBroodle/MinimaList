package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.fd */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1551fd {

    /* JADX INFO: renamed from: g */
    private String f10638g;

    /* JADX INFO: renamed from: b */
    private long f10633b = -1;

    /* JADX INFO: renamed from: c */
    private long f10634c = -1;

    /* JADX INFO: renamed from: d */
    private int f10635d = -1;

    /* JADX INFO: renamed from: a */
    int f10632a = -1;

    /* JADX INFO: renamed from: e */
    private long f10636e = 0;

    /* JADX INFO: renamed from: f */
    private final Object f10637f = new Object();

    /* JADX INFO: renamed from: h */
    private int f10639h = 0;

    /* JADX INFO: renamed from: i */
    private int f10640i = 0;

    public C1551fd(String str) {
        this.f10638g = str;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11330a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C1560fm.m11614d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C1560fm.m11614d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            C1560fm.m11615e("Fail to fetch AdActivity theme");
            C1560fm.m11614d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m11331a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f10637f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f10638g);
            bundle.putLong("basets", this.f10634c);
            bundle.putLong("currts", this.f10633b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f10635d);
            bundle.putInt("preqs_in_session", this.f10632a);
            bundle.putLong("time_in_session", this.f10636e);
            bundle.putInt("pclick", this.f10639h);
            bundle.putInt("pimp", this.f10640i);
            bundle.putBoolean("support_transparent_background", m11330a(context));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public final void m11332a() {
        synchronized (this.f10637f) {
            this.f10639h++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11333a(bwx bwxVar, long j) {
        synchronized (this.f10637f) {
            long jM11309k = C0710au.m5573i().m11309k();
            long jMo7252a = C0710au.m5575k().mo7252a();
            if (this.f10634c == -1) {
                if (jMo7252a - jM11309k > ((Long) bxm.m10409f().m10546a(can.f9476aw)).longValue()) {
                    this.f10632a = -1;
                } else {
                    this.f10632a = C0710au.m5573i().m11312n();
                }
                this.f10634c = j;
                this.f10633b = this.f10634c;
            } else {
                this.f10633b = j;
            }
            if (bwxVar == null || bwxVar.f9209c == null || bwxVar.f9209c.getInt("gw", 2) != 1) {
                this.f10635d++;
                this.f10632a++;
                if (this.f10632a == 0) {
                    this.f10636e = 0L;
                    C0710au.m5573i().m11283a(jMo7252a);
                } else {
                    this.f10636e = jMo7252a - C0710au.m5573i().m11310l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11334b() {
        synchronized (this.f10637f) {
            this.f10640i++;
        }
    }
}
