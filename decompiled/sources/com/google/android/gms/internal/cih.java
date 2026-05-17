package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C0648e;
import com.google.ads.mediation.InterfaceC0639b;
import com.google.ads.mediation.InterfaceC0649f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.InterfaceC0861b;
import com.google.android.gms.ads.mediation.customevent.C0868c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.InterfaceC0866a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cih extends cij {

    /* JADX INFO: renamed from: a */
    private Map<Class<? extends Object>, Object> f10125a;

    /* JADX INFO: renamed from: c */
    private final <NETWORK_EXTRAS extends InterfaceC0649f, SERVER_PARAMETERS extends C0648e> cim m10932c(String str) {
        try {
            Class<?> cls = Class.forName(str, false, cih.class.getClassLoader());
            if (InterfaceC0639b.class.isAssignableFrom(cls)) {
                InterfaceC0639b interfaceC0639b = (InterfaceC0639b) cls.newInstance();
                return new cji(interfaceC0639b, (InterfaceC0649f) this.f10125a.get(interfaceC0639b.getAdditionalParametersType()));
            }
            if (InterfaceC0861b.class.isAssignableFrom(cls)) {
                return new cjd((InterfaceC0861b) cls.newInstance());
            }
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 64).append("Could not instantiate mediation adapter: ").append(str).append(" (not a valid adapter).").toString());
            throw new RemoteException();
        } catch (Throwable th) {
            return m10933d(str);
        }
    }

    /* JADX INFO: renamed from: d */
    private final cim m10933d(String str) throws RemoteException {
        try {
            C1668jm.m11610b("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            C1668jm.m11613c(new StringBuilder(String.valueOf(str).length() + 43).append("Could not instantiate mediation adapter: ").append(str).append(". ").toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new cjd(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new cjd(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new cjd(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new cji(customEventAdapter, (C0868c) this.f10125a.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.cii
    /* JADX INFO: renamed from: a */
    public final cim mo10934a(String str) {
        return m10932c(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m10935a(Map<Class<? extends Object>, Object> map) {
        this.f10125a = map;
    }

    @Override // com.google.android.gms.internal.cii
    /* JADX INFO: renamed from: b */
    public final boolean mo10936b(String str) {
        try {
            return InterfaceC0866a.class.isAssignableFrom(Class.forName(str, false, cih.class.getClassLoader()));
        } catch (Throwable th) {
            C1668jm.m11615e(new StringBuilder(String.valueOf(str).length() + 80).append("Could not load custom event implementation class: ").append(str).append(", assuming old implementation.").toString());
            return false;
        }
    }
}
