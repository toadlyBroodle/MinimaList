package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class akl extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        int size = aroVar.mo8208b().size();
        aroVar.m8214a((arhVarArr.length + size) - 1);
        for (int i = 1; i < arhVarArr.length; i++) {
            aroVar.m8215a(size, arhVarArr[i]);
            size++;
        }
        return new arl(Double.valueOf(size));
    }
}
