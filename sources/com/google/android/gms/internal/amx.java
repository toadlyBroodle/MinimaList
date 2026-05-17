package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class amx extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0 && arhVarArr.length <= 3);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        if (arhVarArr.length == 1) {
            return new art(strMo8208b);
        }
        String strM8083d = aka.m8083d(arhVarArr[1]);
        arh<?> arhVarMo8076b = arhVarArr.length < 3 ? arn.f7154e : arhVarArr[2];
        int iIndexOf = strMo8208b.indexOf(strM8083d);
        if (iIndexOf == -1) {
            return new art(strMo8208b);
        }
        if (arhVarMo8076b instanceof arm) {
            arhVarMo8076b = ((arm) arhVarMo8076b).mo8208b().mo8076b(aiiVar, new art(strM8083d), new arl(Double.valueOf(iIndexOf)), new art(strMo8208b));
        }
        String strM8083d2 = aka.m8083d(arhVarMo8076b);
        String strSubstring = strMo8208b.substring(0, iIndexOf);
        String strSubstring2 = strMo8208b.substring(strM8083d.length() + iIndexOf);
        return new art(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strM8083d2).length() + String.valueOf(strSubstring2).length()).append(strSubstring).append(strM8083d2).append(strSubstring2).toString());
    }
}
