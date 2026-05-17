package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class asy implements asl<aya> {
    asy() {
    }

    /* JADX INFO: renamed from: a */
    private static void m8301a(aub aubVar) throws GeneralSecurityException {
        if (aubVar.m8375a() < 12 || aubVar.m8375a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final awq mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            atx atxVarM8352a = atx.m8352a(bobVar);
            if (!(atxVarM8352a instanceof atx)) {
                throw new GeneralSecurityException("expected AesCtrKey proto");
            }
            atx atxVar = atxVarM8352a;
            ayf.m8685a(atxVar.m8362a(), 0);
            ayf.m8684a(atxVar.m8364c().mo9764a());
            m8301a(atxVar.m8363b());
            return new awq(atxVar.m8364c().m9770c(), atxVar.m8363b().m8375a());
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aya mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof atx)) {
            throw new GeneralSecurityException("expected AesCtrKey proto");
        }
        atx atxVar = (atx) bqaVar;
        ayf.m8685a(atxVar.m8362a(), 0);
        ayf.m8684a(atxVar.m8364c().mo9764a());
        m8301a(atxVar.m8363b());
        return new awq(atxVar.m8364c().m9770c(), atxVar.m8363b().m8375a());
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(atz.m8368a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof atz)) {
            throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
        }
        atz atzVar = (atz) bqaVar;
        ayf.m8684a(atzVar.m8372b());
        m8301a(atzVar.m8371a());
        return atx.m8359e().m8366a(atzVar.m8371a()).m8367a(bob.m9757a(ayd.m8682a(atzVar.m8372b()))).m8365a(0).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.AesCtrKey").m8522a(((atx) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
