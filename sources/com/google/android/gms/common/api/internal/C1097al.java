package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.ThreadFactoryC2036xc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.al */
/* JADX INFO: loaded from: classes.dex */
public final class C1097al {

    /* JADX INFO: renamed from: a */
    private static final ExecutorService f5574a = Executors.newFixedThreadPool(2, new ThreadFactoryC2036xc("GAC_Executor"));

    /* JADX INFO: renamed from: a */
    public static ExecutorService m6778a() {
        return f5574a;
    }
}
