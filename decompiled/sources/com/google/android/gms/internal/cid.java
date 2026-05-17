package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class cid implements Callable<chz> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ chw f10105a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cic f10106b;

    cid(cic cicVar, chw chwVar) {
        this.f10106b = cicVar;
        this.f10105a = chwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final chz call() {
        synchronized (this.f10106b.f10098i) {
            if (this.f10106b.f10099j) {
                return null;
            }
            return this.f10105a.m10900a(this.f10106b.f10095f, this.f10106b.f10096g);
        }
    }
}
