package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.jd */
/* JADX INFO: loaded from: classes.dex */
final class C1659jd extends Thread {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f10839a;

    C1659jd(C1658jc c1658jc, String str) {
        this.f10839a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new C1669jn().mo11455a(this.f10839a);
    }
}
