package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class asv implements asf {
    @Override // com.google.android.gms.internal.asf
    /* JADX INFO: renamed from: a */
    public final asl mo8267a(String str, String str2, int i) throws GeneralSecurityException {
        asl ateVar;
        switch (str2.toLowerCase()) {
            case "aead":
                switch (str) {
                    case "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey":
                        ateVar = new asx();
                        break;
                    case "type.googleapis.com/google.crypto.tink.AesEaxKey":
                        ateVar = new asz();
                        break;
                    case "type.googleapis.com/google.crypto.tink.AesGcmKey":
                        ateVar = new ata();
                        break;
                    case "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key":
                        ateVar = new atb();
                        break;
                    case "type.googleapis.com/google.crypto.tink.KmsAeadKey":
                        ateVar = new atc();
                        break;
                    case "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey":
                        ateVar = new ate();
                        break;
                    default:
                        throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
                }
                if (i > 0) {
                    throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
                }
                return ateVar;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
    }
}
