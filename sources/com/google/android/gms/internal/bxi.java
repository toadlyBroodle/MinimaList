package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
final class bxi extends bxf.AbstractC1463a<byd> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9279a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bxb f9280b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f9281c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ cii f9282d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bxf f9283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bxi(bxf bxfVar, Context context, bxb bxbVar, String str, cii ciiVar) {
        super();
        this.f9283e = bxfVar;
        this.f9279a = context;
        this.f9280b = bxbVar;
        this.f9281c = str;
        this.f9282d = ciiVar;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10400a() {
        byd bydVarM10372a = this.f9283e.f9262c.m10372a(this.f9279a, this.f9280b, this.f9281c, this.f9282d, 2);
        if (bydVarM10372a != null) {
            return bydVarM10372a;
        }
        bxf bxfVar = this.f9283e;
        bxf.m10392a(this.f9279a, "interstitial");
        return new bzq();
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10401a(bym bymVar) {
        return bymVar.createInterstitialAdManager(BinderC0654c.m5329a(this.f9279a), this.f9280b, this.f9281c, this.f9282d, 11910000);
    }
}
