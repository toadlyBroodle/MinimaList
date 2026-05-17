package android.support.v4.p007b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: android.support.v4.b.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0177d<Params, Progress, Result> {

    /* JADX INFO: renamed from: d */
    private static b f1100d;

    /* JADX INFO: renamed from: a */
    private static final ThreadFactory f1097a = new ThreadFactory() { // from class: android.support.v4.b.d.1

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f1107a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f1107a.getAndIncrement());
        }
    };

    /* JADX INFO: renamed from: b */
    private static final BlockingQueue<Runnable> f1098b = new LinkedBlockingQueue(10);

    /* JADX INFO: renamed from: c */
    public static final Executor f1099c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f1098b, f1097a);

    /* JADX INFO: renamed from: e */
    private static volatile Executor f1101e = f1099c;

    /* JADX INFO: renamed from: h */
    private volatile c f1104h = c.PENDING;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f1105i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f1106j = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    private final d<Params, Result> f1102f = new d<Params, Result>() { // from class: android.support.v4.b.d.2
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC0177d.this.f1106j.set(true);
            Result result = null;
            try {
                try {
                    Process.setThreadPriority(10);
                    result = (Result) AbstractC0177d.this.mo1302a((Object[]) this.f1117b);
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            } finally {
                AbstractC0177d.this.m1371d(result);
            }
        }
    };

    /* JADX INFO: renamed from: g */
    private final FutureTask<Result> f1103g = new FutureTask<Result>(this.f1102f) { // from class: android.support.v4.b.d.3
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC0177d.this.m1369c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException e2) {
                AbstractC0177d.this.m1369c(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* JADX INFO: renamed from: android.support.v4.b.d$a */
    private static class a<Data> {

        /* JADX INFO: renamed from: a */
        final AbstractC0177d f1111a;

        /* JADX INFO: renamed from: b */
        final Data[] f1112b;

        a(AbstractC0177d abstractC0177d, Data... dataArr) {
            this.f1111a = abstractC0177d;
            this.f1112b = dataArr;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.b.d$b */
    private static class b extends Handler {
        b() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f1111a.m1372e(aVar.f1112b[0]);
                    break;
                case 2:
                    aVar.f1111a.m1368b((Object[]) aVar.f1112b);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.b.d$c */
    public enum c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: android.support.v4.b.d$d */
    private static abstract class d<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: b */
        Params[] f1117b;

        d() {
        }
    }

    AbstractC0177d() {
    }

    /* JADX INFO: renamed from: d */
    private static Handler m1363d() {
        b bVar;
        synchronized (AbstractC0177d.class) {
            if (f1100d == null) {
                f1100d = new b();
            }
            bVar = f1100d;
        }
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0177d<Params, Progress, Result> m1364a(Executor executor, Params... paramsArr) {
        if (this.f1104h != c.PENDING) {
            switch (this.f1104h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        }
        this.f1104h = c.RUNNING;
        m1365a();
        this.f1102f.f1117b = paramsArr;
        executor.execute(this.f1103g);
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Result mo1302a(Params... paramsArr);

    /* JADX INFO: renamed from: a */
    protected void m1365a() {
    }

    /* JADX INFO: renamed from: a */
    protected void mo1303a(Result result) {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1366a(boolean z) {
        this.f1105i.set(true);
        return this.f1103g.cancel(z);
    }

    /* JADX INFO: renamed from: b */
    protected void m1367b() {
    }

    /* JADX INFO: renamed from: b */
    protected void mo1304b(Result result) {
        m1367b();
    }

    /* JADX INFO: renamed from: b */
    protected void m1368b(Progress... progressArr) {
    }

    /* JADX INFO: renamed from: c */
    void m1369c(Result result) {
        if (this.f1106j.get()) {
            return;
        }
        m1371d(result);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1370c() {
        return this.f1105i.get();
    }

    /* JADX INFO: renamed from: d */
    Result m1371d(Result result) {
        m1363d().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: renamed from: e */
    void m1372e(Result result) {
        if (m1370c()) {
            mo1304b(result);
        } else {
            mo1303a(result);
        }
        this.f1104h = c.FINISHED;
    }
}
