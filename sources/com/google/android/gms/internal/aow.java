package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aow extends akb {

    /* JADX INFO: renamed from: a */
    private static final arl f7006a = new arl(Double.valueOf(0.0d));

    /* JADX INFO: renamed from: b */
    private static final arl f7007b = new arl(Double.valueOf(2.147483647E9d));

    /* JADX INFO: renamed from: a */
    private static boolean m8098a(arh<?> arhVar) {
        return (arhVar instanceof arl) && !Double.isNaN(((arl) arhVar).mo8208b().doubleValue());
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        double dDoubleValue;
        double dDoubleValue2;
        C1221aj.m7074b(true);
        arh<?> arhVar = arhVarArr.length > 0 ? arhVarArr[0] : f7006a;
        arh<?> arhVar2 = arhVarArr.length > 1 ? arhVarArr[1] : f7007b;
        if (m8098a(arhVar) && m8098a(arhVar2) && aka.m8080b(arhVar, arhVar2)) {
            dDoubleValue2 = ((arl) arhVar).mo8208b().doubleValue();
            dDoubleValue = ((arl) arhVar2).mo8208b().doubleValue();
        } else {
            dDoubleValue = 2.147483647E9d;
            dDoubleValue2 = 0.0d;
        }
        return new arl(Double.valueOf(Math.round(((dDoubleValue - dDoubleValue2) * Math.random()) + dDoubleValue2)));
    }
}
