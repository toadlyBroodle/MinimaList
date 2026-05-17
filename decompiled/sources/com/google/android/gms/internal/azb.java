package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.firebase.auth.C2204r;
import com.google.firebase.auth.internal.C2181d;
import com.google.firebase.auth.internal.C2184g;
import com.google.firebase.auth.internal.InterfaceC2178a;

/* JADX INFO: loaded from: classes.dex */
final class azb extends azo<Object, InterfaceC2178a> {

    /* JADX INFO: renamed from: t */
    private C2204r f7603t;

    public azb(C2204r c2204r) {
        super(2);
        this.f7603t = (C2204r) C1221aj.m7065a(c2204r);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: a */
    public final void mo8708a() {
        this.f7617e.mo8731a(this.f7603t, this.f7614b);
    }

    @Override // com.google.android.gms.internal.azo
    /* JADX INFO: renamed from: b */
    public final void mo8709b() {
        C2184g c2184gM8703b = ayv.m8703b(this.f7615c, this.f7625m);
        ((InterfaceC2178a) this.f7618f).mo12845a(this.f7624l, c2184gM8703b);
        m8747b(new C2181d(c2184gM8703b));
    }
}
