package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amh extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 3);
        arh<?> arhVar = arhVarArr[0];
        arh<?> arhVar2 = arhVarArr[1];
        arh<?> arhVar3 = arhVarArr[2];
        C1221aj.m7074b(arhVar != arn.f7153d);
        C1221aj.m7074b(arhVar != arn.f7154e);
        C1221aj.m7074b(!arv.m8234d(arhVar));
        C1221aj.m7074b(!arv.m8234d(arhVar2));
        C1221aj.m7074b(!arv.m8234d(arhVar3));
        if (arv.m8233c(arhVar)) {
            return arhVar3;
        }
        String strM8083d = aka.m8083d(arhVar2);
        if (arhVar instanceof arr) {
            arr arrVar = (arr) arhVar;
            if (!arrVar.m8219e()) {
                arrVar.m8205a(strM8083d, arhVar3);
            }
            return arhVar3;
        }
        if (arhVar instanceof aro) {
            aro aroVar = (aro) arhVar;
            if ("length".equals(strM8083d)) {
                double dM8079b = aka.m8079b(arhVar3);
                C1221aj.m7074b(!Double.isInfinite(dM8079b) && dM8079b == Math.floor(dM8079b));
                aroVar.m8214a((int) dM8079b);
                return arhVar3;
            }
            double dM8079b2 = aka.m8079b(arhVar2);
            if (!Double.isInfinite(dM8079b2) && dM8079b2 >= 0.0d && strM8083d.equals(Integer.toString((int) dM8079b2))) {
                aroVar.m8215a((int) dM8079b2, arhVar3);
                return arhVar3;
            }
        }
        arhVar.m8205a(strM8083d, arhVar3);
        return arhVar3;
    }
}
