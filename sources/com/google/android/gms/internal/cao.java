package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class cao implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9675a;

    cao(Context context) {
        this.f9675a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        bxm.m10409f().m10547a(this.f9675a);
        return null;
    }
}
