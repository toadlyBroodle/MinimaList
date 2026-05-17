package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.xn */
/* JADX INFO: loaded from: classes.dex */
final class C2047xn {

    /* JADX INFO: renamed from: a */
    static ask f12304a;

    /* JADX INFO: renamed from: a */
    static boolean m12576a() {
        if (f12304a != null) {
            return true;
        }
        String str = (String) bxm.m10409f().m10546a(can.f9530bx);
        if (str.length() == 0) {
            return false;
        }
        try {
            try {
                asm asmVarM8281a = asr.m8281a(C2042xi.m12566a(str, true));
                for (avy avyVar : ati.f7240a.m8634a()) {
                    if (avyVar.m8552b().isEmpty()) {
                        throw new GeneralSecurityException("Missing type_url.");
                    }
                    if (avyVar.m8551a().isEmpty()) {
                        throw new GeneralSecurityException("Missing primitive_name.");
                    }
                    if (avyVar.m8555f().isEmpty()) {
                        throw new GeneralSecurityException("Missing catalogue_name.");
                    }
                    asu.m8295a(avyVar.m8552b(), asu.m8287a(avyVar.m8555f()).mo8267a(avyVar.m8552b(), avyVar.m8551a(), avyVar.m8553c()), avyVar.m8554e());
                }
                f12304a = atj.m8312a(asmVarM8281a);
                return f12304a != null;
            } catch (GeneralSecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }
}
