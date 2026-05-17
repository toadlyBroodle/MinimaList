package com.google.android.gms.internal;

import com.google.android.gms.internal.avq;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class atf implements asl<asj> {
    atf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final asj mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            ava avaVarM8442a = ava.m8442a(bobVar);
            if (!(avaVarM8442a instanceof ava)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
            }
            ava avaVar = avaVarM8442a;
            ayf.m8685a(avaVar.m8451a(), 0);
            atl.m8316a(avaVar.m8452b().m8470b());
            auy auyVarM8470b = avaVar.m8452b().m8470b();
            ave aveVarM8439a = auyVarM8470b.m8439a();
            axl axlVarM8313a = atl.m8313a(aveVarM8439a.m8479a());
            byte[] bArrM9770c = avaVar.m8453c().m9770c();
            return new axe((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM9770c), axj.m8668a(axlVarM8313a))), aveVarM8439a.m8481c().m9770c(), atl.m8315a(aveVarM8439a.m8480b()), atl.m8314a(auyVarM8470b.m8441c()), new atn(auyVarM8470b.m8440b().m8433a()));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ asj mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof ava)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        }
        ava avaVar = (ava) bqaVar;
        ayf.m8685a(avaVar.m8451a(), 0);
        atl.m8316a(avaVar.m8452b().m8470b());
        auy auyVarM8470b = avaVar.m8452b().m8470b();
        ave aveVarM8439a = auyVarM8470b.m8439a();
        axl axlVarM8313a = atl.m8313a(aveVarM8439a.m8479a());
        byte[] bArrM9770c = avaVar.m8453c().m9770c();
        return new axe((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM9770c), axj.m8668a(axlVarM8313a))), aveVarM8439a.m8481c().m9770c(), atl.m8315a(aveVarM8439a.m8480b()), atl.m8314a(auyVarM8470b.m8441c()), new atn(auyVarM8470b.m8440b().m8433a()));
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        try {
            return mo8273b(auw.m8434a(bobVar));
        } catch (bpf e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof auw)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
        }
        auw auwVar = (auw) bqaVar;
        atl.m8316a(auwVar.m8436a());
        ECParameterSpec eCParameterSpecM8668a = axj.m8668a(atl.m8313a(auwVar.m8436a().m8439a().m8479a()));
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(eCParameterSpecM8668a);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return ava.m8449e().m8454a(0).m8455a(avc.m8466f().m8473a(0).m8474a(auwVar.m8436a()).m8475a(bob.m9757a(w.getAffineX().toByteArray())).m8476b(bob.m9757a(w.getAffineY().toByteArray())).m9912d()).m8456a(bob.m9757a(eCPrivateKey.getS().toByteArray())).m9912d();
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) {
        return avq.m8515e().m8523a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").m8522a(((ava) mo8272b(bobVar)).mo9747j()).m8521a(avq.EnumC1405b.ASYMMETRIC_PRIVATE).m9912d();
    }
}
