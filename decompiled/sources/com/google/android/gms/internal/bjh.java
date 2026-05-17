package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bjh extends bnq {
    public bjh(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 3);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        synchronized (this.f8492b) {
            ahn ahnVar = new ahn((String) this.f8493c.invoke(null, this.f8491a.m8247a()));
            synchronized (this.f8492b) {
                this.f8492b.f11585c = Long.valueOf(ahnVar.f6787a);
                this.f8492b.f11558O = Long.valueOf(ahnVar.f6788b);
            }
        }
    }
}
