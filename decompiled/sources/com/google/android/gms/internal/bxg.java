package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
final class bxg extends bxf.AbstractC1463a<byd> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9270a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bxb f9271b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f9272c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ cii f9273d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bxf f9274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bxg(bxf bxfVar, Context context, bxb bxbVar, String str, cii ciiVar) {
        super();
        this.f9274e = bxfVar;
        this.f9270a = context;
        this.f9271b = bxbVar;
        this.f9272c = str;
        this.f9273d = ciiVar;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10400a() {
        byd bydVarM10372a = this.f9274e.f9262c.m10372a(this.f9270a, this.f9271b, this.f9272c, this.f9273d, 1);
        if (bydVarM10372a != null) {
            return bydVarM10372a;
        }
        bxf bxfVar = this.f9274e;
        bxf.m10392a(this.f9270a, "banner");
        return new bzq();
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10401a(bym bymVar) {
        return bymVar.createBannerAdManager(BinderC0654c.m5329a(this.f9270a), this.f9271b, this.f9272c, this.f9273d, 11910000);
    }
}
