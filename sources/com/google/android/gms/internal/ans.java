package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class ans implements ajz {

    /* JADX INFO: renamed from: a */
    private final agg f6981a;

    public ans(Context context) {
        this(agg.m7842a(context));
    }

    private ans(agg aggVar) {
        this.f6981a = aggVar;
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        String strM7849a = this.f6981a.m7849a();
        return strM7849a == null ? arn.f7154e : new art(strM7849a);
    }
}
