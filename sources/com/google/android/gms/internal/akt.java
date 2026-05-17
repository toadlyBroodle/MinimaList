package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class akt extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        arm armVar;
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        if (arhVarArr.length == 2) {
            C1221aj.m7074b(arhVarArr[1] instanceof arm);
            armVar = (arm) arhVarArr[1];
        } else {
            armVar = new arm(new akw());
        }
        Collections.sort(aroVar.mo8208b(), new akv(this, armVar, aiiVar));
        return arhVarArr[0];
    }
}
