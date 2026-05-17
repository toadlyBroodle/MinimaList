package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdb {

    /* JADX INFO: renamed from: a */
    private final String f7824a;

    /* JADX INFO: renamed from: b */
    private final String f7825b;

    /* JADX INFO: renamed from: c */
    private final boolean f7826c;

    public bdb(String str, String str2, boolean z) {
        this.f7824a = str;
        this.f7825b = str2;
        this.f7826c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m8953a() {
        return this.f7824a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8954b() {
        return this.f7825b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8955c() {
        return this.f7826c;
    }

    public final String toString() {
        String str = this.f7826c ? "s" : "";
        String str2 = this.f7824a;
        return new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length()).append("http").append(str).append("://").append(str2).toString();
    }
}
