package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class bux implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ View f9091a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ buw f9092b;

    bux(buw buwVar, View view) {
        this.f9092b = buwVar;
        this.f9091a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9092b.m10305a(this.f9091a);
    }
}
