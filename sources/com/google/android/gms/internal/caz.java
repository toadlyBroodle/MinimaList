package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class caz {

    /* JADX INFO: renamed from: a */
    private final Map<String, cay> f9697a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final cba f9698b;

    public caz(cba cbaVar) {
        this.f9698b = cbaVar;
    }

    /* JADX INFO: renamed from: a */
    public final cba m10571a() {
        return this.f9698b;
    }

    /* JADX INFO: renamed from: a */
    public final void m10572a(String str, cay cayVar) {
        this.f9697a.put(str, cayVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m10573a(String str, String str2, long j) {
        cba cbaVar = this.f9698b;
        cay cayVar = this.f9697a.get(str2);
        String[] strArr = {str};
        if (cbaVar != null && cayVar != null) {
            cbaVar.m10580a(cayVar, j, strArr);
        }
        Map<String, cay> map = this.f9697a;
        cba cbaVar2 = this.f9698b;
        map.put(str, cbaVar2 == null ? null : cbaVar2.m10576a(j));
    }
}
