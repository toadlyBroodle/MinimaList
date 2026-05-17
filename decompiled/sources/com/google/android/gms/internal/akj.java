package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akj extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        C1221aj.m7074b(arhVarArr[1] instanceof arm);
        aro aroVar = (aro) arhVarArr[0];
        arm armVar = (arm) arhVarArr[1];
        List<arh<?>> listMo8208b = aroVar.mo8208b();
        int size = listMo8208b.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size && i < aroVar.mo8208b().size(); i++) {
            arh<?> arhVar = null;
            if (aroVar.m8217c(i)) {
                arh<?> arhVarMo8076b = armVar.mo8208b().mo8076b(aiiVar, listMo8208b.get(i), new arl(Double.valueOf(i)), aroVar);
                C1221aj.m7070a(!arv.m8234d(arhVarMo8076b));
                arhVar = arhVarMo8076b;
            }
            arrayList.add(arhVar);
        }
        return new aro(arrayList);
    }
}
