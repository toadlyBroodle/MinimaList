package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amm extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        arh<?> artVar = arhVarArr[0];
        arh<?> arhVar = arhVarArr[1];
        if (((artVar instanceof arn) && artVar != arn.f7154e && artVar != arn.f7153d) || ((arhVar instanceof arn) && arhVar != arn.f7154e && arhVar != arn.f7153d)) {
            throw new IllegalArgumentException("Illegal InternalType passed to Add.");
        }
        if ((artVar instanceof arr) || (artVar instanceof aro) || (artVar instanceof arm)) {
            artVar = new art(aka.m8083d(artVar));
        }
        arh<?> artVar2 = ((arhVar instanceof arr) || (arhVar instanceof aro) || (arhVar instanceof arm)) ? new art(aka.m8083d(arhVar)) : arhVar;
        if (!(artVar instanceof art) && !(artVar2 instanceof art)) {
            return new arl(Double.valueOf(aka.m8077a(artVar, artVar2)));
        }
        String strValueOf = String.valueOf(aka.m8083d(artVar));
        String strValueOf2 = String.valueOf(aka.m8083d(artVar2));
        return new art(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }
}
