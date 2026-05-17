package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@cnb
public class clh extends cky implements InterfaceC1764na {
    clh(Context context, C1542ev c1542ev, InterfaceC1758mv interfaceC1758mv, clg clgVar) {
        super(context, c1542ev, interfaceC1758mv, clgVar);
    }

    @Override // com.google.android.gms.internal.cky
    /* JADX INFO: renamed from: a */
    protected final void mo11073a() {
        if (this.f10250c.f12612d != -2) {
            return;
        }
        this.f10249b.mo11833w().m11853a(this);
        mo11082b();
        C1560fm.m11610b("Loading HTML in WebView.");
        this.f10249b.loadDataWithBaseURL(this.f10250c.f12609a, this.f10250c.f12610b, "text/html", "UTF-8", null);
    }

    /* JADX INFO: renamed from: b */
    protected void mo11082b() {
    }
}
