package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class ant implements ajz {

    /* JADX INFO: renamed from: a */
    private final agg f6982a;

    public ant(Context context) {
        this(agg.m7842a(context));
    }

    private ant(agg aggVar) {
        this.f6982a = aggVar;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        return new ark(Boolean.valueOf(this.f6982a.m7850b() ? false : true));
    }
}
