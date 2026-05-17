package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: renamed from: com.google.firebase.iid.c */
/* JADX INFO: loaded from: classes.dex */
final class C2291c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private RunnableC2290b f12995a;

    public C2291c(RunnableC2290b runnableC2290b) {
        this.f12995a = runnableC2290b;
    }

    /* JADX INFO: renamed from: a */
    public final void m13072a() {
        if (FirebaseInstanceId.m13031g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f12995a.m13070a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12995a != null && this.f12995a.m13071b()) {
            if (FirebaseInstanceId.m13031g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m13029a(this.f12995a, 0L);
            this.f12995a.m13070a().unregisterReceiver(this);
            this.f12995a = null;
        }
    }
}
