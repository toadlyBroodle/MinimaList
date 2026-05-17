package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;
import com.google.android.gms.common.stats.C1290a;

/* JADX INFO: loaded from: classes.dex */
public final class adn implements ServiceConnection, InterfaceC1235ax, InterfaceC1236ay {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ acz f6450a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f6451b;

    /* JADX INFO: renamed from: c */
    private volatile aab f6452c;

    protected adn(acz aczVar) {
        this.f6450a = aczVar;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m7675a(adn adnVar, boolean z) {
        adnVar.f6451b = false;
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m7676a() {
        this.f6450a.mo7376c();
        Context contextMo7385l = this.f6450a.mo7385l();
        synchronized (this) {
            if (this.f6451b) {
                this.f6450a.mo7393t().m7405E().m7412a("Connection attempt already in progress");
                return;
            }
            if (this.f6452c != null) {
                this.f6450a.mo7393t().m7405E().m7412a("Already awaiting connection attempt");
                return;
            }
            this.f6452c = new aab(contextMo7385l, Looper.getMainLooper(), this, this);
            this.f6450a.mo7393t().m7405E().m7412a("Connecting to remote service");
            this.f6451b = true;
            this.f6452c.m7126r();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7136a(int i) {
        C1221aj.m7073b("MeasurementServiceConnection.onConnectionSuspended");
        this.f6450a.mo7393t().m7404D().m7412a("Service connection suspended");
        this.f6450a.mo7392s().m7479a(new adr(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m7677a(Intent intent) {
        this.f6450a.mo7376c();
        Context contextMo7385l = this.f6450a.mo7385l();
        C1290a c1290aM7240a = C1290a.m7240a();
        synchronized (this) {
            if (this.f6451b) {
                this.f6450a.mo7393t().m7405E().m7412a("Connection attempt already in progress");
                return;
            }
            this.f6450a.mo7393t().m7405E().m7412a("Using local app measurement service");
            this.f6451b = true;
            c1290aM7240a.m7241a(contextMo7385l, intent, this.f6450a.f6397a, 129);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7137a(Bundle bundle) {
        C1221aj.m7073b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                InterfaceC2108zu interfaceC2108zuM7131w = this.f6452c.m7131w();
                this.f6452c = null;
                this.f6450a.mo7392s().m7479a(new adq(this, interfaceC2108zuM7131w));
            } catch (DeadObjectException | IllegalStateException e) {
                this.f6452c = null;
                this.f6451b = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1236ay
    /* JADX INFO: renamed from: a */
    public final void mo7138a(C1071a c1071a) {
        C1221aj.m7073b("MeasurementServiceConnection.onConnectionFailed");
        aac aacVarM7541g = this.f6450a.f6329p.m7541g();
        if (aacVarM7541g != null) {
            aacVarM7541g.m7401A().m7413a("Service connection failed", c1071a);
        }
        synchronized (this) {
            this.f6451b = false;
            this.f6452c = null;
        }
        this.f6450a.mo7392s().m7479a(new ads(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC2108zu c2110zw;
        C1221aj.m7073b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f6451b = false;
                this.f6450a.mo7393t().m7410y().m7412a("Service connected with null binder");
                return;
            }
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder == null) {
                        c2110zw = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        c2110zw = iInterfaceQueryLocalInterface instanceof InterfaceC2108zu ? (InterfaceC2108zu) iInterfaceQueryLocalInterface : new C2110zw(iBinder);
                    }
                    try {
                        this.f6450a.mo7393t().m7405E().m7412a("Bound to IMeasurementService interface");
                    } catch (RemoteException e) {
                        this.f6450a.mo7393t().m7410y().m7412a("Service connect failed to get IMeasurementService");
                    }
                } else {
                    this.f6450a.mo7393t().m7410y().m7413a("Got binder with a wrong descriptor", interfaceDescriptor);
                    c2110zw = null;
                }
            } catch (RemoteException e2) {
                c2110zw = null;
            }
            if (c2110zw == null) {
                this.f6451b = false;
                try {
                    C1290a.m7240a();
                    this.f6450a.mo7385l().unbindService(this.f6450a.f6397a);
                } catch (IllegalArgumentException e3) {
                }
            } else {
                this.f6450a.mo7392s().m7479a(new ado(this, c2110zw));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1221aj.m7073b("MeasurementServiceConnection.onServiceDisconnected");
        this.f6450a.mo7393t().m7404D().m7412a("Service disconnected");
        this.f6450a.mo7392s().m7479a(new adp(this, componentName));
    }
}
