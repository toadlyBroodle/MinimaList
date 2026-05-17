package com.google.android.gms.internal;

import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ly */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1734ly implements Runnable {
    RunnableC1734ly(C1733lx c1733lx) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
