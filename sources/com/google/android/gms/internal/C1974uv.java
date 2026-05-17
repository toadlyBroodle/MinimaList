package com.google.android.gms.internal;

import com.google.android.gms.cast.C0990d;
import com.google.android.gms.cast.C0991e;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.internal.uv */
/* JADX INFO: loaded from: classes.dex */
final class C1974uv implements C0991e.a {

    /* JADX INFO: renamed from: a */
    private final Status f11710a;

    /* JADX INFO: renamed from: b */
    private final C0990d f11711b;

    /* JADX INFO: renamed from: c */
    private final String f11712c;

    /* JADX INFO: renamed from: d */
    private final String f11713d;

    /* JADX INFO: renamed from: e */
    private final boolean f11714e;

    public C1974uv(Status status) {
        this(status, null, null, null, false);
    }

    public C1974uv(Status status, C0990d c0990d, String str, String str2, boolean z) {
        this.f11710a = status;
        this.f11711b = c0990d;
        this.f11712c = str;
        this.f11713d = str2;
        this.f11714e = z;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1193k
    /* JADX INFO: renamed from: a */
    public final Status mo6094a() {
        return this.f11710a;
    }

    @Override // com.google.android.gms.cast.C0991e.a
    /* JADX INFO: renamed from: b */
    public final C0990d mo6288b() {
        return this.f11711b;
    }

    @Override // com.google.android.gms.cast.C0991e.a
    /* JADX INFO: renamed from: c */
    public final String mo6289c() {
        return this.f11712c;
    }

    @Override // com.google.android.gms.cast.C0991e.a
    /* JADX INFO: renamed from: d */
    public final String mo6290d() {
        return this.f11713d;
    }

    @Override // com.google.android.gms.cast.C0991e.a
    /* JADX INFO: renamed from: e */
    public final boolean mo6291e() {
        return this.f11714e;
    }
}
