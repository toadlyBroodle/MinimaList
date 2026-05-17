package com.google.android.gms.common.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1266m {

    /* JADX INFO: renamed from: a */
    private static int f5971a = 15;

    /* JADX INFO: renamed from: b */
    private static final String f5972b = null;

    /* JADX INFO: renamed from: c */
    private final String f5973c;

    /* JADX INFO: renamed from: d */
    private final String f5974d;

    public C1266m(String str) {
        this(str, null);
    }

    public C1266m(String str, String str2) {
        C1221aj.m7066a(str, (Object) "log tag cannot be null");
        C1221aj.m7076b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f5973c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f5974d = null;
        } else {
            this.f5974d = str2;
        }
    }
}
