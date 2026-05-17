package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bee implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f7924a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bec f7925b;

    bee(bec becVar, String str) {
        this.f7925b = becVar;
        this.f7924a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7925b.f7921a.m9056c(this.f7924a);
    }
}
