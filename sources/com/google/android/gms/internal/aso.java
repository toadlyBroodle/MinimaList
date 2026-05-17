package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aso {

    /* JADX INFO: renamed from: a */
    private static final CopyOnWriteArrayList<asn> f7207a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public static asn m8279a(String str) throws GeneralSecurityException {
        for (asn asnVar : f7207a) {
            if (asnVar.m8277a(str)) {
                return asnVar;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
