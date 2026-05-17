package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1992vm;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.h */
/* JADX INFO: loaded from: classes.dex */
public class C1006h {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f5262a = new C1992vm("SessionManager");

    /* JADX INFO: renamed from: b */
    private final InterfaceC0997ad f5263b;

    /* JADX INFO: renamed from: c */
    private final Context f5264c;

    public C1006h(InterfaceC0997ad interfaceC0997ad, Context context) {
        this.f5263b = interfaceC0997ad;
        this.f5264c = context;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1005g m6403a() {
        C1221aj.m7073b("Must be called from the main thread.");
        try {
            return (AbstractC1005g) BinderC0654c.m5330a(this.f5263b.mo6348a());
        } catch (RemoteException e) {
            f5262a.m12446a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", InterfaceC0997ad.class.getSimpleName());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6404a(boolean z) {
        C1221aj.m7073b("Must be called from the main thread.");
        try {
            this.f5263b.mo6349a(true, z);
        } catch (RemoteException e) {
            f5262a.m12446a(e, "Unable to call %s on %s.", "endCurrentSession", InterfaceC0997ad.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0652a m6405b() {
        try {
            return this.f5263b.mo6350b();
        } catch (RemoteException e) {
            f5262a.m12446a(e, "Unable to call %s on %s.", "getWrappedThis", InterfaceC0997ad.class.getSimpleName());
            return null;
        }
    }
}
