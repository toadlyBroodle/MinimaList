package com.google.android.gms.p051b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0966g {

    /* JADX INFO: renamed from: a */
    public static final Executor f5109a = new a();

    /* JADX INFO: renamed from: b */
    static final Executor f5110b = new ExecutorC0976q();

    /* JADX INFO: renamed from: com.google.android.gms.b.g$a */
    static final class a implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f5111a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f5111a.post(runnable);
        }
    }
}
