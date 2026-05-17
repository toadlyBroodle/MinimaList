package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.xc */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2036xc implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final String f12282a;

    /* JADX INFO: renamed from: b */
    private final int f12283b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f12284c;

    /* JADX INFO: renamed from: d */
    private final ThreadFactory f12285d;

    public ThreadFactoryC2036xc(String str) {
        this(str, 0);
    }

    private ThreadFactoryC2036xc(String str, int i) {
        this.f12284c = new AtomicInteger();
        this.f12285d = Executors.defaultThreadFactory();
        this.f12282a = (String) C1221aj.m7066a(str, (Object) "Name must not be null");
        this.f12283b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12285d.newThread(new RunnableC2037xd(runnable, 0));
        String str = this.f12282a;
        threadNewThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f12284c.getAndIncrement()).append("]").toString());
        return threadNewThread;
    }
}
