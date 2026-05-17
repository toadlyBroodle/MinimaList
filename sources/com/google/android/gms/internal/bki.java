package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bki extends bnq {

    /* JADX INFO: renamed from: d */
    private List<Long> f8317d;

    public bki(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 31);
        this.f8317d = null;
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        this.f8492b.f11598p = -1L;
        this.f8492b.f11599q = -1L;
        if (this.f8317d == null) {
            this.f8317d = (List) this.f8493c.invoke(null, this.f8491a.m8247a());
        }
        if (this.f8317d == null || this.f8317d.size() != 2) {
            return;
        }
        synchronized (this.f8492b) {
            this.f8492b.f11598p = Long.valueOf(this.f8317d.get(0).longValue());
            this.f8492b.f11599q = Long.valueOf(this.f8317d.get(1).longValue());
        }
    }
}
