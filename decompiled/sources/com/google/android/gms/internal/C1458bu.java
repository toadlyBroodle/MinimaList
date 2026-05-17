package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.bu */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1458bu {

    /* JADX INFO: renamed from: a */
    private WeakHashMap<Context, C1460bw> f8995a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    public final Future<C1456bs> m10252a(Context context) {
        return C1590gp.m11371a(C1590gp.f10701a, new CallableC1459bv(this, context));
    }
}
