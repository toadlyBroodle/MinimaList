package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.qb */
/* JADX INFO: loaded from: classes.dex */
public final class C1846qb extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private final C1808or f11349a;

    C1846qb(C1834pq c1834pq) {
        super(c1834pq);
        this.f11349a = new C1808or();
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        m12041m().m6077a().mo6068a(this.f11349a);
        C1899sa c1899saM12045q = m12045q();
        String strM12298c = c1899saM12045q.m12298c();
        if (strM12298c != null) {
            this.f11349a.m11935a(strM12298c);
        }
        String strM12297b = c1899saM12045q.m12297b();
        if (strM12297b != null) {
            this.f11349a.m11937b(strM12297b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1808or m12122b() {
        m12052y();
        return this.f11349a;
    }
}
