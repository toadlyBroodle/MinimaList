package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class ama implements ajz {

    /* JADX INFO: renamed from: a */
    private static aic f6972a;

    public ama(aic aicVar) {
        f6972a = aicVar;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        return f6972a.m7994a(((art) arhVarArr[0]).mo8208b());
    }
}
