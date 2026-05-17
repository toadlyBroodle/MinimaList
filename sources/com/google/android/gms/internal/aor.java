package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aor extends akb {

    /* JADX INFO: renamed from: a */
    private final Context f7001a;

    /* JADX INFO: renamed from: b */
    private final aig f7002b;

    public aor(Context context, aig aigVar) {
        this.f7001a = context;
        this.f7002b = aigVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        Object obj = this.f7002b.mo7997a().m7908g().get(aka.m8083d(arhVarArr[0]));
        Object obj2 = obj;
        if (obj == null) {
            obj2 = obj;
            if (arhVarArr.length > 1) {
                obj2 = arhVarArr[1];
            }
        }
        return arv.m8227a(obj2);
    }
}
