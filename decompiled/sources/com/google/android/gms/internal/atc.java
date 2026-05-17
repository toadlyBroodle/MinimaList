package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class atc implements asl<ase> {
    atc() {
    }

    /* JADX INFO: renamed from: c */
    private static ase m8307c(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof awe)) {
            throw new GeneralSecurityException("expected KmsAeadKey proto");
        }
        awe aweVar = (awe) bqaVar;
        ayf.m8685a(aweVar.m8603a(), 0);
        String strM8610a = aweVar.m8604b().m8610a();
        return aso.m8279a(strM8610a).m8278b(strM8610a);
    }

    /* JADX INFO: renamed from: d */
    private static ase m8308d(bob bobVar) throws GeneralSecurityException {
        try {
            return m8307c(awe.m8596a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8270a(bob bobVar) {
        return m8308d(bobVar);
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) {
        return m8307c(bqaVar);
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(awg.m8607a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof awg)) {
            throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
        }
        return awe.m8601c().m8606a((awg) bqaVar).m8605a(0).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.KmsAeadKey").m8522a(((awe) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.REMOTE).m9912d();
    }
}
