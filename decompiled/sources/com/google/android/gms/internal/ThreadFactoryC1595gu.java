package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.gu */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC1595gu implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f10709a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10710b;

    ThreadFactoryC1595gu(String str) {
        this.f10710b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f10710b;
        return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.f10709a.getAndIncrement()).toString());
    }
}
