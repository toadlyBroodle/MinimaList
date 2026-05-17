package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.stats.C1290a;
import com.google.android.gms.tagmanager.TagManagerService;

/* JADX INFO: loaded from: classes.dex */
public final class ajt implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f6949a;

    /* JADX INFO: renamed from: b */
    private final C1290a f6950b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f6951c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f6952d;

    /* JADX INFO: renamed from: e */
    private aho f6953e;

    public ajt(Context context) {
        this(context, C1290a.m7240a());
    }

    private ajt(Context context, C1290a c1290a) {
        this.f6951c = false;
        this.f6952d = false;
        this.f6949a = context;
        this.f6950b = c1290a;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m8060c() {
        if (this.f6951c) {
            return true;
        }
        synchronized (this) {
            if (this.f6951c) {
                return true;
            }
            if (!this.f6952d) {
                if (!this.f6950b.m7241a(this.f6949a, new Intent(this.f6949a, (Class<?>) TagManagerService.class), this, 1)) {
                    return false;
                }
                this.f6952d = true;
            }
            while (this.f6952d) {
                try {
                    wait();
                    this.f6952d = false;
                } catch (InterruptedException e) {
                    ahs.m7945b("Error connecting to TagManagerService", e);
                    this.f6952d = false;
                }
            }
            return this.f6951c;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8061a(String str, Bundle bundle, String str2, long j, boolean z) {
        if (m8060c()) {
            try {
                this.f6953e.mo7934a(str, bundle, str2, j, z);
            } catch (RemoteException e) {
                ahs.m7945b("Error calling service to emit event", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8062a(String str, String str2, String str3, ahk ahkVar) {
        if (m8060c()) {
            try {
                this.f6953e.mo7936a(str, str2, str3, ahkVar);
                return;
            } catch (RemoteException e) {
                ahs.m7945b("Error calling service to load container", e);
            }
        }
        if (ahkVar != null) {
            try {
                ahkVar.mo7930a(false, str);
            } catch (RemoteException e2) {
                ahs.m7943a("Error - local callback should not throw RemoteException", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8063a() {
        if (m8060c()) {
            try {
                this.f6953e.mo7933a();
                return true;
            } catch (RemoteException e) {
                ahs.m7945b("Error in resetting service", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m8064b() {
        if (m8060c()) {
            try {
                this.f6953e.mo7937b();
            } catch (RemoteException e) {
                ahs.m7945b("Error calling service to dispatch pending events", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aho ahqVar;
        synchronized (this) {
            if (iBinder == null) {
                ahqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                ahqVar = iInterfaceQueryLocalInterface instanceof aho ? (aho) iInterfaceQueryLocalInterface : new ahq(iBinder);
            }
            this.f6953e = ahqVar;
            this.f6951c = true;
            this.f6952d = false;
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f6953e = null;
            this.f6951c = false;
            this.f6952d = false;
        }
    }
}
