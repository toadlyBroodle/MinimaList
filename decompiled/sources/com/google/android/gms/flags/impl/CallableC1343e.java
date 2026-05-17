package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.e */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1343e implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SharedPreferences f6087a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6088b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Integer f6089c;

    CallableC1343e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f6087a = sharedPreferences;
        this.f6088b = str;
        this.f6089c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        return Integer.valueOf(this.f6087a.getInt(this.f6088b, this.f6089c.intValue()));
    }
}
