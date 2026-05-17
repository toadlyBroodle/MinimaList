package com.google.android.gms.internal;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.km */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1695km {

    /* JADX INFO: renamed from: a */
    public static final Executor f10893a = new ExecutorC1696kn();

    /* JADX INFO: renamed from: b */
    public static final Executor f10894b = new ExecutorC1697ko();

    /* JADX INFO: renamed from: c */
    private static InterfaceExecutorServiceC1693kk f10895c = m11652a(f10893a);

    /* JADX INFO: renamed from: d */
    private static InterfaceExecutorServiceC1693kk f10896d = m11652a(f10894b);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.kk, com.google.android.gms.internal.kp] */
    /* JADX INFO: renamed from: a */
    private static InterfaceExecutorServiceC1693kk m11652a(Executor executor) {
        return new C1698kp(executor, null);
    }
}
