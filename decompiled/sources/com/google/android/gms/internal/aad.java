package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aad implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6115a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aac f6116b;

    aad(aac aacVar, String str) {
        this.f6116b = aacVar;
        this.f6115a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aan aanVarM7539e = this.f6116b.f6329p.m7539e();
        if (aanVarM7539e.m7583P()) {
            aanVarM7539e.f6141b.m7447a(this.f6115a, 1L);
        } else {
            this.f6116b.m7407a(6, "Persisted config not initialized. Not logging error/warn");
        }
    }
}
