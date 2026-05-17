package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class alw extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        HashMap map = new HashMap();
        for (int i = 0; i < arhVarArr.length - 1; i += 2) {
            String strM8083d = aka.m8083d(arhVarArr[i]);
            arh<?> arhVar = arhVarArr[i + 1];
            if ((arhVar instanceof arn) && arhVar != arn.f7153d && arhVar != arn.f7154e) {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
            map.put(strM8083d, arhVar);
        }
        return new arr(map);
    }
}
