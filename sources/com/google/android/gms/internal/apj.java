package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class apj extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 2 || arhVarArr.length == 3);
        try {
            return new ark(Boolean.valueOf(Pattern.compile(aka.m8083d(arhVarArr[1]), arhVarArr.length < 3 ? false : "true".equalsIgnoreCase(aka.m8083d(arhVarArr[2])) ? 66 : 64).matcher(aka.m8083d(arhVarArr[0])).find()));
        } catch (PatternSyntaxException e) {
            return new ark(false);
        }
    }
}
