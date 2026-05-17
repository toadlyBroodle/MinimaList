package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amc extends akb {

    /* JADX INFO: renamed from: a */
    public static final amc f6973a = new amc();

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i;
        int i2;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        arh<?> arhVar = arhVarArr[0];
        arh<?> arhVar2 = arhVarArr[1];
        C1221aj.m7074b(!arv.m8234d(arhVar));
        C1221aj.m7074b(!arv.m8234d(arhVar2));
        String strM8083d = aka.m8083d(arhVar2);
        if (arhVar instanceof aro) {
            if ("length".equals(strM8083d)) {
                return new ark(true);
            }
            double dM8079b = aka.m8079b(arhVar2);
            if (dM8079b == Math.floor(dM8079b) && strM8083d.equals(Integer.toString((int) dM8079b)) && (i2 = (int) dM8079b) >= 0 && i2 < ((aro) arhVar).mo8208b().size()) {
                return new ark(true);
            }
        } else if (arhVar instanceof art) {
            if ("length".equals(strM8083d)) {
                return new ark(true);
            }
            double dM8079b2 = aka.m8079b(arhVar2);
            return (dM8079b2 != Math.floor(dM8079b2) || !strM8083d.equals(Integer.toString((int) dM8079b2)) || (i = (int) dM8079b2) < 0 || i >= ((art) arhVar).mo8208b().length()) ? new ark(false) : new ark(true);
        }
        return new ark(Boolean.valueOf(arhVar.m8206a(strM8083d)));
    }
}
