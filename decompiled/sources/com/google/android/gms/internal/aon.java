package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aon implements ajz {

    /* JADX INFO: renamed from: a */
    private Context f7000a;

    public aon(Context context) {
        this.f7000a = (Context) C1221aj.m7065a(context);
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        String strM8083d = null;
        if (arhVarArr.length > 0 && arhVarArr[0] != arn.f7154e) {
            strM8083d = aka.m8083d(arv.m8225a(aiiVar, arhVarArr[0]));
        }
        String strM7939a = ahr.m7939a(this.f7000a, strM8083d);
        return strM7939a != null ? new art(strM7939a) : arn.f7154e;
    }
}
