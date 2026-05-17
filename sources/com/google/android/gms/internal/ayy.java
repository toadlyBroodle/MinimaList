package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.auth.AbstractC2158a;
import com.google.firebase.auth.internal.C2179b;
import com.google.firebase.auth.internal.C2181d;
import com.google.firebase.auth.internal.C2184g;
import com.google.firebase.auth.internal.InterfaceC2178a;

/* JADX INFO: loaded from: classes.dex */
final class ayy extends azo<Object, InterfaceC2178a> {

    /* JADX INFO: renamed from: t */
    private final bao f7600t;

    public ayy(AbstractC2158a abstractC2158a) {
        super(2);
        C1221aj.m7066a(abstractC2158a, "credential cannot be null");
        this.f7600t = C2179b.m12855a(abstractC2158a);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: a */
    public final void mo8708a() {
        this.f7617e.mo8730a(this.f7600t, this.f7614b);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: b */
    public final void mo8709b() {
        C2184g c2184gM8703b = ayv.m8703b(this.f7615c, this.f7625m);
        ((InterfaceC2178a) this.f7618f).mo12845a(this.f7624l, c2184gM8703b);
        m8747b(new C2181d(c2184gM8703b));
    }
}
