package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public abstract class akb implements ajz {
    /* JADX INFO: renamed from: a */
    protected abstract arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr);

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(aiiVar != null);
        C1221aj.m7074b(arhVarArr != null);
        arh<?>[] arhVarArr2 = new arh[arhVarArr.length];
        for (int i = 0; i < arhVarArr.length; i++) {
            C1221aj.m7074b(arhVarArr[i] != null);
            C1221aj.m7074b(arhVarArr[i] != arn.f7151b);
            C1221aj.m7074b(arhVarArr[i] != arn.f7152c);
            arhVarArr2[i] = arv.m8225a(aiiVar, arhVarArr[i]);
            C1221aj.m7074b(arhVarArr2[i] != null);
            C1221aj.m7074b(arhVarArr2[i] != arn.f7151b);
            C1221aj.m7074b(arhVarArr2[i] != arn.f7152c);
        }
        arh<?> arhVarMo8073a = mo8073a(aiiVar, arhVarArr2);
        C1221aj.m7070a(arhVarMo8073a != null);
        return arhVarMo8073a;
    }
}
