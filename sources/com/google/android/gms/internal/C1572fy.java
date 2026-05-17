package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.fy */
/* JADX INFO: loaded from: classes.dex */
final class C1572fy extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10673a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1572fy(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10673a = context;
        this.f10674b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10673a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedPreferences.getBoolean("use_https", true));
        if (this.f10674b != null) {
            this.f10674b.mo11288a(bundle);
        }
    }
}
