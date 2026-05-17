package com.google.android.gms.internal;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.p046c.C0677a;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
public final class agg {

    /* JADX INFO: renamed from: m */
    private static Object f6700m = new Object();

    /* JADX INFO: renamed from: n */
    private static agg f6701n;

    /* JADX INFO: renamed from: a */
    private volatile long f6702a;

    /* JADX INFO: renamed from: b */
    private volatile long f6703b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f6704c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f6705d;

    /* JADX INFO: renamed from: e */
    private volatile C0677a.a f6706e;

    /* JADX INFO: renamed from: f */
    private volatile long f6707f;

    /* JADX INFO: renamed from: g */
    private volatile long f6708g;

    /* JADX INFO: renamed from: h */
    private final Context f6709h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1300d f6710i;

    /* JADX INFO: renamed from: j */
    private final Thread f6711j;

    /* JADX INFO: renamed from: k */
    private final Object f6712k;

    /* JADX INFO: renamed from: l */
    private agj f6713l;

    private agg(Context context) {
        this(context, null, C1303g.m7263d());
    }

    private agg(Context context, agj agjVar, InterfaceC1300d interfaceC1300d) {
        this.f6702a = 900000L;
        this.f6703b = 30000L;
        this.f6704c = true;
        this.f6705d = false;
        this.f6712k = new Object();
        this.f6713l = new agh(this);
        this.f6710i = interfaceC1300d;
        if (context != null) {
            this.f6709h = context.getApplicationContext();
        } else {
            this.f6709h = context;
        }
        this.f6707f = this.f6710i.mo7252a();
        this.f6711j = new Thread(new agi(this));
    }

    /* JADX INFO: renamed from: a */
    public static agg m7842a(Context context) {
        if (f6701n == null) {
            synchronized (f6700m) {
                if (f6701n == null) {
                    agg aggVar = new agg(context);
                    f6701n = aggVar;
                    aggVar.f6711j.start();
                }
            }
        }
        return f6701n;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m7843a(agg aggVar, boolean z) {
        aggVar.f6704c = false;
        return false;
    }

    /* JADX INFO: renamed from: c */
    private final void m7845c() {
        synchronized (this) {
            try {
                m7846d();
                wait(500L);
            } catch (InterruptedException e) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m7846d() {
        if (this.f6710i.mo7252a() - this.f6707f > this.f6703b) {
            synchronized (this.f6712k) {
                this.f6712k.notify();
            }
            this.f6707f = this.f6710i.mo7252a();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m7847e() {
        if (this.f6710i.mo7252a() - this.f6708g > 3600000) {
            this.f6706e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m7848f() {
        Process.setThreadPriority(10);
        while (true) {
            boolean z = this.f6705d;
            C0677a.a aVarMo7851a = this.f6704c ? this.f6713l.mo7851a() : null;
            if (aVarMo7851a != null) {
                this.f6706e = aVarMo7851a;
                this.f6708g = this.f6710i.mo7252a();
                ahs.m7946c("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.f6712k) {
                    this.f6712k.wait(this.f6702a);
                }
            } catch (InterruptedException e) {
                ahs.m7946c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7849a() {
        if (this.f6706e == null) {
            m7845c();
        } else {
            m7846d();
        }
        m7847e();
        if (this.f6706e == null) {
            return null;
        }
        return this.f6706e.m5408a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7850b() {
        if (this.f6706e == null) {
            m7845c();
        } else {
            m7846d();
        }
        m7847e();
        if (this.f6706e == null) {
            return true;
        }
        return this.f6706e.m5409b();
    }
}
