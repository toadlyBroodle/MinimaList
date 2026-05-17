package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ba */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1239ba<TListener> {

    /* JADX INFO: renamed from: a */
    private TListener f5892a;

    /* JADX INFO: renamed from: b */
    private boolean f5893b = false;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractC1233av f5894c;

    public AbstractC1239ba(AbstractC1233av abstractC1233av, TListener tlistener) {
        this.f5894c = abstractC1233av;
        this.f5892a = tlistener;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo7134a(TListener tlistener);

    /* JADX INFO: renamed from: b */
    public final void m7141b() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f5892a;
            if (this.f5893b) {
                String strValueOf = String.valueOf(this);
                Log.w("GmsClient", new StringBuilder(String.valueOf(strValueOf).length() + 47).append("Callback proxy ").append(strValueOf).append(" being reused. This is not safe.").toString());
            }
        }
        if (tlistener != null) {
            try {
                mo7134a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f5893b = true;
        }
        m7142c();
    }

    /* JADX INFO: renamed from: c */
    public final void m7142c() {
        m7143d();
        synchronized (this.f5894c.f5879r) {
            this.f5894c.f5879r.remove(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7143d() {
        synchronized (this) {
            this.f5892a = null;
        }
    }
}
