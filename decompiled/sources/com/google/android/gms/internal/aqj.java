package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aqj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7081a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ byte[] f7082b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ aqf f7083c;

    aqj(aqf aqfVar, String str, byte[] bArr) {
        this.f7083c = aqfVar;
        this.f7081a = str;
        this.f7082b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7083c.m8157b(this.f7081a, this.f7082b);
    }
}
