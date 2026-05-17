package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class amw extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1 || arhVarArr.length == 2);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        Matcher matcher = Pattern.compile(arhVarArr.length < 2 ? "" : aka.m8083d(arhVarArr[1])).matcher(((art) arhVarArr[0]).mo8208b());
        if (!matcher.find()) {
            return arn.f7153d;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new art(matcher.group()));
        return new aro(arrayList);
    }
}
