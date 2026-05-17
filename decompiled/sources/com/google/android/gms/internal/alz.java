package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class alz implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        arh<?> arhVarM8003b = aiiVar.m8003b(((art) arhVarArr[0]).mo8208b());
        if (arhVarM8003b instanceof ars) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        }
        if (!(arhVarM8003b instanceof arn) || arhVarM8003b == arn.f7154e || arhVarM8003b == arn.f7153d) {
            return arhVarM8003b;
        }
        throw new IllegalStateException("Illegal InternalType encountered in Get.");
    }
}
