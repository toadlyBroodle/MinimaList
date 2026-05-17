package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class aox extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        int i;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length >= 2);
        if (arhVarArr[0] == arn.f7154e || arhVarArr[1] == arn.f7154e) {
            return arn.f7154e;
        }
        String strM8083d = aka.m8083d(arhVarArr[0]);
        String strM8083d2 = aka.m8083d(arhVarArr[1]);
        int i2 = 64;
        if (arhVarArr.length > 2 && arhVarArr[2] != arn.f7154e && aka.m8078a(arhVarArr[2])) {
            i2 = 66;
        }
        if (arhVarArr.length <= 3 || arhVarArr[3] == arn.f7154e) {
            i = 1;
        } else {
            if (!(arhVarArr[3] instanceof arl)) {
                return arn.f7154e;
            }
            double dM8081c = aka.m8081c(arhVarArr[3]);
            if (Double.isInfinite(dM8081c) || dM8081c < 0.0d) {
                return arn.f7154e;
            }
            i = (int) dM8081c;
        }
        String strGroup = null;
        try {
            Matcher matcher = Pattern.compile(strM8083d2, i2).matcher(strM8083d);
            if (matcher.find() && matcher.groupCount() >= i) {
                strGroup = matcher.group(i);
            }
            return strGroup == null ? arn.f7154e : new art(strGroup);
        } catch (PatternSyntaxException e) {
            return arn.f7154e;
        }
    }
}
