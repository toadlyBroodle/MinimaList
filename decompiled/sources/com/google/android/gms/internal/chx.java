package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class chx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ chv f10076a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ chw f10077b;

    chx(chw chwVar, chv chvVar) {
        this.f10077b = chwVar;
        this.f10076a = chvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10077b.f10064i) {
            if (this.f10077b.f10074s != -2) {
                return;
            }
            this.f10077b.f10073r = this.f10077b.m10894d();
            if (this.f10077b.f10073r == null) {
                this.f10077b.mo10902a(4);
                return;
            }
            if (!this.f10077b.m10896e() || this.f10077b.m10891b(1)) {
                this.f10076a.m10872a(this.f10077b);
                this.f10077b.m10885a(this.f10076a);
            } else {
                String str = this.f10077b.f10056a;
                C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 56).append("Ignoring adapter ").append(str).append(" as delayed impression is not supported").toString());
                this.f10077b.mo10902a(2);
            }
        }
    }
}
