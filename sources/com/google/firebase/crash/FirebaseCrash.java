package com.google.firebase.crash;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.bat;
import com.google.android.gms.internal.baw;
import com.google.android.gms.internal.bbc;
import com.google.firebase.C2213b;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("FirebaseApp")
public class FirebaseCrash {

    /* JADX INFO: renamed from: a */
    private static volatile FirebaseCrash f12889a;

    /* JADX INFO: renamed from: b */
    private final Context f12890b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f12891c;

    /* JADX INFO: renamed from: d */
    private final C2213b f12892d;

    /* JADX INFO: renamed from: g */
    private bbc f12895g;

    /* JADX INFO: renamed from: f */
    private final CountDownLatch f12894f = new CountDownLatch(1);

    /* JADX INFO: renamed from: e */
    private final C2216b f12893e = new C2216b(null);

    /* JADX INFO: renamed from: com.google.firebase.crash.FirebaseCrash$a */
    public interface InterfaceC2215a {
        /* JADX INFO: renamed from: a */
        baw mo12947a();
    }

    /* JADX INFO: renamed from: com.google.firebase.crash.FirebaseCrash$b */
    static final class C2216b implements InterfaceC2215a {

        /* JADX INFO: renamed from: a */
        private final Object f12896a;

        /* JADX INFO: renamed from: b */
        private baw f12897b;

        private C2216b() {
            this.f12896a = new Object();
        }

        /* synthetic */ C2216b(RunnableC2218a runnableC2218a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public final void m12948a(baw bawVar) {
            synchronized (this.f12896a) {
                this.f12897b = bawVar;
            }
        }

        @Override // com.google.firebase.crash.FirebaseCrash.InterfaceC2215a
        /* JADX INFO: renamed from: a */
        public final baw mo12947a() {
            baw bawVar;
            synchronized (this.f12896a) {
                bawVar = this.f12897b;
            }
            return bawVar;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crash.FirebaseCrash$c */
    class C2217c implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a */
        private final Thread.UncaughtExceptionHandler f12898a;

        public C2217c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f12898a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Log.e("UncaughtException", "", th);
            if (!FirebaseCrash.this.m12946a()) {
                try {
                    Future<?> futureM12944a = FirebaseCrash.this.m12944a(th);
                    if (futureM12944a != null) {
                        futureM12944a.get(10000L, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception e) {
                    Log.e("UncaughtException", "Ouch! My own exception handler threw an exception.", e);
                }
            }
            if (this.f12898a != null) {
                this.f12898a.uncaughtException(thread, th);
            }
        }
    }

    private FirebaseCrash(C2213b c2213b, ExecutorService executorService) {
        this.f12892d = c2213b;
        this.f12891c = executorService;
        this.f12890b = this.f12892d.m12929a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m12943b() {
        try {
            this.f12894f.await(20000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrash", "Failed waiting for crash api to load.", e);
        }
    }

    @UsedByReflection("FirebaseApp")
    @Keep
    public static FirebaseCrash getInstance(C2213b c2213b) {
        if (f12889a == null) {
            synchronized (FirebaseCrash.class) {
                if (f12889a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    FirebaseCrash firebaseCrash = new FirebaseCrash(c2213b, threadPoolExecutor);
                    C2220c c2220c = new C2220c(c2213b, null);
                    Thread.setDefaultUncaughtExceptionHandler(firebaseCrash.new C2217c(Thread.getDefaultUncaughtExceptionHandler()));
                    C2219b c2219b = new C2219b(firebaseCrash);
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    executorServiceNewFixedThreadPool.submit(new RunnableC2222e(c2220c, executorServiceNewFixedThreadPool.submit(new CallableC2221d(c2220c)), 10000L, c2219b));
                    executorServiceNewFixedThreadPool.shutdown();
                    firebaseCrash.f12891c.execute(new RunnableC2218a(firebaseCrash));
                    f12889a = firebaseCrash;
                }
            }
        }
        return f12889a;
    }

    /* JADX INFO: renamed from: a */
    final Future<?> m12944a(Throwable th) {
        if (th == null || m12946a()) {
            return null;
        }
        return this.f12891c.submit(new bat(this.f12890b, this.f12893e, th, this.f12895g));
    }

    /* JADX INFO: renamed from: a */
    final void m12945a(baw bawVar) {
        if (bawVar == null) {
            this.f12891c.shutdownNow();
        } else {
            this.f12895g = bbc.m8796a(this.f12890b);
            this.f12893e.m12948a(bawVar);
            if (this.f12895g != null && !m12946a()) {
                this.f12895g.m8797a(this.f12890b, this.f12891c, this.f12893e);
                Log.d("FirebaseCrash", "Firebase Analytics Listener for Firebase Crash is initialized");
            }
        }
        this.f12894f.countDown();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12946a() {
        return this.f12891c.isShutdown();
    }
}
