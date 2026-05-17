package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ami extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        boolean z;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 3);
        C1221aj.m7074b(arhVarArr[1] instanceof aro);
        C1221aj.m7074b(arhVarArr[2] instanceof aro);
        arh<?> arhVar = arhVarArr[0];
        List<arh<?>> listMo8208b = ((aro) arhVarArr[1]).mo8208b();
        List<arh<?>> listMo8208b2 = ((aro) arhVarArr[2]).mo8208b();
        C1221aj.m7074b(listMo8208b2.size() <= listMo8208b.size() + 1);
        int i = 0;
        boolean z2 = false;
        while (i < listMo8208b.size()) {
            if (z2 || aka.m8084d(arhVar, arv.m8225a(aiiVar, listMo8208b.get(i)))) {
                arh<?> arhVarM8225a = arv.m8225a(aiiVar, listMo8208b2.get(i));
                if (!(arhVarM8225a instanceof arn)) {
                    z = true;
                } else {
                    if (arhVarM8225a == arn.f7152c || ((arn) arhVarM8225a).m8212d()) {
                        return arhVarM8225a;
                    }
                    if (arhVarM8225a == arn.f7151b) {
                        return arn.f7154e;
                    }
                    z = z2;
                }
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (listMo8208b.size() < listMo8208b2.size()) {
            arh<?> arhVarM8225a2 = arv.m8225a(aiiVar, listMo8208b2.get(listMo8208b2.size() - 1));
            if ((arhVarM8225a2 instanceof arn) && (arhVarM8225a2 == arn.f7152c || ((arn) arhVarM8225a2).m8212d())) {
                return arhVarM8225a2;
            }
        }
        return arn.f7154e;
    }
}
