package android.support.v4.p017h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: android.support.v4.h.c */
/* JADX INFO: loaded from: classes.dex */
public class C0206c {

    /* JADX INFO: renamed from: b */
    private HandlerThread f1195b;

    /* JADX INFO: renamed from: c */
    private Handler f1196c;

    /* JADX INFO: renamed from: f */
    private final int f1199f;

    /* JADX INFO: renamed from: g */
    private final int f1200g;

    /* JADX INFO: renamed from: h */
    private final String f1201h;

    /* JADX INFO: renamed from: a */
    private final Object f1194a = new Object();

    /* JADX INFO: renamed from: e */
    private Handler.Callback f1198e = new Handler.Callback() { // from class: android.support.v4.h.c.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0206c.this.m1502a();
                    return true;
                case 1:
                    C0206c.this.m1506b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* JADX INFO: renamed from: d */
    private int f1197d = 0;

    /* JADX INFO: renamed from: android.support.v4.h.c$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        void mo1493a(T t);
    }

    public C0206c(String str, int i, int i2) {
        this.f1201h = str;
        this.f1200g = i;
        this.f1199f = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1502a() {
        synchronized (this.f1194a) {
            if (this.f1196c.hasMessages(1)) {
                return;
            }
            this.f1195b.quit();
            this.f1195b = null;
            this.f1196c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1505a(Runnable runnable) {
        synchronized (this.f1194a) {
            if (this.f1195b == null) {
                this.f1195b = new HandlerThread(this.f1201h, this.f1200g);
                this.f1195b.start();
                this.f1196c = new Handler(this.f1195b.getLooper(), this.f1198e);
                this.f1197d++;
            }
            this.f1196c.removeMessages(0);
            this.f1196c.sendMessage(this.f1196c.obtainMessage(1, runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1506b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1194a) {
            this.f1196c.removeMessages(0);
            this.f1196c.sendMessageDelayed(this.f1196c.obtainMessage(0), this.f1199f);
        }
    }

    /* JADX INFO: renamed from: a */
    public <T> T m1507a(final Callable<T> callable, int i) {
        T t;
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m1505a(new Runnable() { // from class: android.support.v4.h.c.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception e) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    conditionNewCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i);
                do {
                    try {
                        nanos = conditionNewCondition.awaitNanos(nanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        t = (T) atomicReference.get();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            t = (T) atomicReference.get();
            return t;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    public <T> void m1508a(final Callable<T> callable, final a<T> aVar) {
        final Handler handler = new Handler();
        m1505a(new Runnable() { // from class: android.support.v4.h.c.2
            @Override // java.lang.Runnable
            public void run() {
                final Object objCall;
                try {
                    objCall = callable.call();
                } catch (Exception e) {
                    objCall = null;
                }
                handler.post(new Runnable() { // from class: android.support.v4.h.c.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.mo1493a(objCall);
                    }
                });
            }
        });
    }
}
