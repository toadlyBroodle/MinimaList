package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.util.C1304h;
import com.google.android.gms.common.util.C1310n;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.bt */
/* JADX INFO: loaded from: classes.dex */
public final class C1457bt {

    /* JADX INFO: renamed from: A */
    private String f8908A;

    /* JADX INFO: renamed from: B */
    private boolean f8909B;

    /* JADX INFO: renamed from: a */
    private int f8910a;

    /* JADX INFO: renamed from: b */
    private boolean f8911b;

    /* JADX INFO: renamed from: c */
    private boolean f8912c;

    /* JADX INFO: renamed from: d */
    private int f8913d;

    /* JADX INFO: renamed from: e */
    private int f8914e;

    /* JADX INFO: renamed from: f */
    private int f8915f;

    /* JADX INFO: renamed from: g */
    private String f8916g;

    /* JADX INFO: renamed from: h */
    private int f8917h;

    /* JADX INFO: renamed from: i */
    private int f8918i;

    /* JADX INFO: renamed from: j */
    private int f8919j;

    /* JADX INFO: renamed from: k */
    private boolean f8920k;

    /* JADX INFO: renamed from: l */
    private int f8921l;

    /* JADX INFO: renamed from: m */
    private double f8922m;

    /* JADX INFO: renamed from: n */
    private boolean f8923n;

    /* JADX INFO: renamed from: o */
    private String f8924o;

    /* JADX INFO: renamed from: p */
    private String f8925p;

    /* JADX INFO: renamed from: q */
    private boolean f8926q;

    /* JADX INFO: renamed from: r */
    private boolean f8927r;

    /* JADX INFO: renamed from: s */
    private String f8928s;

    /* JADX INFO: renamed from: t */
    private boolean f8929t;

    /* JADX INFO: renamed from: u */
    private boolean f8930u;

    /* JADX INFO: renamed from: v */
    private String f8931v;

    /* JADX INFO: renamed from: w */
    private String f8932w;

    /* JADX INFO: renamed from: x */
    private float f8933x;

    /* JADX INFO: renamed from: y */
    private int f8934y;

    /* JADX INFO: renamed from: z */
    private int f8935z;

    public C1457bt(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m10210a(context);
        m10212b(context);
        m10213c(context);
        Locale locale = Locale.getDefault();
        this.f8926q = m10208a(packageManager, "geo:0,0?q=donuts") != null;
        this.f8927r = m10208a(packageManager, "http://www.google.com") != null;
        this.f8928s = locale.getCountry();
        bxm.m10404a();
        this.f8929t = C1657jb.m11569a();
        this.f8930u = C1304h.m7266c(context);
        this.f8931v = locale.getLanguage();
        this.f8932w = m10211b(context, packageManager);
        this.f8908A = m10209a(context, packageManager);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f8933x = displayMetrics.density;
        this.f8934y = displayMetrics.widthPixels;
        this.f8935z = displayMetrics.heightPixels;
    }

    public C1457bt(Context context, C1456bs c1456bs) {
        context.getPackageManager();
        m10210a(context);
        m10212b(context);
        m10213c(context);
        this.f8924o = Build.FINGERPRINT;
        this.f8925p = Build.DEVICE;
        this.f8909B = C1310n.m7278a() && cbl.m10592a(context);
        this.f8926q = c1456bs.f8785b;
        this.f8927r = c1456bs.f8786c;
        this.f8928s = c1456bs.f8788e;
        this.f8929t = c1456bs.f8789f;
        this.f8930u = c1456bs.f8790g;
        this.f8931v = c1456bs.f8793j;
        this.f8932w = c1456bs.f8794k;
        this.f8908A = c1456bs.f8795l;
        this.f8933x = c1456bs.f8802s;
        this.f8934y = c1456bs.f8803t;
        this.f8935z = c1456bs.f8804u;
    }

    /* JADX INFO: renamed from: a */
    private static ResolveInfo m10208a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C0710au.m5573i().m11292a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m10209a(Context context, PackageManager packageManager) {
        try {
            PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b("com.android.vending", 128);
            if (packageInfoM12560b == null) {
                return null;
            }
            int i = packageInfoM12560b.versionCode;
            String str = packageInfoM12560b.packageName;
            return new StringBuilder(String.valueOf(str).length() + 12).append(i).append(".").append(str).toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m10210a(Context context) {
        C0710au.m5569e();
        AudioManager audioManagerM11431i = C1596gv.m11431i(context);
        if (audioManagerM11431i != null) {
            try {
                this.f8910a = audioManagerM11431i.getMode();
                this.f8911b = audioManagerM11431i.isMusicActive();
                this.f8912c = audioManagerM11431i.isSpeakerphoneOn();
                this.f8913d = audioManagerM11431i.getStreamVolume(3);
                this.f8914e = audioManagerM11431i.getRingerMode();
                this.f8915f = audioManagerM11431i.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C0710au.m5573i().m11292a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f8910a = -2;
        this.f8911b = false;
        this.f8912c = false;
        this.f8913d = 0;
        this.f8914e = 0;
        this.f8915f = 0;
    }

    /* JADX INFO: renamed from: b */
    private static String m10211b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoM10208a = m10208a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoM10208a == null || (activityInfo = resolveInfoM10208a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b(activityInfo.packageName, 0);
            if (packageInfoM12560b == null) {
                return null;
            }
            int i = packageInfoM12560b.versionCode;
            String str = activityInfo.packageName;
            return new StringBuilder(String.valueOf(str).length() + 12).append(i).append(".").append(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    private final void m10212b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8916g = telephonyManager.getNetworkOperator();
        this.f8918i = telephonyManager.getNetworkType();
        this.f8919j = telephonyManager.getPhoneType();
        this.f8917h = -2;
        this.f8920k = false;
        this.f8921l = -1;
        C0710au.m5569e();
        if (C1596gv.m11400a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f8917h = activeNetworkInfo.getType();
                this.f8921l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f8917h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f8920k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m10213c(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f8922m = -1.0d;
            this.f8923n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f8922m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f8923n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1456bs m10214a() {
        return new C1456bs(this.f8910a, this.f8926q, this.f8927r, this.f8916g, this.f8928s, this.f8929t, this.f8930u, this.f8911b, this.f8912c, this.f8931v, this.f8932w, this.f8908A, this.f8913d, this.f8917h, this.f8918i, this.f8919j, this.f8914e, this.f8915f, this.f8933x, this.f8934y, this.f8935z, this.f8922m, this.f8923n, this.f8920k, this.f8921l, this.f8924o, this.f8909B, this.f8925p);
    }
}
