package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aoy implements ajz {
    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        return new art(new StringBuilder(String.valueOf("5.06-").length() + 11).append("5.06-").append(Build.VERSION.SDK_INT).toString());
    }
}
