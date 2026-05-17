package com.google.android.gms.common.util;

import android.util.Base64;

/* JADX INFO: renamed from: com.google.android.gms.common.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1298b {
    /* JADX INFO: renamed from: a */
    public static String m7249a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m7250b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
