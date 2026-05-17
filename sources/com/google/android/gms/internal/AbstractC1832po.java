package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.po */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1832po extends C1830pm {

    /* JADX INFO: renamed from: a */
    private boolean f11301a;

    protected AbstractC1832po(C1834pq c1834pq) {
        super(c1834pq);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6013a();

    /* JADX INFO: renamed from: x */
    public final boolean m12051x() {
        return this.f11301a;
    }

    /* JADX INFO: renamed from: y */
    protected final void m12052y() {
        if (!m12051x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12053z() {
        mo6013a();
        this.f11301a = true;
    }
}
