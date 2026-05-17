package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class bwn implements Executor {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Handler f9194a;

    bwn(bvm bvmVar, Handler handler) {
        this.f9194a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9194a.post(runnable);
    }
}
