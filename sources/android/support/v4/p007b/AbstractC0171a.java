package android.support.v4.p007b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p016g.C0201c;
import android.support.v4.p018i.C0221o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: android.support.v4.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171a<D> extends C0176c<D> {

    /* JADX INFO: renamed from: a */
    volatile AbstractC0171a<D>.a f1065a;

    /* JADX INFO: renamed from: b */
    volatile AbstractC0171a<D>.a f1066b;

    /* JADX INFO: renamed from: c */
    long f1067c;

    /* JADX INFO: renamed from: d */
    long f1068d;

    /* JADX INFO: renamed from: e */
    Handler f1069e;

    /* JADX INFO: renamed from: o */
    private final Executor f1070o;

    /* JADX INFO: renamed from: android.support.v4.b.a$a */
    final class a extends AbstractC0177d<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: a */
        boolean f1071a;

        /* JADX INFO: renamed from: d */
        private final CountDownLatch f1073d = new CountDownLatch(1);

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.support.v4.p007b.AbstractC0177d
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public D mo1302a(Void... voidArr) {
            try {
                return (D) AbstractC0171a.this.m1300e();
            } catch (C0201c e) {
                if (m1370c()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // android.support.v4.p007b.AbstractC0177d
        /* JADX INFO: renamed from: a */
        protected void mo1303a(D d) {
            try {
                AbstractC0171a.this.m1296b(this, d);
            } finally {
                this.f1073d.countDown();
            }
        }

        @Override // android.support.v4.p007b.AbstractC0177d
        /* JADX INFO: renamed from: b */
        protected void mo1304b(D d) {
            try {
                AbstractC0171a.this.m1293a(this, d);
            } finally {
                this.f1073d.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1071a = false;
            AbstractC0171a.this.m1298c();
        }
    }

    public AbstractC0171a(Context context) {
        this(context, AbstractC0177d.f1099c);
    }

    private AbstractC0171a(Context context, Executor executor) {
        super(context);
        this.f1068d = -10000L;
        this.f1070o = executor;
    }

    @Override // android.support.v4.p007b.C0176c
    /* JADX INFO: renamed from: a */
    protected void mo1292a() {
        super.mo1292a();
        m1352k();
        this.f1065a = new a();
        m1298c();
    }

    /* JADX INFO: renamed from: a */
    void m1293a(AbstractC0171a<D>.a aVar, D d) {
        m1294a(d);
        if (this.f1066b == aVar) {
            m1359r();
            this.f1068d = SystemClock.uptimeMillis();
            this.f1066b = null;
            m1348g();
            m1298c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1294a(D d) {
    }

    @Override // android.support.v4.p007b.C0176c
    /* JADX INFO: renamed from: a */
    public void mo1295a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1295a(str, fileDescriptor, printWriter, strArr);
        if (this.f1065a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f1065a);
            printWriter.print(" waiting=");
            printWriter.println(this.f1065a.f1071a);
        }
        if (this.f1066b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f1066b);
            printWriter.print(" waiting=");
            printWriter.println(this.f1066b.f1071a);
        }
        if (this.f1067c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0221o.m1603a(this.f1067c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0221o.m1602a(this.f1068d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* JADX INFO: renamed from: b */
    void m1296b(AbstractC0171a<D>.a aVar, D d) {
        if (this.f1065a != aVar) {
            m1293a(aVar, d);
            return;
        }
        if (m1349h()) {
            m1294a(d);
            return;
        }
        m1358q();
        this.f1068d = SystemClock.uptimeMillis();
        this.f1065a = null;
        m1346b(d);
    }

    @Override // android.support.v4.p007b.C0176c
    /* JADX INFO: renamed from: b */
    protected boolean mo1297b() {
        boolean zA = false;
        if (this.f1065a != null) {
            if (!this.f1092j) {
                this.f1095m = true;
            }
            if (this.f1066b != null) {
                if (this.f1065a.f1071a) {
                    this.f1065a.f1071a = false;
                    this.f1069e.removeCallbacks(this.f1065a);
                }
                this.f1065a = null;
            } else if (this.f1065a.f1071a) {
                this.f1065a.f1071a = false;
                this.f1069e.removeCallbacks(this.f1065a);
                this.f1065a = null;
            } else {
                zA = this.f1065a.m1366a(false);
                if (zA) {
                    this.f1066b = this.f1065a;
                    m1301f();
                }
                this.f1065a = null;
            }
        }
        return zA;
    }

    /* JADX INFO: renamed from: c */
    void m1298c() {
        if (this.f1066b != null || this.f1065a == null) {
            return;
        }
        if (this.f1065a.f1071a) {
            this.f1065a.f1071a = false;
            this.f1069e.removeCallbacks(this.f1065a);
        }
        if (this.f1067c <= 0 || SystemClock.uptimeMillis() >= this.f1068d + this.f1067c) {
            this.f1065a.m1364a(this.f1070o, (Void[]) null);
        } else {
            this.f1065a.f1071a = true;
            this.f1069e.postAtTime(this.f1065a, this.f1068d + this.f1067c);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract D mo1299d();

    /* JADX INFO: renamed from: e */
    protected D m1300e() {
        return mo1299d();
    }

    /* JADX INFO: renamed from: f */
    public void m1301f() {
    }
}
