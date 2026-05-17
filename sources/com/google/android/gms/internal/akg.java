package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akg extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i;
        int iMax = 0;
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0 && arhVarArr.length <= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        arh<?> arhVar = arhVarArr.length < 2 ? arn.f7154e : arhVarArr[1];
        arh<?> arhVar2 = arhVarArr.length < 3 ? arn.f7154e : arhVarArr[2];
        List<arh<?>> listMo8208b = aroVar.mo8208b();
        int size = listMo8208b.size();
        if (arhVar2 != arn.f7154e) {
            int iM8081c = (int) aka.m8081c(arhVar2);
            iMax = iM8081c < 0 ? Math.max(size - Math.abs(iM8081c), 0) : iM8081c;
        }
        int i2 = iMax;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            if (aroVar.m8217c(i2) && aka.m8084d(arhVar, listMo8208b.get(i2))) {
                i = i2;
                break;
            }
            i2++;
        }
        return new arl(Double.valueOf(i));
    }
}
