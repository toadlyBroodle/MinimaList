package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbq extends cdo implements ccc {

    /* JADX INFO: renamed from: a */
    private String f9731a;

    /* JADX INFO: renamed from: b */
    private List<cbp> f9732b;

    /* JADX INFO: renamed from: c */
    private String f9733c;

    /* JADX INFO: renamed from: d */
    private ccy f9734d;

    /* JADX INFO: renamed from: e */
    private String f9735e;

    /* JADX INFO: renamed from: f */
    private double f9736f;

    /* JADX INFO: renamed from: g */
    private String f9737g;

    /* JADX INFO: renamed from: h */
    private String f9738h;

    /* JADX INFO: renamed from: i */
    private cbn f9739i;

    /* JADX INFO: renamed from: j */
    private Bundle f9740j;

    /* JADX INFO: renamed from: k */
    private byx f9741k;

    /* JADX INFO: renamed from: l */
    private View f9742l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0652a f9743m;

    /* JADX INFO: renamed from: n */
    private String f9744n;

    /* JADX INFO: renamed from: o */
    private Object f9745o = new Object();

    /* JADX INFO: renamed from: p */
    private cbz f9746p;

    public cbq(String str, List<cbp> list, String str2, ccy ccyVar, String str3, double d, String str4, String str5, cbn cbnVar, Bundle bundle, byx byxVar, View view, InterfaceC0652a interfaceC0652a, String str6) {
        this.f9731a = str;
        this.f9732b = list;
        this.f9733c = str2;
        this.f9734d = ccyVar;
        this.f9735e = str3;
        this.f9736f = d;
        this.f9737g = str4;
        this.f9738h = str5;
        this.f9739i = cbnVar;
        this.f9740j = bundle;
        this.f9741k = byxVar;
        this.f9742l = view;
        this.f9743m = interfaceC0652a;
        this.f9744n = str6;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ cbz m10608a(cbq cbqVar, cbz cbzVar) {
        cbqVar.f9746p = null;
        return null;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: a */
    public final String mo10609a() {
        return this.f9731a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: a */
    public final void mo10610a(Bundle bundle) {
        synchronized (this.f9745o) {
            if (this.f9746p == null) {
                C1560fm.m11612c("Attempt to perform click before app install ad initialized.");
            } else {
                this.f9746p.mo10681b(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: a */
    public final void mo10611a(cbz cbzVar) {
        synchronized (this.f9745o) {
            this.f9746p = cbzVar;
        }
    }

    @Override // com.google.android.gms.internal.cdn, com.google.android.gms.internal.ccc
    /* JADX INFO: renamed from: b */
    public final List mo10612b() {
        return this.f9732b;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: b */
    public final boolean mo10613b(Bundle bundle) {
        boolean zMo10680a;
        synchronized (this.f9745o) {
            if (this.f9746p == null) {
                C1560fm.m11612c("Attempt to record impression before app install ad initialized.");
                zMo10680a = false;
            } else {
                zMo10680a = this.f9746p.mo10680a(bundle);
            }
        }
        return zMo10680a;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: c */
    public final String mo10614c() {
        return this.f9733c;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: c */
    public final void mo10615c(Bundle bundle) {
        synchronized (this.f9745o) {
            if (this.f9746p == null) {
                C1560fm.m11612c("Attempt to perform click before app install ad initialized.");
            } else {
                this.f9746p.mo10683c(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: d */
    public final ccy mo10616d() {
        return this.f9734d;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: e */
    public final String mo10617e() {
        return this.f9735e;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: f */
    public final double mo10618f() {
        return this.f9736f;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: g */
    public final String mo10619g() {
        return this.f9737g;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: h */
    public final String mo10620h() {
        return this.f9738h;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: i */
    public final byx mo10621i() {
        return this.f9741k;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo10622j() {
        return BinderC0654c.m5329a(this.f9746p);
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: k */
    public final String mo10623k() {
        return "2";
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: l */
    public final String mo10624l() {
        return "";
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: m */
    public final cbn mo10625m() {
        return this.f9739i;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: n */
    public final Bundle mo10626n() {
        return this.f9740j;
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: o */
    public final View mo10627o() {
        return this.f9742l;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: p */
    public final InterfaceC0652a mo10628p() {
        return this.f9743m;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: q */
    public final String mo10629q() {
        return this.f9744n;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: r */
    public final ccu mo10630r() {
        return this.f9739i;
    }

    @Override // com.google.android.gms.internal.cdn
    /* JADX INFO: renamed from: s */
    public final void mo10631s() {
        C1596gv.f10711a.post(new cbr(this));
        this.f9731a = null;
        this.f9732b = null;
        this.f9733c = null;
        this.f9734d = null;
        this.f9735e = null;
        this.f9736f = 0.0d;
        this.f9737g = null;
        this.f9738h = null;
        this.f9739i = null;
        this.f9740j = null;
        this.f9745o = null;
        this.f9741k = null;
        this.f9742l = null;
    }
}
