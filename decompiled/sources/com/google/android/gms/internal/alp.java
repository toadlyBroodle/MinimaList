package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class alp extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[1] instanceof art);
        C1221aj.m7074b(arhVarArr[2] instanceof aro);
        arh<?> arhVar = arhVarArr[0];
        String strMo8208b = ((art) arhVarArr[1]).mo8208b();
        List<arh<?>> listMo8208b = ((aro) arhVarArr[2]).mo8208b();
        if (arhVar.m8206a(strMo8208b)) {
            arh<?> arhVarMo8207b = arhVar.mo8207b(strMo8208b);
            if (arhVarMo8207b instanceof arm) {
                return ((arm) arhVarMo8207b).mo8208b().mo8076b(aiiVar, (arh[]) listMo8208b.toArray(new arh[listMo8208b.size()]));
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(strMo8208b).length() + 35).append("Apply TypeError: ").append(strMo8208b).append(" is not a function").toString());
        }
        if (!arhVar.mo8210c(strMo8208b)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(strMo8208b).length() + 40).append("Apply TypeError: object has no ").append(strMo8208b).append(" property").toString());
        }
        ajz ajzVarMo8211d = arhVar.mo8211d(strMo8208b);
        listMo8208b.add(0, arhVar);
        return ajzVarMo8211d.mo8076b(aiiVar, (arh[]) listMo8208b.toArray(new arh[listMo8208b.size()]));
    }
}
