package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ack implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6348a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6349b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6350c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6351d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f6352e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ acf f6353f;

    ack(acf acfVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f6353f = acfVar;
        this.f6348a = atomicReference;
        this.f6349b = str;
        this.f6350c = str2;
        this.f6351d = str3;
        this.f6352e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6353f.f6329p.m7557w().m7670a(this.f6348a, this.f6349b, this.f6350c, this.f6351d, this.f6352e);
    }
}
