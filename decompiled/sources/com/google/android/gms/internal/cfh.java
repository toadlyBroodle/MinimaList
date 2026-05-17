package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
final class cfh implements InterfaceC1235ax {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cff f9910a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1700kr f9911b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ cez f9912c;

    cfh(cff cffVar, C1700kr c1700kr, cez cezVar) {
        this.f9910a = cffVar;
        this.f9911b = c1700kr;
        this.f9912c = cezVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7136a(int i) {
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7137a(Bundle bundle) {
        synchronized (this.f9910a.f9908d) {
            if (this.f9910a.f9906b) {
                return;
            }
            cff.m10787a(this.f9910a, true);
            final cey ceyVar = this.f9910a.f9905a;
            if (ceyVar == null) {
                return;
            }
            final C1700kr c1700kr = this.f9911b;
            final cez cezVar = this.f9912c;
            final InterfaceFutureC1689kg<Void> interfaceFutureC1689kgM11370a = C1590gp.m11370a(new Runnable(this, ceyVar, c1700kr, cezVar) { // from class: com.google.android.gms.internal.cfj

                /* JADX INFO: renamed from: a */
                private final cfh f9916a;

                /* JADX INFO: renamed from: b */
                private final cey f9917b;

                /* JADX INFO: renamed from: c */
                private final C1700kr f9918c;

                /* JADX INFO: renamed from: d */
                private final cez f9919d;

                {
                    this.f9916a = this;
                    this.f9917b = ceyVar;
                    this.f9918c = c1700kr;
                    this.f9919d = cezVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cfh cfhVar = this.f9916a;
                    cey ceyVar2 = this.f9917b;
                    C1700kr c1700kr2 = this.f9918c;
                    try {
                        c1700kr2.m11657b(ceyVar2.m10781e().mo10783a(this.f9919d));
                    } catch (RemoteException e) {
                        C1560fm.m11611b("Unable to obtain a cache service instance.", e);
                        c1700kr2.m11656a(e);
                        cfhVar.f9910a.m10785a();
                    }
                }
            });
            C1700kr c1700kr2 = this.f9911b;
            final C1700kr c1700kr3 = this.f9911b;
            c1700kr2.mo11631a(new Runnable(c1700kr3, interfaceFutureC1689kgM11370a) { // from class: com.google.android.gms.internal.cfk

                /* JADX INFO: renamed from: a */
                private final C1700kr f9920a;

                /* JADX INFO: renamed from: b */
                private final Future f9921b;

                {
                    this.f9920a = c1700kr3;
                    this.f9921b = interfaceFutureC1689kgM11370a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1700kr c1700kr4 = this.f9920a;
                    Future future = this.f9921b;
                    if (c1700kr4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, C1695km.f10894b);
        }
    }
}
