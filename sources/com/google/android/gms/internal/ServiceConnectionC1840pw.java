package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1290a;

/* JADX INFO: renamed from: com.google.android.gms.internal.pw */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1840pw implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1838pu f11334a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC1878rg f11335b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f11336c;

    protected ServiceConnectionC1840pw(C1838pu c1838pu) {
        this.f11334a = c1838pu;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1878rg m12095a() {
        InterfaceC1878rg interfaceC1878rg = null;
        C0903r.m6076d();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context contextM12038j = this.f11334a.m12038j();
        intent.putExtra("app_package_name", contextM12038j.getPackageName());
        C1290a c1290aM7240a = C1290a.m7240a();
        synchronized (this) {
            this.f11335b = null;
            this.f11336c = true;
            boolean zM7241a = c1290aM7240a.m7241a(contextM12038j, intent, this.f11334a.f11329a, 129);
            this.f11334a.m12020a("Bind to service requested", Boolean.valueOf(zM7241a));
            if (zM7241a) {
                try {
                    wait(C1872ra.f11401B.m12204a().longValue());
                } catch (InterruptedException e) {
                    this.f11334a.m12033e("Wait for service connect was interrupted");
                }
                this.f11336c = false;
                interfaceC1878rg = this.f11335b;
                this.f11335b = null;
                if (interfaceC1878rg == null) {
                    this.f11334a.m12035f("Successfully bound to service but never got onServiceConnected callback");
                }
            } else {
                this.f11336c = false;
            }
        }
        return interfaceC1878rg;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1878rg c1879rh;
        C1221aj.m7073b("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.f11334a.m12035f("Service connected with null binder");
                    return;
                }
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        if (iBinder == null) {
                            c1879rh = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                            c1879rh = iInterfaceQueryLocalInterface instanceof InterfaceC1878rg ? (InterfaceC1878rg) iInterfaceQueryLocalInterface : new C1879rh(iBinder);
                        }
                        try {
                            this.f11334a.m12023b("Bound to IAnalyticsService interface");
                        } catch (RemoteException e) {
                            this.f11334a.m12035f("Service connect failed to get IAnalyticsService");
                        }
                    } else {
                        this.f11334a.m12034e("Got binder with a wrong descriptor", interfaceDescriptor);
                        c1879rh = null;
                    }
                } catch (RemoteException e2) {
                    c1879rh = null;
                }
                if (c1879rh == null) {
                    try {
                        C1290a.m7240a();
                        this.f11334a.m12038j().unbindService(this.f11334a.f11329a);
                    } catch (IllegalArgumentException e3) {
                    }
                } else if (this.f11336c) {
                    this.f11335b = c1879rh;
                } else {
                    this.f11334a.m12033e("onServiceConnected received after the timeout limit");
                    this.f11334a.m12041m().m6080a(new RunnableC1841px(this, c1879rh));
                }
            } finally {
                notifyAll();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1221aj.m7073b("AnalyticsServiceConnection.onServiceDisconnected");
        this.f11334a.m12041m().m6080a(new RunnableC1842py(this, componentName));
    }
}
