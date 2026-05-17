package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aqh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7074a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aps f7075b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ aqf f7076c;

    aqh(aqf aqfVar, String str, aps apsVar) {
        this.f7076c = aqfVar;
        this.f7074a = str;
        this.f7075b = apsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7076c.m8155b(this.f7074a, this.f7075b);
    }
}
