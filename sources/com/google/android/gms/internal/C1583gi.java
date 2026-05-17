package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.gi */
/* JADX INFO: loaded from: classes.dex */
final class C1583gi extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10691a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1583gi(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10691a = context;
        this.f10692b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10691a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedPreferences.getInt("webview_cache_version", 0));
        if (this.f10692b != null) {
            this.f10692b.mo11288a(bundle);
        }
    }
}
