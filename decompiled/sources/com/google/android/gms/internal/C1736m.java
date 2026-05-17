package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1304h;

/* JADX INFO: renamed from: com.google.android.gms.internal.m */
/* JADX INFO: loaded from: classes.dex */
final class C1736m implements InterfaceC1790o {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10987a;

    C1736m(Context context) {
        this.f10987a = context;
    }

    @Override // com.google.android.gms.internal.InterfaceC1790o
    /* JADX INFO: renamed from: a */
    public final boolean mo11733a(C1670jo c1670jo) {
        bxm.m10404a();
        boolean zM11576c = C1657jb.m11576c(this.f10987a);
        boolean z = ((Boolean) bxm.m10409f().m10546a(can.f9544cK)).booleanValue() && c1670jo.f10858d;
        if (C1709l.m11666b(this.f10987a, c1670jo.f10858d) && zM11576c && !z) {
            if (!C1304h.m7266c(this.f10987a)) {
                return false;
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9404D)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
