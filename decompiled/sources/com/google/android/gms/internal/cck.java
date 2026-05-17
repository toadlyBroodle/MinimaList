package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class cck implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cmh f9810a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ccf f9811b;

    cck(ccf ccfVar, cmh cmhVar) {
        this.f9811b = ccfVar;
        this.f9810a = cmhVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        Object obj2 = (InterfaceC1758mv) this.f9811b.f9796a.get();
        if (obj2 == null) {
            this.f9810a.mo11090b("/hideOverlay", this);
        } else {
            if (obj2 == null) {
                throw null;
            }
            ((View) obj2).setVisibility(8);
        }
    }
}
