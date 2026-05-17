package com.google.android.gms.internal;

import com.google.android.gms.common.C1283m;

/* JADX INFO: renamed from: com.google.android.gms.internal.pp */
/* JADX INFO: loaded from: classes.dex */
public final class C1833pp {

    /* JADX INFO: renamed from: a */
    public static final String f11302a = String.valueOf(C1283m.f5983b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* JADX INFO: renamed from: b */
    public static final String f11303b;

    static {
        String strValueOf = String.valueOf(f11302a);
        f11303b = strValueOf.length() != 0 ? "ma".concat(strValueOf) : new String("ma");
    }
}
