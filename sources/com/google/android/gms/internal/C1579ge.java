package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ge */
/* JADX INFO: loaded from: classes.dex */
final class C1579ge extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10685a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1579ge(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10685a = context;
        this.f10686b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10685a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("request_in_session_count", sharedPreferences.getInt("request_in_session_count", -1));
        if (this.f10686b != null) {
            this.f10686b.mo11288a(bundle);
        }
    }
}
