package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cbs extends cds implements ccc {

    /* JADX INFO: renamed from: a */
    private String f9748a;

    /* JADX INFO: renamed from: b */
    private List<cbp> f9749b;

    /* JADX INFO: renamed from: c */
    private String f9750c;

    /* JADX INFO: renamed from: d */
    private ccy f9751d;

    /* JADX INFO: renamed from: e */
    private String f9752e;

    /* JADX INFO: renamed from: f */
    private String f9753f;

    /* JADX INFO: renamed from: g */
    private cbn f9754g;

    /* JADX INFO: renamed from: h */
    private Bundle f9755h;

    /* JADX INFO: renamed from: i */
    private byx f9756i;

    /* JADX INFO: renamed from: j */
    private View f9757j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0652a f9758k;

    /* JADX INFO: renamed from: l */
    private String f9759l;

    /* JADX INFO: renamed from: m */
    private Object f9760m = new Object();

    /* JADX INFO: renamed from: n */
    private cbz f9761n;

    public cbs(String str, List<cbp> list, String str2, ccy ccyVar, String str3, String str4, cbn cbnVar, Bundle bundle, byx byxVar, View view, InterfaceC0652a interfaceC0652a, String str5) {
        this.f9748a = str;
        this.f9749b = list;
        this.f9750c = str2;
        this.f9751d = ccyVar;
        this.f9752e = str3;
        this.f9753f = str4;
        this.f9754g = cbnVar;
        this.f9755h = bundle;
        this.f9756i = byxVar;
        this.f9757j = view;
        this.f9758k = interfaceC0652a;
        this.f9759l = str5;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ cbz m10633a(cbs cbsVar, cbz cbzVar) {
        cbsVar.f9761n = null;
        return null;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: a */
    public final String mo10634a() {
        return this.f9748a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: a */
    public final void mo10635a(Bundle bundle) {
        synchronized (this.f9760m) {
            if (this.f9761n == null) {
                C1560fm.m11612c("Attempt to perform click before content ad initialized.");
            } else {
                this.f9761n.mo10681b(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: a */
    public final void mo10611a(cbz cbzVar) {
        synchronized (this.f9760m) {
            this.f9761n = cbzVar;
        }
    }

    @Override // com.google.android.gms.internal.cdr, com.google.android.gms.internal.ccc
    /* JADX INFO: renamed from: b */
    public final List mo10612b() {
        return this.f9749b;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: b */
    public final boolean mo10636b(Bundle bundle) {
        boolean zMo10680a;
        synchronized (this.f9760m) {
            if (this.f9761n == null) {
                C1560fm.m11612c("Attempt to record impression before content ad initialized.");
                zMo10680a = false;
            } else {
                zMo10680a = this.f9761n.mo10680a(bundle);
            }
        }
        return zMo10680a;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: c */
    public final InterfaceC0652a mo10637c() {
        return this.f9758k;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: c */
    public final void mo10638c(Bundle bundle) {
        synchronized (this.f9760m) {
            if (this.f9761n == null) {
                C1560fm.m11612c("Attempt to perform click before app install ad initialized.");
            } else {
                this.f9761n.mo10683c(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: d */
    public final String mo10639d() {
        return this.f9759l;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: e */
    public final String mo10640e() {
        return this.f9750c;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: f */
    public final ccy mo10641f() {
        return this.f9751d;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: g */
    public final String mo10642g() {
        return this.f9752e;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: h */
    public final String mo10643h() {
        return this.f9753f;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: i */
    public final byx mo10644i() {
        return this.f9756i;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo10645j() {
        return BinderC0654c.m5329a(this.f9761n);
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: k */
    public final String mo10623k() {
        return "1";
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: l */
    public final String mo10624l() {
        return "";
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: m */
    public final cbn mo10625m() {
        return this.f9754g;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: n */
    public final Bundle mo10646n() {
        return this.f9755h;
    }

    @Override // com.google.android.gms.internal.ccb
    /* JADX INFO: renamed from: o */
    public final View mo10627o() {
        return this.f9757j;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: p */
    public final ccu mo10647p() {
        return this.f9754g;
    }

    @Override // com.google.android.gms.internal.cdr
    /* JADX INFO: renamed from: q */
    public final void mo10648q() {
        C1596gv.f10711a.post(new cbt(this));
        this.f9748a = null;
        this.f9749b = null;
        this.f9750c = null;
        this.f9751d = null;
        this.f9752e = null;
        this.f9753f = null;
        this.f9754g = null;
        this.f9755h = null;
        this.f9760m = null;
        this.f9756i = null;
        this.f9757j = null;
    }
}
