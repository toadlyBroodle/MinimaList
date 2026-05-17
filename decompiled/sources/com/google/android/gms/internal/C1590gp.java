package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.gp */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1590gp {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f10701a = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m11372a("Default"));

    /* JADX INFO: renamed from: b */
    private static final ThreadPoolExecutor f10702b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m11372a("Loader"));

    static {
        f10701a.allowCoreThreadTimeOut(true);
        f10702b.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC1689kg<Void> m11369a(int i, Runnable runnable) {
        return i == 1 ? m11371a(f10702b, new CallableC1591gq(runnable)) : m11371a(f10701a, new CallableC1592gr(runnable));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC1689kg<Void> m11370a(Runnable runnable) {
        return m11369a(0, runnable);
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceFutureC1689kg<T> m11371a(ExecutorService executorService, Callable<T> callable) {
        C1700kr c1700kr = new C1700kr();
        try {
            c1700kr.mo11631a(new RunnableC1594gt(c1700kr, executorService.submit(new RunnableC1593gs(c1700kr, callable))), C1695km.f10893a);
        } catch (RejectedExecutionException e) {
            C1560fm.m11613c("Thread execution is rejected.", e);
            c1700kr.m11656a(e);
        }
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    private static ThreadFactory m11372a(String str) {
        return new ThreadFactoryC1595gu(str);
    }
}
