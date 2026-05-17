package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class buu implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ but f9074a;

    buu(but butVar) {
        this.f9074a = butVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9074a.f9066c) {
            if (this.f9074a.f9067d && this.f9074a.f9068e) {
                but.m10292a(this.f9074a, false);
                C1560fm.m11610b("App went background");
                Iterator it = this.f9074a.f9069f.iterator();
                while (it.hasNext()) {
                    try {
                        ((buv) it.next()).mo10300d(false);
                    } catch (Exception e) {
                        C1560fm.m11611b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                C1560fm.m11610b("App is still foreground");
            }
        }
    }
}
