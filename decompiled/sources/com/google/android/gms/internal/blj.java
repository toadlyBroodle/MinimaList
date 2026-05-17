package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blj extends bnq {
    public blj(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 61);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        long jLongValue = ((Long) this.f8493c.invoke(null, this.f8491a.m8247a(), Boolean.valueOf(this.f8491a.m8260j()))).longValue();
        synchronized (this.f8492b) {
            this.f8492b.f11559P = Long.valueOf(jLongValue);
        }
    }
}
