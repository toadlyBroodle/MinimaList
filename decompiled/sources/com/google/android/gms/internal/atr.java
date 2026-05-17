package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class atr implements asf {
    @Override // com.google.android.gms.internal.asf
    /* JADX INFO: renamed from: a */
    public final asl mo8267a(String str, String str2, int i) throws GeneralSecurityException {
        switch (str2.toLowerCase()) {
            case "mac":
                switch (str) {
                    case "type.googleapis.com/google.crypto.tink.HmacKey":
                        ato atoVar = new ato();
                        if (i > 0) {
                            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
                        }
                        return atoVar;
                    default:
                        throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", str));
                }
            default:
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
    }
}
