package com.google.firebase.iid;

import android.content.Intent;

/* JADX INFO: renamed from: com.google.firebase.iid.e */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2293e implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Intent f13001a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Intent f13002b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractServiceC2292d f13003c;

    RunnableC2293e(AbstractServiceC2292d abstractServiceC2292d, Intent intent, Intent intent2) {
        this.f13003c = abstractServiceC2292d;
        this.f13001a = intent;
        this.f13002b = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13003c.mo13049b(this.f13001a);
        this.f13003c.m13074d(this.f13002b);
    }
}
