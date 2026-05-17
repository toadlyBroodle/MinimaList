package com.google.android.gms.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ut */
/* JADX INFO: loaded from: classes.dex */
public class C1972ut {

    /* JADX INFO: renamed from: a */
    private final String f11682a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1997vr f11683b;

    /* JADX INFO: renamed from: c */
    protected final C1992vm f11684c;

    protected C1972ut(String str, String str2, String str3) {
        C1981vb.m12426a(str);
        this.f11682a = str;
        this.f11684c = new C1992vm(str2);
        m12372a(str3);
    }

    /* JADX INFO: renamed from: a */
    public void mo12367a() {
    }

    /* JADX INFO: renamed from: a */
    public void mo12370a(long j, int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m12371a(InterfaceC1997vr interfaceC1997vr) {
        this.f11683b = interfaceC1997vr;
        if (this.f11683b == null) {
            mo12367a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12372a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11684c.m12444a(str);
    }

    /* JADX INFO: renamed from: a */
    protected final void m12373a(String str, long j, String str2) {
        Object[] objArr = {str, null};
        this.f11683b.mo6505a(this.f11682a, str, j, null);
    }

    /* JADX INFO: renamed from: b */
    public final String m12374b() {
        return this.f11682a;
    }

    /* JADX INFO: renamed from: b */
    public void mo12375b(String str) {
    }

    /* JADX INFO: renamed from: c */
    protected final long m12376c() {
        return this.f11683b.mo6503a();
    }
}
