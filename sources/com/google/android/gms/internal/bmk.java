package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bmk extends bnq {

    /* JADX INFO: renamed from: d */
    private final StackTraceElement[] f8427d;

    public bmk(arz arzVar, String str, String str2, C1937tl c1937tl, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(arzVar, str, str2, c1937tl, i, 45);
        this.f8427d = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.bnq
    /* JADX INFO: renamed from: a */
    protected final void mo8698a() {
        if (this.f8427d != null) {
            arx arxVar = new arx((String) this.f8493c.invoke(null, this.f8427d));
            synchronized (this.f8492b) {
                this.f8492b.f11545B = arxVar.f7172a;
                if (arxVar.f7173b.booleanValue()) {
                    this.f8492b.f11553J = Integer.valueOf(arxVar.f7174c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
