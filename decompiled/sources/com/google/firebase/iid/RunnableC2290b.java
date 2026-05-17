package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.iid.b */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2290b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final long f12991a;

    /* JADX INFO: renamed from: b */
    private final PowerManager.WakeLock f12992b = ((PowerManager) m13070a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* JADX INFO: renamed from: c */
    private final FirebaseInstanceId f12993c;

    /* JADX INFO: renamed from: d */
    private final C2311w f12994d;

    RunnableC2290b(FirebaseInstanceId firebaseInstanceId, C2311w c2311w, long j) {
        this.f12993c = firebaseInstanceId;
        this.f12994d = c2311w;
        this.f12991a = j;
        this.f12992b.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m13067a(String str) {
        String[] strArrSplit = str.split("!");
        if (strArrSplit.length != 2) {
            return true;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        try {
            switch (str2) {
                case "S":
                    this.f12993c.m13036a(str3);
                    if (FirebaseInstanceId.m13031g()) {
                        Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                        break;
                    }
                    break;
                case "U":
                    this.f12993c.m13039b(str3);
                    if (FirebaseInstanceId.m13031g()) {
                        Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                        break;
                    }
                    break;
            }
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", strValueOf.length() != 0 ? "Topic sync failed: ".concat(strValueOf) : new String("Topic sync failed: "));
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m13068c() {
        C2289ab c2289abM13041d = this.f12993c.m13041d();
        if (c2289abM13041d != null && !c2289abM13041d.m13066b(this.f12994d.m13107b())) {
            return true;
        }
        try {
            String strM13042e = this.f12993c.m13042e();
            if (strM13042e == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (c2289abM13041d != null && (c2289abM13041d == null || strM13042e.equals(c2289abM13041d.f12988a))) {
                return true;
            }
            Context contextM13070a = m13070a();
            Intent intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
            Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
            intent2.setClass(contextM13070a, FirebaseInstanceIdReceiver.class);
            intent2.putExtra("wrapped_intent", intent);
            contextM13070a.sendBroadcast(intent2);
            return true;
        } catch (IOException | SecurityException e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", strValueOf.length() != 0 ? "Token retrieval failed: ".concat(strValueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m13069d() {
        while (true) {
            synchronized (this.f12993c) {
                String strM13056a = FirebaseInstanceId.m13030f().m13056a();
                if (strM13056a == null) {
                    Log.d("FirebaseInstanceId", "topic sync succeeded");
                    return true;
                }
                if (!m13067a(strM13056a)) {
                    return false;
                }
                FirebaseInstanceId.m13030f().m13058a(strM13056a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final Context m13070a() {
        return this.f12993c.m13038b().m12929a();
    }

    /* JADX INFO: renamed from: b */
    final boolean m13071b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m13070a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12992b.acquire();
        try {
            this.f12993c.m13037a(true);
            if (!(this.f12994d.m13106a() != 0)) {
                this.f12993c.m13037a(false);
                return;
            }
            if (!m13071b()) {
                new C2291c(this).m13072a();
                return;
            }
            if (m13068c() && m13069d()) {
                this.f12993c.m13037a(false);
            } else {
                this.f12993c.m13035a(this.f12991a);
            }
        } finally {
            this.f12992b.release();
        }
    }
}
