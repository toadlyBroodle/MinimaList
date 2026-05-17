package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class ate implements asl<ase> {
    ate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ase mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            awi awiVarM8611a = awi.m8611a(bobVar);
            if (!(awiVarM8611a instanceof awi)) {
                throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
            }
            awi awiVar = awiVarM8611a;
            ayf.m8685a(awiVar.m8618a(), 0);
            String strM8625a = awiVar.m8619b().m8625a();
            return new atd(awiVar.m8619b().m8626b(), aso.m8279a(strM8625a).m8278b(strM8625a));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof awi)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        }
        awi awiVar = (awi) bqaVar;
        ayf.m8685a(awiVar.m8618a(), 0);
        String strM8625a = awiVar.m8619b().m8625a();
        return new atd(awiVar.m8619b().m8626b(), aso.m8279a(strM8625a).m8278b(strM8625a));
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(awk.m8622a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof awk)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
        }
        return awi.m8616c().m8621a((awk) bqaVar).m8620a(0).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").m8522a(((awi) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.REMOTE).m9912d();
    }
}
