package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p018i.C0219m;
import android.text.TextUtils;
import com.google.android.gms.ads.p045b.C0673j;
import com.google.android.gms.internal.C1670jo;
import com.google.android.gms.internal.bxb;
import com.google.android.gms.internal.bxs;
import com.google.android.gms.internal.bxv;
import com.google.android.gms.internal.bxz;
import com.google.android.gms.internal.byp;
import com.google.android.gms.internal.ccm;
import com.google.android.gms.internal.cdz;
import com.google.android.gms.internal.cec;
import com.google.android.gms.internal.cef;
import com.google.android.gms.internal.cei;
import com.google.android.gms.internal.cem;
import com.google.android.gms.internal.cep;
import com.google.android.gms.internal.cii;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.k */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC0821k extends bxz {

    /* JADX INFO: renamed from: a */
    private bxs f4749a;

    /* JADX INFO: renamed from: b */
    private cdz f4750b;

    /* JADX INFO: renamed from: c */
    private cem f4751c;

    /* JADX INFO: renamed from: d */
    private cec f4752d;

    /* JADX INFO: renamed from: g */
    private cep f4755g;

    /* JADX INFO: renamed from: h */
    private bxb f4756h;

    /* JADX INFO: renamed from: i */
    private C0673j f4757i;

    /* JADX INFO: renamed from: j */
    private ccm f4758j;

    /* JADX INFO: renamed from: k */
    private byp f4759k;

    /* JADX INFO: renamed from: l */
    private final Context f4760l;

    /* JADX INFO: renamed from: m */
    private final cii f4761m;

    /* JADX INFO: renamed from: n */
    private final String f4762n;

    /* JADX INFO: renamed from: o */
    private final C1670jo f4763o;

    /* JADX INFO: renamed from: p */
    private final C0733bq f4764p;

    /* JADX INFO: renamed from: f */
    private C0219m<String, cei> f4754f = new C0219m<>();

    /* JADX INFO: renamed from: e */
    private C0219m<String, cef> f4753e = new C0219m<>();

    public BinderC0821k(Context context, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        this.f4760l = context;
        this.f4762n = str;
        this.f4761m = ciiVar;
        this.f4763o = c1670jo;
        this.f4764p = c0733bq;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final bxv mo5752a() {
        return new BinderC0780h(this.f4760l, this.f4762n, this.f4761m, this.f4763o, this.f4749a, this.f4750b, this.f4751c, this.f4752d, this.f4754f, this.f4753e, this.f4758j, this.f4759k, this.f4764p, this.f4755g, this.f4756h, this.f4757i);
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5753a(C0673j c0673j) {
        this.f4757i = c0673j;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5754a(bxs bxsVar) {
        this.f4749a = bxsVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5755a(byp bypVar) {
        this.f4759k = bypVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5756a(ccm ccmVar) {
        this.f4758j = ccmVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5757a(cdz cdzVar) {
        this.f4750b = cdzVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5758a(cec cecVar) {
        this.f4752d = cecVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5759a(cem cemVar) {
        this.f4751c = cemVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5760a(cep cepVar, bxb bxbVar) {
        this.f4755g = cepVar;
        this.f4756h = bxbVar;
    }

    @Override // com.google.android.gms.internal.bxy
    /* JADX INFO: renamed from: a */
    public final void mo5761a(String str, cei ceiVar, cef cefVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f4754f.put(str, ceiVar);
        this.f4753e.put(str, cefVar);
    }
}
