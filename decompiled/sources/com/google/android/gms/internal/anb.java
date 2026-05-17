package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class anb extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0 && arhVarArr.length <= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        int iM8081c = (int) aka.m8081c(arhVarArr.length < 2 ? arn.f7154e : arhVarArr[1]);
        int length = strMo8208b.length();
        if (arhVarArr.length == 3 && arhVarArr[2] != arn.f7154e) {
            length = (int) aka.m8081c(arv.m8225a(aiiVar, arhVarArr[2]));
        }
        int iMin = Math.min(Math.max(iM8081c, 0), strMo8208b.length());
        int iMin2 = Math.min(Math.max(length, 0), strMo8208b.length());
        return new art(strMo8208b.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
    }
}
