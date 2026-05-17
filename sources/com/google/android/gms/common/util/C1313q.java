package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.common.util.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1313q {

    /* JADX INFO: renamed from: a */
    private static final Pattern f6048a = Pattern.compile("\\$\\{(.*?)\\}");

    /* JADX INFO: renamed from: a */
    public static boolean m7289a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
