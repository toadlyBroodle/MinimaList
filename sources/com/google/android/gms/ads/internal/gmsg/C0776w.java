package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.w */
/* JADX INFO: loaded from: classes.dex */
final class C0776w implements InterfaceC0748aa<InterfaceC1758mv> {
    C0776w() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        if (((Boolean) bxm.m10409f().m10546a(can.f9512bf)).booleanValue()) {
            interfaceC1758mv2.mo11822d(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
