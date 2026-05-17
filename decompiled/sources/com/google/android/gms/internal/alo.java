package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class alo extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(!(arhVarArr[0] instanceof ars));
        C1221aj.m7074b(arv.m8234d(arhVarArr[0]) ? false : true);
        arh<?> arhVar = arhVarArr[0];
        String str = "object";
        if (arhVar == arn.f7154e) {
            str = "undefined";
        } else if (arhVar instanceof ark) {
            str = "boolean";
        } else if (arhVar instanceof arl) {
            str = "number";
        } else if (arhVar instanceof art) {
            str = "string";
        } else if (arhVar instanceof arm) {
            str = "function";
        }
        return new art(str);
    }
}
