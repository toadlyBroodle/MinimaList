package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class akc extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        aro aroVar = (aro) arhVarArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator<arh<?>> it = aroVar.mo8208b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        for (int i = 1; i < arhVarArr.length; i++) {
            if (arhVarArr[i] instanceof aro) {
                Iterator<arh<?>> it2 = ((aro) arhVarArr[i]).mo8208b().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                arrayList.add(arhVarArr[i]);
            }
        }
        return new aro(arrayList);
    }
}
