package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.p007b.AbstractC0179f;
import android.support.v4.p018i.C0219m;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.iid.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2314z {

    /* JADX INFO: renamed from: b */
    private static C2314z f13056b;

    /* JADX INFO: renamed from: c */
    private final C0219m<String, String> f13058c = new C0219m<>();

    /* JADX INFO: renamed from: d */
    private Boolean f13059d = null;

    /* JADX INFO: renamed from: a */
    final Queue<Intent> f13057a = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    private Queue<Intent> f13060e = new ArrayDeque();

    private C2314z() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m13118a(Context context, Intent intent) {
        String strConcat;
        ComponentName componentNameStartService;
        synchronized (this.f13058c) {
            strConcat = this.f13058c.get(intent.getAction());
        }
        if (strConcat != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(strConcat);
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(strValueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), strConcat);
        } else {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) {
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            } else {
                ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    Log.e("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 94 + String.valueOf(str2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str).append("/").append(str2).toString());
                } else {
                    strConcat = serviceInfo.name;
                    if (strConcat.startsWith(".")) {
                        String strValueOf2 = String.valueOf(context.getPackageName());
                        String strValueOf3 = String.valueOf(strConcat);
                        strConcat = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
                    }
                    synchronized (this.f13058c) {
                        this.f13058c.put(intent.getAction(), strConcat);
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    }
                    intent.setClassName(context.getPackageName(), strConcat);
                }
            }
        }
        try {
            if (this.f13059d == null) {
                this.f13059d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            }
            if (this.f13059d.booleanValue()) {
                componentNameStartService = AbstractC0179f.m1376a_(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            String strValueOf4 = String.valueOf(e);
            Log.e("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf4).length() + 45).append("Failed to start service while in background: ").append(strValueOf4).toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m13119a(Context context, int i, Intent intent, int i2) {
        Intent intent2 = new Intent(context, (Class<?>) FirebaseInstanceIdReceiver.class);
        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
        intent2.putExtra("wrapped_intent", intent);
        return PendingIntent.getBroadcast(context, i, intent2, 1073741824);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2314z m13120a() {
        if (f13056b == null) {
            f13056b = new C2314z();
        }
        return f13056b;
    }

    /* JADX INFO: renamed from: a */
    public final int m13121a(Context context, String str, Intent intent) {
        switch (str) {
            case "com.google.firebase.INSTANCE_ID_EVENT":
                this.f13057a.offer(intent);
                break;
            case "com.google.firebase.MESSAGING_EVENT":
                this.f13060e.offer(intent);
                break;
            default:
                String strValueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Unknown service action: ".concat(strValueOf) : new String("Unknown service action: "));
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m13118a(context, intent2);
    }

    /* JADX INFO: renamed from: b */
    public final Intent m13122b() {
        return this.f13060e.poll();
    }
}
