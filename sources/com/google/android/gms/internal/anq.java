package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class anq extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        String strM8083d;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        strM8083d = aka.m8083d(arhVarArr[1]);
        switch (((art) arhVarArr[0]).mo8208b()) {
            case "e":
                ahs.m7942a(strM8083d);
                break;
            case "i":
                ahs.m7946c(strM8083d);
                break;
            case "v":
                ahs.m7947d(strM8083d);
                break;
            case "w":
                ahs.m7944b(strM8083d);
                break;
            default:
                String strValueOf = String.valueOf(((art) arhVarArr[0]).mo8208b());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid logging level: ".concat(strValueOf) : new String("Invalid logging level: "));
        }
        return arn.f7154e;
    }
}
