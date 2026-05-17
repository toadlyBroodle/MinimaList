package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.BinderC0829d;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.InterfaceC1758mv;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.s */
/* JADX INFO: loaded from: classes.dex */
final class C0772s implements InterfaceC0748aa<InterfaceC1758mv> {
    C0772s() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final /* synthetic */ void zza(InterfaceC1758mv interfaceC1758mv, Map map) {
        InterfaceC1758mv interfaceC1758mv2 = interfaceC1758mv;
        BinderC0829d binderC0829dMo11829s = interfaceC1758mv2.mo11829s();
        if (binderC0829dMo11829s != null) {
            binderC0829dMo11829s.m5780a();
            return;
        }
        BinderC0829d binderC0829dMo11830t = interfaceC1758mv2.mo11830t();
        if (binderC0829dMo11830t != null) {
            binderC0829dMo11830t.m5780a();
        } else {
            C1560fm.m11615e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
