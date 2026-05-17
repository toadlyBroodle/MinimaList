package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class azr extends bnq {

    /* JADX INFO: renamed from: d */
    private static volatile String f7635d = null;

    /* JADX INFO: renamed from: e */
    private static final Object f7636e = new Object();

    public azr(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 29);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        this.f8492b.f11597o = "E";
        if (f7635d == null) {
            synchronized (f7636e) {
                if (f7635d == null) {
                    f7635d = (String) this.f8493c.invoke(null, this.f8491a.m8247a());
                }
            }
        }
        synchronized (this.f8492b) {
            this.f8492b.f11597o = C2042xi.m12565a(f7635d.getBytes(), true);
        }
    }
}
