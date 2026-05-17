package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class akq extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        int iM8081c = (int) aka.m8081c(arhVarArr[1]);
        int iMax = iM8081c < 0 ? Math.max(aroVar.mo8208b().size() + iM8081c, 0) : Math.min(iM8081c, aroVar.mo8208b().size());
        int size = aroVar.mo8208b().size();
        if (arhVarArr.length == 3) {
            int iM8081c2 = (int) aka.m8081c(arhVarArr[2]);
            size = iM8081c2 < 0 ? Math.max(aroVar.mo8208b().size() + iM8081c2, 0) : Math.min(iM8081c2, aroVar.mo8208b().size());
        }
        return new aro(new ArrayList(aroVar.mo8208b().subList(iMax, Math.max(iMax, size))));
    }
}
