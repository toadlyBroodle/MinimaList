package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class bbj implements bez {

    /* JADX INFO: renamed from: a */
    private final Handler f7732a = new Handler(Looper.getMainLooper());

    @Override // com.google.android.gms.internal.bez
    /* JADX INFO: renamed from: a */
    public final void mo8804a(Runnable runnable) {
        this.f7732a.post(runnable);
    }
}
