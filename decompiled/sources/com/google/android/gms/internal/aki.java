package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aki extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i;
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0 && arhVarArr.length <= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        arh<?> arhVar = arhVarArr.length < 2 ? arn.f7154e : arhVarArr[1];
        List<arh<?>> listMo8208b = aroVar.mo8208b();
        int size = listMo8208b.size();
        int iAbs = size - 1;
        if (arhVarArr.length == 3) {
            int iM8081c = (int) aka.m8081c(arhVarArr[2]);
            iAbs = iM8081c < 0 ? size - Math.abs(iM8081c) : Math.min(iM8081c, size - 1);
        }
        int i2 = iAbs;
        while (true) {
            if (i2 < 0) {
                i = -1;
                break;
            }
            if (aroVar.m8217c(i2) && aka.m8084d(arhVar, listMo8208b.get(i2))) {
                i = i2;
                break;
            }
            i2--;
        }
        return new arl(Double.valueOf(i));
    }
}
