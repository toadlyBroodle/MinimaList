package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ajh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ajg f6926a;

    ajh(ajg ajgVar) {
        this.f6926a = ajgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahs.m7947d("App's UI deactivated. Dispatching hits.");
        this.f6926a.f6925a.f6889f.m8064b();
    }
}
