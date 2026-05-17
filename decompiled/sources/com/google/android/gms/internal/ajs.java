package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class ajs implements ThreadFactory {
    ajs() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "google-tag-manager-scheduler-thread");
    }
}
