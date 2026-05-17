package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amr extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        int iM8081c = arhVarArr.length == 2 ? (int) aka.m8081c(arhVarArr[1]) : 0;
        return (iM8081c < 0 || iM8081c >= strMo8208b.length()) ? new art("") : new art(String.valueOf(strMo8208b.charAt(iM8081c)));
    }
}
