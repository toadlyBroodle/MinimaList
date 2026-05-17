package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class alt extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        Iterator<arh<?>> it = ((aro) arhVarArr[0]).mo8208b().iterator();
        while (it.hasNext()) {
            arh<?> arhVarM8225a = arv.m8225a(aiiVar, it.next());
            if ((arhVarM8225a instanceof arn) && (arhVarM8225a == arn.f7151b || arhVarM8225a == arn.f7152c || ((arn) arhVarM8225a).m8212d())) {
                return arhVarM8225a;
            }
        }
        return arn.f7154e;
    }
}
