package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.fu */
/* JADX INFO: loaded from: classes.dex */
final class C1568fu extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10664a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1568fu(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10664a = context;
        this.f10665b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10664a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", sharedPreferences.getInt("version_code", 0));
        if (this.f10665b != null) {
            this.f10665b.mo11288a(bundle);
        }
    }
}
