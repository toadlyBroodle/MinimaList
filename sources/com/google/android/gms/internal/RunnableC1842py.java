package com.google.android.gms.internal;

import android.content.ComponentName;

/* JADX INFO: renamed from: com.google.android.gms.internal.py */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1842py implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ComponentName f11339a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ServiceConnectionC1840pw f11340b;

    RunnableC1842py(ServiceConnectionC1840pw serviceConnectionC1840pw, ComponentName componentName) {
        this.f11340b = serviceConnectionC1840pw;
        this.f11339a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11340b.f11334a.m12083a(this.f11339a);
    }
}
