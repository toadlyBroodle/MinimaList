package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.kr */
/* JADX INFO: loaded from: classes.dex */
@cnb
public class C1700kr<T> implements InterfaceFutureC1689kg<T> {

    /* JADX INFO: renamed from: b */
    private T f10901b;

    /* JADX INFO: renamed from: c */
    private Throwable f10902c;

    /* JADX INFO: renamed from: d */
    private boolean f10903d;

    /* JADX INFO: renamed from: e */
    private boolean f10904e;

    /* JADX INFO: renamed from: a */
    private final Object f10900a = new Object();

    /* JADX INFO: renamed from: f */
    private final C1690kh f10905f = new C1690kh();

    /* JADX INFO: renamed from: a */
    private final boolean m11655a() {
        return this.f10902c != null || this.f10903d;
    }

    @Override // com.google.android.gms.internal.InterfaceFutureC1689kg
    /* JADX INFO: renamed from: a */
    public final void mo11631a(Runnable runnable, Executor executor) {
        this.f10905f.m11633a(runnable, executor);
    }

    /* JADX INFO: renamed from: a */
    public final void m11656a(Throwable th) {
        synchronized (this.f10900a) {
            if (this.f10904e) {
                return;
            }
            if (m11655a()) {
                C0710au.m5573i().m11292a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                return;
            }
            this.f10902c = th;
            this.f10900a.notifyAll();
            this.f10905f.m11632a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11657b(T t) {
        synchronized (this.f10900a) {
            if (this.f10904e) {
                return;
            }
            if (m11655a()) {
                C0710au.m5573i().m11292a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                return;
            }
            this.f10903d = true;
            this.f10901b = t;
            this.f10900a.notifyAll();
            this.f10905f.m11632a();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = false;
        if (z) {
            synchronized (this.f10900a) {
                if (!m11655a()) {
                    this.f10904e = true;
                    this.f10903d = true;
                    this.f10900a.notifyAll();
                    this.f10905f.m11632a();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T t;
        synchronized (this.f10900a) {
            if (!m11655a()) {
                try {
                    this.f10900a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f10902c != null) {
                throw new ExecutionException(this.f10902c);
            }
            if (this.f10904e) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.f10901b;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f10900a) {
            if (!m11655a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f10900a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f10902c != null) {
                throw new ExecutionException(this.f10902c);
            }
            if (!this.f10903d) {
                throw new TimeoutException("SettableFuture timed out.");
            }
            if (this.f10904e) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.f10901b;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.f10900a) {
            z = this.f10904e;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean zM11655a;
        synchronized (this.f10900a) {
            zM11655a = m11655a();
        }
        return zM11655a;
    }
}
