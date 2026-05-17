package com.google.android.gms.internal;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class bhi implements bhh {
    bhi() {
    }

    @Override // com.google.android.gms.internal.bhh
    /* JADX INFO: renamed from: a */
    public final void mo9305a(Thread thread, String str) {
        thread.setName(str);
    }

    @Override // com.google.android.gms.internal.bhh
    /* JADX INFO: renamed from: a */
    public final void mo9306a(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    @Override // com.google.android.gms.internal.bhh
    /* JADX INFO: renamed from: a */
    public final void mo9307a(Thread thread, boolean z) {
        thread.setDaemon(true);
    }
}
