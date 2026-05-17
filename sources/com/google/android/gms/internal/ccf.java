package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class ccf {

    /* JADX INFO: renamed from: a */
    private final WeakReference<InterfaceC1758mv> f9796a;

    /* JADX INFO: renamed from: b */
    private String f9797b;

    public ccf(InterfaceC1758mv interfaceC1758mv) {
        this.f9796a = new WeakReference<>(interfaceC1758mv);
    }

    /* JADX INFO: renamed from: a */
    public final void m10710a(cmh cmhVar) {
        cmhVar.mo11089a("/loadHtml", new ccg(this, cmhVar));
        cmhVar.mo11089a("/showOverlay", new ccj(this, cmhVar));
        cmhVar.mo11089a("/hideOverlay", new cck(this, cmhVar));
        InterfaceC1758mv interfaceC1758mv = this.f9796a.get();
        if (interfaceC1758mv != null) {
            interfaceC1758mv.mo11833w().m11857a("/sendMessageToSdk", new ccl(this, cmhVar));
        }
    }
}
