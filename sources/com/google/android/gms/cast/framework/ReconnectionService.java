package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.C1931tf;
import com.google.android.gms.internal.C1992vm;

/* JADX INFO: loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5216a = new C1992vm("ReconnectionService");

    /* JADX INFO: renamed from: b */
    private InterfaceC1050z f5217b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f5217b.mo6338a(intent);
        } catch (RemoteException e) {
            f5216a.m12446a(e, "Unable to call %s on %s.", "onBind", InterfaceC1050z.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        C0993a c0993aM6331a = C0993a.m6331a(this);
        this.f5217b = C1931tf.m12315a(this, c0993aM6331a.m6334b().m6405b(), c0993aM6331a.m6335c().m6525a());
        try {
            this.f5217b.mo6339a();
        } catch (RemoteException e) {
            f5216a.m12446a(e, "Unable to call %s on %s.", "onCreate", InterfaceC1050z.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f5217b.mo6340b();
        } catch (RemoteException e) {
            f5216a.m12446a(e, "Unable to call %s on %s.", "onDestroy", InterfaceC1050z.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f5217b.mo6337a(intent, i, i2);
        } catch (RemoteException e) {
            f5216a.m12446a(e, "Unable to call %s on %s.", "onStartCommand", InterfaceC1050z.class.getSimpleName());
            return 1;
        }
    }
}
