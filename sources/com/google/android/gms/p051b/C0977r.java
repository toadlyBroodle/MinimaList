package com.google.android.gms.p051b;

import android.app.Activity;
import com.google.android.gms.common.api.internal.InterfaceC1117be;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C1221aj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.r */
/* JADX INFO: loaded from: classes.dex */
final class C0977r<TResult> extends AbstractC0964e<TResult> {

    /* JADX INFO: renamed from: a */
    private final Object f5131a = new Object();

    /* JADX INFO: renamed from: b */
    private final C0975p<TResult> f5132b = new C0975p<>();

    /* JADX INFO: renamed from: c */
    private boolean f5133c;

    /* JADX INFO: renamed from: d */
    private TResult f5134d;

    /* JADX INFO: renamed from: e */
    private Exception f5135e;

    /* JADX INFO: renamed from: com.google.android.gms.b.r$a */
    static class a extends LifecycleCallback {

        /* JADX INFO: renamed from: b */
        private final List<WeakReference<InterfaceC0974o<?>>> f5136b;

        private a(InterfaceC1117be interfaceC1117be) {
            super(interfaceC1117be);
            this.f5136b = new ArrayList();
            this.f5519a.mo6883a("TaskOnStopCallback", this);
        }

        /* JADX INFO: renamed from: b */
        public static a m6248b(Activity activity) {
            InterfaceC1117be interfaceC1117beA = m6714a(activity);
            a aVar = (a) interfaceC1117beA.mo6882a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(interfaceC1117beA) : aVar;
        }

        /* JADX INFO: renamed from: a */
        public final <T> void m6249a(InterfaceC0974o<T> interfaceC0974o) {
            synchronized (this.f5136b) {
                this.f5136b.add(new WeakReference<>(interfaceC0974o));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        /* JADX INFO: renamed from: d */
        public final void mo6250d() {
            synchronized (this.f5136b) {
                Iterator<WeakReference<InterfaceC0974o<?>>> it = this.f5136b.iterator();
                while (it.hasNext()) {
                    InterfaceC0974o<?> interfaceC0974o = it.next().get();
                    if (interfaceC0974o != null) {
                        interfaceC0974o.mo6233a();
                    }
                }
                this.f5136b.clear();
            }
        }
    }

    C0977r() {
    }

    /* JADX INFO: renamed from: e */
    private final void m6241e() {
        C1221aj.m7071a(this.f5133c, "Task is not yet complete");
    }

    /* JADX INFO: renamed from: f */
    private final void m6242f() {
        C1221aj.m7071a(!this.f5133c, "Task is already complete");
    }

    /* JADX INFO: renamed from: g */
    private final void m6243g() {
        synchronized (this.f5131a) {
            if (this.f5133c) {
                this.f5132b.m6239a(this);
            }
        }
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6207a(Activity activity, InterfaceC0960a<TResult> interfaceC0960a) {
        C0968i c0968i = new C0968i(C0966g.f5109a, interfaceC0960a);
        this.f5132b.m6240a(c0968i);
        a.m6248b(activity).m6249a(c0968i);
        m6243g();
        return this;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6208a(InterfaceC0960a<TResult> interfaceC0960a) {
        return mo6210a(C0966g.f5109a, interfaceC0960a);
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6209a(InterfaceC0961b interfaceC0961b) {
        return mo6211a(C0966g.f5109a, interfaceC0961b);
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6210a(Executor executor, InterfaceC0960a<TResult> interfaceC0960a) {
        this.f5132b.m6240a(new C0968i(executor, interfaceC0960a));
        m6243g();
        return this;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6211a(Executor executor, InterfaceC0961b interfaceC0961b) {
        this.f5132b.m6240a(new C0970k(executor, interfaceC0961b));
        m6243g();
        return this;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final AbstractC0964e<TResult> mo6212a(Executor executor, InterfaceC0962c<? super TResult> interfaceC0962c) {
        this.f5132b.m6240a(new C0972m(executor, interfaceC0962c));
        m6243g();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m6244a(Exception exc) {
        C1221aj.m7066a(exc, "Exception must not be null");
        synchronized (this.f5131a) {
            m6242f();
            this.f5133c = true;
            this.f5135e = exc;
        }
        this.f5132b.m6239a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m6245a(TResult tresult) {
        synchronized (this.f5131a) {
            m6242f();
            this.f5133c = true;
            this.f5134d = tresult;
        }
        this.f5132b.m6239a(this);
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: a */
    public final boolean mo6213a() {
        boolean z;
        synchronized (this.f5131a) {
            z = this.f5133c;
        }
        return z;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: b */
    public final boolean mo6214b() {
        boolean z;
        synchronized (this.f5131a) {
            z = this.f5133c && this.f5135e == null;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6246b(Exception exc) {
        boolean z = true;
        C1221aj.m7066a(exc, "Exception must not be null");
        synchronized (this.f5131a) {
            if (this.f5133c) {
                z = false;
            } else {
                this.f5133c = true;
                this.f5135e = exc;
                this.f5132b.m6239a(this);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6247b(TResult tresult) {
        boolean z = true;
        synchronized (this.f5131a) {
            if (this.f5133c) {
                z = false;
            } else {
                this.f5133c = true;
                this.f5134d = tresult;
                this.f5132b.m6239a(this);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: c */
    public final TResult mo6215c() {
        TResult tresult;
        synchronized (this.f5131a) {
            m6241e();
            if (this.f5135e != null) {
                throw new C0963d(this.f5135e);
            }
            tresult = this.f5134d;
        }
        return tresult;
    }

    @Override // com.google.android.gms.p051b.AbstractC0964e
    /* JADX INFO: renamed from: d */
    public final Exception mo6216d() {
        Exception exc;
        synchronized (this.f5131a) {
            exc = this.f5135e;
        }
        return exc;
    }
}
