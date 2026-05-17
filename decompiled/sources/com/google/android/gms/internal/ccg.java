package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ccg implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cmh f9798a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ccf f9799b;

    ccg(ccf ccfVar, cmh cmhVar) {
        this.f9799b = ccfVar;
        this.f9798a = cmhVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        InterfaceC1758mv interfaceC1758mv = (InterfaceC1758mv) this.f9799b.f9796a.get();
        if (interfaceC1758mv == null) {
            this.f9798a.mo11090b("/loadHtml", this);
            return;
        }
        interfaceC1758mv.mo11833w().m11853a(new cci(this, map));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            interfaceC1758mv.loadData(str, "text/html", "UTF-8");
        } else {
            interfaceC1758mv.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
