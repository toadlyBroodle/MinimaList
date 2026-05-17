package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.ThreadFactoryC2036xc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bn */
/* JADX INFO: loaded from: classes.dex */
public final class C1126bn {

    /* JADX INFO: renamed from: a */
    private static final ExecutorService f5665a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2036xc("GAC_Transform"));

    /* JADX INFO: renamed from: a */
    public static ExecutorService m6892a() {
        return f5665a;
    }
}
