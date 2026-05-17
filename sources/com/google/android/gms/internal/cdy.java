package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C0688i;
import com.google.android.gms.ads.p045b.C0665b;
import com.google.android.gms.ads.p045b.InterfaceC0672i;
import com.google.android.gms.p043a.BinderC0654c;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cdy implements InterfaceC0672i {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap<IBinder, cdy> f9869a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b */
    private final cdv f9870b;

    /* JADX INFO: renamed from: c */
    private final C0665b f9871c;

    /* JADX INFO: renamed from: d */
    private final C0688i f9872d = new C0688i();

    private cdy(cdv cdvVar) {
        Context context;
        C0665b c0665b = null;
        this.f9870b = cdvVar;
        try {
            context = (Context) BinderC0654c.m5330a(cdvVar.mo10659e());
        } catch (RemoteException | NullPointerException e) {
            C1668jm.m11611b("Unable to inflate MediaView.", e);
            context = null;
        }
        if (context != null) {
            C0665b c0665b2 = new C0665b(context);
            try {
                c0665b = this.f9870b.mo10653a(BinderC0654c.m5329a(c0665b2)) ? c0665b2 : null;
            } catch (RemoteException e2) {
                C1668jm.m11611b("Unable to render video in MediaView.", e2);
            }
        }
        this.f9871c = c0665b;
    }

    /* JADX INFO: renamed from: a */
    public static cdy m10744a(cdv cdvVar) {
        cdy cdyVar;
        synchronized (f9869a) {
            cdyVar = f9869a.get(cdvVar.asBinder());
            if (cdyVar == null) {
                cdyVar = new cdy(cdvVar);
                f9869a.put(cdvVar.asBinder(), cdyVar);
            }
        }
        return cdyVar;
    }

    @Override // com.google.android.gms.ads.p045b.InterfaceC0672i
    /* JADX INFO: renamed from: a */
    public final String mo5382a() {
        try {
            return this.f9870b.mo10624l();
        } catch (RemoteException e) {
            C1668jm.m11611b("Failed to get custom template id.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final cdv m10745b() {
        return this.f9870b;
    }
}
