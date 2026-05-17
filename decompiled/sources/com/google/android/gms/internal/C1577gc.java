package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.gc */
/* JADX INFO: loaded from: classes.dex */
final class C1577gc extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10681a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1577gc(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10681a = context;
        this.f10682b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10681a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("app_last_background_time_ms", sharedPreferences.getLong("app_last_background_time_ms", 0L));
        if (this.f10682b != null) {
            this.f10682b.mo11288a(bundle);
        }
    }
}
