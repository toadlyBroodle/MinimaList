package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1808or;
import com.google.android.gms.internal.C1813ow;
import com.google.android.gms.internal.C1897rz;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.analytics.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0903r {

    /* JADX INFO: renamed from: a */
    private static volatile C0903r f4967a;

    /* JADX INFO: renamed from: b */
    private final Context f4968b;

    /* JADX INFO: renamed from: c */
    private final List<Object> f4969c;

    /* JADX INFO: renamed from: d */
    private final C0898m f4970d;

    /* JADX INFO: renamed from: e */
    private final a f4971e;

    /* JADX INFO: renamed from: f */
    private volatile C1808or f4972f;

    /* JADX INFO: renamed from: g */
    private Thread.UncaughtExceptionHandler f4973g;

    /* JADX INFO: renamed from: com.google.android.gms.analytics.r$a */
    class a extends ThreadPoolExecutor {
        public a() {
            super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new b(null));
            allowCoreThreadTimeOut(true);
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C0905t(this, runnable, t);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.analytics.r$b */
    static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private static final AtomicInteger f4975a = new AtomicInteger();

        private b() {
        }

        /* synthetic */ b(RunnableC0904s runnableC0904s) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new c(runnable, new StringBuilder(23).append("measurement-").append(f4975a.incrementAndGet()).toString());
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.analytics.r$c */
    static class c extends Thread {
        c(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C0903r(Context context) {
        Context applicationContext = context.getApplicationContext();
        C1221aj.m7065a(applicationContext);
        this.f4968b = applicationContext;
        this.f4971e = new a();
        this.f4969c = new CopyOnWriteArrayList();
        this.f4970d = new C0898m();
    }

    /* JADX INFO: renamed from: a */
    public static C0903r m6071a(Context context) {
        C1221aj.m7065a(context);
        if (f4967a == null) {
            synchronized (C0903r.class) {
                if (f4967a == null) {
                    f4967a = new C0903r(context);
                }
            }
        }
        return f4967a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m6075b(C0900o c0900o) {
        C1221aj.m7077c("deliver should be called from worker thread");
        C1221aj.m7075b(c0900o.m6060f(), "Measurement must be submitted");
        List<InterfaceC0906u> listM6057c = c0900o.m6057c();
        if (listM6057c.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (InterfaceC0906u interfaceC0906u : listM6057c) {
            Uri uriMo6036a = interfaceC0906u.mo6036a();
            if (!hashSet.contains(uriMo6036a)) {
                hashSet.add(uriMo6036a);
                interfaceC0906u.mo6037a(c0900o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6076d() {
        if (!(Thread.currentThread() instanceof c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1808or m6077a() {
        if (this.f4972f == null) {
            synchronized (this) {
                if (this.f4972f == null) {
                    C1808or c1808or = new C1808or();
                    PackageManager packageManager = this.f4968b.getPackageManager();
                    String packageName = this.f4968b.getPackageName();
                    c1808or.m11939c(packageName);
                    c1808or.m11941d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f4968b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        String strValueOf = String.valueOf(packageName);
                        Log.e("GAv4", strValueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(strValueOf) : new String("Error retrieving package info: appName set to "));
                    }
                    c1808or.m11935a(packageName);
                    c1808or.m11937b(str);
                    this.f4972f = c1808or;
                }
            }
        }
        return this.f4972f;
    }

    /* JADX INFO: renamed from: a */
    public final <V> Future<V> m6078a(Callable<V> callable) {
        C1221aj.m7065a(callable);
        if (!(Thread.currentThread() instanceof c)) {
            return this.f4971e.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* JADX INFO: renamed from: a */
    final void m6079a(C0900o c0900o) {
        if (c0900o.m6063i()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (c0900o.m6060f()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        C0900o c0900oM6051a = c0900o.m6051a();
        c0900oM6051a.m6061g();
        this.f4971e.execute(new RunnableC0904s(this, c0900oM6051a));
    }

    /* JADX INFO: renamed from: a */
    public final void m6080a(Runnable runnable) {
        C1221aj.m7065a(runnable);
        this.f4971e.submit(runnable);
    }

    /* JADX INFO: renamed from: a */
    public final void m6081a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4973g = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: b */
    public final C1813ow m6082b() {
        DisplayMetrics displayMetrics = this.f4968b.getResources().getDisplayMetrics();
        C1813ow c1813ow = new C1813ow();
        c1813ow.m11967a(C1897rz.m12285a(Locale.getDefault()));
        c1813ow.f11241b = displayMetrics.widthPixels;
        c1813ow.f11242c = displayMetrics.heightPixels;
        return c1813ow;
    }

    /* JADX INFO: renamed from: c */
    public final Context m6083c() {
        return this.f4968b;
    }
}
