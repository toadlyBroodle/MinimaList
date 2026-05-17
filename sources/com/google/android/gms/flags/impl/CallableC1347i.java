package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.i */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1347i implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SharedPreferences f6093a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6094b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6095c;

    CallableC1347i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f6093a = sharedPreferences;
        this.f6094b = str;
        this.f6095c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f6093a.getString(this.f6094b, this.f6095c);
    }
}
