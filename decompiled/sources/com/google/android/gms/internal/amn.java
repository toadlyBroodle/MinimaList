package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amn extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        double dM8079b = aka.m8079b(arhVarArr[0]);
        double dM8079b2 = aka.m8079b(arhVarArr[1]);
        if (Double.isNaN(dM8079b) || Double.isNaN(dM8079b2)) {
            return new arl(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(dM8079b) && Double.isInfinite(dM8079b2)) {
            return new arl(Double.valueOf(Double.NaN));
        }
        boolean z = (((double) Double.compare(dM8079b, 0.0d)) < 0.0d) ^ (((double) Double.compare(dM8079b2, 0.0d)) < 0.0d);
        if (Double.isInfinite(dM8079b) && !Double.isInfinite(dM8079b2)) {
            return new arl(Double.valueOf(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
        }
        if (!Double.isInfinite(dM8079b) && Double.isInfinite(dM8079b2)) {
            return new arl(Double.valueOf(z ? -0.0d : 0.0d));
        }
        if (dM8079b == 0.0d) {
            if (dM8079b2 == 0.0d) {
                return new arl(Double.valueOf(Double.NaN));
            }
            return new arl(Double.valueOf(z ? -0.0d : 0.0d));
        }
        if (Double.isInfinite(dM8079b) || dM8079b == 0.0d || dM8079b2 != 0.0d) {
            return new arl(Double.valueOf(dM8079b / dM8079b2));
        }
        return new arl(Double.valueOf(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
    }
}
