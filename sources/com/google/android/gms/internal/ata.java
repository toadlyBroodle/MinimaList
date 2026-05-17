package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class ata implements asl<ase> {
    ata() {
    }

    /* JADX INFO: renamed from: d */
    private static ase m8304d(bob bobVar) throws GeneralSecurityException {
        try {
            return new aws(auj.m8398a(bobVar).m8408b().m9770c());
        } catch (bpf e) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8270a(bob bobVar) {
        return m8304d(bobVar);
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof auj)) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
        auj aujVar = (auj) bqaVar;
        ayf.m8685a(aujVar.m8407a(), 0);
        ayf.m8684a(aujVar.m8408b().mo9764a());
        return new aws(aujVar.m8408b().m9770c());
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(aul.m8412a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof aul)) {
            throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
        }
        aul aulVar = (aul) bqaVar;
        ayf.m8684a(aulVar.m8415b());
        return auj.m8405c().m8411a(bob.m9757a(ayd.m8682a(aulVar.m8415b()))).m8410a(aulVar.m8414a()).m8409a(0).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.AesGcmKey").m8522a(((auj) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
