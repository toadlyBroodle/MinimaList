package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class ams extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        StringBuilder sb = new StringBuilder(((art) arhVarArr[0]).mo8208b());
        for (int i = 1; i < arhVarArr.length; i++) {
            sb.append(aka.m8083d(arhVarArr[i]));
        }
        return new art(sb.toString());
    }
}
