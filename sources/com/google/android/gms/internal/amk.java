package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amk implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length > 0);
        for (arh<?> arhVar : arhVarArr) {
            C1221aj.m7065a(arhVar);
            C1221aj.m7074b(arhVar instanceof art);
            aiiVar.m8001a(((art) arhVar).mo8208b(), arn.f7154e);
        }
        return arn.f7154e;
    }
}
