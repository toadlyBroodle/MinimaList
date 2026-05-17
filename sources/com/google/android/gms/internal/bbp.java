package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbp extends bnq {
    public bbp(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 5);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        this.f8492b.f11586d = -1L;
        this.f8492b.f11587e = -1L;
        int[] iArr = (int[]) this.f8493c.invoke(null, this.f8491a.m8247a());
        synchronized (this.f8492b) {
            this.f8492b.f11586d = Long.valueOf(iArr[0]);
            this.f8492b.f11587e = Long.valueOf(iArr[1]);
            if (((Boolean) bxm.m10409f().m10546a(can.f9523bq)).booleanValue() && iArr[2] != Integer.MIN_VALUE) {
                this.f8492b.f11557N = Long.valueOf(iArr[2]);
            }
        }
    }
}
