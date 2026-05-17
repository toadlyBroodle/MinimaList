package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class aoj extends akb {

    /* JADX INFO: renamed from: a */
    private static final Pattern f6998a = Pattern.compile("(.+)/(.+)/(.+)");

    /* JADX INFO: renamed from: a */
    private static String m8094a(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return agk.m7852a(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(strValueOf.length() != 0 ? "Encrypt: ".concat(strValueOf) : new String("Encrypt: "));
        }
    }

    @Override // com.google.android.gms.internal.akb
    /* JADX INFO: renamed from: a */
    protected final arh<?> mo8073a(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(true);
        C1221aj.m7074b(arhVarArr.length >= 3);
        String strM8083d = aka.m8083d(arhVarArr[0]);
        String strM8083d2 = aka.m8083d(arhVarArr[1]);
        String strM8083d3 = aka.m8083d(arhVarArr[2]);
        String strM8083d4 = arhVarArr.length < 4 ? "AES/CBC/NoPadding" : aka.m8083d(arhVarArr[3]);
        Matcher matcher = f6998a.matcher(strM8083d4);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(strM8083d4);
            throw new RuntimeException(strValueOf.length() != 0 ? "Encrypt: invalid transformation:".concat(strValueOf) : new String("Encrypt: invalid transformation:"));
        }
        try {
            return new art(m8094a(Cipher.getInstance(strM8083d4), strM8083d, new SecretKeySpec(strM8083d2.getBytes(), matcher.group(1)), new IvParameterSpec(strM8083d3.getBytes())));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            String strValueOf2 = String.valueOf(strM8083d4);
            throw new RuntimeException(strValueOf2.length() != 0 ? "Encrypt: invalid transformation:".concat(strValueOf2) : new String("Encrypt: invalid transformation:"));
        }
    }
}
