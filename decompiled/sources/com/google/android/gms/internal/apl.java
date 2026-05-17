package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class apl extends akb {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f7019b = new HashSet(Arrays.asList("GET", "HEAD", "POST", "PUT"));

    /* JADX INFO: renamed from: a */
    private final ahe f7020a;

    public apl(ahe aheVar) {
        this.f7020a = aheVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        HashMap map;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof arr);
        arh<?> arhVarMo8207b = arhVarArr[0].mo8207b("url");
        C1221aj.m7074b(arhVarMo8207b instanceof art);
        String strMo8208b = ((art) arhVarMo8207b).mo8208b();
        arh<?> arhVarMo8207b2 = arhVarArr[0].mo8207b("method");
        if (arhVarMo8207b2 == arn.f7154e) {
            arhVarMo8207b2 = new art("GET");
        }
        C1221aj.m7074b(arhVarMo8207b2 instanceof art);
        String strMo8208b2 = ((art) arhVarMo8207b2).mo8208b();
        C1221aj.m7074b(f7019b.contains(strMo8208b2));
        arh<?> arhVarMo8207b3 = arhVarArr[0].mo8207b("uniqueId");
        C1221aj.m7074b(arhVarMo8207b3 == arn.f7154e || arhVarMo8207b3 == arn.f7153d || (arhVarMo8207b3 instanceof art));
        String strMo8208b3 = (arhVarMo8207b3 == arn.f7154e || arhVarMo8207b3 == arn.f7153d) ? null : ((art) arhVarMo8207b3).mo8208b();
        arh<?> arhVarMo8207b4 = arhVarArr[0].mo8207b("headers");
        C1221aj.m7074b(arhVarMo8207b4 == arn.f7154e || (arhVarMo8207b4 instanceof arr));
        HashMap map2 = new HashMap();
        if (arhVarMo8207b4 == arn.f7154e) {
            map = null;
        } else {
            for (Map.Entry<String, arh<?>> entry : ((arr) arhVarMo8207b4).mo8208b().entrySet()) {
                String key = entry.getKey();
                arh<?> value = entry.getValue();
                if (value instanceof art) {
                    map2.put(key, ((art) value).mo8208b());
                } else {
                    ahs.m7944b(String.format("Ignore the non-string value of header key %s.", key));
                }
            }
            map = map2;
        }
        arh<?> arhVarMo8207b5 = arhVarArr[0].mo8207b("body");
        C1221aj.m7074b(arhVarMo8207b5 == arn.f7154e || (arhVarMo8207b5 instanceof art));
        String strMo8208b4 = arhVarMo8207b5 != arn.f7154e ? ((art) arhVarMo8207b5).mo8208b() : null;
        if ((strMo8208b2.equals("GET") || strMo8208b2.equals("HEAD")) && strMo8208b4 != null) {
            ahs.m7944b(String.format("Body of %s hit will be ignored: %s.", strMo8208b2, strMo8208b4));
        }
        this.f7020a.mo7900a(strMo8208b, strMo8208b2, strMo8208b3, map, strMo8208b4);
        ahs.m7947d(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", strMo8208b, strMo8208b2, strMo8208b3, map, strMo8208b4));
        return arn.f7154e;
    }
}
