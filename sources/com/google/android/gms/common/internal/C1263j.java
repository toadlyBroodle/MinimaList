package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C1290a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.j */
/* JADX INFO: loaded from: classes.dex */
final class C1263j extends AbstractC1261h implements Handler.Callback {

    /* JADX INFO: renamed from: b */
    private final Context f5957b;

    /* JADX INFO: renamed from: c */
    private final Handler f5958c;

    /* JADX INFO: renamed from: a */
    private final HashMap<C1262i, ServiceConnectionC1264k> f5956a = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private final C1290a f5959d = C1290a.m7240a();

    /* JADX INFO: renamed from: e */
    private final long f5960e = 5000;

    /* JADX INFO: renamed from: f */
    private final long f5961f = 300000;

    C1263j(Context context) {
        this.f5957b = context.getApplicationContext();
        this.f5958c = new Handler(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1261h
    /* JADX INFO: renamed from: a */
    protected final boolean mo7187a(C1262i c1262i, ServiceConnection serviceConnection, String str) {
        boolean zM7200a;
        C1221aj.m7066a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5956a) {
            ServiceConnectionC1264k serviceConnectionC1264k = this.f5956a.get(c1262i);
            if (serviceConnectionC1264k != null) {
                this.f5958c.removeMessages(0, c1262i);
                if (!serviceConnectionC1264k.m7201a(serviceConnection)) {
                    serviceConnectionC1264k.m7198a(serviceConnection, str);
                    switch (serviceConnectionC1264k.m7202b()) {
                        case 1:
                            serviceConnection.onServiceConnected(serviceConnectionC1264k.m7207e(), serviceConnectionC1264k.m7206d());
                            break;
                        case 2:
                            serviceConnectionC1264k.m7199a(str);
                            break;
                    }
                } else {
                    String strValueOf = String.valueOf(c1262i);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(strValueOf).toString());
                }
            } else {
                serviceConnectionC1264k = new ServiceConnectionC1264k(this, c1262i);
                serviceConnectionC1264k.m7198a(serviceConnection, str);
                serviceConnectionC1264k.m7199a(str);
                this.f5956a.put(c1262i, serviceConnectionC1264k);
            }
            zM7200a = serviceConnectionC1264k.m7200a();
        }
        return zM7200a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1261h
    /* JADX INFO: renamed from: b */
    protected final void mo7188b(C1262i c1262i, ServiceConnection serviceConnection, String str) {
        C1221aj.m7066a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5956a) {
            ServiceConnectionC1264k serviceConnectionC1264k = this.f5956a.get(c1262i);
            if (serviceConnectionC1264k == null) {
                String strValueOf = String.valueOf(c1262i);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 50).append("Nonexistent connection status for service config: ").append(strValueOf).toString());
            }
            if (!serviceConnectionC1264k.m7201a(serviceConnection)) {
                String strValueOf2 = String.valueOf(c1262i);
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(strValueOf2).toString());
            }
            serviceConnectionC1264k.m7203b(serviceConnection, str);
            if (serviceConnectionC1264k.m7205c()) {
                this.f5958c.sendMessageDelayed(this.f5958c.obtainMessage(0, c1262i), this.f5960e);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f5956a) {
                    C1262i c1262i = (C1262i) message.obj;
                    ServiceConnectionC1264k serviceConnectionC1264k = this.f5956a.get(c1262i);
                    if (serviceConnectionC1264k != null && serviceConnectionC1264k.m7205c()) {
                        if (serviceConnectionC1264k.m7200a()) {
                            serviceConnectionC1264k.m7204b("GmsClientSupervisor");
                        }
                        this.f5956a.remove(c1262i);
                    }
                    break;
                }
                return true;
            case 1:
                synchronized (this.f5956a) {
                    C1262i c1262i2 = (C1262i) message.obj;
                    ServiceConnectionC1264k serviceConnectionC1264k2 = this.f5956a.get(c1262i2);
                    if (serviceConnectionC1264k2 != null && serviceConnectionC1264k2.m7202b() == 3) {
                        String strValueOf = String.valueOf(c1262i2);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(strValueOf).toString(), new Exception());
                        ComponentName componentNameM7207e = serviceConnectionC1264k2.m7207e();
                        if (componentNameM7207e == null) {
                            componentNameM7207e = c1262i2.m7190b();
                        }
                        serviceConnectionC1264k2.onServiceDisconnected(componentNameM7207e == null ? new ComponentName(c1262i2.m7189a(), "unknown") : componentNameM7207e);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
