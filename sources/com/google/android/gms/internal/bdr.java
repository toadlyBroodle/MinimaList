package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdr extends bnq {

    /* JADX INFO: renamed from: d */
    private long f7879d;

    public bdr(arz arzVar, String str, String str2, C1937tl c1937tl, long j, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 25);
        this.f7879d = j;
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        long jLongValue = ((Long) this.f8493c.invoke(null, new Object[0])).longValue();
        synchronized (this.f8492b) {
            this.f8492b.f11565V = Long.valueOf(jLongValue);
            if (this.f7879d != 0) {
                this.f8492b.f11592j = Long.valueOf(jLongValue - this.f7879d);
                this.f8492b.f11595m = Long.valueOf(this.f7879d);
            }
        }
    }
}
