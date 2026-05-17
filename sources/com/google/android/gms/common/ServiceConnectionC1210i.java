package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.common.i */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1210i implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private boolean f5836a = false;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue<IBinder> f5837b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final IBinder m7053a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C1221aj.m7077c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5836a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f5836a = true;
        IBinder iBinderPoll = this.f5837b.poll(10000L, timeUnit);
        if (iBinderPoll == null) {
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        return iBinderPoll;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5837b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
