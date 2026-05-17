package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class bex {

    /* JADX INFO: renamed from: b */
    private bey f7979b;

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f7978a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private boolean f7980c = false;

    /* JADX INFO: renamed from: a */
    public abstract bex mo9130a(bjs bjsVar);

    /* JADX INFO: renamed from: a */
    public abstract bji mo9131a(bjg bjgVar, bjs bjsVar);

    /* JADX INFO: renamed from: a */
    public abstract bjs mo9132a();

    /* JADX INFO: renamed from: a */
    public final void m9133a(bey beyVar) {
        this.f7979b = beyVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9134a(bji bjiVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo9135a(C2226b c2226b);

    /* JADX INFO: renamed from: a */
    public final void m9136a(boolean z) {
        this.f7980c = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo9137a(bex bexVar);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo9138a(bjk bjkVar);

    /* JADX INFO: renamed from: b */
    public final void m9139b() {
        if (!this.f7978a.compareAndSet(false, true) || this.f7979b == null) {
            return;
        }
        this.f7979b.mo9141a(this);
        this.f7979b = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9140c() {
        return this.f7978a.get();
    }
}
