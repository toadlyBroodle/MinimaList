package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.gk */
/* JADX INFO: loaded from: classes.dex */
final class C1585gk extends AbstractC1588gn {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10695a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1589go f10696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1585gk(Context context, InterfaceC1589go interfaceC1589go) {
        super(null);
        this.f10695a = context;
        this.f10696b = interfaceC1589go;
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        SharedPreferences sharedPreferences = this.f10695a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("content_url_opted_out", sharedPreferences.getBoolean("content_url_opted_out", true));
        if (this.f10696b != null) {
            this.f10696b.mo11288a(bundle);
        }
    }
}
