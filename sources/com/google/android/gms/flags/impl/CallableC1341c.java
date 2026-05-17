package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.c */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1341c implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SharedPreferences f6084a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6085b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Boolean f6086c;

    CallableC1341c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f6084a = sharedPreferences;
        this.f6085b = str;
        this.f6086c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f6084a.getBoolean(this.f6085b, this.f6086c.booleanValue()));
    }
}
