package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.bd */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1242bd implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final int f5897a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ AbstractC1233av f5898b;

    public ServiceConnectionC1242bd(AbstractC1233av abstractC1233av, int i) {
        this.f5898b = abstractC1233av;
        this.f5897a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1277x c1278y;
        if (iBinder == null) {
            this.f5898b.m7098c(16);
            return;
        }
        synchronized (this.f5898b.f5876o) {
            AbstractC1233av abstractC1233av = this.f5898b;
            if (iBinder == null) {
                c1278y = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c1278y = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1277x)) ? new C1278y(iBinder) : (InterfaceC1277x) iInterfaceQueryLocalInterface;
            }
            abstractC1233av.f5877p = c1278y;
        }
        this.f5898b.m7108a(0, (Bundle) null, this.f5897a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5898b.f5876o) {
            this.f5898b.f5877p = null;
        }
        this.f5898b.f5862a.sendMessage(this.f5898b.f5862a.obtainMessage(6, this.f5897a, 1));
    }
}
