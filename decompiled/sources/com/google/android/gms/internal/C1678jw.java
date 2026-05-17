package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.jw */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1678jw {
    /* JADX INFO: renamed from: a */
    public static <T> C1688kf<T> m11618a(T t) {
        return new C1688kf<>(t);
    }

    /* JADX INFO: renamed from: a */
    public static <V> InterfaceFutureC1689kg<V> m11619a(InterfaceFutureC1689kg<V> interfaceFutureC1689kg, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final C1700kr c1700kr = new C1700kr();
        m11627a((InterfaceFutureC1689kg) c1700kr, (Future) interfaceFutureC1689kg);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(c1700kr) { // from class: com.google.android.gms.internal.ka

            /* JADX INFO: renamed from: a */
            private final C1700kr f10870a;

            {
                this.f10870a = c1700kr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10870a.m11656a(new TimeoutException());
            }
        }, j, timeUnit);
        m11626a((InterfaceFutureC1689kg) interfaceFutureC1689kg, c1700kr);
        c1700kr.mo11631a(new Runnable(scheduledFutureSchedule) { // from class: com.google.android.gms.internal.kb

            /* JADX INFO: renamed from: a */
            private final Future f10871a;

            {
                this.f10871a = scheduledFutureSchedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future = this.f10871a;
                if (future.isDone()) {
                    return;
                }
                future.cancel(true);
            }
        }, C1695km.f10894b);
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> InterfaceFutureC1689kg<B> m11620a(final InterfaceFutureC1689kg<A> interfaceFutureC1689kg, final InterfaceC1673jr<? super A, ? extends B> interfaceC1673jr, Executor executor) {
        final C1700kr c1700kr = new C1700kr();
        interfaceFutureC1689kg.mo11631a(new Runnable(c1700kr, interfaceC1673jr, interfaceFutureC1689kg) { // from class: com.google.android.gms.internal.jz

            /* JADX INFO: renamed from: a */
            private final C1700kr f10866a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC1673jr f10867b;

            /* JADX INFO: renamed from: c */
            private final InterfaceFutureC1689kg f10868c;

            {
                this.f10866a = c1700kr;
                this.f10867b = interfaceC1673jr;
                this.f10868c = interfaceFutureC1689kg;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1678jw.m11628a(this.f10866a, this.f10867b, this.f10868c);
            }
        }, executor);
        m11627a((InterfaceFutureC1689kg) c1700kr, (Future) interfaceFutureC1689kg);
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> InterfaceFutureC1689kg<B> m11621a(final InterfaceFutureC1689kg<A> interfaceFutureC1689kg, final InterfaceC1674js<A, B> interfaceC1674js, Executor executor) {
        final C1700kr c1700kr = new C1700kr();
        interfaceFutureC1689kg.mo11631a(new Runnable(c1700kr, interfaceC1674js, interfaceFutureC1689kg) { // from class: com.google.android.gms.internal.jy

            /* JADX INFO: renamed from: a */
            private final C1700kr f10863a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC1674js f10864b;

            /* JADX INFO: renamed from: c */
            private final InterfaceFutureC1689kg f10865c;

            {
                this.f10863a = c1700kr;
                this.f10864b = interfaceC1674js;
                this.f10865c = interfaceFutureC1689kg;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1700kr c1700kr2 = this.f10863a;
                try {
                    c1700kr2.m11657b(this.f10864b.mo10413a(this.f10865c.get()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    c1700kr2.m11656a(e);
                } catch (CancellationException e2) {
                    c1700kr2.cancel(true);
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c1700kr2.m11656a(e);
                } catch (Exception e4) {
                    c1700kr2.m11656a(e4);
                }
            }
        }, executor);
        m11627a((InterfaceFutureC1689kg) c1700kr, (Future) interfaceFutureC1689kg);
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    public static <V, X extends Throwable> InterfaceFutureC1689kg<V> m11622a(final InterfaceFutureC1689kg<? extends V> interfaceFutureC1689kg, final Class<X> cls, final InterfaceC1673jr<? super X, ? extends V> interfaceC1673jr, final Executor executor) {
        final C1700kr c1700kr = new C1700kr();
        m11627a((InterfaceFutureC1689kg) c1700kr, (Future) interfaceFutureC1689kg);
        interfaceFutureC1689kg.mo11631a(new Runnable(c1700kr, interfaceFutureC1689kg, cls, interfaceC1673jr, executor) { // from class: com.google.android.gms.internal.kc

            /* JADX INFO: renamed from: a */
            private final C1700kr f10872a;

            /* JADX INFO: renamed from: b */
            private final InterfaceFutureC1689kg f10873b;

            /* JADX INFO: renamed from: c */
            private final Class f10874c;

            /* JADX INFO: renamed from: d */
            private final InterfaceC1673jr f10875d;

            /* JADX INFO: renamed from: e */
            private final Executor f10876e;

            {
                this.f10872a = c1700kr;
                this.f10873b = interfaceFutureC1689kg;
                this.f10874c = cls;
                this.f10875d = interfaceC1673jr;
                this.f10876e = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1678jw.m11629a(this.f10872a, this.f10873b, this.f10874c, this.f10875d, this.f10876e);
            }
        }, C1695km.f10894b);
        return c1700kr;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m11623a(Future<T> future, T t) {
        try {
            return future.get(((Long) bxm.m10409f().m10546a(can.f9518bl)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            C1560fm.m11613c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C0710au.m5573i().m11292a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            C1560fm.m11611b("Error waiting for future.", e2);
            C0710au.m5573i().m11292a(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m11624a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            C1560fm.m11613c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C0710au.m5573i().m11292a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            C1560fm.m11611b("Error waiting for future.", e2);
            C0710au.m5573i().m11292a(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <V> void m11625a(final InterfaceFutureC1689kg<V> interfaceFutureC1689kg, final InterfaceC1675jt<V> interfaceC1675jt, Executor executor) {
        interfaceFutureC1689kg.mo11631a(new Runnable(interfaceC1675jt, interfaceFutureC1689kg) { // from class: com.google.android.gms.internal.jx

            /* JADX INFO: renamed from: a */
            private final InterfaceC1675jt f10861a;

            /* JADX INFO: renamed from: b */
            private final InterfaceFutureC1689kg f10862b;

            {
                this.f10861a = interfaceC1675jt;
                this.f10862b = interfaceFutureC1689kg;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1675jt interfaceC1675jt2 = this.f10861a;
                try {
                    interfaceC1675jt2.mo11137a(this.f10862b.get());
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    interfaceC1675jt2.mo11138a(e);
                } catch (ExecutionException e2) {
                    e = e2.getCause();
                    interfaceC1675jt2.mo11138a(e);
                } catch (Exception e3) {
                    e = e3;
                    interfaceC1675jt2.mo11138a(e);
                }
            }
        }, executor);
    }

    /* JADX INFO: renamed from: a */
    private static <V> void m11626a(final InterfaceFutureC1689kg<? extends V> interfaceFutureC1689kg, final C1700kr<V> c1700kr) {
        m11627a((InterfaceFutureC1689kg) c1700kr, (Future) interfaceFutureC1689kg);
        interfaceFutureC1689kg.mo11631a(new Runnable(c1700kr, interfaceFutureC1689kg) { // from class: com.google.android.gms.internal.kd

            /* JADX INFO: renamed from: a */
            private final C1700kr f10877a;

            /* JADX INFO: renamed from: b */
            private final InterfaceFutureC1689kg f10878b;

            {
                this.f10877a = c1700kr;
                this.f10878b = interfaceFutureC1689kg;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1700kr c1700kr2 = this.f10877a;
                try {
                    c1700kr2.m11657b(this.f10878b.get());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    c1700kr2.m11656a(e);
                } catch (ExecutionException e2) {
                    c1700kr2.m11656a(e2.getCause());
                } catch (Exception e3) {
                    c1700kr2.m11656a(e3);
                }
            }
        }, C1695km.f10894b);
    }

    /* JADX INFO: renamed from: a */
    private static <A, B> void m11627a(final InterfaceFutureC1689kg<A> interfaceFutureC1689kg, final Future<B> future) {
        interfaceFutureC1689kg.mo11631a(new Runnable(interfaceFutureC1689kg, future) { // from class: com.google.android.gms.internal.ke

            /* JADX INFO: renamed from: a */
            private final InterfaceFutureC1689kg f10879a;

            /* JADX INFO: renamed from: b */
            private final Future f10880b;

            {
                this.f10879a = interfaceFutureC1689kg;
                this.f10880b = future;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceFutureC1689kg interfaceFutureC1689kg2 = this.f10879a;
                Future future2 = this.f10880b;
                if (interfaceFutureC1689kg2.isCancelled()) {
                    future2.cancel(true);
                }
            }
        }, C1695km.f10894b);
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m11628a(C1700kr c1700kr, InterfaceC1673jr interfaceC1673jr, InterfaceFutureC1689kg interfaceFutureC1689kg) {
        if (c1700kr.isCancelled()) {
            return;
        }
        try {
            m11626a(interfaceC1673jr.mo5652a(interfaceFutureC1689kg.get()), c1700kr);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            c1700kr.m11656a(e);
        } catch (CancellationException e2) {
            c1700kr.cancel(true);
        } catch (ExecutionException e3) {
            c1700kr.m11656a(e3.getCause());
        } catch (Exception e4) {
            c1700kr.m11656a(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final /* synthetic */ void m11629a(C1700kr c1700kr, InterfaceFutureC1689kg interfaceFutureC1689kg, Class cls, InterfaceC1673jr interfaceC1673jr, Executor executor) {
        try {
            c1700kr.m11657b(interfaceFutureC1689kg.get());
        } catch (InterruptedException e) {
            e = e;
            Thread.currentThread().interrupt();
            if (cls.isInstance(e)) {
                m11626a(m11620a(m11618a(e), interfaceC1673jr, executor), c1700kr);
            } else {
                c1700kr.m11656a(e);
            }
        } catch (ExecutionException e2) {
            e = e2.getCause();
            if (cls.isInstance(e)) {
            }
        } catch (Exception e3) {
            e = e3;
            if (cls.isInstance(e)) {
            }
        }
    }
}
