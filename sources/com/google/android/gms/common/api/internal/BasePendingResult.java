package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.InterfaceC1082i;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.InterfaceC1271r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC1193k> extends AbstractC1080g<R> {

    /* JADX INFO: renamed from: b */
    static final ThreadLocal<Boolean> f5502b = new C1161cv();

    /* JADX INFO: renamed from: a */
    private final Object f5503a;

    /* JADX INFO: renamed from: c */
    private HandlerC1083a<R> f5504c;

    /* JADX INFO: renamed from: d */
    private WeakReference<AbstractC1079f> f5505d;

    /* JADX INFO: renamed from: e */
    private final CountDownLatch f5506e;

    /* JADX INFO: renamed from: f */
    private final ArrayList<AbstractC1080g.a> f5507f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1194l<? super R> f5508g;

    /* JADX INFO: renamed from: h */
    private final AtomicReference<InterfaceC1145cf> f5509h;

    /* JADX INFO: renamed from: i */
    private R f5510i;

    /* JADX INFO: renamed from: j */
    private Status f5511j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f5512k;

    /* JADX INFO: renamed from: l */
    private boolean f5513l;

    /* JADX INFO: renamed from: m */
    private boolean f5514m;

    @KeepName
    private C1084b mResultGuardian;

    /* JADX INFO: renamed from: n */
    private InterfaceC1271r f5515n;

    /* JADX INFO: renamed from: o */
    private volatile C1138bz<R> f5516o;

    /* JADX INFO: renamed from: p */
    private boolean f5517p;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC1083a<R extends InterfaceC1193k> extends Handler {
        public HandlerC1083a() {
            this(Looper.getMainLooper());
        }

        public HandlerC1083a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public final void m6713a(InterfaceC1194l<? super R> interfaceC1194l, R r) {
            sendMessage(obtainMessage(1, new Pair(interfaceC1194l, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    InterfaceC1194l interfaceC1194l = (InterfaceC1194l) pair.first;
                    InterfaceC1193k interfaceC1193k = (InterfaceC1193k) pair.second;
                    try {
                        interfaceC1194l.mo4791a(interfaceC1193k);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m6704b(interfaceC1193k);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).m6709c(Status.f5454d);
                    return;
                default:
                    Log.wtf("BasePendingResult", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    final class C1084b {
        private C1084b() {
        }

        /* synthetic */ C1084b(BasePendingResult basePendingResult, C1161cv c1161cv) {
            this();
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.m6704b(BasePendingResult.this.f5510i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f5503a = new Object();
        this.f5506e = new CountDownLatch(1);
        this.f5507f = new ArrayList<>();
        this.f5509h = new AtomicReference<>();
        this.f5517p = false;
        this.f5504c = new HandlerC1083a<>(Looper.getMainLooper());
        this.f5505d = new WeakReference<>(null);
    }

    protected BasePendingResult(AbstractC1079f abstractC1079f) {
        this.f5503a = new Object();
        this.f5506e = new CountDownLatch(1);
        this.f5507f = new ArrayList<>();
        this.f5509h = new AtomicReference<>();
        this.f5517p = false;
        this.f5504c = new HandlerC1083a<>(abstractC1079f != null ? abstractC1079f.mo6677c() : Looper.getMainLooper());
        this.f5505d = new WeakReference<>(abstractC1079f);
    }

    /* JADX INFO: renamed from: b */
    public static void m6704b(InterfaceC1193k interfaceC1193k) {
        if (interfaceC1193k instanceof InterfaceC1082i) {
            try {
                ((InterfaceC1082i) interfaceC1193k).mo6702a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(interfaceC1193k);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(strValueOf).length() + 18).append("Unable to release ").append(strValueOf).toString(), e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m6705c(R r) {
        C1161cv c1161cv = null;
        this.f5510i = r;
        this.f5515n = null;
        this.f5506e.countDown();
        this.f5511j = this.f5510i.mo6094a();
        if (this.f5513l) {
            this.f5508g = null;
        } else if (this.f5508g != null) {
            this.f5504c.removeMessages(2);
            this.f5504c.m6713a(this.f5508g, m6706g());
        } else if (this.f5510i instanceof InterfaceC1082i) {
            this.mResultGuardian = new C1084b(this, c1161cv);
        }
        ArrayList<AbstractC1080g.a> arrayList = this.f5507f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC1080g.a aVar = arrayList.get(i);
            i++;
            aVar.mo6699a(this.f5511j);
        }
        this.f5507f.clear();
    }

    /* JADX INFO: renamed from: g */
    private final R m6706g() {
        R r;
        synchronized (this.f5503a) {
            C1221aj.m7071a(this.f5512k ? false : true, "Result has already been consumed.");
            C1221aj.m7071a(m6710d(), "Result is not ready.");
            r = this.f5510i;
            this.f5510i = null;
            this.f5508g = null;
            this.f5512k = true;
        }
        InterfaceC1145cf andSet = this.f5509h.getAndSet(null);
        if (andSet != null) {
            andSet.mo6923a(this);
        }
        return r;
    }

    /* JADX INFO: renamed from: a */
    protected abstract R mo6177a(Status status);

    @Override // com.google.android.gms.common.api.AbstractC1080g
    /* JADX INFO: renamed from: a */
    public void mo6694a() {
        synchronized (this.f5503a) {
            if (this.f5513l || this.f5512k) {
                return;
            }
            if (this.f5515n != null) {
                try {
                    this.f5515n.m7214a();
                } catch (RemoteException e) {
                }
            }
            m6704b(this.f5510i);
            this.f5513l = true;
            m6705c(mo6177a(Status.f5455e));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1080g
    /* JADX INFO: renamed from: a */
    public final void mo6695a(AbstractC1080g.a aVar) {
        C1221aj.m7075b(aVar != null, "Callback cannot be null.");
        synchronized (this.f5503a) {
            if (m6710d()) {
                aVar.mo6699a(this.f5511j);
            } else {
                this.f5507f.add(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6707a(InterfaceC1145cf interfaceC1145cf) {
        this.f5509h.set(interfaceC1145cf);
    }

    /* JADX INFO: renamed from: a */
    public final void m6708a(R r) {
        synchronized (this.f5503a) {
            if (this.f5514m || this.f5513l) {
                m6704b(r);
                return;
            }
            if (m6710d()) {
            }
            C1221aj.m7071a(!m6710d(), "Results have already been set");
            C1221aj.m7071a(this.f5512k ? false : true, "Result has already been consumed");
            m6705c(r);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1080g
    /* JADX INFO: renamed from: a */
    public final void mo6696a(InterfaceC1194l<? super R> interfaceC1194l) {
        synchronized (this.f5503a) {
            if (interfaceC1194l == null) {
                this.f5508g = null;
                return;
            }
            C1221aj.m7071a(!this.f5512k, "Result has already been consumed.");
            C1221aj.m7071a(this.f5516o == null, "Cannot set callbacks if then() has been called.");
            if (mo6697b()) {
                return;
            }
            if (m6710d()) {
                this.f5504c.m6713a(interfaceC1194l, m6706g());
            } else {
                this.f5508g = interfaceC1194l;
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1080g
    /* JADX INFO: renamed from: b */
    public boolean mo6697b() {
        boolean z;
        synchronized (this.f5503a) {
            z = this.f5513l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.AbstractC1080g
    /* JADX INFO: renamed from: c */
    public final Integer mo6698c() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6709c(Status status) {
        synchronized (this.f5503a) {
            if (!m6710d()) {
                m6708a(mo6177a(status));
                this.f5514m = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6710d() {
        return this.f5506e.getCount() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6711e() {
        boolean zMo6697b;
        synchronized (this.f5503a) {
            if (this.f5505d.get() == null || !this.f5517p) {
                mo6694a();
            }
            zMo6697b = mo6697b();
        }
        return zMo6697b;
    }

    /* JADX INFO: renamed from: f */
    public final void m6712f() {
        this.f5517p = this.f5517p || f5502b.get().booleanValue();
    }
}
