package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.auth.internal.C2181d;
import com.google.firebase.auth.internal.C2184g;
import com.google.firebase.auth.internal.InterfaceC2178a;

/* JADX INFO: loaded from: classes.dex */
final class aza extends azo<Object, InterfaceC2178a> {

    /* JADX INFO: renamed from: t */
    private String f7601t;

    /* JADX INFO: renamed from: u */
    private String f7602u;

    public aza(String str, String str2) {
        super(2);
        this.f7601t = C1221aj.m7068a(str, (Object) "email cannot be null or empty");
        this.f7602u = C1221aj.m7068a(str2, (Object) "password cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: a */
    public final void mo8708a() {
        this.f7617e.mo8733a(this.f7601t, this.f7602u, this.f7614b);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: b */
    public final void mo8709b() {
        C2184g c2184gM8703b = ayv.m8703b(this.f7615c, this.f7625m);
        ((InterfaceC2178a) this.f7618f).mo12845a(this.f7624l, c2184gM8703b);
        m8747b(new C2181d(c2184gM8703b));
    }
}
