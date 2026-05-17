package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
final class atl {
    /* JADX INFO: renamed from: a */
    public static axl m8313a(avg avgVar) throws GeneralSecurityException {
        switch (atm.f7244b[avgVar.ordinal()]) {
            case 1:
                return axl.NIST_P256;
            case 2:
                return axl.NIST_P384;
            case 3:
                return axl.NIST_P521;
            default:
                String strValueOf = String.valueOf(avgVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(strValueOf).length() + 20).append("unknown curve type: ").append(strValueOf).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static axm m8314a(aus ausVar) throws GeneralSecurityException {
        switch (atm.f7245c[ausVar.ordinal()]) {
            case 1:
                return axm.UNCOMPRESSED;
            case 2:
                return axm.COMPRESSED;
            default:
                String strValueOf = String.valueOf(ausVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(strValueOf).length() + 22).append("unknown point format: ").append(strValueOf).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m8315a(avi aviVar) throws NoSuchAlgorithmException {
        switch (atm.f7243a[aviVar.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String strValueOf = String.valueOf(aviVar);
                throw new NoSuchAlgorithmException(new StringBuilder(String.valueOf(strValueOf).length() + 27).append("hash unsupported for HMAC: ").append(strValueOf).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8316a(auy auyVar) throws GeneralSecurityException {
        axj.m8668a(m8313a(auyVar.m8439a().m8479a()));
        m8315a(auyVar.m8439a().m8480b());
        if (auyVar.m8441c() == aus.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        asu.m8289a(auyVar.m8440b().m8433a());
    }
}
