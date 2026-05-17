package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnm extends bnq {
    public bnm(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 48);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        this.f8492b.f11548E = 2;
        boolean zBooleanValue = ((Boolean) this.f8493c.invoke(null, this.f8491a.m8247a())).booleanValue();
        synchronized (this.f8492b) {
            if (zBooleanValue) {
                this.f8492b.f11548E = 1;
            } else {
                this.f8492b.f11548E = 0;
            }
        }
    }
}
