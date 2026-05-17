package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class apv extends aps {

    /* JADX INFO: renamed from: c */
    private final apu f7051c;

    /* JADX INFO: renamed from: d */
    private final List<Integer> f7052d;

    /* JADX INFO: renamed from: e */
    private final int f7053e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ apt f7054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    apv(apt aptVar, int i, aqc aqcVar, apy apyVar, List<Integer> list, int i2, apu apuVar, agv agvVar) {
        super(i, aqcVar, apyVar, agvVar);
        this.f7054f = aptVar;
        this.f7051c = apuVar;
        this.f7052d = list;
        this.f7053e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    @Override // com.google.android.gms.internal.aps
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo8126a(aqd aqdVar) {
        boolean z;
        if (aqdVar.mo6094a() == Status.f5451a) {
            String strValueOf = String.valueOf(aqdVar.m8143e());
            ahs.m7947d(strValueOf.length() != 0 ? "Container resource successfully loaded from ".concat(strValueOf) : new String("Container resource successfully loaded from "));
            if (aqdVar.m8142d() == 0) {
                aqe aqeVarM8140b = aqdVar.m8140b();
                if (aqeVarM8140b.m8145b().m8111e()) {
                    z = true;
                } else {
                    this.f7054f.m8129a(aqdVar.mo6094a(), aqeVarM8140b);
                    if (aqeVarM8140b.m8144a() == null || aqeVarM8140b.m8144a().length <= 0) {
                        z = false;
                    } else {
                        this.f7054f.f7046b.m8154a(aqeVarM8140b.m8145b().m8110d(), aqeVarM8140b.m8144a());
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f7051c.mo7876a(aqdVar);
            return;
        }
        String strM8143e = aqdVar.m8143e();
        String str = aqdVar.mo6094a().m6626d() ? "SUCCESS" : "FAILURE";
        ahs.m7947d(new StringBuilder(String.valueOf(strM8143e).length() + 54 + String.valueOf(str).length()).append("Cannot fetch a valid resource from ").append(strM8143e).append(". Response status: ").append(str).toString());
        if (aqdVar.mo6094a().m6626d()) {
            String strValueOf2 = String.valueOf(aqdVar.m8143e());
            ahs.m7947d(strValueOf2.length() != 0 ? "Response source: ".concat(strValueOf2) : new String("Response source: "));
            ahs.m7947d(new StringBuilder(26).append("Response size: ").append(aqdVar.m8140b().m8144a().length).toString());
        }
        this.f7054f.m8130a(this.f7040a, this.f7052d, this.f7053e + 1, this.f7051c, this.f7041b);
    }
}
