package com.google.android.gms.cast.framework.media;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C0993a;
import com.google.android.gms.internal.C1931tf;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
public class MediaNotificationService extends Service {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5285a = new C1992vm("MediaNotificationService");

    /* JADX INFO: renamed from: b */
    private InterfaceC1027p f5286b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f5286b.mo6515a(intent);
        } catch (RemoteException e) {
            f5285a.m12446a(e, "Unable to call %s on %s.", "onBind", InterfaceC1027p.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5286b = C1931tf.m12312a(this, C0993a.m6331a(this).m6336d(), BinderC0654c.m5329a((Object) null), C0993a.m6331a(this).m6333a().m6359f());
        try {
            this.f5286b.mo6516a();
        } catch (RemoteException e) {
            f5285a.m12446a(e, "Unable to call %s on %s.", "onCreate", InterfaceC1027p.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f5286b.mo6517b();
        } catch (RemoteException e) {
            f5285a.m12446a(e, "Unable to call %s on %s.", "onDestroy", InterfaceC1027p.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f5286b.mo6514a(intent, i, i2);
        } catch (RemoteException e) {
            f5285a.m12446a(e, "Unable to call %s on %s.", "onStartCommand", InterfaceC1027p.class.getSimpleName());
            return 1;
        }
    }
}
