package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akm extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i;
        arh<?> arhVar;
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        C1221aj.m7074b(arhVarArr[1] instanceof arm);
        aro aroVar = (aro) arhVarArr[0];
        arm armVar = (arm) arhVarArr[1];
        List<arh<?>> listMo8208b = aroVar.mo8208b();
        int size = listMo8208b.size();
        if (arhVarArr.length == 3) {
            arhVar = arhVarArr[2];
            i = 0;
        } else {
            C1221aj.m7070a(size > 0);
            arh<?> arhVarM8216b = aroVar.m8216b(0);
            int i2 = 1;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (aroVar.m8217c(i3)) {
                    arhVarM8216b = aroVar.m8216b(i3);
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
            C1221aj.m7070a(i3 < size);
            i = i2;
            arhVar = arhVarM8216b;
        }
        int i4 = i;
        while (i4 < size && i4 < aroVar.mo8208b().size()) {
            arh<?> arhVarMo8076b = aroVar.m8217c(i4) ? armVar.mo8208b().mo8076b(aiiVar, arhVar, listMo8208b.get(i4), new arl(Double.valueOf(i4)), aroVar) : arhVar;
            i4++;
            arhVar = arhVarMo8076b;
        }
        return arhVar;
    }
}
