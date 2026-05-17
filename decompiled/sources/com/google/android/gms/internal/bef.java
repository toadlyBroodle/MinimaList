package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bef implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bec f7926a;

    bef(bec becVar) {
        this.f7926a = becVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7926a.f7921a.f7906l.m9541a()) {
            this.f7926a.f7921a.f7906l.m9540a("closed", null, new Object[0]);
        }
        this.f7926a.f7921a.m9058d();
    }
}
