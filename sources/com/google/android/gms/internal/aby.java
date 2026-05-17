package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aby implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aeh f6317a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6318b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6319c;

    aby(abi abiVar, aeh aehVar, C2084yx c2084yx) {
        this.f6319c = abiVar;
        this.f6317a = aehVar;
        this.f6318b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6319c.f6271a.m7516G();
        this.f6319c.f6271a.m7521a(this.f6317a, this.f6318b);
    }
}
