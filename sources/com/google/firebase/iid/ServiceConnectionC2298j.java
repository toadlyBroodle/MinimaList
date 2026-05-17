package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.C1290a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: com.google.firebase.iid.j */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2298j implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f13013a;

    /* JADX INFO: renamed from: b */
    private final Intent f13014b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f13015c;

    /* JADX INFO: renamed from: d */
    private final Queue<C2294f> f13016d;

    /* JADX INFO: renamed from: e */
    private BinderC2296h f13017e;

    /* JADX INFO: renamed from: f */
    private boolean f13018f;

    public ServiceConnectionC2298j(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private ServiceConnectionC2298j(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f13016d = new ArrayDeque();
        this.f13018f = false;
        this.f13013a = context.getApplicationContext();
        this.f13014b = new Intent(str).setPackage(this.f13013a.getPackageName());
        this.f13015c = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized void m13079a() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (!this.f13016d.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            if (this.f13017e == null || !this.f13017e.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", new StringBuilder(39).append("binder is dead. start connection? ").append(!this.f13018f).toString());
                }
                if (!this.f13018f) {
                    this.f13018f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e);
                    }
                    if (!C1290a.m7240a().m7241a(this.f13013a, this.f13014b, this, 65)) {
                        Log.e("EnhancedIntentService", "binding to the service failed");
                        while (!this.f13016d.isEmpty()) {
                            this.f13016d.poll().m13076a();
                        }
                    }
                }
            } else {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
                }
                this.f13017e.m13078a(this.f13016d.poll());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13080a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f13016d.add(new C2294f(intent, pendingResult, this.f13015c));
        m13079a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f13018f = false;
            this.f13017e = (BinderC2296h) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String strValueOf = String.valueOf(componentName);
                Log.d("EnhancedIntentService", new StringBuilder(String.valueOf(strValueOf).length() + 20).append("onServiceConnected: ").append(strValueOf).toString());
            }
            m13079a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String strValueOf = String.valueOf(componentName);
            Log.d("EnhancedIntentService", new StringBuilder(String.valueOf(strValueOf).length() + 23).append("onServiceDisconnected: ").append(strValueOf).toString());
        }
        m13079a();
    }
}
