package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class amd extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[1] instanceof aro);
        if (arhVarArr.length == 3) {
            C1221aj.m7074b(arhVarArr[2] instanceof aro);
        }
        List<arh<?>> arrayList = new ArrayList<>();
        if (aka.m8078a(arhVarArr[0])) {
            arrayList = ((aro) arhVarArr[1]).mo8208b();
        } else if (arhVarArr.length > 2) {
            arrayList = ((aro) arhVarArr[2]).mo8208b();
        }
        arn arnVarM8228a = arv.m8228a(aiiVar, arrayList);
        return ((arnVarM8228a instanceof arn) && arv.m8234d(arnVarM8228a)) ? arnVarM8228a : arn.f7154e;
    }
}
