package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akh extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof aro);
        List<arh<?>> listMo8208b = ((aro) arhVarArr[0]).mo8208b();
        arh<?> arhVar = arhVarArr.length < 2 ? arn.f7154e : arhVarArr[1];
        String strM8083d = arhVar == arn.f7154e ? "," : aka.m8083d(arhVar);
        ArrayList arrayList = new ArrayList();
        for (arh<?> arhVar2 : listMo8208b) {
            if (arhVar2 == arn.f7153d || arhVar2 == arn.f7154e) {
                arrayList.add("");
            } else {
                arrayList.add(aka.m8083d(arhVar2));
            }
        }
        return new art(TextUtils.join(strM8083d, arrayList));
    }
}
