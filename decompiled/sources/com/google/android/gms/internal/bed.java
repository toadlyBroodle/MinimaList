package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bed implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bec f7923a;

    bed(bec becVar) {
        this.f7923a = becVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7923a.f7921a.f7903i.cancel(false);
        bdx.m9051a(this.f7923a.f7921a, true);
        if (this.f7923a.f7921a.f7906l.m9541a()) {
            this.f7923a.f7921a.f7906l.m9540a("websocket opened", null, new Object[0]);
        }
        this.f7923a.f7921a.m9054c();
    }
}
