package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class axh {

    /* JADX INFO: renamed from: a */
    private ECPublicKey f7535a;

    public axh(ECPublicKey eCPublicKey) {
        this.f7535a = eCPublicKey;
    }

    /* JADX INFO: renamed from: a */
    public final axi m8664a(String str, byte[] bArr, byte[] bArr2, int i, axm axmVar) throws GeneralSecurityException {
        byte[] bArr3;
        ECParameterSpec params = this.f7535a.getParams();
        KeyPairGenerator keyPairGeneratorM8673a = axo.f7553d.m8673a("EC");
        keyPairGeneratorM8673a.initialize(params);
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorM8673a.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        axj.m8670a(this.f7535a.getW(), this.f7535a.getParams().getCurve());
        KeyAgreement keyAgreementM8673a = axo.f7552c.m8673a("ECDH");
        keyAgreementM8673a.init(eCPrivateKey);
        keyAgreementM8673a.doPhase(this.f7535a, true);
        byte[] bArrGenerateSecret = keyAgreementM8673a.generateSecret();
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        axj.m8670a(w, curve);
        int iM8667a = axj.m8667a(curve);
        switch (axmVar) {
            case UNCOMPRESSED:
                bArr3 = new byte[(iM8667a * 2) + 1];
                byte[] byteArray = w.getAffineX().toByteArray();
                byte[] byteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(byteArray2, 0, bArr3, ((iM8667a * 2) + 1) - byteArray2.length, byteArray2.length);
                System.arraycopy(byteArray, 0, bArr3, (iM8667a + 1) - byteArray.length, byteArray.length);
                bArr3[0] = 4;
                break;
            case COMPRESSED:
                byte[] bArr4 = new byte[iM8667a + 1];
                byte[] byteArray3 = w.getAffineX().toByteArray();
                System.arraycopy(byteArray3, 0, bArr4, (iM8667a + 1) - byteArray3.length, byteArray3.length);
                bArr4[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                bArr3 = bArr4;
                break;
            default:
                String strValueOf = String.valueOf(axmVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(strValueOf).length() + 15).append("invalid format:").append(strValueOf).toString());
        }
        return new axi(bArr3, axy.m8675a(str, awu.m8641a(bArr3, bArrGenerateSecret), bArr, bArr2, i));
    }
}
