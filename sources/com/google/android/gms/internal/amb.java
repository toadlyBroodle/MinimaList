package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amb extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        arh<?> arhVarM8216b;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        arh<?> arhVar = arhVarArr[0];
        arh<?> arhVar2 = arhVarArr[1];
        C1221aj.m7074b((arhVar instanceof art) || !arv.m8233c(arhVar));
        C1221aj.m7074b(!arv.m8234d(arhVar));
        C1221aj.m7074b(arv.m8234d(arhVar2) ? false : true);
        String strM8083d = aka.m8083d(arhVar2);
        if (arhVar instanceof aro) {
            aro aroVar = (aro) arhVar;
            if ("length".equals(strM8083d)) {
                return new arl(Double.valueOf(aroVar.mo8208b().size()));
            }
            double dM8079b = aka.m8079b(arhVar2);
            if (dM8079b == Math.floor(dM8079b) && strM8083d.equals(Integer.toString((int) dM8079b)) && (arhVarM8216b = aroVar.m8216b((int) dM8079b)) != arn.f7154e) {
                return arhVarM8216b;
            }
        } else if (arhVar instanceof art) {
            art artVar = (art) arhVar;
            if ("length".equals(strM8083d)) {
                return new arl(Double.valueOf(artVar.mo8208b().length()));
            }
            double dM8079b2 = aka.m8079b(arhVar2);
            return (dM8079b2 == Math.floor(dM8079b2) && strM8083d.equals(Integer.toString((int) dM8079b2))) ? artVar.m8223a((int) dM8079b2) : arn.f7154e;
        }
        return arhVar.mo8207b(strM8083d);
    }
}
