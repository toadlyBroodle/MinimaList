package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.x */
/* JADX INFO: loaded from: classes.dex */
final class C0777x implements InterfaceC0748aa<InterfaceC1758mv> {
    C0777x() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC1758mv2.mo5536g_();
        } else if ("resume".equals(str)) {
            interfaceC1758mv2.mo5537h_();
        }
    }
}
