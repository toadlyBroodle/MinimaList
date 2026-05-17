package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.internal.bxf;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: loaded from: classes.dex */
final class bxl extends bxf.AbstractC1463a<cki> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Activity f9291a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bxf f9292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bxl(bxf bxfVar, Activity activity) {
        super();
        this.f9292b = bxfVar;
        this.f9291a = activity;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cki mo10400a() {
        cki ckiVarM11065a = this.f9292b.f9267h.m11065a(this.f9291a);
        if (ckiVarM11065a != null) {
            return ckiVarM11065a;
        }
        bxf bxfVar = this.f9292b;
        bxf.m10392a(this.f9291a, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.bxf.AbstractC1463a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cki mo10401a(bym bymVar) {
        return bymVar.createAdOverlay(BinderC0654c.m5329a(this.f9291a));
    }
}
