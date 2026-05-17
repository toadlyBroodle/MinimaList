package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.fz */
/* JADX INFO: loaded from: classes.dex */
final class C1573fz extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10675a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1573fz(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10675a = context;
        this.f10676b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10675a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("native_advanced_settings", sharedPreferences.getString("native_advanced_settings", "{}"));
        if (this.f10676b != null) {
            this.f10676b.mo11288a(bundle);
        }
    }
}
