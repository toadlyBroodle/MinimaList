package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.auth.C2200n;
import com.google.firebase.auth.internal.InterfaceC2178a;

/* JADX INFO: loaded from: classes.dex */
final class ayw extends azo<C2200n, InterfaceC2178a> {

    /* JADX INFO: renamed from: t */
    private final String f7596t;

    public ayw(String str) {
        super(1);
        this.f7596t = C1221aj.m7068a(str, (Object) "refresh token cannot be null");
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: a */
    public final void mo8708a() {
        this.f7617e.mo8732a(this.f7596t, this.f7614b);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: b */
    public final void mo8709b() {
        this.f7624l.m8766a(this.f7596t);
        ((InterfaceC2178a) this.f7618f).mo12845a(this.f7624l, this.f7616d);
        m8747b(new C2200n(this.f7624l.m8769c()));
    }
}
