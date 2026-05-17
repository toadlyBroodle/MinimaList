package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amu extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        return new arl(Double.valueOf(strMo8208b.indexOf(aka.m8083d(arhVarArr[1]), (int) Math.min(Math.max(arhVarArr.length < 3 ? 0.0d : aka.m8081c(arhVarArr[2]), 0.0d), strMo8208b.length()))));
    }
}
