package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aml implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        arn arnVarM8228a;
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 4);
        arh arhVarM8225a = arv.m8225a(aiiVar, arhVarArr[3]);
        C1221aj.m7074b(arhVarM8225a instanceof aro);
        List<arh<?>> listMo8208b = ((aro) arhVarM8225a).mo8208b();
        arh<?> arhVar = arhVarArr[2];
        C1221aj.m7074b(arhVar instanceof ark);
        if (((ark) arhVar).mo8208b().booleanValue()) {
            arn arnVarM8228a2 = arv.m8228a(aiiVar, listMo8208b);
            if (arnVarM8228a2 == arn.f7151b) {
                return arn.f7154e;
            }
            if (arnVarM8228a2.m8212d()) {
                return arnVarM8228a2;
            }
        }
        while (aka.m8078a(arv.m8225a(aiiVar, arhVarArr[0])) && (arnVarM8228a = arv.m8228a(aiiVar, listMo8208b)) != arn.f7151b) {
            if (arnVarM8228a.m8212d()) {
                return arnVarM8228a;
            }
            arv.m8225a(aiiVar, arhVarArr[1]);
        }
        return arn.f7154e;
    }
}
