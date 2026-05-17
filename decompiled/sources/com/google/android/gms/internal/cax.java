package com.google.android.gms.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class cax extends cau {
    cax() {
    }

    /* JADX INFO: renamed from: a */
    private static String m10567a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.cau
    /* JADX INFO: renamed from: a */
    public final String mo10566a(String str, String str2) {
        String strM10567a = m10567a(str);
        String strM10567a2 = m10567a(str2);
        return TextUtils.isEmpty(strM10567a) ? strM10567a2 : TextUtils.isEmpty(strM10567a2) ? strM10567a : new StringBuilder(String.valueOf(strM10567a).length() + 1 + String.valueOf(strM10567a2).length()).append(strM10567a).append(",").append(strM10567a2).toString();
    }
}
