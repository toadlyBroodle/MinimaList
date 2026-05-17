package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akk extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        List<arh<?>> listMo8208b = ((aro) arhVarArr[0]).mo8208b();
        return !listMo8208b.isEmpty() ? listMo8208b.remove(listMo8208b.size() - 1) : arn.f7154e;
    }
}
