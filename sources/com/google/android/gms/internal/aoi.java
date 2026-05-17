package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aoi extends akb {
    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        byte[] bArrDecode;
        String strEncodeToString;
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length > 0);
        String strM8083d = aka.m8083d(arhVarArr[0]);
        String strM8083d2 = arhVarArr.length > 1 ? aka.m8083d(arhVarArr[1]) : "text";
        String strM8083d3 = arhVarArr.length > 2 ? aka.m8083d(arhVarArr[2]) : "base16";
        int i = arhVarArr.length > 3 && aka.m8078a(arhVarArr[3]) ? 3 : 2;
        try {
            if ("text".equals(strM8083d2)) {
                bArrDecode = strM8083d.getBytes();
            } else if ("base16".equals(strM8083d2)) {
                bArrDecode = agk.m7853a(strM8083d);
            } else if ("base64".equals(strM8083d2)) {
                bArrDecode = Base64.decode(strM8083d, i);
            } else {
                if (!"base64url".equals(strM8083d2)) {
                    String strValueOf = String.valueOf(strM8083d2);
                    throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Encode: unknown input format: ".concat(strValueOf) : new String("Encode: unknown input format: "));
                }
                bArrDecode = Base64.decode(strM8083d, i | 8);
            }
            if ("base16".equals(strM8083d3)) {
                strEncodeToString = agk.m7852a(bArrDecode);
            } else if ("base64".equals(strM8083d3)) {
                strEncodeToString = Base64.encodeToString(bArrDecode, i);
            } else {
                if (!"base64url".equals(strM8083d3)) {
                    String strValueOf2 = String.valueOf(strM8083d3);
                    throw new RuntimeException(strValueOf2.length() != 0 ? "Encode: unknown output format: ".concat(strValueOf2) : new String("Encode: unknown output format: "));
                }
                strEncodeToString = Base64.encodeToString(bArrDecode, i | 8);
            }
            return new art(strEncodeToString);
        } catch (IllegalArgumentException e) {
            String strValueOf3 = String.valueOf(strM8083d2);
            throw new RuntimeException(strValueOf3.length() != 0 ? "Encode: invalid input:".concat(strValueOf3) : new String("Encode: invalid input:"));
        }
    }
}
