package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.gm */
/* JADX INFO: loaded from: classes.dex */
final class C1587gm extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10699a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1587gm(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10699a = context;
        this.f10700b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10699a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", sharedPreferences.getString("content_url_hashes", ""));
        if (this.f10700b != null) {
            this.f10700b.mo11288a(bundle);
        }
    }
}
