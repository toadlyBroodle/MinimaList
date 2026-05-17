package com.google.android.gms.common.api;

/* JADX INFO: renamed from: com.google.android.gms.common.api.b */
/* JADX INFO: loaded from: classes.dex */
public class C1075b extends Exception {

    /* JADX INFO: renamed from: a */
    protected final Status f5467a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1075b(Status status) {
        int iM6627e = status.m6627e();
        String strM6624b = status.m6624b() != null ? status.m6624b() : "";
        super(new StringBuilder(String.valueOf(strM6624b).length() + 13).append(iM6627e).append(": ").append(strM6624b).toString());
        this.f5467a = status;
    }
}
