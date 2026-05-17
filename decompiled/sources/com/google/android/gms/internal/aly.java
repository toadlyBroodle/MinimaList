package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aly extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    public final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        C1221aj.m7074b(aiiVar.m8002a(strMo8208b));
        arh<?> arhVar = arhVarArr[1];
        C1221aj.m7065a(arhVar);
        arh<?> arhVar2 = arhVarArr[2];
        C1221aj.m7074b(arhVar2 instanceof aro);
        List<arh<?>> listMo8208b = ((aro) arhVar2).mo8208b();
        Iterator<arh<?>> itMo8204a = arhVar.mo8204a();
        while (itMo8204a.hasNext()) {
            aiiVar.m8004b(strMo8208b, itMo8204a.next());
            arn arnVarM8228a = arv.m8228a(aiiVar, listMo8208b);
            if (arnVarM8228a == arn.f7151b) {
                return arn.f7154e;
            }
            if (arnVarM8228a.m8212d()) {
                return arnVarM8228a;
            }
        }
        return arn.f7154e;
    }
}
