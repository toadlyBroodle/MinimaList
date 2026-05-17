package com.google.firebase.crash;

/* JADX INFO: renamed from: com.google.firebase.crash.a */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2218a implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FirebaseCrash f12900a;

    RunnableC2218a(FirebaseCrash firebaseCrash) {
        this.f12900a = firebaseCrash;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12900a.m12943b();
    }
}
