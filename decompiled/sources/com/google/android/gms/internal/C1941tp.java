package com.google.android.gms.internal;

import android.os.RemoteException;
import android.support.v7.p027d.C0376g;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.tp */
/* JADX INFO: loaded from: classes.dex */
public final class C1941tp extends C0376g.a {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f11609a = new C1992vm("MediaRouterCallback");

    /* JADX INFO: renamed from: b */
    private final InterfaceC1939tn f11610b;

    public C1941tp(InterfaceC1939tn interfaceC1939tn) {
        this.f11610b = (InterfaceC1939tn) C1221aj.m7065a(interfaceC1939tn);
    }

    @Override // android.support.v7.p027d.C0376g.a
    /* JADX INFO: renamed from: a */
    public final void mo2905a(C0376g c0376g, C0376g.g gVar) {
        try {
            this.f11610b.mo12338d(gVar.m2984c(), gVar.m2995n());
        } catch (RemoteException e) {
            f11609a.m12446a(e, "Unable to call %s on %s.", "onRouteSelected", InterfaceC1939tn.class.getSimpleName());
        }
    }

    @Override // android.support.v7.p027d.C0376g.a
    /* JADX INFO: renamed from: a */
    public final void mo2906a(C0376g c0376g, C0376g.g gVar, int i) {
        try {
            this.f11610b.mo12335a(gVar.m2984c(), gVar.m2995n(), i);
        } catch (RemoteException e) {
            f11609a.m12446a(e, "Unable to call %s on %s.", "onRouteUnselected", InterfaceC1939tn.class.getSimpleName());
        }
    }

    @Override // android.support.v7.p027d.C0376g.a
    /* JADX INFO: renamed from: c */
    public final void mo2910c(C0376g c0376g, C0376g.g gVar) {
        try {
            this.f11610b.mo12334a(gVar.m2984c(), gVar.m2995n());
        } catch (RemoteException e) {
            f11609a.m12446a(e, "Unable to call %s on %s.", "onRouteAdded", InterfaceC1939tn.class.getSimpleName());
        }
    }

    @Override // android.support.v7.p027d.C0376g.a
    /* JADX INFO: renamed from: d */
    public final void mo2911d(C0376g c0376g, C0376g.g gVar) {
        try {
            this.f11610b.mo12337c(gVar.m2984c(), gVar.m2995n());
        } catch (RemoteException e) {
            f11609a.m12446a(e, "Unable to call %s on %s.", "onRouteRemoved", InterfaceC1939tn.class.getSimpleName());
        }
    }

    @Override // android.support.v7.p027d.C0376g.a
    /* JADX INFO: renamed from: e */
    public final void mo2912e(C0376g c0376g, C0376g.g gVar) {
        try {
            this.f11610b.mo12336b(gVar.m2984c(), gVar.m2995n());
        } catch (RemoteException e) {
            f11609a.m12446a(e, "Unable to call %s on %s.", "onRouteChanged", InterfaceC1939tn.class.getSimpleName());
        }
    }
}
