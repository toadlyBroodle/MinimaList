package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ana extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        ArrayList arrayList = new ArrayList();
        if (arhVarArr.length == 1) {
            arrayList.add(arhVarArr[0]);
        } else {
            String strMo8208b = ((art) arhVarArr[0]).mo8208b();
            String strM8083d = aka.m8083d(arhVarArr[1]);
            boolean zEquals = strM8083d.equals("");
            String[] strArrSplit = strMo8208b.split(strM8083d, zEquals ? 0 : -1);
            for (int i = zEquals && strArrSplit.length > 0 && strArrSplit[0].equals("") ? 1 : 0; i < strArrSplit.length; i++) {
                arrayList.add(new art(strArrSplit[i]));
            }
        }
        return new aro(arrayList);
    }
}
