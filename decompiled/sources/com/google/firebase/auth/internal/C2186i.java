package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.internal.C2032wz;
import com.google.firebase.C2213b;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2186i {

    /* JADX INFO: renamed from: c */
    private static C2032wz f12829c = new C2032wz("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a */
    volatile long f12830a;

    /* JADX INFO: renamed from: b */
    volatile long f12831b;

    /* JADX INFO: renamed from: d */
    private final C2213b f12832d;

    /* JADX INFO: renamed from: e */
    private long f12833e;

    /* JADX INFO: renamed from: f */
    private HandlerThread f12834f;

    /* JADX INFO: renamed from: g */
    private Handler f12835g;

    /* JADX INFO: renamed from: h */
    private Runnable f12836h;

    public C2186i(C2213b c2213b) {
        f12829c.m12548a("Initializing TokenRefresher", new Object[0]);
        this.f12832d = (C2213b) C1221aj.m7065a(c2213b);
        this.f12834f = new HandlerThread("TokenRefresher", 10);
        this.f12834f.start();
        this.f12835g = new Handler(this.f12834f.getLooper());
        this.f12836h = new RunnableC2187j(this, this.f12832d.m12936b());
        this.f12833e = 300000L;
    }

    /* JADX INFO: renamed from: a */
    public final void m12881a() {
        f12829c.m12548a(new StringBuilder(43).append("Scheduling refresh for ").append(this.f12830a - this.f12833e).toString(), new Object[0]);
        m12883c();
        this.f12831b = Math.max((this.f12830a - C1303g.m7263d().mo7252a()) - this.f12833e, 0L) / 1000;
        this.f12835g.postDelayed(this.f12836h, this.f12831b * 1000);
    }

    /* JADX INFO: renamed from: b */
    final void m12882b() {
        long j;
        switch ((int) this.f12831b) {
            case 30:
            case 60:
            case 120:
            case 240:
            case 480:
                j = 2 * this.f12831b;
                break;
            case 960:
                j = 960;
                break;
            default:
                j = 30;
                break;
        }
        this.f12831b = j;
        this.f12830a = C1303g.m7263d().mo7252a() + (this.f12831b * 1000);
        f12829c.m12548a(new StringBuilder(43).append("Scheduling refresh for ").append(this.f12830a).toString(), new Object[0]);
        this.f12835g.postDelayed(this.f12836h, this.f12831b * 1000);
    }

    /* JADX INFO: renamed from: c */
    public final void m12883c() {
        this.f12835g.removeCallbacks(this.f12836h);
    }
}
