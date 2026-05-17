package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class big extends bnq {

    /* JADX INFO: renamed from: d */
    private static volatile String f8209d = null;

    /* JADX INFO: renamed from: e */
    private static final Object f8210e = new Object();

    public big(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2) {
        super(arzVar, str, str2, c1937tl, i, 1);
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        this.f8492b.f11568a = "E";
        if (f8209d == null) {
            synchronized (f8210e) {
                if (f8209d == null) {
                    f8209d = (String) this.f8493c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8492b) {
            this.f8492b.f11568a = f8209d;
        }
    }
}
