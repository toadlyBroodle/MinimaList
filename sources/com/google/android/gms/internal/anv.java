package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class anv extends akb {

    /* JADX INFO: renamed from: a */
    private final Context f6984a;

    /* JADX INFO: renamed from: b */
    private final aig f6985b;

    public anv(Context context, aig aigVar) {
        this.f6984a = (Context) C1221aj.m7065a(context);
        this.f6985b = aigVar;
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        String strM8083d = null;
        C1221aj.m7074b(true);
        if (arhVarArr.length == 0 || arhVarArr[0] == arn.f7154e) {
            return new art("");
        }
        Object obj = this.f6985b.mo7997a().m7908g().get("_ldl");
        if (obj == null) {
            return new art("");
        }
        arh<?> arhVarM8227a = arv.m8227a(obj);
        if (!(arhVarM8227a instanceof art)) {
            return new art("");
        }
        String strMo8208b = ((art) arhVarM8227a).mo8208b();
        if (!ahr.m7940a(strMo8208b, "conv").equals(aka.m8083d(arhVarArr[0]))) {
            return new art("");
        }
        if (arhVarArr.length > 1 && arhVarArr[1] != arn.f7154e) {
            strM8083d = aka.m8083d(arhVarArr[1]);
        }
        String strM7940a = ahr.m7940a(strMo8208b, strM8083d);
        return strM7940a != null ? new art(strM7940a) : new art("");
    }
}
