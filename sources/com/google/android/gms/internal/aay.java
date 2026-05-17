package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class aay extends acd {

    /* JADX INFO: renamed from: k */
    private static final AtomicLong f6198k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    private ExecutorService f6199a;

    /* JADX INFO: renamed from: b */
    private abc f6200b;

    /* JADX INFO: renamed from: c */
    private abc f6201c;

    /* JADX INFO: renamed from: d */
    private final PriorityBlockingQueue<abb<?>> f6202d;

    /* JADX INFO: renamed from: e */
    private final BlockingQueue<abb<?>> f6203e;

    /* JADX INFO: renamed from: f */
    private final Thread.UncaughtExceptionHandler f6204f;

    /* JADX INFO: renamed from: g */
    private final Thread.UncaughtExceptionHandler f6205g;

    /* JADX INFO: renamed from: h */
    private final Object f6206h;

    /* JADX INFO: renamed from: i */
    private final Semaphore f6207i;

    /* JADX INFO: renamed from: j */
    private volatile boolean f6208j;

    aay(abd abdVar) {
        super(abdVar);
        this.f6206h = new Object();
        this.f6207i = new Semaphore(2);
        this.f6202d = new PriorityBlockingQueue<>();
        this.f6203e = new LinkedBlockingQueue();
        this.f6204f = new aba(this, "Thread death: Uncaught exception on worker thread");
        this.f6205g = new aba(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ abc m7468a(aay aayVar, abc abcVar) {
        aayVar.f6200b = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final void m7470a(abb<?> abbVar) {
        synchronized (this.f6206h) {
            this.f6202d.add(abbVar);
            if (this.f6200b == null) {
                this.f6200b = new abc(this, "Measurement Worker", this.f6202d);
                this.f6200b.setUncaughtExceptionHandler(this.f6204f);
                this.f6200b.start();
            } else {
                this.f6200b.m7485a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ abc m7471b(aay aayVar, abc abcVar) {
        aayVar.f6201c = null;
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7476y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: A */
    final ExecutorService m7477A() {
        ExecutorService executorService;
        synchronized (this.f6206h) {
            if (this.f6199a == null) {
                this.f6199a = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f6199a;
        }
        return executorService;
    }

    /* JADX INFO: renamed from: a */
    public final <V> Future<V> m7478a(Callable<V> callable) {
        m7584Q();
        C1221aj.m7065a(callable);
        abb<?> abbVar = new abb<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6200b) {
            if (!this.f6202d.isEmpty()) {
                mo7393t().m7401A().m7412a("Callable skipped the worker queue.");
            }
            abbVar.run();
        } else {
            m7470a(abbVar);
        }
        return abbVar;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7479a(Runnable runnable) {
        m7584Q();
        C1221aj.m7065a(runnable);
        m7470a(new abb<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: b */
    public final <V> Future<V> m7480b(Callable<V> callable) {
        m7584Q();
        C1221aj.m7065a(callable);
        abb<?> abbVar = new abb<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6200b) {
            abbVar.run();
        } else {
            m7470a(abbVar);
        }
        return abbVar;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final void mo7374b() {
        if (Thread.currentThread() != this.f6201c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7481b(Runnable runnable) {
        m7584Q();
        C1221aj.m7065a(runnable);
        abb<?> abbVar = new abb<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f6206h) {
            this.f6203e.add(abbVar);
            if (this.f6201c == null) {
                this.f6201c = new abc(this, "Measurement Network", this.f6203e);
                this.f6201c.setUncaughtExceptionHandler(this.f6205g);
                this.f6201c.start();
            } else {
                this.f6201c.m7485a();
            }
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final void mo7376c() {
        if (Thread.currentThread() != this.f6200b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7482z() {
        return Thread.currentThread() == this.f6200b;
    }
}
