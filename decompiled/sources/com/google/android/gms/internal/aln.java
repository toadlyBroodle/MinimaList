package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aln implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 3);
        arh<?> arhVarM8225a = aka.m8078a(arv.m8225a(aiiVar, arhVarArr[0])) ? arv.m8225a(aiiVar, arhVarArr[1]) : arv.m8225a(aiiVar, arhVarArr[2]);
        if (!(arhVarM8225a instanceof arn) || arhVarM8225a == arn.f7154e || arhVarM8225a == arn.f7153d) {
            return arhVarM8225a;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
