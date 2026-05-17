package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.p007b.AbstractC0179f;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.google.firebase.iid.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2292d extends Service {

    /* JADX INFO: renamed from: b */
    private Binder f12997b;

    /* JADX INFO: renamed from: d */
    private int f12999d;

    /* JADX INFO: renamed from: a */
    final ExecutorService f12996a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    private final Object f12998c = new Object();

    /* JADX INFO: renamed from: e */
    private int f13000e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m13074d(Intent intent) {
        if (intent != null) {
            AbstractC0179f.m1375a(intent);
        }
        synchronized (this.f12998c) {
            this.f13000e--;
            if (this.f13000e == 0) {
                stopSelfResult(this.f12999d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected Intent mo13047a(Intent intent) {
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13049b(Intent intent);

    /* JADX INFO: renamed from: c */
    public boolean mo13075c(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f12997b == null) {
            this.f12997b = new BinderC2296h(this);
        }
        return this.f12997b;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f12998c) {
            this.f12999d = i2;
            this.f13000e++;
        }
        Intent intentMo13047a = mo13047a(intent);
        if (intentMo13047a == null) {
            m13074d(intent);
            return 2;
        }
        if (mo13075c(intentMo13047a)) {
            m13074d(intent);
            return 2;
        }
        this.f12996a.execute(new RunnableC2293e(this, intentMo13047a, intent));
        return 3;
    }
}
