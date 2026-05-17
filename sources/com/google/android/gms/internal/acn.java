package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class acn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6358a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6359b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ long f6360c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Bundle f6361d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ boolean f6362e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ boolean f6363f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ boolean f6364g;

    /* JADX INFO: renamed from: h */
    private /* synthetic */ String f6365h;

    /* JADX INFO: renamed from: i */
    private /* synthetic */ acf f6366i;

    acn(acf acfVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f6366i = acfVar;
        this.f6358a = str;
        this.f6359b = str2;
        this.f6360c = j;
        this.f6361d = bundle;
        this.f6362e = z;
        this.f6363f = z2;
        this.f6364g = z3;
        this.f6365h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6366i.m7598b(this.f6358a, this.f6359b, this.f6360c, this.f6361d, this.f6362e, this.f6363f, this.f6364g, this.f6365h);
    }
}
