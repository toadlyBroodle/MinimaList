package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.C0875h;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjg extends ciz {

    /* JADX INFO: renamed from: a */
    private final C0875h f10157a;

    public cjg(C0875h c0875h) {
        this.f10157a = c0875h;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: a */
    public final String mo10987a() {
        return this.f10157a.m5904i();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: a */
    public final void mo10988a(InterfaceC0652a interfaceC0652a) {
        this.f10157a.m5876c((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: b */
    public final List mo10989b() {
        List<AbstractC0666c.b> listM5905j = this.f10157a.m5905j();
        if (listM5905j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC0666c.b bVar : listM5905j) {
            arrayList.add(new cbp(bVar.mo5344a(), bVar.mo5345b(), bVar.mo5346c()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: b */
    public final void mo10990b(InterfaceC0652a interfaceC0652a) {
        this.f10157a.mo5302a((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: c */
    public final String mo10991c() {
        return this.f10157a.m5906k();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: c */
    public final void mo10992c(InterfaceC0652a interfaceC0652a) {
        this.f10157a.m5872b((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: d */
    public final ccy mo10993d() {
        AbstractC0666c.b bVarM5907l = this.f10157a.m5907l();
        if (bVarM5907l != null) {
            return new cbp(bVarM5907l.mo5344a(), bVarM5907l.mo5345b(), bVarM5907l.mo5346c());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: e */
    public final String mo10994e() {
        return this.f10157a.m5908m();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: f */
    public final String mo10995f() {
        return this.f10157a.m5909n();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: g */
    public final void mo10996g() {
        this.f10157a.m5878e();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: h */
    public final boolean mo10997h() {
        return this.f10157a.m5871a();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: i */
    public final boolean mo10998i() {
        return this.f10157a.m5874b();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: j */
    public final Bundle mo10999j() {
        return this.f10157a.m5875c();
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: k */
    public final InterfaceC0652a mo11000k() {
        View viewM5877d = this.f10157a.m5877d();
        if (viewM5877d == null) {
            return null;
        }
        return BinderC0654c.m5329a(viewM5877d);
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: l */
    public final byx mo11001l() {
        if (this.f10157a.m5880g() != null) {
            return this.f10157a.m5880g().m5433a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: m */
    public final ccu mo11002m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: n */
    public final InterfaceC0652a mo11003n() {
        View viewM5879f = this.f10157a.m5879f();
        if (viewM5879f == null) {
            return null;
        }
        return BinderC0654c.m5329a(viewM5879f);
    }

    @Override // com.google.android.gms.internal.ciy
    /* JADX INFO: renamed from: o */
    public final InterfaceC0652a mo11004o() {
        return null;
    }
}
