package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class asz implements asl<ase> {
    asz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ase mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            aud audVarM8376a = aud.m8376a(bobVar);
            if (!(audVarM8376a instanceof aud)) {
                throw new GeneralSecurityException("expected AesEaxKey proto");
            }
            aud audVar = audVarM8376a;
            ayf.m8685a(audVar.m8385a(), 0);
            ayf.m8684a(audVar.m8387c().mo9764a());
            if (audVar.m8386b().m8397a() == 12 || audVar.m8386b().m8397a() == 16) {
                return new awr(audVar.m8387c().m9770c(), audVar.m8386b().m8397a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof aud)) {
            throw new GeneralSecurityException("expected AesEaxKey proto");
        }
        aud audVar = (aud) bqaVar;
        ayf.m8685a(audVar.m8385a(), 0);
        ayf.m8684a(audVar.m8387c().mo9764a());
        if (audVar.m8386b().m8397a() == 12 || audVar.m8386b().m8397a() == 16) {
            return new awr(audVar.m8387c().m9770c(), audVar.m8386b().m8397a());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(auf.m8391a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof auf)) {
            throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
        }
        auf aufVar = (auf) bqaVar;
        ayf.m8684a(aufVar.m8394b());
        if (aufVar.m8393a().m8397a() == 12 || aufVar.m8393a().m8397a() == 16) {
            return aud.m8383e().m8390a(bob.m9757a(ayd.m8682a(aufVar.m8394b()))).m8389a(aufVar.m8393a()).m8388a(0).m9912d();
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.AesEaxKey").m8522a(((aud) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
