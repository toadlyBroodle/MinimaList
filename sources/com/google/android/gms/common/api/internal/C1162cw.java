package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cw */
/* JADX INFO: loaded from: classes.dex */
public final class C1162cw implements AbstractC1079f.b, AbstractC1079f.c {

    /* JADX INFO: renamed from: a */
    public final C1074a<?> f5741a;

    /* JADX INFO: renamed from: b */
    private final boolean f5742b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1163cx f5743c;

    public C1162cw(C1074a<?> c1074a, boolean z) {
        this.f5741a = c1074a;
        this.f5742b = z;
    }

    /* JADX INFO: renamed from: a */
    private final void m6955a() {
        C1221aj.m7066a(this.f5743c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
        m6955a();
        this.f5743c.mo6386a(i);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        m6955a();
        this.f5743c.mo6387a(bundle);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.c
    /* JADX INFO: renamed from: a */
    public final void mo4766a(C1071a c1071a) {
        m6955a();
        this.f5743c.mo6762a(c1071a, this.f5741a, this.f5742b);
    }

    /* JADX INFO: renamed from: a */
    public final void m6956a(InterfaceC1163cx interfaceC1163cx) {
        this.f5743c = interfaceC1163cx;
    }
}
