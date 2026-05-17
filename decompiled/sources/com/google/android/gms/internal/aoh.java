package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aoh implements ajz {

    /* JADX INFO: renamed from: a */
    private final String f6996a = Build.MANUFACTURER;

    /* JADX INFO: renamed from: b */
    private final String f6997b = Build.MODEL;

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        String str = this.f6996a;
        String string = this.f6997b;
        if (!string.startsWith(str) && !str.equals("unknown")) {
            string = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length()).append(str).append(" ").append(string).toString();
        }
        return new art(string);
    }
}
