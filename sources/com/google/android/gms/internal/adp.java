package com.google.android.gms.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
final class adp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ComponentName f6455a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ adn f6456b;

    adp(adn adnVar, ComponentName componentName) {
        this.f6456b = adnVar;
        this.f6455a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6456b.f6450a.m7650a(this.f6455a);
    }
}
