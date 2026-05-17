package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.hy */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1626hy extends C1610hi {

    /* JADX INFO: renamed from: a */
    private final Context f10764a;

    private C1626hy(Context context, InterfaceC1831pn interfaceC1831pn) {
        super(interfaceC1831pn);
        this.f10764a = context;
    }

    /* JADX INFO: renamed from: a */
    public static cil m11519a(Context context) {
        cil cilVar = new cil(new C1694kl(new File(context.getCacheDir(), "admob_volley")), new C1626hy(context, new C1859qo()));
        cilVar.m10939a();
        return cilVar;
    }

    @Override // com.google.android.gms.internal.C1610hi, com.google.android.gms.internal.bzk
    /* JADX INFO: renamed from: a */
    public final cch mo10516a(cej<?> cejVar) {
        if (cejVar.m10771g() && cejVar.m10766c() == 0) {
            if (Pattern.matches((String) bxm.m10409f().m10546a(can.f9579ct), cejVar.m10769e())) {
                bxm.m10404a();
                if (C1657jb.m11576c(this.f10764a)) {
                    cch cchVarMo10516a = new cff(this.f10764a).mo10516a(cejVar);
                    if (cchVarMo10516a != null) {
                        String strValueOf = String.valueOf(cejVar.m10769e());
                        C1560fm.m11343a(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return cchVarMo10516a;
                    }
                    String strValueOf2 = String.valueOf(cejVar.m10769e());
                    C1560fm.m11343a(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo10516a(cejVar);
    }
}
