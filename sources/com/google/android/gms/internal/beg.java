package com.google.android.gms.internal;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
final class beg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bml f7927a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bec f7928b;

    beg(bec becVar, bml bmlVar) {
        this.f7928b = becVar;
        this.f7927a = bmlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7927a.getCause() == null || !(this.f7927a.getCause() instanceof EOFException)) {
            this.f7928b.f7921a.f7906l.m9540a("WebSocket error.", this.f7927a, new Object[0]);
        } else {
            this.f7928b.f7921a.f7906l.m9540a("WebSocket reached EOF.", null, new Object[0]);
        }
        this.f7928b.f7921a.m9058d();
    }
}
