package com.google.android.gms.internal;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.mx */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1760mx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ View f11109a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1528eh f11110b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ int f11111c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1759mw f11112d;

    RunnableC1760mx(C1759mw c1759mw, View view, InterfaceC1528eh interfaceC1528eh, int i) {
        this.f11112d = c1759mw;
        this.f11109a = view;
        this.f11110b = interfaceC1528eh;
        this.f11111c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11112d.m11842a(this.f11109a, this.f11110b, this.f11111c - 1);
    }
}
