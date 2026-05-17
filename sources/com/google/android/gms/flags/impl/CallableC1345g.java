package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.g */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1345g implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ SharedPreferences f6090a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6091b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Long f6092c;

    CallableC1345g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f6090a = sharedPreferences;
        this.f6091b = str;
        this.f6092c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return Long.valueOf(this.f6090a.getLong(this.f6091b, this.f6092c.longValue()));
    }
}
