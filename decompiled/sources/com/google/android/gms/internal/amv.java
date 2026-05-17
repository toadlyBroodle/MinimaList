package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amv extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        String strM8083d = aka.m8083d(arhVarArr[1]);
        double dM8081c = Double.POSITIVE_INFINITY;
        if (arhVarArr.length == 3 && !Double.isNaN(aka.m8079b(arhVarArr[2]))) {
            dM8081c = aka.m8081c(arhVarArr[2]);
        }
        return new arl(Double.valueOf(strMo8208b.lastIndexOf(strM8083d, (int) Math.min(Math.max(dM8081c, 0.0d), strMo8208b.length()))));
    }
}
