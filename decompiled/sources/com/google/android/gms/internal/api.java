package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public abstract class api extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        try {
            double dM8079b = aka.m8079b(arhVarArr[0]);
            double dM8079b2 = aka.m8079b(arhVarArr[1]);
            return (Double.isNaN(dM8079b) || Double.isNaN(dM8079b2)) ? new ark(false) : new ark(Boolean.valueOf(mo8099a(dM8079b, dM8079b2)));
        } catch (IllegalArgumentException e) {
            return new ark(false);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo8099a(double d, double d2);
}
