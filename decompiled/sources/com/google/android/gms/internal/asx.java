package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
class asx implements asl<ase> {

    /* JADX INFO: renamed from: a */
    private static final Logger f7233a = Logger.getLogger(asx.class.getName());

    asx() {
        asu.m8294a("type.googleapis.com/google.crypto.tink.AesCtrKey", new asy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ase mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            att attVarM8330a = att.m8330a(bobVar);
            if (!(attVarM8330a instanceof att)) {
                throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
            }
            att attVar = attVarM8330a;
            ayf.m8685a(attVar.m8339a(), 0);
            return new axn((aya) asu.m8298b("type.googleapis.com/google.crypto.tink.AesCtrKey", attVar.m8342b()), (asq) asu.m8298b("type.googleapis.com/google.crypto.tink.HmacKey", attVar.m8343c()), attVar.m8343c().m8495b().m8508b());
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ase mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof att)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        }
        att attVar = (att) bqaVar;
        ayf.m8685a(attVar.m8339a(), 0);
        return new axn((aya) asu.m8298b("type.googleapis.com/google.crypto.tink.AesCtrKey", attVar.m8342b()), (asq) asu.m8298b("type.googleapis.com/google.crypto.tink.HmacKey", attVar.m8343c()), attVar.m8343c().m8495b().m8508b());
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(atv.m8348a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof atv)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
        }
        atv atvVar = (atv) bqaVar;
        atx atxVar = (atx) asu.m8290a("type.googleapis.com/google.crypto.tink.AesCtrKey", atvVar.m8350a());
        return att.m8337e().m8346a(atxVar).m8347a((avk) asu.m8290a("type.googleapis.com/google.crypto.tink.HmacKey", atvVar.m8351b())).m8345a(0).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").m8522a(((att) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
