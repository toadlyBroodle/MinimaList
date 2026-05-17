package com.google.android.gms.internal;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class clz implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JSONObject f10343a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1700kr f10344b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ cly f10345c;

    clz(cly clyVar, JSONObject jSONObject, C1700kr c1700kr) {
        this.f10345c = clyVar;
        this.f10343a = jSONObject;
        this.f10344b = c1700kr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1758mv interfaceC1758mvM11124a = this.f10345c.m11124a();
            interfaceC1758mvM11124a.mo11813a(C1807oq.m11928b());
            this.f10345c.f10337f.m5519a(interfaceC1758mvM11124a);
            WeakReference weakReference = new WeakReference(interfaceC1758mvM11124a);
            interfaceC1758mvM11124a.mo11833w().m11850a(this.f10345c.m11116a((WeakReference<InterfaceC1758mv>) weakReference), this.f10345c.m11123b(weakReference));
            this.f10345c.m11120a(interfaceC1758mvM11124a);
            interfaceC1758mvM11124a.mo11833w().m11854a(new cma(this, interfaceC1758mvM11124a));
            interfaceC1758mvM11124a.mo11833w().m11853a(new cmb(this));
            interfaceC1758mvM11124a.loadUrl((String) bxm.m10409f().m10546a(can.f9492bL));
        } catch (Exception e) {
            C1560fm.m11613c("Exception occurred while getting video view", e);
            this.f10344b.m11657b(null);
        }
    }
}
