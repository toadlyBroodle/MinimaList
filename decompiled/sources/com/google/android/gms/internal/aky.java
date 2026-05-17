package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aky extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < arhVarArr.length; i++) {
            arrayList.add(arhVarArr[i]);
        }
        aroVar.mo8208b().addAll(0, arrayList);
        return new arl(Double.valueOf(aroVar.mo8208b().size()));
    }
}
