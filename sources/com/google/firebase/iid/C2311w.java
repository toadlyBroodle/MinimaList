package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.design.C0025a;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C1310n;
import com.google.firebase.C2213b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.iid.w */
/* JADX INFO: loaded from: classes.dex */
final class C2311w {

    /* JADX INFO: renamed from: a */
    private final Context f13042a;

    /* JADX INFO: renamed from: b */
    private String f13043b;

    /* JADX INFO: renamed from: c */
    private String f13044c;

    /* JADX INFO: renamed from: d */
    private int f13045d;

    /* JADX INFO: renamed from: e */
    private int f13046e = 0;

    public C2311w(Context context) {
        this.f13042a = context;
    }

    /* JADX INFO: renamed from: a */
    private final PackageInfo m13102a(String str) {
        try {
            return this.f13042a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 23).append("Failed to find package ").append(strValueOf).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m13103a(C2213b c2213b) {
        String strM13026d = c2213b.m12937c().m13026d();
        if (strM13026d != null) {
            return strM13026d;
        }
        String strM13024b = c2213b.m12937c().m13024b();
        if (!strM13024b.startsWith("1:")) {
            return strM13024b;
        }
        String[] strArrSplit = strM13024b.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m13104a(KeyPair keyPair) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + C0025a.j.AppCompatTheme_windowFixedHeightMajor);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m13105e() {
        PackageInfo packageInfoM13102a = m13102a(this.f13042a.getPackageName());
        if (packageInfoM13102a != null) {
            this.f13043b = Integer.toString(packageInfoM13102a.versionCode);
            this.f13044c = packageInfoM13102a.versionName;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x000a, B:11:0x001b, B:16:0x0026, B:18:0x002c, B:20:0x003f, B:22:0x0045, B:23:0x004b, B:25:0x005e, B:27:0x0064, B:28:0x006a, B:30:0x0077, B:31:0x007a, B:32:0x007d), top: B:34:0x0002 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int m13106a() {
        int i = 0;
        synchronized (this) {
            if (this.f13046e != 0) {
                i = this.f13046e;
            } else {
                PackageManager packageManager = this.f13042a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                } else if (!C1310n.m7286i()) {
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent2.setPackage("com.google.android.gms");
                        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                            if (C1310n.m7286i()) {
                                this.f13046e = 2;
                            } else {
                                this.f13046e = 1;
                            }
                            i = this.f13046e;
                        } else {
                            this.f13046e = 2;
                            i = this.f13046e;
                        }
                    } else {
                        this.f13046e = 1;
                        i = this.f13046e;
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m13107b() {
        if (this.f13043b == null) {
            m13105e();
        }
        return this.f13043b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m13108c() {
        if (this.f13044c == null) {
            m13105e();
        }
        return this.f13044c;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m13109d() {
        PackageInfo packageInfoM13102a;
        if (this.f13045d == 0 && (packageInfoM13102a = m13102a("com.google.android.gms")) != null) {
            this.f13045d = packageInfoM13102a.versionCode;
        }
        return this.f13045d;
    }
}
