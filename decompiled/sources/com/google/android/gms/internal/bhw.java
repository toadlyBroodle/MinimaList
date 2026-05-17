package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhw {

    /* JADX INFO: renamed from: a */
    public static final bhw f8191a = new bhw(bhx.User, null, false);

    /* JADX INFO: renamed from: b */
    public static final bhw f8192b = new bhw(bhx.Server, null, false);

    /* JADX INFO: renamed from: c */
    private final bhx f8193c;

    /* JADX INFO: renamed from: d */
    private final bjp f8194d;

    /* JADX INFO: renamed from: e */
    private final boolean f8195e;

    private bhw(bhx bhxVar, bjp bjpVar, boolean z) {
        this.f8193c = bhxVar;
        this.f8194d = bjpVar;
        this.f8195e = z;
    }

    /* JADX INFO: renamed from: a */
    public static bhw m9351a(bjp bjpVar) {
        return new bhw(bhx.Server, bjpVar, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9352a() {
        return this.f8193c == bhx.User;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9353b() {
        return this.f8195e;
    }

    /* JADX INFO: renamed from: c */
    public final bjp m9354c() {
        return this.f8194d;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8193c);
        String strValueOf2 = String.valueOf(this.f8194d);
        return new StringBuilder(String.valueOf(strValueOf).length() + 52 + String.valueOf(strValueOf2).length()).append("OperationSource{source=").append(strValueOf).append(", queryParams=").append(strValueOf2).append(", tagged=").append(this.f8195e).append("}").toString();
    }
}
