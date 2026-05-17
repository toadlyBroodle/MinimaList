package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.xg */
/* JADX INFO: loaded from: classes.dex */
public final class C2040xg {

    /* JADX INFO: renamed from: b */
    private static C2040xg f12291b = new C2040xg();

    /* JADX INFO: renamed from: a */
    private C2039xf f12292a = null;

    /* JADX INFO: renamed from: a */
    public static C2039xf m12562a(Context context) {
        return f12291b.m12563b(context);
    }

    /* JADX INFO: renamed from: b */
    private final synchronized C2039xf m12563b(Context context) {
        if (this.f12292a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f12292a = new C2039xf(context);
        }
        return this.f12292a;
    }
}
