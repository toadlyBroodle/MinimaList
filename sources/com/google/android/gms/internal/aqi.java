package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aqi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7077a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f7078b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ aps f7079c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ aqf f7080d;

    aqi(aqf aqfVar, String str, String str2, aps apsVar) {
        this.f7080d = aqfVar;
        this.f7077a = str;
        this.f7078b = str2;
        this.f7079c = apsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7080d.m8156b(this.f7077a, this.f7078b, this.f7079c);
    }
}
