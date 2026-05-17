package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1224am;
import com.google.android.gms.common.internal.C1248bj;
import com.google.android.gms.internal.afn;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.afr;
import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.agd;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bq */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1129bq extends afv implements AbstractC1079f.b, AbstractC1079f.c {

    /* JADX INFO: renamed from: a */
    private static C1074a.b<? extends afq, afr> f5667a = afn.f6658a;

    /* JADX INFO: renamed from: b */
    private final Context f5668b;

    /* JADX INFO: renamed from: c */
    private final Handler f5669c;

    /* JADX INFO: renamed from: d */
    private final C1074a.b<? extends afq, afr> f5670d;

    /* JADX INFO: renamed from: e */
    private Set<Scope> f5671e;

    /* JADX INFO: renamed from: f */
    private C1248bj f5672f;

    /* JADX INFO: renamed from: g */
    private afq f5673g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1132bt f5674h;

    public BinderC1129bq(Context context, Handler handler, C1248bj c1248bj) {
        this(context, handler, c1248bj, f5667a);
    }

    public BinderC1129bq(Context context, Handler handler, C1248bj c1248bj, C1074a.b<? extends afq, afr> bVar) {
        this.f5668b = context;
        this.f5669c = handler;
        this.f5672f = (C1248bj) C1221aj.m7066a(c1248bj, "ClientSettings must not be null");
        this.f5671e = c1248bj.m7151d();
        this.f5670d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m6896b(agd agdVar) {
        C1071a c1071aM7834a = agdVar.m7834a();
        if (c1071aM7834a.m6612b()) {
            C1224am c1224amM7835b = agdVar.m7835b();
            C1071a c1071aM7079b = c1224amM7835b.m7079b();
            if (!c1071aM7079b.m6612b()) {
                String strValueOf = String.valueOf(c1071aM7079b);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(strValueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(strValueOf).toString(), new Exception());
                this.f5674h.mo6844b(c1071aM7079b);
                this.f5673g.mo6640f();
                return;
            }
            this.f5674h.mo6843a(c1224amM7835b.m7078a(), this.f5671e);
        } else {
            this.f5674h.mo6844b(c1071aM7834a);
        }
        this.f5673g.mo6640f();
    }

    /* JADX INFO: renamed from: a */
    public final afq m6897a() {
        return this.f5673g;
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6386a(int i) {
        this.f5673g.mo6640f();
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.b
    /* JADX INFO: renamed from: a */
    public final void mo6387a(Bundle bundle) {
        this.f5673g.mo7819a(this);
    }

    @Override // com.google.android.gms.common.api.AbstractC1079f.c
    /* JADX INFO: renamed from: a */
    public final void mo4766a(C1071a c1071a) {
        this.f5674h.mo6844b(c1071a);
    }

    /* JADX INFO: renamed from: a */
    public final void m6898a(InterfaceC1132bt interfaceC1132bt) {
        if (this.f5673g != null) {
            this.f5673g.mo6640f();
        }
        this.f5672f.m7148a(Integer.valueOf(System.identityHashCode(this)));
        this.f5673g = (afq) this.f5670d.mo6098a(this.f5668b, this.f5669c.getLooper(), this.f5672f, this.f5672f.m7156i(), this, this);
        this.f5674h = interfaceC1132bt;
        if (this.f5671e == null || this.f5671e.isEmpty()) {
            this.f5669c.post(new RunnableC1130br(this));
        } else {
            this.f5673g.mo7821m();
        }
    }

    @Override // com.google.android.gms.internal.afv, com.google.android.gms.internal.afw
    /* JADX INFO: renamed from: a */
    public final void mo6899a(agd agdVar) {
        this.f5669c.post(new RunnableC1131bs(this, agdVar));
    }

    /* JADX INFO: renamed from: b */
    public final void m6900b() {
        if (this.f5673g != null) {
            this.f5673g.mo6640f();
        }
    }
}
