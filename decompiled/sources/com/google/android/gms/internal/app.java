package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class app {

    /* JADX INFO: renamed from: a */
    private final String f7034a;

    /* JADX INFO: renamed from: b */
    private final String f7035b;

    /* JADX INFO: renamed from: c */
    private final String f7036c;

    /* JADX INFO: renamed from: d */
    private final boolean f7037d;

    /* JADX INFO: renamed from: e */
    private final String f7038e;

    /* JADX INFO: renamed from: f */
    private final String f7039f;

    public app(String str, String str2, String str3, boolean z, String str4) {
        this(str, str2, str3, z, str4, "");
    }

    private app(String str, String str2, String str3, boolean z, String str4, String str5) {
        C1221aj.m7065a(str);
        C1221aj.m7065a(str5);
        this.f7034a = str;
        this.f7035b = str2;
        this.f7036c = str3;
        this.f7037d = z;
        this.f7038e = str4;
        this.f7039f = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m8107a() {
        return this.f7034a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8108b() {
        return this.f7035b;
    }

    /* JADX INFO: renamed from: c */
    public final String m8109c() {
        return this.f7036c;
    }

    /* JADX INFO: renamed from: d */
    public final String m8110d() {
        if (this.f7036c == null) {
            return this.f7034a;
        }
        String str = this.f7036c;
        String str2 = this.f7034a;
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append("_").append(str2).toString();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8111e() {
        return this.f7037d;
    }

    /* JADX INFO: renamed from: f */
    public final String m8112f() {
        return this.f7038e;
    }

    /* JADX INFO: renamed from: g */
    public final String m8113g() {
        return this.f7039f;
    }
}
