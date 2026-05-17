package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.C0874g;
import com.google.android.gms.ads.p045b.AbstractC0666c;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cjf extends ciw {

    /* JADX INFO: renamed from: a */
    private final C0874g f10156a;

    public cjf(C0874g c0874g) {
        this.f10156a = c0874g;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: a */
    public final String mo10967a() {
        return this.f10156a.m5890i();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: a */
    public final void mo10968a(InterfaceC0652a interfaceC0652a) {
        this.f10156a.m5876c((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: b */
    public final List mo10969b() {
        List<AbstractC0666c.b> listM5891j = this.f10156a.m5891j();
        if (listM5891j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC0666c.b bVar : listM5891j) {
            arrayList.add(new cbp(bVar.mo5344a(), bVar.mo5345b(), bVar.mo5346c()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: b */
    public final void mo10970b(InterfaceC0652a interfaceC0652a) {
        this.f10156a.mo5302a((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: c */
    public final String mo10971c() {
        return this.f10156a.m5892k();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: c */
    public final void mo10972c(InterfaceC0652a interfaceC0652a) {
        this.f10156a.m5872b((View) BinderC0654c.m5330a(interfaceC0652a));
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: d */
    public final ccy mo10973d() {
        AbstractC0666c.b bVarM5893l = this.f10156a.m5893l();
        if (bVarM5893l != null) {
            return new cbp(bVarM5893l.mo5344a(), bVarM5893l.mo5345b(), bVarM5893l.mo5346c());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: e */
    public final String mo10974e() {
        return this.f10156a.m5894m();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: f */
    public final double mo10975f() {
        return this.f10156a.m5895n();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: g */
    public final String mo10976g() {
        return this.f10156a.m5896o();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: h */
    public final String mo10977h() {
        return this.f10156a.m5897p();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: i */
    public final void mo10978i() {
        this.f10156a.m5878e();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: j */
    public final boolean mo10979j() {
        return this.f10156a.m5871a();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: k */
    public final boolean mo10980k() {
        return this.f10156a.m5874b();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: l */
    public final Bundle mo10981l() {
        return this.f10156a.m5875c();
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: m */
    public final byx mo10982m() {
        if (this.f10156a.m5880g() != null) {
            return this.f10156a.m5880g().m5433a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: n */
    public final InterfaceC0652a mo10983n() {
        View viewM5877d = this.f10156a.m5877d();
        if (viewM5877d == null) {
            return null;
        }
        return BinderC0654c.m5329a(viewM5877d);
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: o */
    public final ccu mo10984o() {
        return null;
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: p */
    public final InterfaceC0652a mo10985p() {
        View viewM5879f = this.f10156a.m5879f();
        if (viewM5879f == null) {
            return null;
        }
        return BinderC0654c.m5329a(viewM5879f);
    }

    @Override // com.google.android.gms.internal.civ
    /* JADX INFO: renamed from: q */
    public final InterfaceC0652a mo10986q() {
        return null;
    }
}
