package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class ato implements asl<asq> {
    ato() {
    }

    /* JADX INFO: renamed from: a */
    private static void m8319a(avo avoVar) throws GeneralSecurityException {
        if (avoVar.m8508b() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (avoVar.m8507a()) {
            case SHA1:
                if (avoVar.m8508b() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case SHA256:
                if (avoVar.m8508b() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case SHA512:
                if (avoVar.m8508b() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final asq mo8270a(bob bobVar) throws GeneralSecurityException {
        ayb aybVar;
        try {
            avk avkVarM8484a = avk.m8484a(bobVar);
            if (!(avkVarM8484a instanceof avk)) {
                throw new GeneralSecurityException("expected HmacKey proto");
            }
            avk avkVar = avkVarM8484a;
            ayf.m8685a(avkVar.m8494a(), 0);
            if (avkVar.m8496c().mo9764a() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            m8319a(avkVar.m8495b());
            avi aviVarM8507a = avkVar.m8495b().m8507a();
            SecretKeySpec secretKeySpec = new SecretKeySpec(avkVar.m8496c().m9770c(), "HMAC");
            int iM8508b = avkVar.m8495b().m8508b();
            switch (aviVarM8507a) {
                case SHA1:
                    aybVar = new ayb("HMACSHA1", secretKeySpec, iM8508b);
                    break;
                case SHA256:
                    aybVar = new ayb("HMACSHA256", secretKeySpec, iM8508b);
                    break;
                case SHA512:
                    aybVar = new ayb("HMACSHA512", secretKeySpec, iM8508b);
                    break;
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
            return aybVar;
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ asq mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof avk)) {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
        avk avkVar = (avk) bqaVar;
        ayf.m8685a(avkVar.m8494a(), 0);
        if (avkVar.m8496c().mo9764a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m8319a(avkVar.m8495b());
        avi aviVarM8507a = avkVar.m8495b().m8507a();
        SecretKeySpec secretKeySpec = new SecretKeySpec(avkVar.m8496c().m9770c(), "HMAC");
        int iM8508b = avkVar.m8495b().m8508b();
        switch (aviVarM8507a) {
            case SHA1:
                return new ayb("HMACSHA1", secretKeySpec, iM8508b);
            case SHA256:
                return new ayb("HMACSHA256", secretKeySpec, iM8508b);
            case SHA512:
                return new ayb("HMACSHA512", secretKeySpec, iM8508b);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(avm.m8500a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof avm)) {
            throw new GeneralSecurityException("expected HmacKeyFormat proto");
        }
        avm avmVar = (avm) bqaVar;
        if (avmVar.m8504b() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m8319a(avmVar.m8503a());
        return avk.m8491e().m8497a(0).m8498a(avmVar.m8503a()).m8499a(bob.m9757a(ayd.m8682a(avmVar.m8504b()))).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.HmacKey").m8522a(((avk) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.SYMMETRIC).m9912d();
    }
}
