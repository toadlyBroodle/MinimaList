package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0949n {

    /* JADX INFO: renamed from: a */
    private static int f5101a = 31;

    /* JADX INFO: renamed from: b */
    private int f5102b = 1;

    /* JADX INFO: renamed from: a */
    public final int m6185a() {
        return this.f5102b;
    }

    /* JADX INFO: renamed from: a */
    public final C0949n m6186a(Object obj) {
        this.f5102b = (obj == null ? 0 : obj.hashCode()) + (this.f5102b * f5101a);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C0949n m6187a(boolean z) {
        this.f5102b = (z ? 1 : 0) + (this.f5102b * f5101a);
        return this;
    }
}
