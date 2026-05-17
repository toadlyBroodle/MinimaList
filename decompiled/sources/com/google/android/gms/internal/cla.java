package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class cla extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    protected final clg f10259a;

    /* JADX INFO: renamed from: b */
    protected final Context f10260b;

    /* JADX INFO: renamed from: c */
    protected final Object f10261c;

    /* JADX INFO: renamed from: d */
    protected final Object f10262d;

    /* JADX INFO: renamed from: e */
    protected final C1542ev f10263e;

    /* JADX INFO: renamed from: f */
    protected C2087z f10264f;

    protected cla(Context context, C1542ev c1542ev, clg clgVar) {
        super(true);
        this.f10261c = new Object();
        this.f10262d = new Object();
        this.f10260b = context;
        this.f10263e = c1542ev;
        this.f10264f = c1542ev.f10561b;
        this.f10259a = clgVar;
    }

    /* JADX INFO: renamed from: a */
    protected abstract C1541eu mo11077a(int i);

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        synchronized (this.f10261c) {
            C1560fm.m11610b("AdRendererBackgroundTask started.");
            int i = this.f10263e.f10564e;
            try {
                mo11078a(SystemClock.elapsedRealtime());
            } catch (cld e) {
                int iM11079a = e.m11079a();
                if (iM11079a == 3 || iM11079a == -1) {
                    C1560fm.m11614d(e.getMessage());
                } else {
                    C1560fm.m11615e(e.getMessage());
                }
                if (this.f10264f == null) {
                    this.f10264f = new C2087z(iM11079a);
                } else {
                    this.f10264f = new C2087z(iM11079a, this.f10264f.f12618j);
                }
                C1596gv.f10711a.post(new clb(this));
                i = iM11079a;
            }
            C1596gv.f10711a.post(new clc(this, mo11077a(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo11078a(long j);

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public void mo5770b() {
    }
}
