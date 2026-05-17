package com.google.android.gms.internal;

import android.annotation.TargetApi;

/* JADX INFO: renamed from: com.google.android.gms.internal.iv */
/* JADX INFO: loaded from: classes.dex */
@cnb
@TargetApi(17)
public final class C1650iv {

    /* JADX INFO: renamed from: b */
    private static C1650iv f10810b = null;

    /* JADX INFO: renamed from: a */
    String f10811a;

    private C1650iv() {
    }

    /* JADX INFO: renamed from: a */
    public static C1650iv m11545a() {
        if (f10810b == null) {
            f10810b = new C1650iv();
        }
        return f10810b;
    }
}
