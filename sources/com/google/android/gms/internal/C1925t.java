package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: renamed from: com.google.android.gms.internal.t */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1925t extends AbstractC1817p implements InterfaceC1235ax, InterfaceC1236ay {

    /* JADX INFO: renamed from: a */
    private Context f11530a;

    /* JADX INFO: renamed from: b */
    private C1670jo f11531b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1702kt<C1979v> f11532c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1763n f11533d;

    /* JADX INFO: renamed from: e */
    private final Object f11534e;

    /* JADX INFO: renamed from: f */
    private C1952u f11535f;

    public C1925t(Context context, C1670jo c1670jo, InterfaceC1702kt<C1979v> interfaceC1702kt, InterfaceC1763n interfaceC1763n) {
        super(interfaceC1702kt, interfaceC1763n);
        this.f11534e = new Object();
        this.f11530a = context;
        this.f11531b = c1670jo;
        this.f11532c = interfaceC1702kt;
        this.f11533d = interfaceC1763n;
        this.f11535f = new C1952u(context, ((Boolean) bxm.m10409f().m10546a(can.f9403C)).booleanValue() ? C0710au.m5583s().m11535a() : context.getMainLooper(), this, this, this.f11531b.f10857c);
        this.f11535f.m7126r();
    }

    @Override // com.google.android.gms.internal.AbstractC1817p
    /* JADX INFO: renamed from: a */
    public final void mo11976a() {
        synchronized (this.f11534e) {
            if (this.f11535f.m7118g() || this.f11535f.m7119h()) {
                this.f11535f.mo6640f();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7136a(int i) {
        C1560fm.m11610b("Disconnected from remote ad request service.");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1235ax
    /* JADX INFO: renamed from: a */
    public final void mo7137a(Bundle bundle) {
        mo11076d();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1236ay
    /* JADX INFO: renamed from: a */
    public final void mo7138a(C1071a c1071a) {
        C1560fm.m11610b("Cannot connect to remote service, fallback to local instance.");
        new C1898s(this.f11530a, this.f11532c, this.f11533d).mo11076d();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        C0710au.m5569e().m11448b(this.f11530a, this.f11531b.f10855a, "gmob-apps", bundle, true);
    }

    @Override // com.google.android.gms.internal.AbstractC1817p
    /* JADX INFO: renamed from: b */
    public final InterfaceC1359ae mo11978b() {
        InterfaceC1359ae interfaceC1359aeM12351e;
        synchronized (this.f11534e) {
            try {
                interfaceC1359aeM12351e = this.f11535f.m12351e();
            } catch (DeadObjectException | IllegalStateException e) {
                interfaceC1359aeM12351e = null;
            }
        }
        return interfaceC1359aeM12351e;
    }
}
