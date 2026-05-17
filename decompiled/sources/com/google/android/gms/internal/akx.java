package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class akx extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length >= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        int iM8081c = (int) aka.m8081c(arhVarArr[1]);
        int iMax = iM8081c < 0 ? Math.max(aroVar.mo8208b().size() + iM8081c, 0) : Math.min(iM8081c, aroVar.mo8208b().size());
        int iMin = iMax + Math.min(Math.max((int) aka.m8081c(arhVarArr[2]), 0), aroVar.mo8208b().size() - iMax);
        ArrayList arrayList = new ArrayList(aroVar.mo8208b().subList(iMax, iMin));
        aroVar.mo8208b().subList(iMax, iMin).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 3; i < arhVarArr.length; i++) {
            arrayList2.add(arhVarArr[i]);
        }
        aroVar.mo8208b().addAll(iMax, arrayList2);
        return new aro(arrayList);
    }
}
