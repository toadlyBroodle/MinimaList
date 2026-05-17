package com.google.android.gms.internal;

import android.util.Base64;

/* JADX INFO: renamed from: com.google.android.gms.internal.xi */
/* JADX INFO: loaded from: classes.dex */
public final class C2042xi {
    /* JADX INFO: renamed from: a */
    public static String m12565a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12566a(String str, boolean z) {
        byte[] bArrDecode = Base64.decode(str, z ? 11 : 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unable to decode ".concat(strValueOf) : new String("Unable to decode "));
    }
}
