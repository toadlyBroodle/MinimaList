package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class aom extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        byte[] bArrM7853a;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        if (arhVarArr[0] == arn.f7154e) {
            return arn.f7154e;
        }
        String strM8083d = aka.m8083d(arhVarArr[0]);
        String strM8083d2 = arhVarArr.length > 1 ? arhVarArr[1] == arn.f7154e ? "MD5" : aka.m8083d(arhVarArr[1]) : "MD5";
        String strM8083d3 = arhVarArr.length > 2 ? arhVarArr[2] == arn.f7154e ? "text" : aka.m8083d(arhVarArr[2]) : "text";
        if ("text".equals(strM8083d3)) {
            bArrM7853a = strM8083d.getBytes();
        } else {
            if (!"base16".equals(strM8083d3)) {
                String strValueOf = String.valueOf(strM8083d3);
                throw new RuntimeException(strValueOf.length() != 0 ? "Hash: Unknown input format: ".concat(strValueOf) : new String("Hash: Unknown input format: "));
            }
            bArrM7853a = agk.m7853a(strM8083d);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(strM8083d2);
            messageDigest.update(bArrM7853a);
            return new art(agk.m7852a(messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            String strValueOf2 = String.valueOf(strM8083d2);
            throw new RuntimeException(strValueOf2.length() != 0 ? "Hash: Unknown algorithm: ".concat(strValueOf2) : new String("Hash: Unknown algorithm: "), e);
        }
    }
}
