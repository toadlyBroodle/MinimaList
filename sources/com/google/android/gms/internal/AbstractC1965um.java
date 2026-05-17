package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.um */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1965um extends C1972ut {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC1300d f11668a;

    /* JADX INFO: renamed from: b */
    protected boolean f11669b;

    /* JADX INFO: renamed from: d */
    private Handler f11670d;

    /* JADX INFO: renamed from: e */
    private long f11671e;

    /* JADX INFO: renamed from: f */
    private Runnable f11672f;

    public AbstractC1965um(String str, InterfaceC1300d interfaceC1300d, String str2, String str3, long j) {
        super(str, str2, str3);
        this.f11670d = new Handler(Looper.getMainLooper());
        this.f11668a = interfaceC1300d;
        this.f11672f = new RunnableC1967uo(this);
        this.f11671e = 1000L;
        m12368a(false);
    }

    @Override // com.google.android.gms.internal.C1972ut
    /* JADX INFO: renamed from: a */
    public void mo12367a() {
        m12368a(false);
    }

    /* JADX INFO: renamed from: a */
    protected final void m12368a(boolean z) {
        if (this.f11669b != z) {
            this.f11669b = z;
            if (z) {
                this.f11670d.postDelayed(this.f11672f, this.f11671e);
            } else {
                this.f11670d.removeCallbacks(this.f11672f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo12369a(long j);
}
