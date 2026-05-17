package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class atg implements asl<ask> {
    atg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ask mo8270a(bob bobVar) throws GeneralSecurityException {
        try {
            avc avcVarM8457a = avc.m8457a(bobVar);
            if (!(avcVarM8457a instanceof avc)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
            }
            avc avcVar = avcVarM8457a;
            ayf.m8685a(avcVar.m8469a(), 0);
            atl.m8316a(avcVar.m8470b());
            auy auyVarM8470b = avcVar.m8470b();
            ave aveVarM8439a = auyVarM8470b.m8439a();
            axl axlVarM8313a = atl.m8313a(aveVarM8439a.m8479a());
            byte[] bArrM9770c = avcVar.m8471c().m9770c();
            byte[] bArrM9770c2 = avcVar.m8472e().m9770c();
            ECParameterSpec eCParameterSpecM8668a = axj.m8668a(axlVarM8313a);
            ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrM9770c), new BigInteger(1, bArrM9770c2));
            axj.m8670a(eCPoint, eCParameterSpecM8668a.getCurve());
            return new axf((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecM8668a)), aveVarM8439a.m8481c().m9770c(), atl.m8315a(aveVarM8439a.m8480b()), atl.m8314a(auyVarM8470b.m8441c()), new atn(auyVarM8470b.m8440b().m8433a()));
        } catch (bpf e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ask mo8271a(bqa bqaVar) throws GeneralSecurityException {
        if (!(bqaVar instanceof avc)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        }
        avc avcVar = (avc) bqaVar;
        ayf.m8685a(avcVar.m8469a(), 0);
        atl.m8316a(avcVar.m8470b());
        auy auyVarM8470b = avcVar.m8470b();
        ave aveVarM8439a = auyVarM8470b.m8439a();
        axl axlVarM8313a = atl.m8313a(aveVarM8439a.m8479a());
        byte[] bArrM9770c = avcVar.m8471c().m9770c();
        byte[] bArrM9770c2 = avcVar.m8472e().m9770c();
        ECParameterSpec eCParameterSpecM8668a = axj.m8668a(axlVarM8313a);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrM9770c), new BigInteger(1, bArrM9770c2));
        axj.m8670a(eCPoint, eCParameterSpecM8668a.getCurve());
        return new axf((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecM8668a)), aveVarM8439a.m8481c().m9770c(), atl.m8315a(aveVarM8439a.m8480b()), atl.m8314a(auyVarM8470b.m8441c()), new atn(auyVarM8470b.m8440b().m8433a()));
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8272b(bob bobVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: b */
    public final bqa mo8273b(bqa bqaVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    @Override // com.google.android.gms.internal.asl
    /* JADX INFO: renamed from: c */
    public final avq mo8274c(bob bobVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }
}
