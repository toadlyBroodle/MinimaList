package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class alg extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        boolean z = false;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2);
        arh<?> artVar = arhVarArr[0];
        arh<?> arhVar = arhVarArr[1];
        if ((artVar instanceof arr) || (artVar instanceof aro) || (artVar instanceof arm)) {
            artVar = new art(aka.m8083d(artVar));
        }
        arh<?> artVar2 = ((arhVar instanceof arr) || (arhVar instanceof aro) || (arhVar instanceof arm)) ? new art(aka.m8083d(arhVar)) : arhVar;
        if ((((artVar instanceof art) && (artVar2 instanceof art)) || (!Double.isNaN(aka.m8079b(artVar)) && !Double.isNaN(aka.m8079b(artVar2)))) && !aka.m8080b(artVar2, artVar)) {
            z = true;
        }
        return new ark(Boolean.valueOf(z));
    }
}
