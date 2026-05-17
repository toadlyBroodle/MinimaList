package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ann extends akb {

    /* JADX INFO: renamed from: a */
    private final ano f6977a;

    public ann(ano anoVar) {
        this.f6977a = anoVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7065a(arhVarArr);
        C1221aj.m7074b(arhVarArr.length > 0);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        String strMo8208b = ((art) arhVarArr[0]).mo8208b();
        HashMap map = new HashMap();
        if (arhVarArr.length >= 2 && arhVarArr[1] != arn.f7154e) {
            C1221aj.m7074b(arhVarArr[1] instanceof arr);
            for (Map.Entry<String, arh<?>> entry : ((arr) arhVarArr[1]).mo8208b().entrySet()) {
                C1221aj.m7070a(!(entry.getValue() instanceof ars));
                C1221aj.m7070a(!arv.m8234d(entry.getValue()));
                map.put(entry.getKey(), entry.getValue().mo8208b());
            }
        }
        return arv.m8227a(this.f6977a.mo7998a(strMo8208b, map));
    }
}
