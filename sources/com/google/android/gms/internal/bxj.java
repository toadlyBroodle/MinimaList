package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
final class bxj extends bxf.AbstractC1463a<bxy> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9284a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f9285b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ cii f9286c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bxf f9287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bxj(bxf bxfVar, Context context, String str, cii ciiVar) {
        super();
        this.f9287d = bxfVar;
        this.f9284a = context;
        this.f9285b = str;
        this.f9286c = ciiVar;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bxy mo10400a() {
        bxy bxyVarM10371a = this.f9287d.f9263d.m10371a(this.f9284a, this.f9285b, this.f9286c);
        if (bxyVarM10371a != null) {
            return bxyVarM10371a;
        }
        bxf bxfVar = this.f9287d;
        bxf.m10392a(this.f9284a, "native_ad");
        return new bzm();
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bxy mo10401a(bym bymVar) {
        return bymVar.createAdLoaderBuilder(BinderC0654c.m5329a(this.f9284a), this.f9285b, this.f9286c, 11910000);
    }
}
