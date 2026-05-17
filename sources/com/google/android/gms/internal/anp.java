package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class anp extends akb {

    /* JADX INFO: renamed from: a */
    private final int f6978a;

    /* JADX INFO: renamed from: b */
    private final aii f6979b;

    public anp(int i, aii aiiVar) {
        this.f6978a = i;
        this.f6979b = aiiVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    public final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length == 1);
        C1221aj.m7074b(arhVarArr[0] instanceof art);
        try {
            ajy ajyVarM8114a = apr.m8114a((Object) new JSONArray(((art) arhVarArr[0]).mo8208b()).getJSONArray(0));
            ajyVarM8114a.m8075a(this.f6979b);
            return this.f6978a == 0 ? arn.f7154e : ajyVarM8114a.mo8076b(aiiVar, new arh[0]);
        } catch (JSONException e) {
            ahs.m7943a("Unable to convert Custom Pixie to instruction", e);
            return arn.f7154e;
        }
    }
}
