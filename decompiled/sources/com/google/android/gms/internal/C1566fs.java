package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.fs */
/* JADX INFO: loaded from: classes.dex */
final class C1566fs extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10660a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1566fs(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10660a = context;
        this.f10661b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10660a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("auto_collect_location", sharedPreferences.getBoolean("auto_collect_location", false));
        if (this.f10661b != null) {
            this.f10661b.mo11288a(bundle);
        }
    }
}
