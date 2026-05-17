package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cfi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f9913a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f9914b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ cej f9915c;

    cfi(cej cejVar, String str, long j) {
        this.f9915c = cejVar;
        this.f9913a = str;
        this.f9914b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9915c.f9875a.m11174a(this.f9913a, this.f9914b);
        this.f9915c.f9875a.m11173a(toString());
    }
}
