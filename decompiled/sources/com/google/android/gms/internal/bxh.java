package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
final class bxh extends bxf.AbstractC1463a<byd> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f9275a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bxb f9276b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f9277c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bxf f9278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bxh(bxf bxfVar, Context context, bxb bxbVar, String str) {
        super();
        this.f9278d = bxfVar;
        this.f9275a = context;
        this.f9276b = bxbVar;
        this.f9277c = str;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10400a() {
        byd bydVarM10372a = this.f9278d.f9262c.m10372a(this.f9275a, this.f9276b, this.f9277c, null, 3);
        if (bydVarM10372a != null) {
            return bydVarM10372a;
        }
        bxf bxfVar = this.f9278d;
        bxf.m10392a(this.f9275a, "search");
        return new bzq();
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byd mo10401a(bym bymVar) {
        return bymVar.createSearchAdManager(BinderC0654c.m5329a(this.f9275a), this.f9276b, this.f9277c, 11910000);
    }
}
