package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.z */
/* JADX INFO: loaded from: classes.dex */
final class C0779z implements InterfaceC0748aa<InterfaceC1758mv> {
    C0779z() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        if (map.keySet().contains("start")) {
            interfaceC1758mv2.mo11823e(true);
        }
        if (map.keySet().contains("stop")) {
            interfaceC1758mv2.mo11823e(false);
        }
    }
}
