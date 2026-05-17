package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.tagmanager.InterfaceC2137q;

/* JADX INFO: loaded from: classes.dex */
public final class apm extends akb {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2137q f7021a;

    /* JADX INFO: renamed from: b */
    private final aig f7022b;

    public apm(InterfaceC2137q interfaceC2137q, aig aigVar) {
        this.f7021a = interfaceC2137q;
        this.f7022b = aigVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        boolean z = true;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        arh<?> arhVar = arhVarArr.length > 1 ? arhVarArr[1] : arn.f7154e;
        if (arhVar != arn.f7154e && !(arhVar instanceof arr)) {
            z = false;
        }
        C1221aj.m7074b(z);
        aha ahaVarMo7997a = this.f7022b.mo7997a();
        try {
            this.f7021a.mo12818a(ahaVarMo7997a.m7907f(), ((art) arhVarArr[0]).mo8208b(), arhVar != arn.f7154e ? arv.m8224a(((arr) arhVar).mo8208b()) : null, ahaVarMo7997a.mo7252a());
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e.getMessage());
            ahs.m7942a(strValueOf.length() != 0 ? "Error calling measurement proxy:".concat(strValueOf) : new String("Error calling measurement proxy:"));
        }
        return arn.f7154e;
    }
}
