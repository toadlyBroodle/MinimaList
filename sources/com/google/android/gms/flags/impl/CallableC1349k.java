package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.k */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1349k implements Callable<SharedPreferences> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f6097a;

    CallableC1349k(Context context) {
        this.f6097a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.f6097a.getSharedPreferences("google_sdk_flags", 0);
    }
}
