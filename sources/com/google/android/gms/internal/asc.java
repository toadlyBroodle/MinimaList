package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class asc implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f7200a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f7201b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ arz f7202c;

    asc(arz arzVar, int i, boolean z) {
        this.f7202c = arzVar;
        this.f7200a = i;
        this.f7201b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1937tl c1937tlM8251b = this.f7202c.m8251b(this.f7200a, this.f7201b);
        this.f7202c.f7187k = c1937tlM8251b;
        if (arz.m8243b(this.f7200a, c1937tlM8251b)) {
            this.f7202c.m8249a(this.f7200a + 1, this.f7201b);
        }
    }
}
