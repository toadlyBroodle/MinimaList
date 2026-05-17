package com.google.firebase.crash;

import com.google.android.gms.internal.baw;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.crash.d */
/* JADX INFO: loaded from: classes.dex */
final class CallableC2221d implements Callable<baw> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2220c f12905a;

    CallableC2221d(C2220c c2220c) {
        this.f12905a = c2220c;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ baw call() {
        return this.f12905a.m12956a();
    }
}
