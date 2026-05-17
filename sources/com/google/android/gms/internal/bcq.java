package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcq extends bnq {

    /* JADX INFO: renamed from: d */
    private static volatile Long f7799d = null;

    /* JADX INFO: renamed from: e */
    private static final Object f7800e = new Object();

    public bcq(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 44);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (f7799d == null) {
            synchronized (f7800e) {
                if (f7799d == null) {
                    f7799d = (Long) this.f8493c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8492b) {
            this.f8492b.f11544A = f7799d;
        }
    }
}
