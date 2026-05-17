package com.google.android.gms.p051b;

import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0967h {

    /* JADX INFO: renamed from: com.google.android.gms.b.h$a */
    static final class a implements b {

        /* JADX INFO: renamed from: a */
        private final CountDownLatch f5112a;

        private a() {
            this.f5112a = new CountDownLatch(1);
        }

        /* synthetic */ a(RunnableC0978s runnableC0978s) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m6229a() throws InterruptedException {
            this.f5112a.await();
        }

        @Override // com.google.android.gms.p051b.InterfaceC0961b
        /* JADX INFO: renamed from: a */
        public final void mo6205a(Exception exc) {
            this.f5112a.countDown();
        }

        @Override // com.google.android.gms.p051b.InterfaceC0962c
        /* JADX INFO: renamed from: a */
        public final void mo6206a(Object obj) {
            this.f5112a.countDown();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6230a(long j, TimeUnit timeUnit) {
            return this.f5112a.await(j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.b.h$b */
    interface b extends InterfaceC0961b, InterfaceC0962c<Object> {
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> AbstractC0964e<TResult> m6222a(Exception exc) {
        C0977r c0977r = new C0977r();
        c0977r.m6244a(exc);
        return c0977r;
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> AbstractC0964e<TResult> m6223a(TResult tresult) {
        C0977r c0977r = new C0977r();
        c0977r.m6245a(tresult);
        return c0977r;
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> AbstractC0964e<TResult> m6224a(Executor executor, Callable<TResult> callable) {
        C1221aj.m7066a(executor, "Executor must not be null");
        C1221aj.m7066a(callable, "Callback must not be null");
        C0977r c0977r = new C0977r();
        executor.execute(new RunnableC0978s(c0977r, callable));
        return c0977r;
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m6225a(AbstractC0964e<TResult> abstractC0964e) throws InterruptedException {
        C1221aj.m7077c("Must not be called on the main application thread");
        C1221aj.m7066a(abstractC0964e, "Task must not be null");
        if (abstractC0964e.mo6213a()) {
            return (TResult) m6228b(abstractC0964e);
        }
        a aVar = new a(null);
        m6227a((AbstractC0964e<?>) abstractC0964e, (b) aVar);
        aVar.m6229a();
        return (TResult) m6228b(abstractC0964e);
    }

    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m6226a(AbstractC0964e<TResult> abstractC0964e, long j, TimeUnit timeUnit) throws TimeoutException {
        C1221aj.m7077c("Must not be called on the main application thread");
        C1221aj.m7066a(abstractC0964e, "Task must not be null");
        C1221aj.m7066a(timeUnit, "TimeUnit must not be null");
        if (abstractC0964e.mo6213a()) {
            return (TResult) m6228b(abstractC0964e);
        }
        a aVar = new a(null);
        m6227a((AbstractC0964e<?>) abstractC0964e, (b) aVar);
        if (aVar.m6230a(j, timeUnit)) {
            return (TResult) m6228b(abstractC0964e);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: a */
    private static void m6227a(AbstractC0964e<?> abstractC0964e, b bVar) {
        abstractC0964e.mo6212a(C0966g.f5110b, (InterfaceC0962c<? super Object>) bVar);
        abstractC0964e.mo6211a(C0966g.f5110b, (InterfaceC0961b) bVar);
    }

    /* JADX INFO: renamed from: b */
    private static <TResult> TResult m6228b(AbstractC0964e<TResult> abstractC0964e) throws ExecutionException {
        if (abstractC0964e.mo6214b()) {
            return abstractC0964e.mo6215c();
        }
        throw new ExecutionException(abstractC0964e.mo6216d());
    }
}
