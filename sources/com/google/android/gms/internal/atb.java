package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class atb implements asl<ase> {
    atb() {
    }

    /* JADX INFO: renamed from: a */
    private static aup m8305a() {
        return aup.m8423c().m8427a(0).m8428a(bob.m9757a(ayd.m8682a(32))).m9912d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ase mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            aup aupVarM8418a = aup.m8418a(bobVar);
            if (!(aupVarM8418a instanceof aup)) {
                throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
            }
            aup aupVar = aupVarM8418a;
            ayf.m8685a(aupVar.m8425a(), 0);
            if (aupVar.m8426b().mo9764a() != 32) {
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            return axa.m8661a(aupVar.m8426b().m9770c());
        } catch (bpf e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof aup)) {
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        }
        aup aupVar = (aup) bqaVar;
        ayf.m8685a(aupVar.m8425a(), 0);
        if (aupVar.m8426b().mo9764a() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        return axa.m8661a(aupVar.m8426b().m9770c());
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) {
        return m8305a();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) {
        return m8305a();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").m8522a(m8305a().mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
