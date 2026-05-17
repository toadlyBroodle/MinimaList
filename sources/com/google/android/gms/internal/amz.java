package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amz extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0 && arhVarArr.length <= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        double dM8081c = arhVarArr.length < 2 ? 0.0d : aka.m8081c(arhVarArr[1]);
        double length = strMo8208b.length();
        if (arhVarArr.length == 3 && arhVarArr[2] != arn.f7154e) {
            length = aka.m8081c(arhVarArr[2]);
        }
        int iMax = dM8081c < 0.0d ? (int) Math.max(dM8081c + ((double) strMo8208b.length()), 0.0d) : (int) Math.min(dM8081c, strMo8208b.length());
        return new art(strMo8208b.substring(iMax, Math.max(0, (length < 0.0d ? (int) Math.max(((double) strMo8208b.length()) + length, 0.0d) : (int) Math.min(length, strMo8208b.length())) - iMax) + iMax));
    }
}
