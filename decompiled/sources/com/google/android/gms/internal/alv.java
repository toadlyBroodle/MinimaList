package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class alv extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        ArrayList arrayList = new ArrayList();
        int length = arhVarArr.length;
        for (int i = 0; i < length; i++) {
            arh<?> arhVar = arhVarArr[i];
            C1221aj.m7074b(!(arhVar instanceof arn) || arhVar == arn.f7154e || arhVar == arn.f7153d);
            arrayList.add(arhVar);
        }
        return new aro(arrayList);
    }
}
