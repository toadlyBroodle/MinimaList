package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bgh extends bnq {

    /* JADX INFO: renamed from: d */
    private static volatile Long f8084d = null;

    /* JADX INFO: renamed from: e */
    private static final Object f8085e = new Object();

    public bgh(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 22);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (f8084d == null) {
            synchronized (f8085e) {
                if (f8084d == null) {
                    f8084d = (Long) this.f8493c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8492b) {
            this.f8492b.f11594l = f8084d;
        }
    }
}
