package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class alq extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        if (aiiVar.m8002a(strMo8208b)) {
            aiiVar.m8004b(strMo8208b, arhVarArr[1]);
            return arhVarArr[1];
        }
        String strValueOf = String.valueOf(strMo8208b);
        throw new IllegalStateException(strValueOf.length() != 0 ? "Attempting to assign to undefined variable ".concat(strValueOf) : new String("Attempting to assign to undefined variable "));
    }
}
